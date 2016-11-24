package com.chexun.dealer.utils;

import com.chexun.base.common.util.io.PropertyUtil;

public class InterfaceUrlConstant {
	
	// 属性文件配置名称
	public static final String PROPERTY_FILE_NAME = "project";
	// 读取配置文件类
	public static final PropertyUtil propertyUtil = PropertyUtil.getInstance(PROPERTY_FILE_NAME);
	
	//经销商项目路径
	public static final String dealerContextPath = propertyUtil.getProperty("dealerContextPath");
	
	//拆车项目路径
	public static final String chaicheContextPath = propertyUtil.getProperty("chaicheContextPath");
	
	//金融项目路径
	public static final String jinrongContextPath = propertyUtil.getProperty("jinrongContextPath");
	
	//auto项目路径
	public static final String autoContextPath = propertyUtil.getProperty("autoContextPath");
			
	//cms项目路径
	public static final String cmsContextPath = propertyUtil.getProperty("cmsContextPath");
		
	//reg项目路径
	public static final String regContextPath = propertyUtil.getProperty("regContextPath");
	
	//utility项目路径
	public static final String utilityContextPath = propertyUtil.getProperty("utilityContextPath");
		
	//根据ip获取所在城市接口
	public static final String GET_USER_CITY_INTERFACE_URL = utilityContextPath + "/cgi/ipinfo?ip=";
	
}
