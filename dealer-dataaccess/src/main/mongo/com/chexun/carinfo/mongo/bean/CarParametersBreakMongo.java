 /**     
   * @create.date: 2012-3-21 上午10:09:41
   * @author: lfz 
   * @company: 车马驿站
   * @see:com.chexun.carinfo.mongo 
   */ 
package com.chexun.carinfo.mongo.bean;

import java.io.Serializable;

import com.chexun.common.mongo.AnnotationMongoKey;

 /**  
 * @create.date: 2012-3-21 上午10:09:41     
 * @comment: <p>TODO</p>
 * @see: com.chexun.carinfo.mongo
 * @author: lfz
 * @modify.by: lfz
 * @modify.date: 2012-3-21 上午10:09:41
 */
public class CarParametersBreakMongo implements Serializable {

	private static final long serialVersionUID = 1L;
	public static final String MONGO_COLLECT_NAME = "car_parameters_break";
	
	@AnnotationMongoKey
	private Integer id;
	private Integer model;
	//前保险杠
	private String frontCareCount ; //前防撞梁防护层数
	private String frontCareLength; //前保险杠长度
	private String frontCareWidth;  //前保险杠宽度
	private String frontCareHeight;  //前保险杠高度
	private String frontCareThick;  //前保险杠厚度
	private String front2CareLength;  //前二级保险杠长度
	private String front2CareWidth;  //前二级保险杠宽度
	private String front2CareHeight;  //前二级保险杠高度
	private String front2CareThick;  //前二级保险杠厚度
	private String frontXinengLength;  //前吸能盒长度
	private String frontXinengWidth;  //前吸能盒宽度
	private String frontXinengHeight;  //前吸能盒高度
	private String frontXinengThick;  //前吸能盒厚度
	private String frontToEarthHeight;  //前保险杠距地高度
	private String frontCareMpa;  //前防撞梁钢板兆帕值
	private String frontCareScore;  //前保险杠评分
	private String frontCareComment;  //前保险杠编辑点评
	
	//ABC柱
	private String aGangThick;  //A柱钢板总厚度（含空隙）
	private String aOutGangThick;  //A柱外层钢板厚度(mm)
	private String aCenterGangThick;  //A柱中层钢板厚度(mm)
	private String aInGangThick;  //A柱内层钢板厚度(mm)
	private String bGangThick;  //B柱钢板总厚度（含空隙）
	private String bOutGangThick;  //B柱外层钢板厚度(mm)
	private String bCenterGangThick;  //B柱中层钢板厚度(mm)
	private String bInGangThick;  //B柱内层钢板厚度(mm)
	private String cGangThick;  //C柱钢板总厚度（含空隙） 	
	private String cOutGangThick;  //C柱外层钢板厚度(mm)
	private String cCenterGangThick;  //C柱中层钢板厚度(mm)
	private String cInGangThick;  //C柱内层钢板厚度(mm)
	private String aGangMpa;  //A柱钢板兆帕值(Mpa)
	private String bGangMpa;  //B柱钢板兆帕值(Mpa)
	private String cGangMpa;  //C柱钢板兆帕值(Mpa)
	private String abcScore;  //ABC柱评分
	private String abcComment;  //ABC柱点评
	
	//后保险杠
	private String backCareCount ; //后防撞梁防护层数
	private String backCareLength ; //后保险杠长度(mm)
	private String backCareWidth ; //后保险杠宽度(mm)
	private String backCareHeight ; //后保险杠高度(mm)
	private String backCareThick ; //后保险杠厚度(mm)
	private String back2CareLength ; //后二级保险杠长度(mm)
	private String back2CareWidth ; //后二级保险杠宽度(mm)
	private String back2CareHeight ; //后二级保险杠高度(mm)
	private String back2CareThick ; //后二级保险杠厚度(mm)
	private String backXinengLength ; //后吸能盒长度(mm)
	private String backXinengWidth ; //后吸能盒宽度(mm)
	private String backXinengHeight ; //后吸能盒高度(mm)
	private String backXinengThick ; //后吸能盒厚度(mm)
	private String backToEarthHeight ; //后保险杠距地高度(mm)
	private String backCareMpa ; //后防撞梁钢板兆帕值(Mpa)
	private String backCareScore ; //后保险杠评分
	private String backCareComment ; //后保险杠点评
	
	
	//前门后门
	private String frontdoorLevel ; //前车门铰链级数
	private String doormeterhan ; //门框每米点焊数
	private String frontdoorgangbanMpa ; //前门槛梁钢板兆帕值
	private String frontdoorfangzhuang ; //前门防撞梁数量
	private String frontdoorfangzhuangMpa ; //前门防撞梁兆帕值
	private String frontdoorfangzhuang1Width ; //前门防撞梁1直径/宽度
	private String frontdoorfangzhuang2Width ; //前门防撞梁2直径/宽度
	private String frontdoorfangzhuang1Height ; //前门防撞梁1距地高度
	private String frontdoorfangzhuang2Height ; //前门防撞梁2距地高度
	private String frontdoorMaxDistance ; //前门最大开启距离
	private String backdoorLevel ; //后车门铰链级数
	private String backdoorgangbanMpa ; //后门槛梁钢板兆帕值
	private String backdoorfangzhuang ; //后门防撞梁数量
	private String backdoofangzhuangMpa ; //后门防撞梁兆帕值
	private String backdoorfangzhuang1Width ; //后门防撞梁1直径/宽度
	private String backdoorfangzhuang2Height ; //后门防撞梁2直径/宽度
	private String backdoorfangzhuang1Height ; //后门防撞梁1距地高度
	private String backdoorfangzhuang2Width ; //后门防撞梁2距地高度
	private String backdoorMaxDistance ; //后门最大开启距离
	private String backdoorScrore ; //前后车门评分
	private String backdoorComment ; //前后车门点评
	
	//翼子板
	private String yizibanThick ; //翼子板厚度
	private String yizibanScore ; //翼子板评分
	private String yizibanComment ; //翼子板点评
	private String YIZIBAN_CAIZHI;//翼子板材质
	private String GEYINMIAN_CAIZHI;//隔音棉材质
	
	//车系顶配相关
	private String tianhuabanThick ; //天花板厚度
	private String jiaqiangjinCount ; //顶棚加强筋数量
	private String jiaqiangjinMpa ; //顶棚加强筋兆帕值
	private String mainJiaqiangjinWidth ; //主顶棚加强筋宽度
	private String mainJiaqiangjinThick ; //主顶棚加强筋钢板厚度
	private String fuJiaqiangjinWidth ; //副顶棚加强筋宽度
	private String fuJiaqiangjinThick; //副顶棚加强筋钢板厚度
	private String dingpeiScrore ; //顶配相关评分
	private String dingpeiComment ; //顶配相关点评
	
	
	//刹车系统
	private String frontShache ; //前刹车盘直径
	private String backShache ; //后刹车盘直径
	private String shacheScore ; //刹车系统评分
	private String shacheComment ; //刹车系统点评
	
	
	//钣金缝隙
	private String leftAverage ; //左机器盖缝隙平均值
	private String leftAaverage ; //左A柱缝隙平均值
	private String leftBaverage ; //左B柱缝隙平均值
	private String leftCaverage ; //左C柱缝隙平均值
	private String rightAverage ; //右机器盖缝隙平均值
	private String rightAaverage ; //右A柱缝隙平均值
	private String rightBaverage ; //右B柱缝隙平均值
	private String rightCaverage ; //右C柱缝隙平均值
	private String backaverage ; //后备箱盖缝隙平均值
	private String banjinScore ; //钣金缝隙评分
	private String banjinComment ; //钣金缝隙点评

	//新增
	private String LEFT_MAXVAL; //左机器盖缝隙最大差值(mm)
	private String LEFTA_MAXVAL ; //左A柱缝隙最大差值(mm)
	private String LEFTB_MAXVAL ; //左B柱缝隙最大差值(mm)
	private String LEFTC_MAXVAL ; //左C柱缝隙最大差值(mm)
	private String RIGHT_MAXVAL ; //右机器盖缝隙最大差值(mm)
	private String RIGHTA_MAXVAL ; //右A柱缝隙最大差值(mm)
	private String RIGHTB_MAXVAL ; //右B柱缝隙最大差值(mm)
	private String RIGHTC_MAXVAL ; //右C柱缝隙最大差值(mm)
	private String BACK_MAXVAL ; //后备箱盖缝隙最大差值(mm)
	
	//漆面硬度
	private String qimianYingdu ; //漆面图层硬度
	private String qimianYingduScore ; //漆面图层硬度评分
	private String qimianYingduComment ; //漆面图层硬度点评
	
	//舒适性测试
	private String frontNVH60 ; //NVH前排成绩-时速60公里
	private String frontNVH80 ; //NVH前排成绩-时速80公里
	private String frontNVH100 ; //NVH前排成绩-时速100公里
	private String backNVH60 ; //NVH后排成绩-时速60公里
	private String backNVH80 ; //NVH后排成绩-时速80公里
	private String backNVH100 ; //NVH后排成绩-时速100公里
	private String NVHScore ; //舒适性测试评分
	private String NVHComment ; //舒适性测试点评
	
	
	//钣金喷漆工艺
	private String leftBanjinThick ; //左前翼子板涂层厚度和
	private String rightBanjinThick ; //右前翼子板涂层厚度
	private String leftDoorBanjinThick ; //门左侧涂层厚度
	private String rightDoorBanjinThick ; //门右侧涂层厚度
	private String mechineBanjinThick ; //机器盖涂层厚度
	private String backBanjinThick ; //后备箱盖涂层厚度
	private String banjinGongyiScore ; //钣金喷漆工艺评分
	private String banjinGongyiComment ; //钣金喷漆工艺点评
	//新加
	private String ZQYZBTCHDPJZ ; //左前翼子板涂层厚度平均值
	private String YQYZBTCHDPJZ ; //右前翼子板涂层厚度平均值
	private String MZCTCHDPJZ ; //门左侧涂层厚度平均值
	private String MYCTCHDPJZ ; //门右侧涂层厚度平均值
	private String JQGTCHDPJZ ; //机器盖涂层厚度平均值
	private String HBXGTCHDPJZ ; //后备箱盖涂层厚度平均值
	private String QMHDZCZDCZ;//漆面厚度整车最大差值;
	
	//其它
	private String jinqikouHeight ; //进气口高度
	
	//数据维护
	private String totalScore; //车型总评分
	private String ticheLink ; //提车作业链接
	private String staticCompareLink ; //静态对比
	private String testLink ; //评测
	private String compareLink ; //对比报告
	private String singleCarLink ; //单车报告
	
	private String topicLink ; //专题链接
	private String qiangangNewsLink; //前杠新闻链接
	private String hougangNewsLink; //后杠新闻链接
	private String dingpengNewsLink; //顶棚新闻链接
	private String doorNewsLink; //车门新闻链接
	private String position1 ; //位置1
	private String newsLink1 ; //新闻链接1
	private String position2 ; //位置2
	private String newsLink2 ; //新闻链接2
	private String position3 ; //位置3
	private String newsLink3 ; //新闻链接3
	private String position4 ; //位置4
	private String newsLink4 ; //新闻链接4
	private String position5 ; //位置5
	private String newsLink5 ; //新闻链接5
	
	private String advantages1 ;//优点1
	private String advantages2 ;//优点2
	private String advantages3 ;//优点3
	private String advantages4 ;//优点4
	private String advantages5 ;//优点5
	private String advantages6 ;//优点6
	private String advantages7 ;//优点7
	private String advantages8 ;//优点8
	private String advantages9 ;//优点9
	private String advantages10 ;//优点10
	
	
	private String weakness1; //缺点1
	private String weakness2; //缺点2
	private String weakness3; //缺点3
	private String weakness4; //缺点4
	private String weakness5; //缺点5
	private String weakness6; //缺点6
	private String weakness7; //缺点7
	private String weakness8; //缺点8
	private String weakness9; //缺点9
	private String weakness10; //缺点10
	
	//所有评分汇总  added by jiangpeng at 20131029
	
	private String frontGuardScore; // 前保险杠
	private String backGuradScore; // 后保险杠
	private String yizibanScore2; // 翼子板
	private String frontDoorScore; // 前车门
	private String backDoorScore; // 后车门
	private String roofStructureScore; // 车顶结构
	private String hanjieScore; // 焊接工艺
	private String azhuScore; // A柱
	private String bzhuScore; // B柱
	private String czhuScore; // C柱
	private String floorStructureScore; // 地板结构
	private String neishicailiaoScore; // 内饰材料
	private String neishizuranScore; // 内饰阻燃性
	private String zhengchebuxianScore; // 整车布线
	private String fengxiScore; // 缝隙均匀度
	private String qimoyingduScore; // 漆膜硬度
	private String qimianhouduScore; // 漆面厚度
	private String dipanfangfuScore; // 底盘防腐
	private String airScore; // 空气质量
	private String frontSeatComfortScore; // 驾乘舒适性（前座）
	private String backSeatComfortScore; // 驾乘舒适性（后座）
	private String xuanguaxitongScore; // 悬挂系统
	private String tyreSizeScore; // 轮胎规格
	private String speedUpTestScore; // 加速测试
	private String breakingTestScore; // 制动测试
	private String raozhuangTestScore; // 绕桩测试
	private String noiseTestScore; // 噪音测试
	private String zhuansuTestScore; // 转速测试
	private String consumptionTestScore; // 油耗测试
	private String fujiaScore; // 附加分值
	private String fujiajianfen; //附件减分
	private String chaijiegoumaiScore; // 拆解购买指数
	
	//2014-09-24 add
	private String FRONT_BUMPER_STRENGTH ;//前保险杠强度
	private String FRONT_ENERGY_BOX_STRENGTH ;//前吸能盒强度
	private String FRONT_LONGERON_STRENGTH ;//前纵梁强度
	private String AFTER_ANTICOLLISION_STRENGTH ;//后防撞梁强度
	private String AFTER_ENERGY_BOX_STRENGTH ;//后吸能盒强度
	private String AFTER_LONGERON_STRENGTH ;//后纵梁强度
	private String FRONT_DOOR_STRENGTH ;//前门防撞梁强度
	private String AFTER_DOOR_STRENGTH ;//后门防撞梁强度
	private String CEILING_ANTICOLLISION_STRENGTH ;//顶棚防撞梁强度
	private String ASTEELPLATE_STRENGTH ;//A柱钢板强度
	private String BSTEELPLATE_STRENGTH ;//B柱钢板强度
	private String CSTEELPLATE_STRENGTH ;//C柱钢板强度
	private String INTERIOR_COMBUSTION_STATUS ;//内饰燃烧状态
	private String ENGINE_CABLE_PROTECTION ;//发动机舱电缆布线及保护
	private String SHUTTER_CABLE_PROTECTION ;//门板电缆布线及保护
	private String CEILING_CABLE_PROTECTION ;//顶棚电缆布线及保护
	private String CAR_CABLE_PROTECTION ;//车内电缆布线及保护
	private String SINGLE_BIGGEST_GAP_ERROR ;//单条最大缝隙误差
	private String SINGLE_PAINT__PLATE ;//单面最大钢板漆面厚度差值
	private String VEHICEL_MAXIMUM_PAINT ;//整车最大喷漆厚度差值
	private String FRONT_ROW_60_SPEED ;//前排60公里/小时 
	private String FRONT_ROW_100_SPEED ;//前排100公里/小时
	private String AFTER_ROW_60_SPEED ;//后排60公里/小时
	private String AFTER_ROW_100_SPEED ;//后排100公里/小时
	private String FRONT_SUSPENSION_SYSTEM ;//前悬挂系统
	private String AFTER_SUSPENSION_SYSTEM ;//后悬挂系统
	private String TIRE_CAR_DATE_DIFFERENT ;//轮胎与整车生产日期差
	private String ENGINE_EFFICIENCY ;//发动机效率（实测与官方对比）
	private String ROUND_EFFICIENCY_COMPARE ;//轮出功率与实测功率效率对比
	private String TORQUE_CONTRAST ;//扭矩对比（实测扭矩与官方扭矩）
	
	private String weiqijudigaodu;//尾气距地高度
	
	//轮胎参数
	private String TIRE_BRAND;//轮胎品牌
	private String TIRE_MODEL;//轮胎型号
	private String TIRE_SPEED_LEVEL;//轮胎速度等级
	private String TIRE_PRODUCTION_DATE;//轮胎生产日期
	
	
	//电瓶规格
	private String BATTERY_BRAND;//电瓶品牌
	private String BATTERY_MODEL;//电瓶型号
	private String BATTERY_CAPACITY;//电瓶容量(ah)
	private String BATTERY_TYPE;//电瓶种类(免维护/维护)
	
	//防冻液冰点测试
	private String ANTIFREEZE_FREEZING_POINT;//防冻液冰点(℃)
	private String GLASS_WATER_FREEZING_POINT;//玻璃水冰点(℃)
	private String ELECTROLYTE_CONCENTRATION;//电解液浓度
	
	//液体含水量测试
	private String STEERING_OIL;//转向机油
	private String BRAKE_FLUID;//刹车油
	
	//安全人性设计
	private String QJQGYYG;//前机器盖液压杆
	private String HBXGYYG;//后备箱盖液压杆
	private String FIRE_EXTINGUISHER;//灭火器
	private String TRIANGLE;//三角牌
	private String IS_OPEN_DOOR;//锁车断电后是否可打开车门
	
	//动态测试
	private String LDBGLJSSJ;//0-100公里/小时加速时间(s)
	private String BDLGLZDSJ;//100-0公里/小时制动时间(s)
	private String ZKRZSD;//最快绕桩时速(km)
	private String DSSCNZY;//怠速时车内噪音(db)
	private String SS40GLXSCNZY;//时速40公里行驶车内噪音(db)
	private String SS60GLXSCNZY;//时速60公里行驶车内噪音(db)
	private String SS80GLXSCNZY;//时速80公里行驶车内噪音(db)
	private String SS100GLXSCNZY;//时速100公里行驶车内噪音(db)
	private String SS120GLXSCNZY;//时速120公里行驶车内噪音(db)
	private String SS40GLSFDJZS;//时速40公里时发动机转速(rpm)
	private String SS60GLSFDJZS;//时速60公里时发动机转速(rpm)
	private String SS80GLSFDJZS;//时速80公里时发动机转速(rpm)
	private String SS100GLSFDJZS;//时速100公里时发动机转速(rpm)
	private String SS120GLSFDJZS;//时速120公里时发动机转速(rpm)
	private String BGLZHYH;//百公里综合油耗(/100km)
	
	
	//整车电磁辐射测试
	private String ENGINE_CABIN_LEFT;//发动机舱左侧
	private String ENGINE_CABIN_MID;//发动机舱中间
	private String ENGINE_CABIN_RIGHT;//发动机舱右侧
	private String CLOSE_HOOD;//关闭发动机盖
	private String JSYJX_CLOSE_AIR;//驾驶员脚下-关闭空调
	private String JSYJX_OPEN_AIR;//驾驶员脚下-打开空调
	private String FJSJX_OPEN_AIR;//副驾驶脚下-打开空调
	private String FJSJX_CLOSE_AIR;//副驾驶脚下-关闭空调
	private String CLOSE_SOUND_AIR;//中控台-关闭音响和空调
	private String OPEN_SOUND_AIR;//中控台-打开音响和空调
	private String BACK_LEFT;//后排左侧
	private String BACK_MID;//后排中间
	private String BACK_RIGHT;//后排右侧
	private String DOOR_OPERATION;//门窗操作
	private String SOUND;//音响
	
	//车内空间
	private String FRONT_WIDTH;//前排宽度(mm)
	private String FRONT_HEIGHT;//前排高度(mm)
	private String FRONT_LEGROOM_MIN;//前排腿部空间最小值(mm)
	private String FRONT_LEGROOM_MAX;//前排腿部空间最大值(mm)
	private String FRONT_SEAT_HEIGHT;//前排坐垫长度(mm)
	private String BACK_WIDTH;//后排宽度(mm)
	private String BACK_HEIGHT;//后排高度(mm)
	private String BACK_LEGROOM_MIN;//后排腿部空间最小值(mm)
	private String BACK_LEGROOM_MAX;//后排腿部空间最大值(mm)
	private String BACK_CUSHION_LENGTH;//后排坐垫长度(mm)
	private String BACK_CENTRAL_PLATFORM_HEIGHT;//后排中央地台高度(mm)
	
	//后备箱
	private String TRUNK_OPEN_WIDTH;//后备箱开启后宽度(mm)
	private String TRUNK_OPEN_HEIGHT;//后备箱开启后高度(mm)
	private String TRUNK_OPEN_VERTICAL_HEIGHT;//后备箱开启后垂直高度(mm)
	private String TRUNK_INSIDE_WIDTH;//后备箱内侧最窄宽度(mm)
	private String TRUNK_OPEN_LON_DEPTH;//后备箱开启后纵向深度(mm)
	private String TRUNK_OPEN_RECLINE_LON_DEPTH;//后备箱开启后放倒后排纵向深度(mm)
	
	//钢板强度测试
	private String FRONT_BUMPER_LEFT;//前保险杠左侧(Mpa)
	private String FRONT_BUMPER_MID;//前保险杠中间(Mpa)
	private String FRONT_BUMPER_RIGHT;//前保险杠右侧(Mpa)
	private String LEFT_FRONT_BOX;//左前吸能盒(Mpa)
	private String RIGHT_FRONT_BOX;//右前吸能盒(Mpa)
	private String LEFT_FRONT_STRINGER;//左前纵梁(Mpa)
	private String RIGHT_FRONT_STRINGER;//右前纵梁(Mpa)
	private String AOUTER_PLATE;//A柱外侧钢板(取三点平均)(Mpa)
	private String AINSIDE_PLATE;//A柱内侧钢板(取三点平均)(Mpa)
	private String BOUTER_PLATE;//B柱外侧钢板(取三点平均)(Mpa)
	private String BINSIDE_PLATE;//B柱内侧钢板(取三点平均)(Mpa)
	private String COUTER_PLATE;//C柱外侧钢板(取三点平均)(Mpa)
	private String CINSIDE_PLATE;//C柱内侧钢板(取三点平均)(Mpa)
	private String BACK_BUMPER_LEFT;//后保险杠左侧(Mpa)
	private String BACK_BUMPER_MID;//后保险杠中间(Mpa)
	private String BACK_BUMPER_RIGHT;//后保险杠右侧(Mpa)
	private String LEFT_BACK_BOX;//左后吸能盒(Mpa)
	private String RIGHT_BACK_BOX;//右后吸能盒(Mpa)
	private String FRONT_DOWN_ARM;//前下摆臂(Mpa)
	private String BACK_DOWN_ARM;//后下摆臂(Mpa)
	private String FRONT_FRAME;//前副车架(Mpa)
	private String BACK_FRAME;//后副车架(Mpa)
	private String CHASSIS_LEFT_STRINGER;//底盘左纵梁(Mpa)
	private String CHASSIS_RIGHT_STRINGER;//底盘右纵梁(Mpa)
	private String CEILING_RIBS;//顶棚加强筋(Mpa)
	private String FRONT_DOOR_BUMPER_BEAMS;//前门板防撞梁(Mpa)
	private String BACK_DOOR_BUMPER_BEAMS;//后门板防撞梁(Mpa)
	private String FRONT_DOOR_SILL_BEAM;//前门槛梁(Mpa)
	private String BACK_DOOR_SILL_BEAM;//后门槛梁(Mpa)
	private String LEFT_BACK_STRINGER;//左后纵梁(Mpa)
	private String RIGHT_BACK_STRINGER;//右后纵梁(Mpa)
	
	//冗余分数
	private String pentuTScore;//钣金喷涂工艺
	private String hanjieTScore;//车身结构
	private String anquanfanghuTScore;//安全防护
	private String shushiTScore;//舒适度
	private String neishiTScore;//内饰做工
	private String dongtaiTScore;//动态测试
	
	
	public String getAOUTER_PLATE() {
		return AOUTER_PLATE;
	}
	public void setAOUTER_PLATE(String aOUTER_PLATE) {
		AOUTER_PLATE = aOUTER_PLATE;
	}
	public String getAINSIDE_PLATE() {
		return AINSIDE_PLATE;
	}
	public void setAINSIDE_PLATE(String aINSIDE_PLATE) {
		AINSIDE_PLATE = aINSIDE_PLATE;
	}
	public String getBOUTER_PLATE() {
		return BOUTER_PLATE;
	}
	public void setBOUTER_PLATE(String bOUTER_PLATE) {
		BOUTER_PLATE = bOUTER_PLATE;
	}
	public String getBINSIDE_PLATE() {
		return BINSIDE_PLATE;
	}
	public void setBINSIDE_PLATE(String bINSIDE_PLATE) {
		BINSIDE_PLATE = bINSIDE_PLATE;
	}
	public String getCOUTER_PLATE() {
		return COUTER_PLATE;
	}
	public void setCOUTER_PLATE(String cOUTER_PLATE) {
		COUTER_PLATE = cOUTER_PLATE;
	}
	public String getCINSIDE_PLATE() {
		return CINSIDE_PLATE;
	}
	public void setCINSIDE_PLATE(String cINSIDE_PLATE) {
		CINSIDE_PLATE = cINSIDE_PLATE;
	}
	public String getCEILING_RIBS() {
		return CEILING_RIBS;
	}
	public void setCEILING_RIBS(String cEILING_RIBS) {
		CEILING_RIBS = cEILING_RIBS;
	}
	public String getFRONT_BUMPER_LEFT() {
		return FRONT_BUMPER_LEFT;
	}
	public void setFRONT_BUMPER_LEFT(String fRONT_BUMPER_LEFT) {
		FRONT_BUMPER_LEFT = fRONT_BUMPER_LEFT;
	}
	public String getFRONT_BUMPER_MID() {
		return FRONT_BUMPER_MID;
	}
	public void setFRONT_BUMPER_MID(String fRONT_BUMPER_MID) {
		FRONT_BUMPER_MID = fRONT_BUMPER_MID;
	}
	public String getFRONT_BUMPER_RIGHT() {
		return FRONT_BUMPER_RIGHT;
	}
	public void setFRONT_BUMPER_RIGHT(String fRONT_BUMPER_RIGHT) {
		FRONT_BUMPER_RIGHT = fRONT_BUMPER_RIGHT;
	}
	public String getLEFT_FRONT_BOX() {
		return LEFT_FRONT_BOX;
	}
	public void setLEFT_FRONT_BOX(String lEFT_FRONT_BOX) {
		LEFT_FRONT_BOX = lEFT_FRONT_BOX;
	}
	public String getRIGHT_FRONT_BOX() {
		return RIGHT_FRONT_BOX;
	}
	public void setRIGHT_FRONT_BOX(String rIGHT_FRONT_BOX) {
		RIGHT_FRONT_BOX = rIGHT_FRONT_BOX;
	}
	public String getLEFT_FRONT_STRINGER() {
		return LEFT_FRONT_STRINGER;
	}
	public void setLEFT_FRONT_STRINGER(String lEFT_FRONT_STRINGER) {
		LEFT_FRONT_STRINGER = lEFT_FRONT_STRINGER;
	}
	public String getRIGHT_FRONT_STRINGER() {
		return RIGHT_FRONT_STRINGER;
	}
	public void setRIGHT_FRONT_STRINGER(String rIGHT_FRONT_STRINGER) {
		RIGHT_FRONT_STRINGER = rIGHT_FRONT_STRINGER;
	}
	public String getBACK_BUMPER_LEFT() {
		return BACK_BUMPER_LEFT;
	}
	public void setBACK_BUMPER_LEFT(String bACK_BUMPER_LEFT) {
		BACK_BUMPER_LEFT = bACK_BUMPER_LEFT;
	}
	public String getBACK_BUMPER_MID() {
		return BACK_BUMPER_MID;
	}
	public void setBACK_BUMPER_MID(String bACK_BUMPER_MID) {
		BACK_BUMPER_MID = bACK_BUMPER_MID;
	}
	public String getBACK_BUMPER_RIGHT() {
		return BACK_BUMPER_RIGHT;
	}
	public void setBACK_BUMPER_RIGHT(String bACK_BUMPER_RIGHT) {
		BACK_BUMPER_RIGHT = bACK_BUMPER_RIGHT;
	}
	public String getLEFT_BACK_BOX() {
		return LEFT_BACK_BOX;
	}
	public void setLEFT_BACK_BOX(String lEFT_BACK_BOX) {
		LEFT_BACK_BOX = lEFT_BACK_BOX;
	}
	public String getRIGHT_BACK_BOX() {
		return RIGHT_BACK_BOX;
	}
	public void setRIGHT_BACK_BOX(String rIGHT_BACK_BOX) {
		RIGHT_BACK_BOX = rIGHT_BACK_BOX;
	}
	public String getFRONT_DOWN_ARM() {
		return FRONT_DOWN_ARM;
	}
	public void setFRONT_DOWN_ARM(String fRONT_DOWN_ARM) {
		FRONT_DOWN_ARM = fRONT_DOWN_ARM;
	}
	public String getBACK_DOWN_ARM() {
		return BACK_DOWN_ARM;
	}
	public void setBACK_DOWN_ARM(String bACK_DOWN_ARM) {
		BACK_DOWN_ARM = bACK_DOWN_ARM;
	}
	public String getFRONT_FRAME() {
		return FRONT_FRAME;
	}
	public void setFRONT_FRAME(String fRONT_FRAME) {
		FRONT_FRAME = fRONT_FRAME;
	}
	public String getBACK_FRAME() {
		return BACK_FRAME;
	}
	public void setBACK_FRAME(String bACK_FRAME) {
		BACK_FRAME = bACK_FRAME;
	}
	public String getCHASSIS_LEFT_STRINGER() {
		return CHASSIS_LEFT_STRINGER;
	}
	public void setCHASSIS_LEFT_STRINGER(String cHASSIS_LEFT_STRINGER) {
		CHASSIS_LEFT_STRINGER = cHASSIS_LEFT_STRINGER;
	}
	public String getCHASSIS_RIGHT_STRINGER() {
		return CHASSIS_RIGHT_STRINGER;
	}
	public void setCHASSIS_RIGHT_STRINGER(String cHASSIS_RIGHT_STRINGER) {
		CHASSIS_RIGHT_STRINGER = cHASSIS_RIGHT_STRINGER;
	}
	public String getFRONT_DOOR_BUMPER_BEAMS() {
		return FRONT_DOOR_BUMPER_BEAMS;
	}
	public void setFRONT_DOOR_BUMPER_BEAMS(String fRONT_DOOR_BUMPER_BEAMS) {
		FRONT_DOOR_BUMPER_BEAMS = fRONT_DOOR_BUMPER_BEAMS;
	}
	public String getBACK_DOOR_BUMPER_BEAMS() {
		return BACK_DOOR_BUMPER_BEAMS;
	}
	public void setBACK_DOOR_BUMPER_BEAMS(String bACK_DOOR_BUMPER_BEAMS) {
		BACK_DOOR_BUMPER_BEAMS = bACK_DOOR_BUMPER_BEAMS;
	}
	public String getFRONT_DOOR_SILL_BEAM() {
		return FRONT_DOOR_SILL_BEAM;
	}
	public void setFRONT_DOOR_SILL_BEAM(String fRONT_DOOR_SILL_BEAM) {
		FRONT_DOOR_SILL_BEAM = fRONT_DOOR_SILL_BEAM;
	}
	public String getBACK_DOOR_SILL_BEAM() {
		return BACK_DOOR_SILL_BEAM;
	}
	public void setBACK_DOOR_SILL_BEAM(String bACK_DOOR_SILL_BEAM) {
		BACK_DOOR_SILL_BEAM = bACK_DOOR_SILL_BEAM;
	}
	public String getLEFT_BACK_STRINGER() {
		return LEFT_BACK_STRINGER;
	}
	public void setLEFT_BACK_STRINGER(String lEFT_BACK_STRINGER) {
		LEFT_BACK_STRINGER = lEFT_BACK_STRINGER;
	}
	public String getRIGHT_BACK_STRINGER() {
		return RIGHT_BACK_STRINGER;
	}
	public void setRIGHT_BACK_STRINGER(String rIGHT_BACK_STRINGER) {
		RIGHT_BACK_STRINGER = rIGHT_BACK_STRINGER;
	}
	public String getFRONT_WIDTH() {
		return FRONT_WIDTH;
	}
	public void setFRONT_WIDTH(String fRONT_WIDTH) {
		FRONT_WIDTH = fRONT_WIDTH;
	}
	public String getFRONT_HEIGHT() {
		return FRONT_HEIGHT;
	}
	public void setFRONT_HEIGHT(String fRONT_HEIGHT) {
		FRONT_HEIGHT = fRONT_HEIGHT;
	}
	public String getFRONT_LEGROOM_MIN() {
		return FRONT_LEGROOM_MIN;
	}
	public void setFRONT_LEGROOM_MIN(String fRONT_LEGROOM_MIN) {
		FRONT_LEGROOM_MIN = fRONT_LEGROOM_MIN;
	}
	public String getFRONT_LEGROOM_MAX() {
		return FRONT_LEGROOM_MAX;
	}
	public void setFRONT_LEGROOM_MAX(String fRONT_LEGROOM_MAX) {
		FRONT_LEGROOM_MAX = fRONT_LEGROOM_MAX;
	}
	public String getFRONT_SEAT_HEIGHT() {
		return FRONT_SEAT_HEIGHT;
	}
	public void setFRONT_SEAT_HEIGHT(String fRONT_SEAT_HEIGHT) {
		FRONT_SEAT_HEIGHT = fRONT_SEAT_HEIGHT;
	}
	public String getBACK_WIDTH() {
		return BACK_WIDTH;
	}
	public void setBACK_WIDTH(String bACK_WIDTH) {
		BACK_WIDTH = bACK_WIDTH;
	}
	public String getBACK_HEIGHT() {
		return BACK_HEIGHT;
	}
	public void setBACK_HEIGHT(String bACK_HEIGHT) {
		BACK_HEIGHT = bACK_HEIGHT;
	}
	public String getBACK_LEGROOM_MIN() {
		return BACK_LEGROOM_MIN;
	}
	public void setBACK_LEGROOM_MIN(String bACK_LEGROOM_MIN) {
		BACK_LEGROOM_MIN = bACK_LEGROOM_MIN;
	}
	public String getBACK_LEGROOM_MAX() {
		return BACK_LEGROOM_MAX;
	}
	public void setBACK_LEGROOM_MAX(String bACK_LEGROOM_MAX) {
		BACK_LEGROOM_MAX = bACK_LEGROOM_MAX;
	}
	public String getBACK_CUSHION_LENGTH() {
		return BACK_CUSHION_LENGTH;
	}
	public void setBACK_CUSHION_LENGTH(String bACK_CUSHION_LENGTH) {
		BACK_CUSHION_LENGTH = bACK_CUSHION_LENGTH;
	}
	public String getBACK_CENTRAL_PLATFORM_HEIGHT() {
		return BACK_CENTRAL_PLATFORM_HEIGHT;
	}
	public void setBACK_CENTRAL_PLATFORM_HEIGHT(String bACK_CENTRAL_PLATFORM_HEIGHT) {
		BACK_CENTRAL_PLATFORM_HEIGHT = bACK_CENTRAL_PLATFORM_HEIGHT;
	}
	public String getTRUNK_OPEN_WIDTH() {
		return TRUNK_OPEN_WIDTH;
	}
	public void setTRUNK_OPEN_WIDTH(String tRUNK_OPEN_WIDTH) {
		TRUNK_OPEN_WIDTH = tRUNK_OPEN_WIDTH;
	}
	public String getTRUNK_OPEN_HEIGHT() {
		return TRUNK_OPEN_HEIGHT;
	}
	public void setTRUNK_OPEN_HEIGHT(String tRUNK_OPEN_HEIGHT) {
		TRUNK_OPEN_HEIGHT = tRUNK_OPEN_HEIGHT;
	}
	public String getTRUNK_OPEN_VERTICAL_HEIGHT() {
		return TRUNK_OPEN_VERTICAL_HEIGHT;
	}
	public void setTRUNK_OPEN_VERTICAL_HEIGHT(String tRUNK_OPEN_VERTICAL_HEIGHT) {
		TRUNK_OPEN_VERTICAL_HEIGHT = tRUNK_OPEN_VERTICAL_HEIGHT;
	}
	public String getTRUNK_INSIDE_WIDTH() {
		return TRUNK_INSIDE_WIDTH;
	}
	public void setTRUNK_INSIDE_WIDTH(String tRUNK_INSIDE_WIDTH) {
		TRUNK_INSIDE_WIDTH = tRUNK_INSIDE_WIDTH;
	}
	public String getTRUNK_OPEN_LON_DEPTH() {
		return TRUNK_OPEN_LON_DEPTH;
	}
	public void setTRUNK_OPEN_LON_DEPTH(String tRUNK_OPEN_LON_DEPTH) {
		TRUNK_OPEN_LON_DEPTH = tRUNK_OPEN_LON_DEPTH;
	}
	public String getTRUNK_OPEN_RECLINE_LON_DEPTH() {
		return TRUNK_OPEN_RECLINE_LON_DEPTH;
	}
	public void setTRUNK_OPEN_RECLINE_LON_DEPTH(String tRUNK_OPEN_RECLINE_LON_DEPTH) {
		TRUNK_OPEN_RECLINE_LON_DEPTH = tRUNK_OPEN_RECLINE_LON_DEPTH;
	}
	public String getENGINE_CABIN_LEFT() {
		return ENGINE_CABIN_LEFT;
	}
	public void setENGINE_CABIN_LEFT(String eNGINE_CABIN_LEFT) {
		ENGINE_CABIN_LEFT = eNGINE_CABIN_LEFT;
	}
	public String getENGINE_CABIN_MID() {
		return ENGINE_CABIN_MID;
	}
	public void setENGINE_CABIN_MID(String eNGINE_CABIN_MID) {
		ENGINE_CABIN_MID = eNGINE_CABIN_MID;
	}
	public String getENGINE_CABIN_RIGHT() {
		return ENGINE_CABIN_RIGHT;
	}
	public void setENGINE_CABIN_RIGHT(String eNGINE_CABIN_RIGHT) {
		ENGINE_CABIN_RIGHT = eNGINE_CABIN_RIGHT;
	}
	public String getCLOSE_HOOD() {
		return CLOSE_HOOD;
	}
	public void setCLOSE_HOOD(String cLOSE_HOOD) {
		CLOSE_HOOD = cLOSE_HOOD;
	}
	public String getJSYJX_CLOSE_AIR() {
		return JSYJX_CLOSE_AIR;
	}
	public void setJSYJX_CLOSE_AIR(String jSYJX_CLOSE_AIR) {
		JSYJX_CLOSE_AIR = jSYJX_CLOSE_AIR;
	}
	public String getJSYJX_OPEN_AIR() {
		return JSYJX_OPEN_AIR;
	}
	public void setJSYJX_OPEN_AIR(String jSYJX_OPEN_AIR) {
		JSYJX_OPEN_AIR = jSYJX_OPEN_AIR;
	}
	public String getFJSJX_OPEN_AIR() {
		return FJSJX_OPEN_AIR;
	}
	public void setFJSJX_OPEN_AIR(String fJSJX_OPEN_AIR) {
		FJSJX_OPEN_AIR = fJSJX_OPEN_AIR;
	}
	public String getFJSJX_CLOSE_AIR() {
		return FJSJX_CLOSE_AIR;
	}
	public void setFJSJX_CLOSE_AIR(String fJSJX_CLOSE_AIR) {
		FJSJX_CLOSE_AIR = fJSJX_CLOSE_AIR;
	}
	public String getCLOSE_SOUND_AIR() {
		return CLOSE_SOUND_AIR;
	}
	public void setCLOSE_SOUND_AIR(String cLOSE_SOUND_AIR) {
		CLOSE_SOUND_AIR = cLOSE_SOUND_AIR;
	}
	
	public String getOPEN_SOUND_AIR() {
		return OPEN_SOUND_AIR;
	}
	public void setOPEN_SOUND_AIR(String oPEN_SOUND_AIR) {
		OPEN_SOUND_AIR = oPEN_SOUND_AIR;
	}
	public String getBACK_LEFT() {
		return BACK_LEFT;
	}
	public void setBACK_LEFT(String bACK_LEFT) {
		BACK_LEFT = bACK_LEFT;
	}
	public String getBACK_MID() {
		return BACK_MID;
	}
	public void setBACK_MID(String bACK_MID) {
		BACK_MID = bACK_MID;
	}
	public String getBACK_RIGHT() {
		return BACK_RIGHT;
	}
	public void setBACK_RIGHT(String bACK_RIGHT) {
		BACK_RIGHT = bACK_RIGHT;
	}
	public String getDOOR_OPERATION() {
		return DOOR_OPERATION;
	}
	public void setDOOR_OPERATION(String dOOR_OPERATION) {
		DOOR_OPERATION = dOOR_OPERATION;
	}
	public String getSOUND() {
		return SOUND;
	}
	public void setSOUND(String sOUND) {
		SOUND = sOUND;
	}
	public String getBGLZHYH() {
		return BGLZHYH;
	}
	public void setBGLZHYH(String bGLZHYH) {
		BGLZHYH = bGLZHYH;
	}
	public String getLDBGLJSSJ() {
		return LDBGLJSSJ;
	}
	public void setLDBGLJSSJ(String lDBGLJSSJ) {
		LDBGLJSSJ = lDBGLJSSJ;
	}
	public String getBDLGLZDSJ() {
		return BDLGLZDSJ;
	}
	public void setBDLGLZDSJ(String bDLGLZDSJ) {
		BDLGLZDSJ = bDLGLZDSJ;
	}
	public String getZKRZSD() {
		return ZKRZSD;
	}
	public void setZKRZSD(String zKRZSD) {
		ZKRZSD = zKRZSD;
	}
	public String getDSSCNZY() {
		return DSSCNZY;
	}
	public void setDSSCNZY(String dSSCNZY) {
		DSSCNZY = dSSCNZY;
	}
	public String getSS40GLXSCNZY() {
		return SS40GLXSCNZY;
	}
	public void setSS40GLXSCNZY(String sS40GLXSCNZY) {
		SS40GLXSCNZY = sS40GLXSCNZY;
	}
	public String getSS60GLXSCNZY() {
		return SS60GLXSCNZY;
	}
	public void setSS60GLXSCNZY(String sS60GLXSCNZY) {
		SS60GLXSCNZY = sS60GLXSCNZY;
	}
	public String getSS80GLXSCNZY() {
		return SS80GLXSCNZY;
	}
	public void setSS80GLXSCNZY(String sS80GLXSCNZY) {
		SS80GLXSCNZY = sS80GLXSCNZY;
	}
	public String getSS100GLXSCNZY() {
		return SS100GLXSCNZY;
	}
	public void setSS100GLXSCNZY(String sS100GLXSCNZY) {
		SS100GLXSCNZY = sS100GLXSCNZY;
	}
	public String getSS120GLXSCNZY() {
		return SS120GLXSCNZY;
	}
	public void setSS120GLXSCNZY(String sS120GLXSCNZY) {
		SS120GLXSCNZY = sS120GLXSCNZY;
	}
	public String getSS40GLSFDJZS() {
		return SS40GLSFDJZS;
	}
	public void setSS40GLSFDJZS(String sS40GLSFDJZS) {
		SS40GLSFDJZS = sS40GLSFDJZS;
	}
	public String getSS60GLSFDJZS() {
		return SS60GLSFDJZS;
	}
	public void setSS60GLSFDJZS(String sS60GLSFDJZS) {
		SS60GLSFDJZS = sS60GLSFDJZS;
	}
	public String getSS80GLSFDJZS() {
		return SS80GLSFDJZS;
	}
	public void setSS80GLSFDJZS(String sS80GLSFDJZS) {
		SS80GLSFDJZS = sS80GLSFDJZS;
	}
	public String getSS100GLSFDJZS() {
		return SS100GLSFDJZS;
	}
	public void setSS100GLSFDJZS(String sS100GLSFDJZS) {
		SS100GLSFDJZS = sS100GLSFDJZS;
	}
	public String getSS120GLSFDJZS() {
		return SS120GLSFDJZS;
	}
	public void setSS120GLSFDJZS(String sS120GLSFDJZS) {
		SS120GLSFDJZS = sS120GLSFDJZS;
	}
	public String getQJQGYYG() {
		return QJQGYYG;
	}
	public void setQJQGYYG(String qJQGYYG) {
		QJQGYYG = qJQGYYG;
	}
	public String getHBXGYYG() {
		return HBXGYYG;
	}
	public void setHBXGYYG(String hBXGYYG) {
		HBXGYYG = hBXGYYG;
	}
	public String getFIRE_EXTINGUISHER() {
		return FIRE_EXTINGUISHER;
	}
	public void setFIRE_EXTINGUISHER(String fIRE_EXTINGUISHER) {
		FIRE_EXTINGUISHER = fIRE_EXTINGUISHER;
	}
	public String getTRIANGLE() {
		return TRIANGLE;
	}
	public void setTRIANGLE(String tRIANGLE) {
		TRIANGLE = tRIANGLE;
	}
	public String getIS_OPEN_DOOR() {
		return IS_OPEN_DOOR;
	}
	public void setIS_OPEN_DOOR(String iS_OPEN_DOOR) {
		IS_OPEN_DOOR = iS_OPEN_DOOR;
	}
	public String getSTEERING_OIL() {
		return STEERING_OIL;
	}
	public void setSTEERING_OIL(String sTEERING_OIL) {
		STEERING_OIL = sTEERING_OIL;
	}
	public String getBRAKE_FLUID() {
		return BRAKE_FLUID;
	}
	public void setBRAKE_FLUID(String bRAKE_FLUID) {
		BRAKE_FLUID = bRAKE_FLUID;
	}
	public String getANTIFREEZE_FREEZING_POINT() {
		return ANTIFREEZE_FREEZING_POINT;
	}
	public void setANTIFREEZE_FREEZING_POINT(String aNTIFREEZE_FREEZING_POINT) {
		ANTIFREEZE_FREEZING_POINT = aNTIFREEZE_FREEZING_POINT;
	}
	public String getGLASS_WATER_FREEZING_POINT() {
		return GLASS_WATER_FREEZING_POINT;
	}
	public void setGLASS_WATER_FREEZING_POINT(String gLASS_WATER_FREEZING_POINT) {
		GLASS_WATER_FREEZING_POINT = gLASS_WATER_FREEZING_POINT;
	}
	public String getELECTROLYTE_CONCENTRATION() {
		return ELECTROLYTE_CONCENTRATION;
	}
	public void setELECTROLYTE_CONCENTRATION(String eLECTROLYTE_CONCENTRATION) {
		ELECTROLYTE_CONCENTRATION = eLECTROLYTE_CONCENTRATION;
	}
	public String getQMHDZCZDCZ() {
		return QMHDZCZDCZ;
	}
	public void setQMHDZCZDCZ(String qMHDZCZDCZ) {
		QMHDZCZDCZ = qMHDZCZDCZ;
	}
	public String getZQYZBTCHDPJZ() {
		return ZQYZBTCHDPJZ;
	}
	public void setZQYZBTCHDPJZ(String zQYZBTCHDPJZ) {
		ZQYZBTCHDPJZ = zQYZBTCHDPJZ;
	}
	public String getYQYZBTCHDPJZ() {
		return YQYZBTCHDPJZ;
	}
	public void setYQYZBTCHDPJZ(String yQYZBTCHDPJZ) {
		YQYZBTCHDPJZ = yQYZBTCHDPJZ;
	}
	public String getMZCTCHDPJZ() {
		return MZCTCHDPJZ;
	}
	public void setMZCTCHDPJZ(String mZCTCHDPJZ) {
		MZCTCHDPJZ = mZCTCHDPJZ;
	}
	public String getMYCTCHDPJZ() {
		return MYCTCHDPJZ;
	}
	public void setMYCTCHDPJZ(String mYCTCHDPJZ) {
		MYCTCHDPJZ = mYCTCHDPJZ;
	}
	public String getJQGTCHDPJZ() {
		return JQGTCHDPJZ;
	}
	public void setJQGTCHDPJZ(String jQGTCHDPJZ) {
		JQGTCHDPJZ = jQGTCHDPJZ;
	}
	public String getHBXGTCHDPJZ() {
		return HBXGTCHDPJZ;
	}
	public void setHBXGTCHDPJZ(String hBXGTCHDPJZ) {
		HBXGTCHDPJZ = hBXGTCHDPJZ;
	}
	public String getBACK_MAXVAL() {
		return BACK_MAXVAL;
	}
	public void setBACK_MAXVAL(String bACK_MAXVAL) {
		BACK_MAXVAL = bACK_MAXVAL;
	}
	public String getLEFT_MAXVAL() {
		return LEFT_MAXVAL;
	}
	public void setLEFT_MAXVAL(String lEFT_MAXVAL) {
		LEFT_MAXVAL = lEFT_MAXVAL;
	}
	public String getLEFTA_MAXVAL() {
		return LEFTA_MAXVAL;
	}
	public void setLEFTA_MAXVAL(String lEFTA_MAXVAL) {
		LEFTA_MAXVAL = lEFTA_MAXVAL;
	}
	public String getLEFTB_MAXVAL() {
		return LEFTB_MAXVAL;
	}
	public void setLEFTB_MAXVAL(String lEFTB_MAXVAL) {
		LEFTB_MAXVAL = lEFTB_MAXVAL;
	}
	public String getLEFTC_MAXVAL() {
		return LEFTC_MAXVAL;
	}
	public void setLEFTC_MAXVAL(String lEFTC_MAXVAL) {
		LEFTC_MAXVAL = lEFTC_MAXVAL;
	}
	public String getRIGHT_MAXVAL() {
		return RIGHT_MAXVAL;
	}
	public void setRIGHT_MAXVAL(String rIGHT_MAXVAL) {
		RIGHT_MAXVAL = rIGHT_MAXVAL;
	}
	public String getRIGHTA_MAXVAL() {
		return RIGHTA_MAXVAL;
	}
	public void setRIGHTA_MAXVAL(String rIGHTA_MAXVAL) {
		RIGHTA_MAXVAL = rIGHTA_MAXVAL;
	}
	public String getRIGHTB_MAXVAL() {
		return RIGHTB_MAXVAL;
	}
	public void setRIGHTB_MAXVAL(String rIGHTB_MAXVAL) {
		RIGHTB_MAXVAL = rIGHTB_MAXVAL;
	}
	public String getRIGHTC_MAXVAL() {
		return RIGHTC_MAXVAL;
	}
	public void setRIGHTC_MAXVAL(String rIGHTC_MAXVAL) {
		RIGHTC_MAXVAL = rIGHTC_MAXVAL;
	}
	public String getBATTERY_BRAND() {
		return BATTERY_BRAND;
	}
	public void setBATTERY_BRAND(String bATTERY_BRAND) {
		BATTERY_BRAND = bATTERY_BRAND;
	}
	public String getBATTERY_MODEL() {
		return BATTERY_MODEL;
	}
	public void setBATTERY_MODEL(String bATTERY_MODEL) {
		BATTERY_MODEL = bATTERY_MODEL;
	}
	public String getBATTERY_CAPACITY() {
		return BATTERY_CAPACITY;
	}
	public void setBATTERY_CAPACITY(String bATTERY_CAPACITY) {
		BATTERY_CAPACITY = bATTERY_CAPACITY;
	}
	public String getBATTERY_TYPE() {
		return BATTERY_TYPE;
	}
	public void setBATTERY_TYPE(String bATTERY_TYPE) {
		BATTERY_TYPE = bATTERY_TYPE;
	}
	public String getYIZIBAN_CAIZHI() {
		return YIZIBAN_CAIZHI;
	}
	public void setYIZIBAN_CAIZHI(String yIZIBAN_CAIZHI) {
		YIZIBAN_CAIZHI = yIZIBAN_CAIZHI;
	}
	public String getGEYINMIAN_CAIZHI() {
		return GEYINMIAN_CAIZHI;
	}
	public void setGEYINMIAN_CAIZHI(String gEYINMIAN_CAIZHI) {
		GEYINMIAN_CAIZHI = gEYINMIAN_CAIZHI;
	}
	public String getTIRE_BRAND() {
		return TIRE_BRAND;
	}
	public void setTIRE_BRAND(String tIRE_BRAND) {
		TIRE_BRAND = tIRE_BRAND;
	}
	public String getTIRE_MODEL() {
		return TIRE_MODEL;
	}
	public void setTIRE_MODEL(String tIRE_MODEL) {
		TIRE_MODEL = tIRE_MODEL;
	}
	public String getTIRE_SPEED_LEVEL() {
		return TIRE_SPEED_LEVEL;
	}
	public void setTIRE_SPEED_LEVEL(String tIRE_SPEED_LEVEL) {
		TIRE_SPEED_LEVEL = tIRE_SPEED_LEVEL;
	}
	public String getTIRE_PRODUCTION_DATE() {
		return TIRE_PRODUCTION_DATE;
	}
	public void setTIRE_PRODUCTION_DATE(String tIRE_PRODUCTION_DATE) {
		TIRE_PRODUCTION_DATE = tIRE_PRODUCTION_DATE;
	}
	public String getWeiqijudigaodu() {
		return weiqijudigaodu;
	}
	public void setWeiqijudigaodu(String weiqijudigaodu) {
		this.weiqijudigaodu = weiqijudigaodu;
	}
	public String getFujiajianfen() {
		return fujiajianfen;
	}
	public void setFujiajianfen(String fujiajianfen) {
		this.fujiajianfen = fujiajianfen;
	}
	
	public String getFrontGuardScore() {
		return frontGuardScore;
	}
	public void setFrontGuardScore(String frontGuardScore) {
		this.frontGuardScore = frontGuardScore;
	}
	public String getBackGuradScore() {
		return backGuradScore;
	}
	public void setBackGuradScore(String backGuradScore) {
		this.backGuradScore = backGuradScore;
	}
	public String getYizibanScore2() {
		return yizibanScore2;
	}
	public void setYizibanScore2(String yizibanScore2) {
		this.yizibanScore2 = yizibanScore2;
	}
	public String getFrontDoorScore() {
		return frontDoorScore;
	}
	public void setFrontDoorScore(String frontDoorScore) {
		this.frontDoorScore = frontDoorScore;
	}
	public String getBackDoorScore() {
		return backDoorScore;
	}
	public void setBackDoorScore(String backDoorScore) {
		this.backDoorScore = backDoorScore;
	}
	public String getRoofStructureScore() {
		return roofStructureScore;
	}
	public void setRoofStructureScore(String roofStructureScore) {
		this.roofStructureScore = roofStructureScore;
	}
	public String getHanjieScore() {
		return hanjieScore;
	}
	public void setHanjieScore(String hanjieScore) {
		this.hanjieScore = hanjieScore;
	}
	
	public String getAzhuScore() {
		return azhuScore;
	}
	public void setAzhuScore(String azhuScore) {
		this.azhuScore = azhuScore;
	}
	public String getBzhuScore() {
		return bzhuScore;
	}
	public void setBzhuScore(String bzhuScore) {
		this.bzhuScore = bzhuScore;
	}
	public String getCzhuScore() {
		return czhuScore;
	}
	public void setCzhuScore(String czhuScore) {
		this.czhuScore = czhuScore;
	}
	public String getFloorStructureScore() {
		return floorStructureScore;
	}
	public void setFloorStructureScore(String floorStructureScore) {
		this.floorStructureScore = floorStructureScore;
	}
	public String getNeishicailiaoScore() {
		return neishicailiaoScore;
	}
	public void setNeishicailiaoScore(String neishicailiaoScore) {
		this.neishicailiaoScore = neishicailiaoScore;
	}
	public String getNeishizuranScore() {
		return neishizuranScore;
	}
	public void setNeishizuranScore(String neishizuranScore) {
		this.neishizuranScore = neishizuranScore;
	}
	public String getZhengchebuxianScore() {
		return zhengchebuxianScore;
	}
	public void setZhengchebuxianScore(String zhengchebuxianScore) {
		this.zhengchebuxianScore = zhengchebuxianScore;
	}
	public String getFengxiScore() {
		return fengxiScore;
	}
	public void setFengxiScore(String fengxiScore) {
		this.fengxiScore = fengxiScore;
	}
	public String getQimoyingduScore() {
		return qimoyingduScore;
	}
	public void setQimoyingduScore(String qimoyingduScore) {
		this.qimoyingduScore = qimoyingduScore;
	}
	public String getQimianhouduScore() {
		return qimianhouduScore;
	}
	public void setQimianhouduScore(String qimianhouduScore) {
		this.qimianhouduScore = qimianhouduScore;
	}
	public String getDipanfangfuScore() {
		return dipanfangfuScore;
	}
	public void setDipanfangfuScore(String dipanfangfuScore) {
		this.dipanfangfuScore = dipanfangfuScore;
	}
	public String getAirScore() {
		return airScore;
	}
	public void setAirScore(String airScore) {
		this.airScore = airScore;
	}
	public String getFrontSeatComfortScore() {
		return frontSeatComfortScore;
	}
	public void setFrontSeatComfortScore(String frontSeatComfortScore) {
		this.frontSeatComfortScore = frontSeatComfortScore;
	}
	public String getBackSeatComfortScore() {
		return backSeatComfortScore;
	}
	public void setBackSeatComfortScore(String backSeatComfortScore) {
		this.backSeatComfortScore = backSeatComfortScore;
	}
	public String getXuanguaxitongScore() {
		return xuanguaxitongScore;
	}
	public void setXuanguaxitongScore(String xuanguaxitongScore) {
		this.xuanguaxitongScore = xuanguaxitongScore;
	}
	public String getTyreSizeScore() {
		return tyreSizeScore;
	}
	public void setTyreSizeScore(String tyreSizeScore) {
		this.tyreSizeScore = tyreSizeScore;
	}
	public String getSpeedUpTestScore() {
		return speedUpTestScore;
	}
	public void setSpeedUpTestScore(String speedUpTestScore) {
		this.speedUpTestScore = speedUpTestScore;
	}
	public String getBreakingTestScore() {
		return breakingTestScore;
	}
	public void setBreakingTestScore(String breakingTestScore) {
		this.breakingTestScore = breakingTestScore;
	}
	public String getRaozhuangTestScore() {
		return raozhuangTestScore;
	}
	public void setRaozhuangTestScore(String raozhuangTestScore) {
		this.raozhuangTestScore = raozhuangTestScore;
	}
	public String getNoiseTestScore() {
		return noiseTestScore;
	}
	public void setNoiseTestScore(String noiseTestScore) {
		this.noiseTestScore = noiseTestScore;
	}
	public String getZhuansuTestScore() {
		return zhuansuTestScore;
	}
	public void setZhuansuTestScore(String zhuansuTestScore) {
		this.zhuansuTestScore = zhuansuTestScore;
	}
	public String getConsumptionTestScore() {
		return consumptionTestScore;
	}
	public void setConsumptionTestScore(String consumptionTestScore) {
		this.consumptionTestScore = consumptionTestScore;
	}
	public String getFujiaScore() {
		return fujiaScore;
	}
	public void setFujiaScore(String fujiaScore) {
		this.fujiaScore = fujiaScore;
	}
	public String getChaijiegoumaiScore() {
		return chaijiegoumaiScore;
	}
	public void setChaijiegoumaiScore(String chaijiegoumaiScore) {
		this.chaijiegoumaiScore = chaijiegoumaiScore;
	}
	
	
	
	public String getAdvantages1() {
		return advantages1;
	}
	public void setAdvantages1(String advantages1) {
		this.advantages1 = advantages1;
	}
	public String getAdvantages2() {
		return advantages2;
	}
	public void setAdvantages2(String advantages2) {
		this.advantages2 = advantages2;
	}
	public String getAdvantages3() {
		return advantages3;
	}
	public void setAdvantages3(String advantages3) {
		this.advantages3 = advantages3;
	}
	public String getAdvantages4() {
		return advantages4;
	}
	public void setAdvantages4(String advantages4) {
		this.advantages4 = advantages4;
	}
	public String getAdvantages5() {
		return advantages5;
	}
	public void setAdvantages5(String advantages5) {
		this.advantages5 = advantages5;
	}
	public String getAdvantages6() {
		return advantages6;
	}
	public void setAdvantages6(String advantages6) {
		this.advantages6 = advantages6;
	}
	public String getAdvantages7() {
		return advantages7;
	}
	public void setAdvantages7(String advantages7) {
		this.advantages7 = advantages7;
	}
	public String getAdvantages8() {
		return advantages8;
	}
	public void setAdvantages8(String advantages8) {
		this.advantages8 = advantages8;
	}
	public String getAdvantages9() {
		return advantages9;
	}
	public void setAdvantages9(String advantages9) {
		this.advantages9 = advantages9;
	}
	public String getAdvantages10() {
		return advantages10;
	}
	public void setAdvantages10(String advantages10) {
		this.advantages10 = advantages10;
	}
	public String getWeakness1() {
		return weakness1;
	}
	public void setWeakness1(String weakness1) {
		this.weakness1 = weakness1;
	}
	public String getWeakness2() {
		return weakness2;
	}
	public void setWeakness2(String weakness2) {
		this.weakness2 = weakness2;
	}
	public String getWeakness3() {
		return weakness3;
	}
	public void setWeakness3(String weakness3) {
		this.weakness3 = weakness3;
	}
	public String getWeakness4() {
		return weakness4;
	}
	public void setWeakness4(String weakness4) {
		this.weakness4 = weakness4;
	}
	public String getWeakness5() {
		return weakness5;
	}
	public void setWeakness5(String weakness5) {
		this.weakness5 = weakness5;
	}
	public String getWeakness6() {
		return weakness6;
	}
	public void setWeakness6(String weakness6) {
		this.weakness6 = weakness6;
	}
	public String getWeakness7() {
		return weakness7;
	}
	public void setWeakness7(String weakness7) {
		this.weakness7 = weakness7;
	}
	public String getWeakness8() {
		return weakness8;
	}
	public void setWeakness8(String weakness8) {
		this.weakness8 = weakness8;
	}
	public String getWeakness9() {
		return weakness9;
	}
	public void setWeakness9(String weakness9) {
		this.weakness9 = weakness9;
	}
	public String getWeakness10() {
		return weakness10;
	}
	public void setWeakness10(String weakness10) {
		this.weakness10 = weakness10;
	}
	public String getTopicLink() {
		return topicLink;
	}
	public void setTopicLink(String topicLink) {
		this.topicLink = topicLink;
	}
	public String getQiangangNewsLink() {
		return qiangangNewsLink;
	}
	public void setQiangangNewsLink(String qiangangNewsLink) {
		this.qiangangNewsLink = qiangangNewsLink;
	}
	public String getHougangNewsLink() {
		return hougangNewsLink;
	}
	public void setHougangNewsLink(String hougangNewsLink) {
		this.hougangNewsLink = hougangNewsLink;
	}
	public String getDingpengNewsLink() {
		return dingpengNewsLink;
	}
	public void setDingpengNewsLink(String dingpengNewsLink) {
		this.dingpengNewsLink = dingpengNewsLink;
	}
	public String getDoorNewsLink() {
		return doorNewsLink;
	}
	public void setDoorNewsLink(String doorNewsLink) {
		this.doorNewsLink = doorNewsLink;
	}
	public String getPosition1() {
		return position1;
	}
	public void setPosition1(String position1) {
		this.position1 = position1;
	}
	public String getNewsLink1() {
		return newsLink1;
	}
	public void setNewsLink1(String newsLink1) {
		this.newsLink1 = newsLink1;
	}
	public String getPosition2() {
		return position2;
	}
	public void setPosition2(String position2) {
		this.position2 = position2;
	}
	public String getNewsLink2() {
		return newsLink2;
	}
	public void setNewsLink2(String newsLink2) {
		this.newsLink2 = newsLink2;
	}
	public String getPosition3() {
		return position3;
	}
	public void setPosition3(String position3) {
		this.position3 = position3;
	}
	public String getNewsLink3() {
		return newsLink3;
	}
	public void setNewsLink3(String newsLink3) {
		this.newsLink3 = newsLink3;
	}
	public String getPosition4() {
		return position4;
	}
	public void setPosition4(String position4) {
		this.position4 = position4;
	}
	public String getNewsLink4() {
		return newsLink4;
	}
	public void setNewsLink4(String newsLink4) {
		this.newsLink4 = newsLink4;
	}
	public String getPosition5() {
		return position5;
	}
	public void setPosition5(String position5) {
		this.position5 = position5;
	}
	public String getNewsLink5() {
		return newsLink5;
	}
	public void setNewsLink5(String newsLink5) {
		this.newsLink5 = newsLink5;
	}
	public String getTotalScore() {
		return totalScore;
	}
	public void setTotalScore(String totalScore) {
		this.totalScore = totalScore;
	}
	public String getTicheLink() {
		return ticheLink;
	}
	public void setTicheLink(String ticheLink) {
		this.ticheLink = ticheLink;
	}
	public String getStaticCompareLink() {
		return staticCompareLink;
	}
	public void setStaticCompareLink(String staticCompareLink) {
		this.staticCompareLink = staticCompareLink;
	}
	public String getTestLink() {
		return testLink;
	}
	public void setTestLink(String testLink) {
		this.testLink = testLink;
	}
	public String getCompareLink() {
		return compareLink;
	}
	public void setCompareLink(String compareLink) {
		this.compareLink = compareLink;
	}
	public String getSingleCarLink() {
		return singleCarLink;
	}
	public void setSingleCarLink(String singleCarLink) {
		this.singleCarLink = singleCarLink;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getModel() {
		return model;
	}
	public void setModel(Integer model) {
		this.model = model;
	}
	public String getFrontCareCount() {
		return frontCareCount;
	}
	public void setFrontCareCount(String frontCareCount) {
		this.frontCareCount = frontCareCount;
	}
	public String getFrontCareLength() {
		return frontCareLength;
	}
	public void setFrontCareLength(String frontCareLength) {
		this.frontCareLength = frontCareLength;
	}
	public String getFrontCareWidth() {
		return frontCareWidth;
	}
	public void setFrontCareWidth(String frontCareWidth) {
		this.frontCareWidth = frontCareWidth;
	}
	public String getFrontCareHeight() {
		return frontCareHeight;
	}
	public void setFrontCareHeight(String frontCareHeight) {
		this.frontCareHeight = frontCareHeight;
	}
	public String getFrontCareThick() {
		return frontCareThick;
	}
	public void setFrontCareThick(String frontCareThick) {
		this.frontCareThick = frontCareThick;
	}
	public String getFront2CareLength() {
		return front2CareLength;
	}
	public void setFront2CareLength(String front2CareLength) {
		this.front2CareLength = front2CareLength;
	}
	public String getFront2CareWidth() {
		return front2CareWidth;
	}
	public void setFront2CareWidth(String front2CareWidth) {
		this.front2CareWidth = front2CareWidth;
	}
	public String getFront2CareHeight() {
		return front2CareHeight;
	}
	public void setFront2CareHeight(String front2CareHeight) {
		this.front2CareHeight = front2CareHeight;
	}
	public String getFront2CareThick() {
		return front2CareThick;
	}
	public void setFront2CareThick(String front2CareThick) {
		this.front2CareThick = front2CareThick;
	}
	public String getFrontXinengLength() {
		return frontXinengLength;
	}
	public void setFrontXinengLength(String frontXinengLength) {
		this.frontXinengLength = frontXinengLength;
	}
	public String getFrontXinengWidth() {
		return frontXinengWidth;
	}
	public void setFrontXinengWidth(String frontXinengWidth) {
		this.frontXinengWidth = frontXinengWidth;
	}
	public String getFrontXinengHeight() {
		return frontXinengHeight;
	}
	public void setFrontXinengHeight(String frontXinengHeight) {
		this.frontXinengHeight = frontXinengHeight;
	}
	public String getFrontXinengThick() {
		return frontXinengThick;
	}
	public void setFrontXinengThick(String frontXinengThick) {
		this.frontXinengThick = frontXinengThick;
	}
	public String getFrontToEarthHeight() {
		return frontToEarthHeight;
	}
	public void setFrontToEarthHeight(String frontToEarthHeight) {
		this.frontToEarthHeight = frontToEarthHeight;
	}
	public String getFrontCareMpa() {
		return frontCareMpa;
	}
	public void setFrontCareMpa(String frontCareMpa) {
		this.frontCareMpa = frontCareMpa;
	}
	public String getFrontCareScore() {
		return frontCareScore;
	}
	public void setFrontCareScore(String frontCareScore) {
		this.frontCareScore = frontCareScore;
	}
	public String getFrontCareComment() {
		return frontCareComment;
	}
	public void setFrontCareComment(String frontCareComment) {
		this.frontCareComment = frontCareComment;
	}
	public String getAGangThick() {
		return aGangThick;
	}
	public void setAGangThick(String gangThick) {
		aGangThick = gangThick;
	}
	public String getAOutGangThick() {
		return aOutGangThick;
	}
	public void setAOutGangThick(String outGangThick) {
		aOutGangThick = outGangThick;
	}
	public String getACenterGangThick() {
		return aCenterGangThick;
	}
	public void setACenterGangThick(String centerGangThick) {
		aCenterGangThick = centerGangThick;
	}
	public String getAInGangThick() {
		return aInGangThick;
	}
	public void setAInGangThick(String inGangThick) {
		aInGangThick = inGangThick;
	}
	public String getBGangThick() {
		return bGangThick;
	}
	public void setBGangThick(String gangThick) {
		bGangThick = gangThick;
	}
	public String getBOutGangThick() {
		return bOutGangThick;
	}
	public void setBOutGangThick(String outGangThick) {
		bOutGangThick = outGangThick;
	}
	public String getBCenterGangThick() {
		return bCenterGangThick;
	}
	public void setBCenterGangThick(String centerGangThick) {
		bCenterGangThick = centerGangThick;
	}
	public String getBInGangThick() {
		return bInGangThick;
	}
	public void setBInGangThick(String inGangThick) {
		bInGangThick = inGangThick;
	}
	public String getCGangThick() {
		return cGangThick;
	}
	public void setCGangThick(String gangThick) {
		cGangThick = gangThick;
	}
	public String getCOutGangThick() {
		return cOutGangThick;
	}
	public void setCOutGangThick(String outGangThick) {
		cOutGangThick = outGangThick;
	}
	public String getCCenterGangThick() {
		return cCenterGangThick;
	}
	public void setCCenterGangThick(String centerGangThick) {
		cCenterGangThick = centerGangThick;
	}
	public String getCInGangThick() {
		return cInGangThick;
	}
	public void setCInGangThick(String inGangThick) {
		cInGangThick = inGangThick;
	}
	public String getAGangMpa() {
		return aGangMpa;
	}
	public void setAGangMpa(String gangMpa) {
		aGangMpa = gangMpa;
	}
	public String getBGangMpa() {
		return bGangMpa;
	}
	public void setBGangMpa(String gangMpa) {
		bGangMpa = gangMpa;
	}
	public String getCGangMpa() {
		return cGangMpa;
	}
	public void setCGangMpa(String gangMpa) {
		cGangMpa = gangMpa;
	}
	public String getAbcScore() {
		return abcScore;
	}
	public void setAbcScore(String abcScore) {
		this.abcScore = abcScore;
	}
	public String getAbcComment() {
		return abcComment;
	}
	public void setAbcComment(String abcComment) {
		this.abcComment = abcComment;
	}
	public String getBackCareCount() {
		return backCareCount;
	}
	public void setBackCareCount(String backCareCount) {
		this.backCareCount = backCareCount;
	}
	public String getBackCareLength() {
		return backCareLength;
	}
	public void setBackCareLength(String backCareLength) {
		this.backCareLength = backCareLength;
	}
	public String getBackCareWidth() {
		return backCareWidth;
	}
	public void setBackCareWidth(String backCareWidth) {
		this.backCareWidth = backCareWidth;
	}
	public String getBackCareHeight() {
		return backCareHeight;
	}
	public void setBackCareHeight(String backCareHeight) {
		this.backCareHeight = backCareHeight;
	}
	public String getBackCareThick() {
		return backCareThick;
	}
	public void setBackCareThick(String backCareThick) {
		this.backCareThick = backCareThick;
	}
	public String getBack2CareLength() {
		return back2CareLength;
	}
	public void setBack2CareLength(String back2CareLength) {
		this.back2CareLength = back2CareLength;
	}
	public String getBack2CareWidth() {
		return back2CareWidth;
	}
	public void setBack2CareWidth(String back2CareWidth) {
		this.back2CareWidth = back2CareWidth;
	}
	public String getBack2CareHeight() {
		return back2CareHeight;
	}
	public void setBack2CareHeight(String back2CareHeight) {
		this.back2CareHeight = back2CareHeight;
	}
	public String getBack2CareThick() {
		return back2CareThick;
	}
	public void setBack2CareThick(String back2CareThick) {
		this.back2CareThick = back2CareThick;
	}
	public String getBackXinengLength() {
		return backXinengLength;
	}
	public void setBackXinengLength(String backXinengLength) {
		this.backXinengLength = backXinengLength;
	}
	public String getBackXinengWidth() {
		return backXinengWidth;
	}
	public void setBackXinengWidth(String backXinengWidth) {
		this.backXinengWidth = backXinengWidth;
	}
	public String getBackXinengHeight() {
		return backXinengHeight;
	}
	public void setBackXinengHeight(String backXinengHeight) {
		this.backXinengHeight = backXinengHeight;
	}
	public String getBackXinengThick() {
		return backXinengThick;
	}
	public void setBackXinengThick(String backXinengThick) {
		this.backXinengThick = backXinengThick;
	}
	public String getBackToEarthHeight() {
		return backToEarthHeight;
	}
	public void setBackToEarthHeight(String backToEarthHeight) {
		this.backToEarthHeight = backToEarthHeight;
	}
	public String getBackCareMpa() {
		return backCareMpa;
	}
	public void setBackCareMpa(String backCareMpa) {
		this.backCareMpa = backCareMpa;
	}
	public String getBackCareScore() {
		return backCareScore;
	}
	public void setBackCareScore(String backCareScore) {
		this.backCareScore = backCareScore;
	}
	public String getBackCareComment() {
		return backCareComment;
	}
	public void setBackCareComment(String backCareComment) {
		this.backCareComment = backCareComment;
	}
	public String getFrontdoorLevel() {
		return frontdoorLevel;
	}
	public void setFrontdoorLevel(String frontdoorLevel) {
		this.frontdoorLevel = frontdoorLevel;
	}
	public String getDoormeterhan() {
		return doormeterhan;
	}
	public void setDoormeterhan(String doormeterhan) {
		this.doormeterhan = doormeterhan;
	}
	public String getFrontdoorgangbanMpa() {
		return frontdoorgangbanMpa;
	}
	public void setFrontdoorgangbanMpa(String frontdoorgangbanMpa) {
		this.frontdoorgangbanMpa = frontdoorgangbanMpa;
	}
	public String getFrontdoorfangzhuang() {
		return frontdoorfangzhuang;
	}
	public void setFrontdoorfangzhuang(String frontdoorfangzhuang) {
		this.frontdoorfangzhuang = frontdoorfangzhuang;
	}
	public String getFrontdoorfangzhuangMpa() {
		return frontdoorfangzhuangMpa;
	}
	public void setFrontdoorfangzhuangMpa(String frontdoorfangzhuangMpa) {
		this.frontdoorfangzhuangMpa = frontdoorfangzhuangMpa;
	}
	public String getFrontdoorfangzhuang1Width() {
		return frontdoorfangzhuang1Width;
	}
	public void setFrontdoorfangzhuang1Width(String frontdoorfangzhuang1Width) {
		this.frontdoorfangzhuang1Width = frontdoorfangzhuang1Width;
	}
	public String getFrontdoorfangzhuang2Width() {
		return frontdoorfangzhuang2Width;
	}
	public void setFrontdoorfangzhuang2Width(String frontdoorfangzhuang2Width) {
		this.frontdoorfangzhuang2Width = frontdoorfangzhuang2Width;
	}
	public String getFrontdoorfangzhuang1Height() {
		return frontdoorfangzhuang1Height;
	}
	public void setFrontdoorfangzhuang1Height(String frontdoorfangzhuang1Height) {
		this.frontdoorfangzhuang1Height = frontdoorfangzhuang1Height;
	}
	public String getFrontdoorfangzhuang2Height() {
		return frontdoorfangzhuang2Height;
	}
	public void setFrontdoorfangzhuang2Height(String frontdoorfangzhuang2Height) {
		this.frontdoorfangzhuang2Height = frontdoorfangzhuang2Height;
	}
	public String getFrontdoorMaxDistance() {
		return frontdoorMaxDistance;
	}
	public void setFrontdoorMaxDistance(String frontdoorMaxDistance) {
		this.frontdoorMaxDistance = frontdoorMaxDistance;
	}
	public String getBackdoorLevel() {
		return backdoorLevel;
	}
	public void setBackdoorLevel(String backdoorLevel) {
		this.backdoorLevel = backdoorLevel;
	}
	public String getBackdoorgangbanMpa() {
		return backdoorgangbanMpa;
	}
	public void setBackdoorgangbanMpa(String backdoorgangbanMpa) {
		this.backdoorgangbanMpa = backdoorgangbanMpa;
	}
	public String getBackdoorfangzhuang() {
		return backdoorfangzhuang;
	}
	public void setBackdoorfangzhuang(String backdoorfangzhuang) {
		this.backdoorfangzhuang = backdoorfangzhuang;
	}
	public String getBackdoofangzhuangMpa() {
		return backdoofangzhuangMpa;
	}
	public void setBackdoofangzhuangMpa(String backdoofangzhuangMpa) {
		this.backdoofangzhuangMpa = backdoofangzhuangMpa;
	}
	public String getBackdoorfangzhuang1Width() {
		return backdoorfangzhuang1Width;
	}
	public void setBackdoorfangzhuang1Width(String backdoorfangzhuang1Width) {
		this.backdoorfangzhuang1Width = backdoorfangzhuang1Width;
	}
	public String getBackdoorfangzhuang2Height() {
		return backdoorfangzhuang2Height;
	}
	public void setBackdoorfangzhuang2Height(String backdoorfangzhuang2Height) {
		this.backdoorfangzhuang2Height = backdoorfangzhuang2Height;
	}
	public String getBackdoorfangzhuang1Height() {
		return backdoorfangzhuang1Height;
	}
	public void setBackdoorfangzhuang1Height(String backdoorfangzhuang1Height) {
		this.backdoorfangzhuang1Height = backdoorfangzhuang1Height;
	}
	public String getBackdoorfangzhuang2Width() {
		return backdoorfangzhuang2Width;
	}
	public void setBackdoorfangzhuang2Width(String backdoorfangzhuang2Width) {
		this.backdoorfangzhuang2Width = backdoorfangzhuang2Width;
	}
	public String getBackdoorMaxDistance() {
		return backdoorMaxDistance;
	}
	public void setBackdoorMaxDistance(String backdoorMaxDistance) {
		this.backdoorMaxDistance = backdoorMaxDistance;
	}
	public String getBackdoorScrore() {
		return backdoorScrore;
	}
	public void setBackdoorScrore(String backdoorScrore) {
		this.backdoorScrore = backdoorScrore;
	}
	public String getBackdoorComment() {
		return backdoorComment;
	}
	public void setBackdoorComment(String backdoorComment) {
		this.backdoorComment = backdoorComment;
	}
	public String getYizibanThick() {
		return yizibanThick;
	}
	public void setYizibanThick(String yizibanThick) {
		this.yizibanThick = yizibanThick;
	}
	public String getYizibanScore() {
		return yizibanScore;
	}
	public void setYizibanScore(String yizibanScore) {
		this.yizibanScore = yizibanScore;
	}
	public String getYizibanComment() {
		return yizibanComment;
	}
	public void setYizibanComment(String yizibanComment) {
		this.yizibanComment = yizibanComment;
	}
	public String getTianhuabanThick() {
		return tianhuabanThick;
	}
	public void setTianhuabanThick(String tianhuabanThick) {
		this.tianhuabanThick = tianhuabanThick;
	}
	public String getJiaqiangjinCount() {
		return jiaqiangjinCount;
	}
	public void setJiaqiangjinCount(String jiaqiangjinCount) {
		this.jiaqiangjinCount = jiaqiangjinCount;
	}
	public String getJiaqiangjinMpa() {
		return jiaqiangjinMpa;
	}
	public void setJiaqiangjinMpa(String jiaqiangjinMpa) {
		this.jiaqiangjinMpa = jiaqiangjinMpa;
	}
	public String getMainJiaqiangjinWidth() {
		return mainJiaqiangjinWidth;
	}
	public void setMainJiaqiangjinWidth(String mainJiaqiangjinWidth) {
		this.mainJiaqiangjinWidth = mainJiaqiangjinWidth;
	}
	public String getMainJiaqiangjinThick() {
		return mainJiaqiangjinThick;
	}
	public void setMainJiaqiangjinThick(String mainJiaqiangjinThick) {
		this.mainJiaqiangjinThick = mainJiaqiangjinThick;
	}
	public String getFuJiaqiangjinWidth() {
		return fuJiaqiangjinWidth;
	}
	public void setFuJiaqiangjinWidth(String fuJiaqiangjinWidth) {
		this.fuJiaqiangjinWidth = fuJiaqiangjinWidth;
	}
	public String getFuJiaqiangjinThick() {
		return fuJiaqiangjinThick;
	}
	public void setFuJiaqiangjinThick(String fuJiaqiangjinThick) {
		this.fuJiaqiangjinThick = fuJiaqiangjinThick;
	}
	public String getDingpeiScrore() {
		return dingpeiScrore;
	}
	public void setDingpeiScrore(String dingpeiScrore) {
		this.dingpeiScrore = dingpeiScrore;
	}
	public String getDingpeiComment() {
		return dingpeiComment;
	}
	public void setDingpeiComment(String dingpeiComment) {
		this.dingpeiComment = dingpeiComment;
	}
	public String getFrontShache() {
		return frontShache;
	}
	public void setFrontShache(String frontShache) {
		this.frontShache = frontShache;
	}
	public String getBackShache() {
		return backShache;
	}
	public void setBackShache(String backShache) {
		this.backShache = backShache;
	}
	public String getShacheScore() {
		return shacheScore;
	}
	public void setShacheScore(String shacheScore) {
		this.shacheScore = shacheScore;
	}
	public String getShacheComment() {
		return shacheComment;
	}
	public void setShacheComment(String shacheComment) {
		this.shacheComment = shacheComment;
	}
	public String getLeftAverage() {
		return leftAverage;
	}
	public void setLeftAverage(String leftAverage) {
		this.leftAverage = leftAverage;
	}
	public String getLeftAaverage() {
		return leftAaverage;
	}
	public void setLeftAaverage(String leftAaverage) {
		this.leftAaverage = leftAaverage;
	}
	public String getLeftBaverage() {
		return leftBaverage;
	}
	public void setLeftBaverage(String leftBaverage) {
		this.leftBaverage = leftBaverage;
	}
	public String getLeftCaverage() {
		return leftCaverage;
	}
	public void setLeftCaverage(String leftCaverage) {
		this.leftCaverage = leftCaverage;
	}
	public String getRightAverage() {
		return rightAverage;
	}
	public void setRightAverage(String rightAverage) {
		this.rightAverage = rightAverage;
	}
	public String getRightAaverage() {
		return rightAaverage;
	}
	public void setRightAaverage(String rightAaverage) {
		this.rightAaverage = rightAaverage;
	}
	public String getRightBaverage() {
		return rightBaverage;
	}
	public void setRightBaverage(String rightBaverage) {
		this.rightBaverage = rightBaverage;
	}
	public String getRightCaverage() {
		return rightCaverage;
	}
	public void setRightCaverage(String rightCaverage) {
		this.rightCaverage = rightCaverage;
	}
	public String getBackaverage() {
		return backaverage;
	}
	public void setBackaverage(String backaverage) {
		this.backaverage = backaverage;
	}
	public String getBanjinScore() {
		return banjinScore;
	}
	public void setBanjinScore(String banjinScore) {
		this.banjinScore = banjinScore;
	}
	public String getBanjinComment() {
		return banjinComment;
	}
	public void setBanjinComment(String banjinComment) {
		this.banjinComment = banjinComment;
	}
	public String getQimianYingdu() {
		return qimianYingdu;
	}
	public void setQimianYingdu(String qimianYingdu) {
		this.qimianYingdu = qimianYingdu;
	}
	public String getQimianYingduScore() {
		return qimianYingduScore;
	}
	public void setQimianYingduScore(String qimianYingduScore) {
		this.qimianYingduScore = qimianYingduScore;
	}
	public String getQimianYingduComment() {
		return qimianYingduComment;
	}
	public void setQimianYingduComment(String qimianYingduComment) {
		this.qimianYingduComment = qimianYingduComment;
	}
	public String getFrontNVH60() {
		return frontNVH60;
	}
	public void setFrontNVH60(String frontNVH60) {
		this.frontNVH60 = frontNVH60;
	}
	public String getFrontNVH80() {
		return frontNVH80;
	}
	public void setFrontNVH80(String frontNVH80) {
		this.frontNVH80 = frontNVH80;
	}
	public String getFrontNVH100() {
		return frontNVH100;
	}
	public void setFrontNVH100(String frontNVH100) {
		this.frontNVH100 = frontNVH100;
	}
	public String getBackNVH60() {
		return backNVH60;
	}
	public void setBackNVH60(String backNVH60) {
		this.backNVH60 = backNVH60;
	}
	public String getBackNVH80() {
		return backNVH80;
	}
	public void setBackNVH80(String backNVH80) {
		this.backNVH80 = backNVH80;
	}
	public String getBackNVH100() {
		return backNVH100;
	}
	public void setBackNVH100(String backNVH100) {
		this.backNVH100 = backNVH100;
	}
	public String getNVHScore() {
		return NVHScore;
	}
	public void setNVHScore(String score) {
		NVHScore = score;
	}
	public String getNVHComment() {
		return NVHComment;
	}
	public void setNVHComment(String comment) {
		NVHComment = comment;
	}
	public String getLeftBanjinThick() {
		return leftBanjinThick;
	}
	public void setLeftBanjinThick(String leftBanjinThick) {
		this.leftBanjinThick = leftBanjinThick;
	}
	public String getRightBanjinThick() {
		return rightBanjinThick;
	}
	public void setRightBanjinThick(String rightBanjinThick) {
		this.rightBanjinThick = rightBanjinThick;
	}
	public String getLeftDoorBanjinThick() {
		return leftDoorBanjinThick;
	}
	public void setLeftDoorBanjinThick(String leftDoorBanjinThick) {
		this.leftDoorBanjinThick = leftDoorBanjinThick;
	}
	public String getRightDoorBanjinThick() {
		return rightDoorBanjinThick;
	}
	public void setRightDoorBanjinThick(String rightDoorBanjinThick) {
		this.rightDoorBanjinThick = rightDoorBanjinThick;
	}
	public String getMechineBanjinThick() {
		return mechineBanjinThick;
	}
	public void setMechineBanjinThick(String mechineBanjinThick) {
		this.mechineBanjinThick = mechineBanjinThick;
	}
	public String getBackBanjinThick() {
		return backBanjinThick;
	}
	public void setBackBanjinThick(String backBanjinThick) {
		this.backBanjinThick = backBanjinThick;
	}
	public String getBanjinGongyiScore() {
		return banjinGongyiScore;
	}
	public void setBanjinGongyiScore(String banjinGongyiScore) {
		this.banjinGongyiScore = banjinGongyiScore;
	}
	public String getBanjinGongyiComment() {
		return banjinGongyiComment;
	}
	public void setBanjinGongyiComment(String banjinGongyiComment) {
		this.banjinGongyiComment = banjinGongyiComment;
	}
	public String getJinqikouHeight() {
		return jinqikouHeight;
	}
	public void setJinqikouHeight(String jinqikouHeight) {
		this.jinqikouHeight = jinqikouHeight;
	}
	public String getaGangThick() {
		return aGangThick;
	}
	public void setaGangThick(String aGangThick) {
		this.aGangThick = aGangThick;
	}
	public String getaOutGangThick() {
		return aOutGangThick;
	}
	public void setaOutGangThick(String aOutGangThick) {
		this.aOutGangThick = aOutGangThick;
	}
	public String getaCenterGangThick() {
		return aCenterGangThick;
	}
	public void setaCenterGangThick(String aCenterGangThick) {
		this.aCenterGangThick = aCenterGangThick;
	}
	public String getaInGangThick() {
		return aInGangThick;
	}
	public void setaInGangThick(String aInGangThick) {
		this.aInGangThick = aInGangThick;
	}
	public String getbGangThick() {
		return bGangThick;
	}
	public void setbGangThick(String bGangThick) {
		this.bGangThick = bGangThick;
	}
	public String getbOutGangThick() {
		return bOutGangThick;
	}
	public void setbOutGangThick(String bOutGangThick) {
		this.bOutGangThick = bOutGangThick;
	}
	public String getbCenterGangThick() {
		return bCenterGangThick;
	}
	public void setbCenterGangThick(String bCenterGangThick) {
		this.bCenterGangThick = bCenterGangThick;
	}
	public String getbInGangThick() {
		return bInGangThick;
	}
	public void setbInGangThick(String bInGangThick) {
		this.bInGangThick = bInGangThick;
	}
	public String getcGangThick() {
		return cGangThick;
	}
	public void setcGangThick(String cGangThick) {
		this.cGangThick = cGangThick;
	}
	public String getcOutGangThick() {
		return cOutGangThick;
	}
	public void setcOutGangThick(String cOutGangThick) {
		this.cOutGangThick = cOutGangThick;
	}
	public String getcCenterGangThick() {
		return cCenterGangThick;
	}
	public void setcCenterGangThick(String cCenterGangThick) {
		this.cCenterGangThick = cCenterGangThick;
	}
	public String getcInGangThick() {
		return cInGangThick;
	}
	public void setcInGangThick(String cInGangThick) {
		this.cInGangThick = cInGangThick;
	}
	public String getaGangMpa() {
		return aGangMpa;
	}
	public void setaGangMpa(String aGangMpa) {
		this.aGangMpa = aGangMpa;
	}
	public String getbGangMpa() {
		return bGangMpa;
	}
	public void setbGangMpa(String bGangMpa) {
		this.bGangMpa = bGangMpa;
	}
	public String getcGangMpa() {
		return cGangMpa;
	}
	public void setcGangMpa(String cGangMpa) {
		this.cGangMpa = cGangMpa;
	}
	public String getFRONT_BUMPER_STRENGTH() {
		return FRONT_BUMPER_STRENGTH;
	}
	public void setFRONT_BUMPER_STRENGTH(String fRONT_BUMPER_STRENGTH) {
		FRONT_BUMPER_STRENGTH = fRONT_BUMPER_STRENGTH;
	}
	public String getFRONT_ENERGY_BOX_STRENGTH() {
		return FRONT_ENERGY_BOX_STRENGTH;
	}
	public void setFRONT_ENERGY_BOX_STRENGTH(String fRONT_ENERGY_BOX_STRENGTH) {
		FRONT_ENERGY_BOX_STRENGTH = fRONT_ENERGY_BOX_STRENGTH;
	}
	public String getFRONT_LONGERON_STRENGTH() {
		return FRONT_LONGERON_STRENGTH;
	}
	public void setFRONT_LONGERON_STRENGTH(String fRONT_LONGERON_STRENGTH) {
		FRONT_LONGERON_STRENGTH = fRONT_LONGERON_STRENGTH;
	}
	public String getAFTER_ANTICOLLISION_STRENGTH() {
		return AFTER_ANTICOLLISION_STRENGTH;
	}
	public void setAFTER_ANTICOLLISION_STRENGTH(String aFTER_ANTICOLLISION_STRENGTH) {
		AFTER_ANTICOLLISION_STRENGTH = aFTER_ANTICOLLISION_STRENGTH;
	}
	public String getAFTER_ENERGY_BOX_STRENGTH() {
		return AFTER_ENERGY_BOX_STRENGTH;
	}
	public void setAFTER_ENERGY_BOX_STRENGTH(String aFTER_ENERGY_BOX_STRENGTH) {
		AFTER_ENERGY_BOX_STRENGTH = aFTER_ENERGY_BOX_STRENGTH;
	}
	public String getAFTER_LONGERON_STRENGTH() {
		return AFTER_LONGERON_STRENGTH;
	}
	public void setAFTER_LONGERON_STRENGTH(String aFTER_LONGERON_STRENGTH) {
		AFTER_LONGERON_STRENGTH = aFTER_LONGERON_STRENGTH;
	}
	public String getFRONT_DOOR_STRENGTH() {
		return FRONT_DOOR_STRENGTH;
	}
	public void setFRONT_DOOR_STRENGTH(String fRONT_DOOR_STRENGTH) {
		FRONT_DOOR_STRENGTH = fRONT_DOOR_STRENGTH;
	}
	public String getAFTER_DOOR_STRENGTH() {
		return AFTER_DOOR_STRENGTH;
	}
	public void setAFTER_DOOR_STRENGTH(String aFTER_DOOR_STRENGTH) {
		AFTER_DOOR_STRENGTH = aFTER_DOOR_STRENGTH;
	}
	public String getCEILING_ANTICOLLISION_STRENGTH() {
		return CEILING_ANTICOLLISION_STRENGTH;
	}
	public void setCEILING_ANTICOLLISION_STRENGTH(
			String cEILING_ANTICOLLISION_STRENGTH) {
		CEILING_ANTICOLLISION_STRENGTH = cEILING_ANTICOLLISION_STRENGTH;
	}
	public String getASTEELPLATE_STRENGTH() {
		return ASTEELPLATE_STRENGTH;
	}
	public void setASTEELPLATE_STRENGTH(String aSTEELPLATE_STRENGTH) {
		ASTEELPLATE_STRENGTH = aSTEELPLATE_STRENGTH;
	}
	public String getBSTEELPLATE_STRENGTH() {
		return BSTEELPLATE_STRENGTH;
	}
	public void setBSTEELPLATE_STRENGTH(String bSTEELPLATE_STRENGTH) {
		BSTEELPLATE_STRENGTH = bSTEELPLATE_STRENGTH;
	}
	public String getCSTEELPLATE_STRENGTH() {
		return CSTEELPLATE_STRENGTH;
	}
	public void setCSTEELPLATE_STRENGTH(String cSTEELPLATE_STRENGTH) {
		CSTEELPLATE_STRENGTH = cSTEELPLATE_STRENGTH;
	}
	public String getINTERIOR_COMBUSTION_STATUS() {
		return INTERIOR_COMBUSTION_STATUS;
	}
	public void setINTERIOR_COMBUSTION_STATUS(String iNTERIOR_COMBUSTION_STATUS) {
		INTERIOR_COMBUSTION_STATUS = iNTERIOR_COMBUSTION_STATUS;
	}
	public String getENGINE_CABLE_PROTECTION() {
		return ENGINE_CABLE_PROTECTION;
	}
	public void setENGINE_CABLE_PROTECTION(String eNGINE_CABLE_PROTECTION) {
		ENGINE_CABLE_PROTECTION = eNGINE_CABLE_PROTECTION;
	}
	public String getSHUTTER_CABLE_PROTECTION() {
		return SHUTTER_CABLE_PROTECTION;
	}
	public void setSHUTTER_CABLE_PROTECTION(String sHUTTER_CABLE_PROTECTION) {
		SHUTTER_CABLE_PROTECTION = sHUTTER_CABLE_PROTECTION;
	}
	public String getCEILING_CABLE_PROTECTION() {
		return CEILING_CABLE_PROTECTION;
	}
	public void setCEILING_CABLE_PROTECTION(String cEILING_CABLE_PROTECTION) {
		CEILING_CABLE_PROTECTION = cEILING_CABLE_PROTECTION;
	}
	public String getCAR_CABLE_PROTECTION() {
		return CAR_CABLE_PROTECTION;
	}
	public void setCAR_CABLE_PROTECTION(String cAR_CABLE_PROTECTION) {
		CAR_CABLE_PROTECTION = cAR_CABLE_PROTECTION;
	}
	public String getSINGLE_BIGGEST_GAP_ERROR() {
		return SINGLE_BIGGEST_GAP_ERROR;
	}
	public void setSINGLE_BIGGEST_GAP_ERROR(String sINGLE_BIGGEST_GAP_ERROR) {
		SINGLE_BIGGEST_GAP_ERROR = sINGLE_BIGGEST_GAP_ERROR;
	}
	public String getSINGLE_PAINT__PLATE() {
		return SINGLE_PAINT__PLATE;
	}
	public void setSINGLE_PAINT__PLATE(String sINGLE_PAINT__PLATE) {
		SINGLE_PAINT__PLATE = sINGLE_PAINT__PLATE;
	}
	public String getVEHICEL_MAXIMUM_PAINT() {
		return VEHICEL_MAXIMUM_PAINT;
	}
	public void setVEHICEL_MAXIMUM_PAINT(String vEHICEL_MAXIMUM_PAINT) {
		VEHICEL_MAXIMUM_PAINT = vEHICEL_MAXIMUM_PAINT;
	}
	public String getFRONT_ROW_60_SPEED() {
		return FRONT_ROW_60_SPEED;
	}
	public void setFRONT_ROW_60_SPEED(String fRONT_ROW_60_SPEED) {
		FRONT_ROW_60_SPEED = fRONT_ROW_60_SPEED;
	}
	public String getFRONT_ROW_100_SPEED() {
		return FRONT_ROW_100_SPEED;
	}
	public void setFRONT_ROW_100_SPEED(String fRONT_ROW_100_SPEED) {
		FRONT_ROW_100_SPEED = fRONT_ROW_100_SPEED;
	}
	public String getAFTER_ROW_60_SPEED() {
		return AFTER_ROW_60_SPEED;
	}
	public void setAFTER_ROW_60_SPEED(String aFTER_ROW_60_SPEED) {
		AFTER_ROW_60_SPEED = aFTER_ROW_60_SPEED;
	}
	public String getAFTER_ROW_100_SPEED() {
		return AFTER_ROW_100_SPEED;
	}
	public void setAFTER_ROW_100_SPEED(String aFTER_ROW_100_SPEED) {
		AFTER_ROW_100_SPEED = aFTER_ROW_100_SPEED;
	}
	public String getFRONT_SUSPENSION_SYSTEM() {
		return FRONT_SUSPENSION_SYSTEM;
	}
	public void setFRONT_SUSPENSION_SYSTEM(String fRONT_SUSPENSION_SYSTEM) {
		FRONT_SUSPENSION_SYSTEM = fRONT_SUSPENSION_SYSTEM;
	}
	public String getAFTER_SUSPENSION_SYSTEM() {
		return AFTER_SUSPENSION_SYSTEM;
	}
	public void setAFTER_SUSPENSION_SYSTEM(String aFTER_SUSPENSION_SYSTEM) {
		AFTER_SUSPENSION_SYSTEM = aFTER_SUSPENSION_SYSTEM;
	}
	public String getTIRE_CAR_DATE_DIFFERENT() {
		return TIRE_CAR_DATE_DIFFERENT;
	}
	public void setTIRE_CAR_DATE_DIFFERENT(String tIRE_CAR_DATE_DIFFERENT) {
		TIRE_CAR_DATE_DIFFERENT = tIRE_CAR_DATE_DIFFERENT;
	}
	public String getENGINE_EFFICIENCY() {
		return ENGINE_EFFICIENCY;
	}
	public void setENGINE_EFFICIENCY(String eNGINE_EFFICIENCY) {
		ENGINE_EFFICIENCY = eNGINE_EFFICIENCY;
	}
	public String getROUND_EFFICIENCY_COMPARE() {
		return ROUND_EFFICIENCY_COMPARE;
	}
	public void setROUND_EFFICIENCY_COMPARE(String rOUND_EFFICIENCY_COMPARE) {
		ROUND_EFFICIENCY_COMPARE = rOUND_EFFICIENCY_COMPARE;
	}
	public String getTORQUE_CONTRAST() {
		return TORQUE_CONTRAST;
	}
	public void setTORQUE_CONTRAST(String tORQUE_CONTRAST) {
		TORQUE_CONTRAST = tORQUE_CONTRAST;
	}
	public static String getMongoCollectName() {
		return MONGO_COLLECT_NAME;
	}
	public String getPentuTScore() {
		return pentuTScore;
	}
	public void setPentuTScore(String pentuTScore) {
		this.pentuTScore = pentuTScore;
	}
	public String getHanjieTScore() {
		return hanjieTScore;
	}
	public void setHanjieTScore(String hanjieTScore) {
		this.hanjieTScore = hanjieTScore;
	}
	public String getAnquanfanghuTScore() {
		return anquanfanghuTScore;
	}
	public void setAnquanfanghuTScore(String anquanfanghuTScore) {
		this.anquanfanghuTScore = anquanfanghuTScore;
	}
	public String getShushiTScore() {
		return shushiTScore;
	}
	public void setShushiTScore(String shushiTScore) {
		this.shushiTScore = shushiTScore;
	}
	public String getNeishiTScore() {
		return neishiTScore;
	}
	public void setNeishiTScore(String neishiTScore) {
		this.neishiTScore = neishiTScore;
	}
	public String getDongtaiTScore() {
		return dongtaiTScore;
	}
	public void setDongtaiTScore(String dongtaiTScore) {
		this.dongtaiTScore = dongtaiTScore;
	}
}
