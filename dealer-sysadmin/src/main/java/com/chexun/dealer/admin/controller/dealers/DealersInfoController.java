package com.chexun.dealer.admin.controller.dealers;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.chexun.base.common.util.date.DateUtils;
import com.chexun.base.framework.core.entity.PageEntity;
import com.chexun.dealer.model.car.DealersCar;
import com.chexun.dealer.model.dealers.BuyCredentials;
import com.chexun.dealer.model.dealers.DealersAddcarlog;
import com.chexun.dealer.model.dealers.DealersContract;
import com.chexun.dealer.model.dealers.DealersInfo;
import com.chexun.dealer.model.permission.Component;
import com.chexun.dealer.po.dealers.CarCompanySetPo;
import com.chexun.dealer.po.dealers.DealersInfoPo;
import com.chexun.dealer.service.car.DealersCarService;
import com.chexun.dealer.service.dealers.BuyCredentialsService;
import com.chexun.dealer.service.dealers.DealersAddcarlogService;
import com.chexun.dealer.service.dealers.DealersContractService;
import com.chexun.dealer.service.dealers.DealersInfoService;
import com.chexun.dealer.service.permission.PermissionUserService;
import com.chexun.dealer.utils.MBaseController;
import com.chexun.dealer.utils.common.ClientHttpFile;
import com.chexun.dealer.utils.common.CookieUtil;
import com.chexun.dealer.utils.domain.Constants;
import com.chexun.dealer.vo.dealers.DealersInfoVo;
import com.chexun.dealer.vo.permission.PermissionUserVo;

@Controller
@RequestMapping("/admin")
public class DealersInfoController extends MBaseController {

	private static final Logger logger = Logger.getLogger(DealersInfoController.class);

	@Autowired
	private DealersInfoService dealersInfoService;
	@Autowired
	private DealersCarService dealersCarService;
	@Autowired
	private DealersAddcarlogService dealersAddcarlogService;
	@Autowired
	private DealersContractService dealersContractService;
	@Autowired
	private BuyCredentialsService buyCredentialsService;
	@Autowired
	private PermissionUserService permissionUserService;

	// 路径
	private String toList = "/admin/dealer/dealer_list.httl";// 列表页
	private String toAdd = "/admin/dealer/dealer_add.httl";// 添加页面
	private String toEditBindUser = "/admin/dealer/edit_bind_user.httl";// 修改页
	private String toEditDPower = "/admin/dealer/edit_dealer_power.httl";// 修改页
	private String toEditEPower = "/admin/dealer/edit_ebuy_power.httl";// 修改页
	private String toApplyPhoto = "/admin/dealer/apply_photo.httl";// 申请400
	private String toReviewedCredentials = "/admin/dealer/edit_credentials.httl";// 审核资质证书
	private String toEditList = "/admin/dealer/dealer_verify.httl";// 修改列表页
	//经销商管理列表
	@RequestMapping("/index")
	public ModelAndView listAll(HttpServletRequest request, HttpServletResponse response, DealersInfoVo query, @ModelAttribute("page") PageEntity page) {
		ModelAndView modelAndView=this.getModelAndView(request, Component.ADMIN, toList);
		try {
			page.setPageSize(10);
			if (query == null) {
				query = new DealersInfoVo();
			}
			List<DealersInfoPo> list = dealersInfoService.getDealersInfoPage(query, page);
			//开始权限
			modelAndView.addObject("query", query);
			modelAndView.addObject("dealersInfoList", list);
			modelAndView.addObject("page", page);
		} catch (Exception e) {
			logger.error("DealersInfoController.listAll", e);
			// return new ModelAndView(setExceptionRequestAdmin(request, e));
		}

		return modelAndView;
	}
	//审核经销商列表
	@RequestMapping(value = "/dealer/verify")
	public ModelAndView toEditList(HttpServletRequest request,HttpServletResponse response, DealersInfoVo query,@ModelAttribute("page") PageEntity page) {
		ModelAndView modelAndView = this.getModelAndView(request, Component.ADMIN, toEditList);
		try {
			page.setPageSize(10);
			if (query == null) {
				query = new DealersInfoVo();
			}
			query.setState(-1L);
			List<DealersInfoPo> list = dealersInfoService.getDealersInfoPage(query, page);
			modelAndView.addObject("dealersInfoList", list);
			modelAndView.addObject("page", page);
		} catch (Exception e) {
			logger.error("DealersInfoController.listAll", e);
			// return new ModelAndView(setExceptionRequestAdmin(request, e));
		}

		return modelAndView;
	}
	//到添加页面，如果带有经销商ID 代表是修改操作，则显示该供应商的信息
	@RequestMapping(value = "/dealer/add", method = RequestMethod.GET)
	public ModelAndView toAdd(HttpServletRequest request,HttpServletResponse response, DealersInfo dealersInfo) {
		ModelAndView modelAndView = this.getModelAndView(request, Component.ADMIN, toAdd);
		if (dealersInfo == null) {
			dealersInfo = new DealersInfo();
		}
		if(null!=dealersInfo.getId()&&dealersInfo.getId()>0){
			dealersInfo = dealersInfoService.getDealersInfoById(dealersInfo.getId());
			if(dealersInfo!=null){
				DealersCar dealersCar=new DealersCar();
				List<DealersCar> dealersCarList=new ArrayList<DealersCar>();
				dealersCar.setUserId(dealersInfo.getId());
				dealersCarList=dealersCarService.getDealersCarListByObj(dealersCar);
				Set<CarCompanySetPo> companySetList =new HashSet<CarCompanySetPo>();
				List<DealersCar> dealersCarSeriesList=new ArrayList<DealersCar>();
				for(DealersCar car:dealersCarList){
					CarCompanySetPo dealersCarSet=new CarCompanySetPo();
					dealersCarSet.setCompanyId(car.getCompanyId());
					dealersCarSet.setCompanyName(car.getCompanyName());
					companySetList.add(dealersCarSet);
					if(!check(dealersCarSeriesList,car)){
						dealersCarSeriesList.add(car);
					}
				}
				modelAndView.addObject("dealersInfo",dealersInfo);
				modelAndView.addObject("companySetList",companySetList);
				modelAndView.addObject("dealersCarList",dealersCarSeriesList);
			}
			modelAndView.addObject("dealersInfo",dealersInfo);
		}
		
		try {
		} catch (Exception e) {
			logger.error("DealersInfoController.toAdd", e);
		}
		return modelAndView;
	}
	//检查集合是否存在相同车系
	public Boolean check(List<DealersCar> dealersCarSeriesList,DealersCar car){
		Boolean bool=false;
		for(DealersCar car1:dealersCarSeriesList){
			if(car1.getSeriesId().equals(car.getSeriesId())){
				bool=true;//存在
			}else{
				bool=false;//不存在
			}
		}
		return bool;	
		
	}
	// 绑定经销商
	@RequestMapping(value = "/dealer/edit/bind/user", method = RequestMethod.GET)
	public ModelAndView toEditBindUser(HttpServletRequest request,Long id) {
		ModelAndView modelAndView =this.getModelAndView(request, Component.ADMIN, toEditBindUser); 
		try {
			DealersInfo dealersInfo = dealersInfoService.getDealersInfoById(id);
			modelAndView.addObject(dealersInfo);
		} catch (Exception e) {
			logger.error("DealersInfoController.toEdit", e);
		}
		return modelAndView;
	}

	// 更新经销商权限
	@RequestMapping(value = "/dealer/edit/dpower", method = RequestMethod.GET)
	public ModelAndView toEditDPower(HttpServletRequest request,Long id) {
		ModelAndView modelAndView = this.getModelAndView(request, Component.ADMIN, toEditDPower); 
		try {
			DealersInfo dealersInfo = dealersInfoService.getDealersInfoById(id);
			modelAndView.addObject(dealersInfo);
		} catch (Exception e) {
			logger.error("DealersInfoController.toEdit", e);
		}
		return modelAndView;
	}
	
	// 更新车E购权限
	@RequestMapping(value = "/dealer/edit/epower", method = RequestMethod.GET)
	public ModelAndView toEditEPower(HttpServletRequest request,Long id) {
		ModelAndView modelAndView = this.getModelAndView(request, Component.ADMIN, toEditEPower); 
		try {

			DealersInfo dealersInfo = dealersInfoService.getDealersInfoById(id);

			DealersAddcarlog dealersAddcarlog = new DealersAddcarlog();
			dealersAddcarlog.setDealerid(id);
			dealersAddcarlog = dealersAddcarlogService.getDealersAddcarlogByObj(dealersAddcarlog);

			DealersContract dealersContract = new DealersContract();
			dealersContract.setDealerid(id);
			dealersContract = dealersContractService.getDealersContractByObj(dealersContract);

			modelAndView.addObject("dealersInfo",dealersInfo);
			modelAndView.addObject("dealersAddcarlog",dealersAddcarlog);
			modelAndView.addObject("dealersContract",dealersContract);
		} catch (Exception e) {
			logger.error("DealersInfoController.toEdit", e);
		}
		return modelAndView;
	}

	// 申请400 toApplyPhoto
	@RequestMapping(value = "/dealer/apply/photo", method = RequestMethod.GET)
	public ModelAndView toApplyPhoto(HttpServletRequest request,Long id) {
		ModelAndView modelAndView = this.getModelAndView(request, Component.ADMIN, toApplyPhoto);
		try {

			DealersInfo dealersInfo = dealersInfoService.getDealersInfoById(id);
			modelAndView.addObject(dealersInfo);

		} catch (Exception e) {
			logger.error("DealersInfoController.toEdit", e);
		}
		return modelAndView;
	}

	// 资格证书 
	@RequestMapping(value = "/dealer/reviewed/credentials", method = RequestMethod.GET)
	public ModelAndView toReviewedCredentials(HttpServletRequest request,String dealerid) {
		ModelAndView modelAndView = this.getModelAndView(request, Component.ADMIN, toReviewedCredentials);
		try {
			BuyCredentials buyCredential=new BuyCredentials();
			buyCredential.setDealerid(Long.valueOf(dealerid));
			BuyCredentials buyCredentials = buyCredentialsService.getBuyCredentialsByObj(buyCredential);
			modelAndView.addObject("dealerid",dealerid);
			modelAndView.addObject("buyCredentials",buyCredentials);
		} catch (Exception e) {
			logger.error("DealersInfoController.toReviewedCredentials", e);
		}
		return modelAndView;
	}
	// 资格证书审核
	@ResponseBody
	@RequestMapping("/dealer/updCredentialsState")
	public String toEditCredentialsState(Long id,String bookNames,String dealerid,Long reviewedState) {
		String result = "0";
		String[] idArray = bookNames.split(",");
		BuyCredentials buyCredentials = new BuyCredentials();
		try {// 软隐藏状态设置为4
			for (String bookName : idArray) {
				if (!"".equals(bookName)) {
					buyCredentials=checkBuyCredentials(id,bookName,dealerid,reviewedState);
					
					this.buyCredentialsService.updateBuyCredentialsByObj(buyCredentials);
				}
			}
			result = "1";
		} catch (Exception e) {
			logger.error("DealersInfoController.updatestate", e);
		}
		return result;
	}
	//检查要审核的证书类型
	public BuyCredentials checkBuyCredentials(Long id,String bookName,String dealerid,Long reviewedState){
		BuyCredentials buyCredentials=new BuyCredentials();
		buyCredentials.setId(id);
		if(bookName.equals("zhizhao")){
			buyCredentials.setDealerid(Long.valueOf(dealerid));
			buyCredentials.setZhizhaostatus(reviewedState);
		}if(bookName.equals("jigou")){
			buyCredentials.setDealerid(Long.valueOf(dealerid));
			buyCredentials.setJigoustatus(reviewedState);
		}if(bookName.equals("shuiwu")){
			buyCredentials.setDealerid(Long.valueOf(dealerid));
			buyCredentials.setShuiwustatus(reviewedState);
		}if(bookName.equals("shouquan")){
			buyCredentials.setDealerid(Long.valueOf(dealerid));
			buyCredentials.setShouquanstatus(reviewedState);
		}
		return buyCredentials;
	}
	//经销商基础资料添加/修改
	@RequestMapping(value = "/dealer/save")
	@ResponseBody
	public String save(DealersInfo dealersInfo, String seriesIds,
			HttpServletRequest request) {
		Long ret = -1L;
		boolean bool=false;
		try {
			String userName = CookieUtil.getCookieValue(request.getCookies(),Constants.USER_KEY_COOKIE_INFO, "");
			if (!userName.isEmpty()) {
				dealersInfo.setUsername(userName);
				dealersInfo.setState(1L);
				dealersInfo.setCreateTime(DateUtils.dateToStr(new Date()));
				if(null!=dealersInfo.getId()&&dealersInfo.getId()>0){//修改
					bool=updBase(dealersInfo);
					if(bool){//修改车型
						updCarModel(dealersInfo,seriesIds);
					}
				}else{//添加
					 bool=addBase(dealersInfo);
					 if(bool){//添加车型
						 addCarModel(dealersInfo,seriesIds);
					 }
				}
			}
		} catch (Exception e) {
			logger.error("DealersInfoController.add", e);
			ret = -1L;
		}
		if(bool){
			ret = dealersInfo.getId();
		}
		return String.valueOf(ret);
	}
	//添加经销商基础资料
	public boolean addBase(DealersInfo dealersInfo){
		Long num = dealersInfoService.addDealersInfo(dealersInfo);
		if(num>0){
			return true;
		}else{
			return false;
		}
	}
	//修改经销商基础资料
	public boolean updBase(DealersInfo dealersInfo){
		Long num = dealersInfoService.updateDealersInfoByObj(dealersInfo);
		if(num>0){
			return true;
		}else{
			return false;
		}
	}
	String SeriesURL = "http://api.tool.chexun.com/pc/downSeriesInfo.do?seriesId=";
	String ModeURL = "http://api.tool.chexun.com/pc/downModelInfo.do?seriesId=";
	//添加经销商所选车型
	public boolean addCarModel(DealersInfo dealersInfo,String seriesIds){
		if (!seriesIds.isEmpty()) {
			String seriesId[] = seriesIds.split(",");
			for (String seriesid : seriesId) { 
				if(!"undefined".equals(seriesid)){
				// 根据车系查询车型信息
				String jsonData = ClientHttpFile.wgetIfcString(ModeURL+ seriesid, 1000 * 60);
				new JSONArray();
				JSONArray jsonArray = JSONArray.fromObject(jsonData);
				String seriesjsonData = ClientHttpFile.wgetIfcString(SeriesURL + seriesid, 1000 * 60);
				JSONArray seriesjsonArray = new JSONArray(seriesjsonData);
				if (jsonArray.length() != 0) {// 记录有信息的数据
					// json数组 获取数据
					for (int j = 0; j < jsonArray.length(); j++) {
						JSONObject obj = (JSONObject) jsonArray.get(j);
						DealersCar car = new DealersCar();
						////###################Start 从车型接口中收集数据Start######################////
						car.setSeriesId(Long.valueOf(String.valueOf(obj.get("seriesId"))));
						car.setSeriesName(String.valueOf(obj.get("seriesName")));
						car.setModelId(Long.valueOf(String.valueOf(obj.get("modelId"))));
						car.setModelName(String.valueOf(obj.get("modelName")));
						BigDecimal b2 = BigDecimal.valueOf(Double.valueOf(String.valueOf(obj.get("guidePrice"))));
						car.setCompanyprice(b2);
						car.setConsultprice(b2);
						car.setYearId(Long.valueOf(String.valueOf(obj.get("yearId"))));
						car.setYearName(String.valueOf(obj.get("yearName")));
						////###################End 从车型接口中收集数据End##########################////
						
					    ////###################Start 从车系接口中收集数据Start######################////
						if (seriesjsonArray.length() != 0) {
							JSONObject obj1 = (JSONObject) seriesjsonArray.get(0);
							if (String.valueOf(obj.get("seriesId")).equals(String.valueOf(obj1.get("seriesId")))) {
								car.setBrandId(Long.valueOf(String.valueOf(obj1.get("brandId"))));
								car.setBrandName(String.valueOf(obj1.get("brandName")));
								car.setCompanyId(Long.valueOf(String.valueOf(obj1.get("companyId"))));
								car.setCompanyName(String.valueOf(obj1.get("companyName")));
							}
						}
					    ////###################End 从车系接口中收集数据End###########################////
						
					    ////###################Start 从经销商基础资料中收集数据Start##################////
						car.setUserId(dealersInfo.getId());
						car.setCityId(dealersInfo.getCityId());
						car.setCreateTime(new Date());
						////###################End 从经销商基础资料中收集数据End######################////
						Long v=dealersCarService.insertDealersCar(car);
					}
				}
			}
		}
	}
		return true;
}
	//修改经销商所选车型
	public boolean updCarModel(DealersInfo dealersInfo,String seriesIds){
		DealersCar car = new DealersCar();
		car.setUserId(dealersInfo.getId());
		Long num=dealersCarService.deleteDealersCarByObj(car);
		addCarModel(dealersInfo,seriesIds);
		return true;
	}
	//删除选择的车型
	@ResponseBody
	@RequestMapping("/dealer/deleteCarModel")
	public String deleteCarModel(String dealerId,String seriesIds,String callback,HttpServletRequest request ) {
		String jsonString = "";
		String[] idArray = seriesIds.split(",");
		DealersCar dealersCar=new DealersCar();
		Long num=-1L;
		try {
			if(idArray.length>0){
				for (String seriesId : idArray) {
					if (!"".equals(seriesId)) {
						dealersCar.setSeriesId(Long.valueOf(seriesId));
						dealersCar.setUserId(Long.valueOf(dealerId));
						num+=dealersCarService.deleteDealersCarByObj(dealersCar);
					}
				}
				
			}else{
				num=-2L;
			}
			
		} catch (Exception e) {
			logger.error("DealersInfoController.delete", e);
			num=-1L;
		}
		if (callback != null && !"".equals(callback)) {
			jsonString = callback + "(" + num + ")";
		}
		return jsonString;
	}
	
	// 隐藏
	@ResponseBody
	@RequestMapping("/dealer/updstate")
	public String toEditState(String ids) {
		String result = "0";
		String[] idArray = ids.split(",");
		DealersInfo dealersInfo = new DealersInfo();
		try {// 软隐藏状态设置为4
			for (String id : idArray) {
				if (!"".equals(id)) {
					dealersInfo.setId(Long.valueOf(id));
					dealersInfo.setState(4L);
					this.dealersInfoService.updateDealersInfoByObj(dealersInfo);
				}
			}
			result = "1";
		} catch (Exception e) {
			logger.error("DealersInfoController.updatestate", e);
		}
		return result;
	}
	// 审核经销商操作
	@ResponseBody
	@RequestMapping("/dealer/updstateVerify")
	public String toEditStateVerify(String dealerId) {
		String result = "0";
		DealersInfo dealersInfo = new DealersInfo();
		try {// 审核经销商操作,状态设置为4
			dealersInfo.setId(Long.valueOf(dealerId));
			dealersInfo.setState(1L);
			Long num=this.dealersInfoService.updateDealersInfoByObj(dealersInfo);
			if(num>0){
				result = "1";
			}else{
				result = "-1";
			}
		} catch (Exception e) {
			logger.error("DealersInfoController.toEditStateVerify", e);
		}
		return result;
	}
	// 推荐
	@ResponseBody
	@RequestMapping("/dealer/updisrecommendfirst")
	public String toEditIsRecommendFirst(String ids) {
		String result = "0";
		String[] idArray = ids.split(",");
		DealersInfo dealersInfo = new DealersInfo();
		try {// 推荐状态设置为1
			for (String id : idArray) {
				if (!"".equals(id)) {
					dealersInfo.setId(Long.valueOf(id));
					dealersInfo.setIsrecommendfirst(1L);
					this.dealersInfoService.updateDealersInfoByObj(dealersInfo);
				}
			}
			result = "1";
		} catch (Exception e) {
			logger.error("DealersInfoController.updatestate", e);
		}
		return result;
	}

	// 查看前台,获取经销商别名
	@ResponseBody
	@RequestMapping("/dealer/viewwebsite")
	public String toGetDealerInfoById(String ids) {
		String result = "";
		String[] idArray = ids.split(",");
		DealersInfo dealersInfo = new DealersInfo();
		try {// 获取dealerInfo 别名信息 EnglishAlias
			String id = idArray[0];
			if (!"".equals(id)) {
				dealersInfo = this.dealersInfoService.getDealersInfoById(Long
						.valueOf(id));
			}
			result = dealersInfo.getEnglishAlias();
		} catch (Exception e) {
			logger.error("DealersInfoController.updatestate", e);
		}
		return result;
	}
	// 查看后台,获取经销商报表
	@ResponseBody
	@RequestMapping("/dealer/viewsystem")
	public String toGetDealerReportById(String ids) {
		String result = "";
		String[] idArray = ids.split(",");
		DealersInfo dealersInfo = new DealersInfo();
		try {// 获取dealerInfo 别名信息 EnglishAlias
			String id = idArray[0];
			if (!"".equals(id)) {
				dealersInfo = this.dealersInfoService.getDealersInfoById(Long.valueOf(id));
		}
			result = dealersInfo.getEnglishAlias();
		} catch (Exception e) {
			logger.error("DealersInfoController.updatestate", e);
		}
		return result;
	}
	// 更新报价
	@ResponseBody
	@RequestMapping("/dealer/upddatetime")
	public String toEditcreattime(String ids) {
		String result = "0";
		String[] idArray = ids.split(",");
		long num = 0;
		DealersCar dealersCar = new DealersCar();
		try {
			for (String id : idArray) {
				if (!"".equals(id)) {
					dealersCar.setId(Long.valueOf(id));
					dealersCar.setDateTime(new Date());
					long rows = dealersCarService.updateDealersCarByObj(dealersCar);
					num = num + rows;
				}
			}
			result = String.valueOf(num);
		} catch (Exception e) {
			logger.error("DealersInfoController.updatestate", e);
		}
		return result;
	}

	// 更新经销商信息
	@ResponseBody
	@RequestMapping("/dealer/upddealersInfo")
	public String toEditDealersInfo(DealersInfo dealersInfo,HttpServletRequest request) {
		String callback = request.getParameter("callback");
		String jsonString = "";
		String result = "-1";
		try {// 软隐藏状态设置为4
			long rows = this.dealersInfoService.updateDealersInfoByObj(dealersInfo);
			if (rows > 0) {
				//绑定用户时，在dealer系统添加新用户并赋予经销商角色
				if(null!=dealersInfo.getUsername()){
					PermissionUserVo permissionUserVo=new PermissionUserVo();
					permissionUserVo.setRoleCode(3L);
					permissionUserVo.setUserName(dealersInfo.getUsername());
					permissionUserService.savePermissionUser(permissionUserVo);
				}
				result = "1";
			}
		} catch (Exception e) {
			logger.error("DealersInfoController.DealersInfo", e);
			result = "-1";
		}
		if (callback != null && !"".equals(callback)) {
			jsonString = callback + "(" + result + ")";
		}
		return jsonString;
	}
	
	
}
