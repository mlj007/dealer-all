package com.chexun.dealer.utils;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpState;
import org.apache.commons.httpclient.NameValuePair;
import org.apache.commons.httpclient.cookie.CookiePolicy;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.params.HttpClientParams;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.alibaba.fastjson.JSONObject;
import com.chexun.base.common.util.CookieUtils;
import com.chexun.base.common.util.string.StringUtils;

public abstract class SsoAuthUtil {

	private static final Log LOG = LogFactory.getLog(SsoAuthUtil.class);
//	private static final String CHEXUN_LOGIN_CHECK_TOKEN_URL = InterfaceUrlConstant.regContextPath + "/check.aspx";//使用车讯登录验证token的url
	private static final String CHEXUN_LOGIN_CHECK_TOKEN_URL = "http://reg.chexun.com/check.aspx";
	private static final String CHEXUN_LOGIN_COOKIE_USERID_KEY = "userid";//车讯网登录Cookie中用户ID的key
	private static final String CHEXUN_LOGIN_COOKIE_USERNAME_KEY = "user.name";//车讯网登录Cookie中用户名的key
	private static final String CHEXUN_LOGIN_COOKIE_TOKEN_KEY = "userToken";//车讯网登录Cookie中token的key
	private static final String CHEXUN_LOGIN_COOKIE_BBSUSERID_KEY = "BBSUserID";//车讯网登录Cookie中对应BBS中的用户名
	private static final String CHEXUN3G_LOGIN_COOKIE_KEY = "mchexun.login";
//	private static final String CHEXUN_GET_USER_BY_TOKEN_URL = InterfaceUrlConstant.regContextPath + "/api/userinfo.ashx";//通过用户token获取用户信息的接口地址
	private static final String CHEXUN_GET_USER_BY_TOKEN_URL ="http://reg.chexun.com/api/userinfo.ashx";
	/**
	 * Authentication tokens sso
	 * 
	 */
	public static String[] ssoCheck(HttpServletRequest request,HttpServletResponse response) {
		String result[] = null;
		String loginFlag = CookieUtils.getCookieValue(request, CHEXUN3G_LOGIN_COOKIE_KEY);
		if("1".equals(loginFlag)){
			String userName = CookieUtils.getCookieValue(request, CHEXUN_LOGIN_COOKIE_USERNAME_KEY);
			String userId = CookieUtils.getCookieValue(request, CHEXUN_LOGIN_COOKIE_USERID_KEY);
			String bbsUserId = CookieUtils.getCookieValue(request, CHEXUN_LOGIN_COOKIE_BBSUSERID_KEY);
			
			if(StringUtils.isNotEmpty(userId) 
					&& StringUtils.isNotEmpty(userName)
					&& StringUtils.isNotEmpty(bbsUserId)){
				result = new String[3];
				result[0] = userId;
				result[1] = userName;
				result[2] = bbsUserId;
			}
		}
		
		if(result != null){
			return result;
		}
		HttpClientParams clientParams = new HttpClientParams();
		clientParams.setSoTimeout(5000);
		PostMethod method = new PostMethod(
				CHEXUN_LOGIN_CHECK_TOKEN_URL);
		String responseStr = null;
		try {
			String name = CHEXUN_LOGIN_COOKIE_TOKEN_KEY;
			String token = getUserToken(request);
			String userName = CookieUtils.getCookieValue(request, CHEXUN_LOGIN_COOKIE_USERNAME_KEY);
			String userId = CookieUtils.getCookieValue(request, CHEXUN_LOGIN_COOKIE_USERID_KEY);
			if (null != token) {
				clientParams.setContentCharset("UTF-8");
				clientParams.setCookiePolicy(CookiePolicy.RFC_2109);
				clientParams.setParameter("Content-Type", "application/x-www-form-urlencoded");
				HttpClient client = new HttpClient(clientParams);
				HttpState initialState = new HttpState();
				org.apache.commons.httpclient.Cookie cookie = new org.apache.commons.httpclient.Cookie();
				cookie.setName(name);
				cookie.setValue(token);
				cookie.setDomain(".chexun.com");
				cookie.setPath("/");
				initialState.addCookie(cookie);
				client.setState(initialState);
				NameValuePair[] nvps = new NameValuePair[1];
				NameValuePair nvp = new NameValuePair(name, token);
				nvps[0] = nvp;
				method.setRequestBody(nvps);
				client.executeMethod(method); //打印服务器返回的状态
				responseStr = method.getResponseBodyAsString();
				// System.out.println("-----test in SsoAuthUtil.ssoCheck() responseStr:" + responseStr);
				if (responseStr != null) {
					String[] array = responseStr.split(",");
					if (array != null && array.length >= 2 && array[0] != null
							&& array[1] != null && array[0].equals(userId)
							&& array[1].equals(userName)) {
						result = new String[3];
						result[0] = userId;
						result[1] = userName;
						result[2] = CookieUtils.getCookieValue(request, CHEXUN_LOGIN_COOKIE_BBSUSERID_KEY);
						Cookie ck = new Cookie(CHEXUN3G_LOGIN_COOKIE_KEY, "1");
						CookieUtils.add(response, ck, ".chexun.com", 10*60);
					}
				}
			}
		} catch (Exception e) {
			LOG.info("auth userToken error:", e);
			e.printStackTrace();
		} finally {
			method.releaseConnection();
		}
		return result;
	}
	
	//通过token获取用户信息
	public static UserDto getUserByToken(HttpServletRequest request){
		UserDto user = null;
		HttpClientParams clientParams = new HttpClientParams();
		clientParams.setSoTimeout(5000);
		PostMethod method = new PostMethod(CHEXUN_GET_USER_BY_TOKEN_URL);
		String responseStr = null;
		try {
			String token = getUserToken(request);
			if (null != token) {
				clientParams.setContentCharset("UTF-8");
				clientParams.setCookiePolicy(CookiePolicy.RFC_2109);
				clientParams.setParameter("Content-Type", "application/x-www-form-urlencoded");
				HttpClient client = new HttpClient(clientParams);
				HttpState initialState = new HttpState();
				client.setState(initialState);
				NameValuePair[] nvps = new NameValuePair[1];
				NameValuePair nvp = new NameValuePair(CHEXUN_LOGIN_COOKIE_TOKEN_KEY, token);
				nvps[0] = nvp;
				method.setRequestBody(nvps);
				client.executeMethod(method); //打印服务器返回的状态
				responseStr = method.getResponseBodyAsString();
				//System.out.println("-----test in SsoAuthUtil.ssoCheck() responseStr:" + responseStr);
				if (responseStr != null) {
					JSONObject json = JSONObject.parseObject(responseStr);
					if(json != null){
						user = new UserDto();
						user.setPhone(json.getString("phone"));
						user.setUserName(json.getString("username"));
						user.setGroupId(json.getString("groupId"));
					}
				}
			}
		} catch (Exception e) {
			LOG.info("auth userToken error:", e);
			e.printStackTrace();
		} finally {
			method.releaseConnection();
		}
		return user;
	}
	
	//获取用户token
	public static String getUserToken(HttpServletRequest request){
		String name = CHEXUN_LOGIN_COOKIE_TOKEN_KEY;
		String token = null;
		if (null != request.getCookies()) {
			Cookie[] cookies = request.getCookies();
			for (int i = 0; i < cookies.length; i++) {
				Cookie cookie = cookies[i];
				if (name.equals(cookie.getName())) {
					name = cookie.getName();
					token = cookie.getValue();
					break;
				}
			}
		}
		return token;
	}
}
