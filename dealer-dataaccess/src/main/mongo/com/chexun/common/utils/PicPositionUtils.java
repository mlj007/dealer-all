package com.chexun.common.utils;

import java.util.HashMap;

public class PicPositionUtils {
	public static HashMap<String,String> position = new HashMap<String,String>() ;
	static {
		position.put("1", "车头左侧45度") ;
		position.put("2", "车头正面") ;
		position.put("3", "车头左侧60度") ;
		position.put("4", "车身左侧正") ;
		position.put("5", "车尾左侧45度") ;
		position.put("6", "车尾正面") ;
		position.put("7", "车尾右侧45度") ;
		position.put("8", "车身右侧面正") ;
		position.put("9", "车头右侧45度") ;
		position.put("10", "车头右侧60度") ;
		
		position.put("11", "车身45度仰视") ;
		position.put("12", "车身侧面45度俯视") ;
		position.put("13", "车尾45度仰视") ;
		position.put("14", "车头左侧45度（敞篷）") ;
		position.put("15", "车头右侧45度（敞篷）") ;
		position.put("16", "车身左侧面（敞篷）") ;
		position.put("17", "车身右侧（敞篷）") ;
		position.put("18", "车尾正面（敞篷）") ;
		position.put("19", "车尾左45度（敞篷）") ;
		position.put("20", "车尾右侧45度（敞篷）") ;
		
		position.put("21", "车头45度斜向右上") ;
		position.put("22", "车头45度斜向左上") ;
		position.put("23", "车尾45度斜向左下") ;
		position.put("24", "车尾45度斜向右下") ;
		position.put("25", "车头45度左（动态）") ;
		position.put("26", "车头正面（动态）") ;
		position.put("27", "车头45度右（动态）") ;
		position.put("28", "车身右侧（动态）") ;
		position.put("29", "车身左侧（动态）") ;
		position.put("30", "车头朝左下正侧面（动态）") ;
		
		position.put("31", "车头朝左上侧面（动态）") ;
		position.put("32", "车尾左侧45度（动态）") ;
		position.put("33", "车头45度（仰视、动态）") ;
		position.put("34", "车尾右侧45度（动态）") ;
		position.put("35", "前大灯") ;
		position.put("36", "前大灯左") ;
		position.put("37", "前进气格栅") ;
		position.put("38", "车头特写") ;
		position.put("39", "车头正面特写") ;
		position.put("40", "车头俯视特写") ;
		
		position.put("41", "前大灯（点亮）") ;
		position.put("42", "前大灯侧面") ;
		position.put("43", "右侧雾灯") ;
		position.put("44", "左侧雾灯") ;
		position.put("45", "后视镜外侧") ;
		position.put("46", "后视镜内侧") ;
		position.put("47", "前轮") ;
		position.put("48", "后轮") ;
		position.put("49", "轮胎尺寸") ;
		position.put("50", "雨刷") ;
		
		position.put("51", "前门把手") ;
		position.put("52", "后门把手") ;
		position.put("53", "油箱盖") ;
		position.put("54", "油箱盖（打开状）") ;
		position.put("55", "天线") ;
		position.put("56", "天窗") ;
		position.put("57", "尾部特写") ;
		position.put("58", "左侧尾灯") ;
		position.put("59", "右侧尾灯") ;
		position.put("60", "左侧尾灯（侧面）") ;
		
		position.put("61", "高位刹车灯") ;
		position.put("62", "排气管") ;
		position.put("63", "底盘悬挂") ;
		position.put("64", "后悬架全景") ;
		position.put("65", "发动机舱（全局）") ;
		position.put("66", "发动机舱") ;
		position.put("67", "发动机") ;
		position.put("68", "发动机（特写）") ;
		position.put("69", "钥匙") ;
		position.put("70", "钥匙（打开状）") ;
		
		position.put("71", "中控台全景") ;
		position.put("72", "中控台左侧视") ;
		position.put("73", "中控台右侧视图") ;
		position.put("74", "中控台上侧视") ;
		position.put("75", "方向盘全景") ;
		position.put("76", "中控台正中") ;
		position.put("77", "中控台右侧") ;
		position.put("78", "中控台左侧") ;
		position.put("79", "方向盘特写") ;
		position.put("80", "方向盘左侧按键特写") ;
		
		position.put("81", "方向盘右侧按键特写") ;
		position.put("82", "空调出风口") ;
		position.put("83", "灯光控制区") ;
		position.put("84", "转向灯控制杆") ;
		position.put("85", "雨刷器控制杆") ;
		position.put("86", "点火系统") ;
		position.put("87", "仪表全景") ;
		position.put("88", "仪表左侧") ;
		position.put("89", "仪表右侧") ;
		position.put("90", "音响控制区") ;
		
		position.put("91", "空调控制区") ;
		position.put("92", "副驾驶手套箱") ;
		position.put("93", "遮阳板化妆镜") ;
		position.put("94", "手刹拉杆") ;
		position.put("95", "换挡杆右侧") ;
		position.put("96", "换挡杆左侧") ;
		position.put("97", "前排空间") ;
		position.put("98", "前排座椅特写") ;
		position.put("99", "座椅靠背") ;
		position.put("100", "驾驶座椅调节方式") ;
		
		position.put("101", "前排重要扶手") ;
		position.put("102", "前排中央扶手手套") ;
		position.put("103", "眼镜盒") ;
		position.put("104", "副驾驶调节方式") ;
		position.put("105", "后排空间") ;
		position.put("106", "后排座椅") ;
		position.put("107", "后排中央扶手") ;
		position.put("108", "左前门内侧") ;
		position.put("109", "左前门内侧特写") ;
		position.put("110", "前门内侧储物空间") ;
		
		position.put("111", "车窗控制按") ;
		position.put("112", "左后门内侧") ;
		position.put("113", "左后门内侧特写") ;
		position.put("114", "后备箱全景") ;
		position.put("115", "后备箱空间") ;
		position.put("116", "座椅放倒") ;
		
	}
	public static void main(String args[]){
		System.out.println(position.get("1")) ;
	}
}
