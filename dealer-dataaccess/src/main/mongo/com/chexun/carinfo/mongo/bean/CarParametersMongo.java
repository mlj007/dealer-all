/**     
 * @create.date: 2012-3-21 上午10:09:41
 * @author: lfz 
 * @company: 车马驿站
 * @see:com.chexun.carinfo.mongo 
 */
package com.chexun.carinfo.mongo.bean;

import java.io.Serializable;
import java.util.Date;

import com.chexun.common.mongo.AnnotationMongoKey;

/**
 * @create.date: 2012-3-21 上午10:09:41
 * @comment: <p>
 *           TODO
 *           </p>
 * @see: com.chexun.carinfo.mongo
 * @author: lfz
 * @modify.by: lfz
 * @modify.date: 2012-3-21 上午10:09:41
 */
public class CarParametersMongo implements Serializable {

	private static final long serialVersionUID = 1L;
	public static final String MONGO_COLLECT_NAME = "car_parameters";

	@AnnotationMongoKey
	private Integer id;
	private Integer model;
	private Double max_speed;
	private Double speeded_up;
	private Double brake_test;
	private Double fuel_consumption;
	private Double combined_consumption;

	private String quality_assurance;
	private Integer length;
	private Integer width;
	private Integer height;
	private Integer wheelbase;
	private Integer front_track;
	private Integer rear_track;
	private Integer min_disforfloor;
	private Integer weight;
	private String structure;

	private Integer doors;
	private String seats;
	private Double tank_volume;
	private String trunk_volume;
	private String engine_model;
	private Integer cylinder_volume;
	private Double displacement;
	private String work_type;
	private String cylinder_form;
	private Integer cylinder_num;
	private Integer valves_num;
	private Double compress_ratio;

	private String valve_structure;
	private Double bore;
	private Double stroke;
	private String max_horsepower;
	private String max_power;
	private String max_power_speed;
	private String max_torque;
	private String max_torque_speed;
	private String engine_echnology;
	private String fuel_type;
	private String fuel_label;
	private String fuel_way;
	private String cylinder_head_material;
	private String cylinder_body_material;

	private String ep_standards;
	private String gear_num;
	private String transmission_type;
	private String drive;
	private String front_suspension;
	private String rear_suspension;
	private String power_type;
	private String body_structure;
	private String front_brake;
	private String rear_brake;
	private String parking_brake;
	private String front_tire;
	private String rear_tire;
	private String spare_tire;

	private String seat_airbag;
	private String copilot_airbag;
	private String front_side_airbag;
	private String rear_side_airbag;
	private String front_head_airbag;
	private String rear_head_airbag;
	private String knee_airbag;
	private String child_seats; // add by zhuxingjun 2012-06-12 儿童安全座椅接口
	private String tp_monitor_device;
	private String zero_tp_travel;
	private String seat_belt_tips;
	private String engine_security;
	private String central_lock;

	private String remote_key;
	private String keyless_start_system;
	private String abs_anti_lock;
	private String braking_force_distribution;
	private String brake_assist;
	private String traction_control;
	private String stability_control;
	private String auto_parking;
	private String hill_descent;
	private String adjustable_suspension;
	private String air_suspension;
	private String active_steering;

	private String electric_sunroof;
	private String panoramic_sunroof;
	private String sports_package;
	private String alloy_wheels;
	private String electric_door;
	private String corium_wheel;
	private String wheel_ud;
	private String wheel_fr;
	private String wheel_electric;
	private String multifunction_wheel;
	private String wheel_shift;
	private String cruise;
	private String park_assist;
	private String reverse_video;
	private String rrip_computer_display;
	private String hud_digital_display;
	private String corium_simulation_seat;
	private String sport_seat;

	private String seat_hl;
	private String waist_support;
	private String shoulder_support;
	private String front_seat_electric;
	private String second_back_angle;
	private String second_seat_move;
	private String rear_seat_electric;
	private String electric_seat_memory;
	private String front_seat_heating;
	private String rear_seat_heating;
	private String seat_airiness;
	private String seat_massage;
	private String rear_seat_overall;
	private String rear_seat_ratio;
	private String third_seat;
	private String front_center_armrest;
	private String rear_center_armrest;
	private String rear_cup_holder;
	private String electric_trunk;
	private String gps_navigate_system;
	private String locate_interaction_service;
	private String center_color_screen;
	private String human_computer_system;
	private String hard_drive;
	private String bluetooth_phone;
	private String car_tv;

	private String rear_lcd_screen;
	private String external_audio_interfaces;
	private String cd_support_mp3;
	private String single_cd;
	private String virtual_multi_cd;
	private String multi_cd_system;
	private String single_dvd;
	private String multi_dvd_system;
	private String two_speaker_system;
	private String four_speaker_system;
	private String six_speaker_system;
	private String eight_speaker_system;
	private String xenon_light;
	private String daytime_running_light;
	private String auto_headlight;
	private String steering_headlight;
	private String front_fog_light;
	private String light_height;
	private String light_clean_device;
	private String atmosphere_light;
	private String front_power_window;
	private String rear_power_window;
	private String window_anti_trap_hand;
	private String uv_insulated_glass;
	private String rearview_electric;
	private String rearview_heating;

	private String rearview_auto_anti_glare;
	private String rearview_electric_fold;
	private String rearview_memory;
	private String rear_wind_shade_curtain;
	private String rear_shade_curtain;
	private String shade_mirror;
	private String rear_wiper;
	private String sensing_wipers;
	private String manual_air;
	private String auto_air;
	private String rear_independent_air;
	private String rear_outlet;
	private String temperature_zone_control;
	private String air_control_pollen_filter;
	private String car_refrigerator;
	private String auto_parking_place;
	private String and_line_auxiliary;
	private String active_brake;
	private String overall_active_system;
	private String night_system;
	private String control_lcd_screen;
	private String adaptive_cruise;
	private String panoramic_camera;

	// 电动发动机参数
	private String motor_model;
	private String battery_types;
	private String batteries;
	private String battery_voltage;
	private String quick_duration;
	private String slow_duration;
	private String peak_current;
	private String single_power;
	private String single_mileage;
	private String battery_capacity;
	private String battery_life;
	private String charging_ways;
	private String maximum_horsepower;
	private String maximum_power;
	private String maximum_torque;
	private String maximum_torque_speed;
	private String motor_type;
	private String motor_cooling_way;
	private String discharge_material;
	private String battery_weight;
	private String recharging_voltage;
	private String battery_design;
	private String maintenance_cycle;
	private Date updateTime;

	// add by zhuxingjun at 2012-11-12 16:39
	private String to100Speed; // 0-100公里/小时加速时间
	private String maxSpeed_Circle; // 最快绕桩时速
	private String zaoyinInCar; // 怠速时车内噪音
	private String speedIn40; // 时速40公里时发动机转速
	private String speedIn60; // 时速60公里时发动机转速
	private String speedIn80; // 时速80公里时发动机转速
	private String speedIn100; // 时速100公里时发动机转速
	private String speedIn120; // 时速120公里时发动机转速
	private String speedScore; // 加速评分
	private String speedComment; // 加速点评
	private String zaoyinIn40; // 时速40公里行驶车内噪音
	private String zaoyinIn60; // 时速60公里行驶车内噪音
	private String zaoyinIn80; // 时速80公里行驶车内噪音
	private String zaoyinIn100; // 时速100公里行驶车内噪音
	private String zaoyinIn120; // 时速120公里行驶车内噪音
	private String zaoyinScore; // 噪音评分
	private String zaoyinComment; // 噪音
	// 其他
	private String dianpingRongliang; // 电瓶容量

	// add by zhuxingjun in 车型参数 新增
	private String frontWidth; // 前排宽度
	private String frontHeight; // 前排高度
	private String frontMinForLeg; // 前排腿部空间最小值
	private String frontMaxForLeg; // 前排腿部空间最大值
	private String frontSitLength; // 前排坐垫长度
	private String backWidth; // 后排宽度
	private String backHeight; // 后排高度
	private String backMinForLeg; // 后排腿部空间最小值
	private String backMaxForLeg; // 后排腿部空间最大值
	private String backSitLength; // 后排坐垫长度
	private String backGroundHeight; // 后排中央地台高度
	private String backBoxWidth; // 后备箱开启后宽度
	private String backBoxHeight; // 后备箱开启后高度
	private String backBoxDeep; // 后备箱开启后纵向深度
	private String backBoxDeepAfter; // 后备箱开启后放倒后排纵向深度

	// add by zhuxj at 2012-12-10 11:11
	private String siquMethod;// 四驱形式
	private String centerStructor; // 中央差速器结构

	// add by zhuxj at 2012-12-10 12:11 配置里面新加
	private String latchSeats; // LATCH座椅接口(兼容ISOFIX)
	private String frontBridge; // 前桥限滑差速器/差速锁
	private String centerLock; // 中央差速器锁止功能
	private String backBridge; // 后桥限滑差速器/差速锁
	private String ledBigLamp; // LED大灯 (废弃2013-7-11)
	private String ledBigLamp2; // LED大灯

	private Double maxHorsePower;// 冗余，与max_horsepower等值，只是类型不同，car首页过滤使用

	// 新加（常规车型测试项目）
	private String jiasu50; //
	private String jiasu100; //
	private String zhidong100; //
	private String zaoyinds; // 怠速噪音（分贝）
	private String zaoyin60; //
	private String zaoyin80; //
	private String zaoyin100; //
	private String fadongji60; //
	private String fadongji80; //
	private String fadongji100; //
	private String chesu60; //
	private String chesu80; //
	private String chesu100; //
	private String dcfs_jiashi; // 驾驶座
	private String dcfs_fujiashi; // 副驾驶座
	private String dcfs_houpaizuoce; // 后排左侧座位
	private String dcfs_houpaizhongjian; // 后排中间座位
	private String dcfs_houpaiyouce; // 后排右侧座位
	private String dcfs_zhongkongtai; // 中控台
	private String dcfs_yibiaopan; // 仪表盘
	private String ltgg_taikuan; // 胎宽
	private String ltgg_zhijing; // 直径
	private String ltgg_bianpingbi; // 扁平比
	private String ltgg_zuigaosudu; // 轮胎最高速度系数
	private String ltgg_zuigaozaizhong; // 最高载重系数
	private String ltgg_beitaizuigaosudu; // 备胎最高速度系统
	private String ltgg_beitaizaizhong; // 备胎载重系数
	private String rjyx_zhengbei; // 整备质量
	private String rjyx_max; // 最大总质量
	private String rjyx_chengzai; // 承载质量 //已删除
	private String rjyx_manzairenshu; // 满载人数
	private String rjyx_renjun; // 人均允许最大提供体重 //已删除
	private String mcfjs_zhujiashi; // 主驾驶
	private String mcfjs_fujiashi; // 副驾驶
	private String mcfjs_houpai; // 后排
	private String mcfjs_tianchuang; // 天窗
	private String zygg_qianzuodianchang; // 前排座垫长度
	private String zygg_qianzuodiankuan; // 前排座垫宽度
	private String zygg_qiankaodianchang; // 前排靠垫长
	private String zygg_qiankaodiankuan; // 前排靠垫宽
	private String zygg_houzuodianchang; // 后排座垫长
	private String zygg_houzuodiankuan; // 后排座垫宽
	private String zygg_houkaodianchang; // 后排靠垫长
	private String zygg_houkaodiankuan; // 后排靠垫宽
	private String cndb_qiandipan; // 前排底盘
	private String cndb_houdipan; // 后排底盘
	private String cndb_qiangaodu; // 前排座椅离地高度
	private String cndb_hougaodu; // 后排座椅离地高度
	private String hlz_dance; // 单侧车轮通过滑轮组
	private String hlz_jiaocha; // 交叉轮通过滑轮组
	private String hlz_sanlun; // 三轮通过滑轮组（专业越野SUV）
	private String hbxkj_kaikoumianji; // 开口面积 //已删除
	private String hbxkj_kaikougaokuan; // 开口高、宽
	private String hbxkj_houbeixiang; // 后备箱内长、宽、高
	private String hbxkj_houpaizuoyi; // 后排座椅放倒后长度（后排座椅靠背顶部位置）
	private String hbxgd_kaikou; // 后备箱开口离地高度
	private String hbxgd_kaiqihou; // 后备箱盖开启后离地高度（SUV/MPV）
	private String ldjx_qian; // 前离地间隙
	private String ldjx_hou; // 后离地间隙
	private String ldjx_kongzai; // 空载离地间隙//已删除
	private String ldjx_danren; // 单人离地间隙//已删除
	private String ldjx_manzai; // 满载离地间隙//已删除
	private String dcld_zuiyuan; // 倒车雷达最远报警距离
	private String dcld_zuijin; // 倒车雷达最近报警距离
	private String dcld_jingshi; // 倒车雷达警示音报警距离//已删除
	private String dcld_mangqu; // 倒车雷达盲区测试//已删除
	private String dcyx_tigong; // 是否提供辅助线
	private String dcyx_suidong; // 辅助线是否随动
	private String dcyx_fanwei; // 倒车影像范围角度//已删除
	private String hdl_danrendi; // 单人低负荷//已删除
	private String hdl_danrengao; // 单人高负荷//已删除
	private String hdl_manzaidi; // 满载低负荷//已删除
	private String hdl_manzaigao; // 满载高负荷//已删除

	private String open_purification_system; // 单独开启净化系统10分钟后隔绝率
	private String open_inner_loop; // 开启内循环10分钟后隔绝率
	private String open_outer_loop; // 开启外循环10分钟后隔绝率
	
	private String oil_test; //油耗测试

	public String getLatchSeats() {
		return latchSeats;
	}

	public void setLatchSeats(String latchSeats) {
		this.latchSeats = latchSeats;
	}

	public String getFrontBridge() {
		return frontBridge;
	}

	public void setFrontBridge(String frontBridge) {
		this.frontBridge = frontBridge;
	}

	public String getCenterLock() {
		return centerLock;
	}

	public void setCenterLock(String centerLock) {
		this.centerLock = centerLock;
	}

	public String getBackBridge() {
		return backBridge;
	}

	public void setBackBridge(String backBridge) {
		this.backBridge = backBridge;
	}

	public String getLedBigLamp() {
		return ledBigLamp;
	}

	public void setLedBigLamp(String ledBigLamp) {
		ledBigLamp = ledBigLamp;
	}

	public String getSiquMethod() {
		return siquMethod;
	}

	public void setSiquMethod(String siquMethod) {
		this.siquMethod = siquMethod;
	}

	public String getCenterStructor() {
		return centerStructor;
	}

	public void setCenterStructor(String centerStructor) {
		this.centerStructor = centerStructor;
	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the model
	 */
	public Integer getModel() {
		return model;
	}

	/**
	 * @param model
	 *            the model to set
	 */
	public void setModel(Integer model) {
		this.model = model;
	}

	/**
	 * @return the max_speed
	 */
	public Double getMax_speed() {
		return max_speed;
	}

	/**
	 * @param max_speed
	 *            the max_speed to set
	 */
	public void setMax_speed(Double max_speed) {
		this.max_speed = max_speed;
	}

	/**
	 * @return the speeded_up
	 */
	public Double getSpeeded_up() {
		return speeded_up;
	}

	/**
	 * @param speeded_up
	 *            the speeded_up to set
	 */
	public void setSpeeded_up(Double speeded_up) {
		this.speeded_up = speeded_up;
	}

	/**
	 * @return the brake_test
	 */
	public Double getBrake_test() {
		return brake_test;
	}

	/**
	 * @param brake_test
	 *            the brake_test to set
	 */
	public void setBrake_test(Double brake_test) {
		this.brake_test = brake_test;
	}

	/**
	 * @return the fuel_consumption
	 */
	public Double getFuel_consumption() {
		return fuel_consumption;
	}

	/**
	 * @param fuel_consumption
	 *            the fuel_consumption to set
	 */
	public void setFuel_consumption(Double fuel_consumption) {
		this.fuel_consumption = fuel_consumption;
	}

	/**
	 * @return the combined_consumption
	 */
	public Double getCombined_consumption() {
		return combined_consumption;
	}

	/**
	 * @param combined_consumption
	 *            the combined_consumption to set
	 */
	public void setCombined_consumption(Double combined_consumption) {
		this.combined_consumption = combined_consumption;
	}

	/**
	 * @return the quality_assurance
	 */
	public String getQuality_assurance() {
		return quality_assurance;
	}

	/**
	 * @param quality_assurance
	 *            the quality_assurance to set
	 */
	public void setQuality_assurance(String quality_assurance) {
		this.quality_assurance = quality_assurance;
	}

	/**
	 * @return the length
	 */
	public Integer getLength() {
		return length;
	}

	/**
	 * @param length
	 *            the length to set
	 */
	public void setLength(Integer length) {
		this.length = length;
	}

	/**
	 * @return the width
	 */
	public Integer getWidth() {
		return width;
	}

	/**
	 * @param width
	 *            the width to set
	 */
	public void setWidth(Integer width) {
		this.width = width;
	}

	/**
	 * @return the height
	 */
	public Integer getHeight() {
		return height;
	}

	/**
	 * @param height
	 *            the height to set
	 */
	public void setHeight(Integer height) {
		this.height = height;
	}

	/**
	 * @return the wheelbase
	 */
	public Integer getWheelbase() {
		return wheelbase;
	}

	/**
	 * @param wheelbase
	 *            the wheelbase to set
	 */
	public void setWheelbase(Integer wheelbase) {
		this.wheelbase = wheelbase;
	}

	/**
	 * @return the front_track
	 */
	public Integer getFront_track() {
		return front_track;
	}

	/**
	 * @param front_track
	 *            the front_track to set
	 */
	public void setFront_track(Integer front_track) {
		this.front_track = front_track;
	}

	/**
	 * @return the rear_track
	 */
	public Integer getRear_track() {
		return rear_track;
	}

	/**
	 * @param rear_track
	 *            the rear_track to set
	 */
	public void setRear_track(Integer rear_track) {
		this.rear_track = rear_track;
	}

	/**
	 * @return the min_disforfloor
	 */
	public Integer getMin_disforfloor() {
		return min_disforfloor;
	}

	/**
	 * @param min_disforfloor
	 *            the min_disforfloor to set
	 */
	public void setMin_disforfloor(Integer min_disforfloor) {
		this.min_disforfloor = min_disforfloor;
	}

	/**
	 * @return the weight
	 */
	public Integer getWeight() {
		return weight;
	}

	/**
	 * @param weight
	 *            the weight to set
	 */
	public void setWeight(Integer weight) {
		this.weight = weight;
	}

	/**
	 * @return the structure
	 */
	public String getStructure() {
		return structure;
	}

	/**
	 * @param structure
	 *            the structure to set
	 */
	public void setStructure(String structure) {
		this.structure = structure;
	}

	/**
	 * @return the doors
	 */
	public Integer getDoors() {
		return doors;
	}

	/**
	 * @param doors
	 *            the doors to set
	 */
	public void setDoors(Integer doors) {
		this.doors = doors;
	}

	/**
	 * @return the seats
	 */
	public String getSeats() {
		return seats;
	}

	/**
	 * @param seats
	 *            the seats to set
	 */
	public void setSeats(String seats) {
		this.seats = seats;
	}

	/**
	 * @return the tank_volume
	 */
	public Double getTank_volume() {
		return tank_volume;
	}

	/**
	 * @param tank_volume
	 *            the tank_volume to set
	 */
	public void setTank_volume(Double tank_volume) {
		this.tank_volume = tank_volume;
	}

	/**
	 * @return the trunk_volume
	 */
	public String getTrunk_volume() {
		return trunk_volume;
	}

	/**
	 * @param trunk_volume
	 *            the trunk_volume to set
	 */
	public void setTrunk_volume(String trunk_volume) {
		this.trunk_volume = trunk_volume;
	}

	/**
	 * @return the engine_model
	 */
	public String getEngine_model() {
		return engine_model;
	}

	/**
	 * @param engine_model
	 *            the engine_model to set
	 */
	public void setEngine_model(String engine_model) {
		this.engine_model = engine_model;
	}

	/**
	 * @return the cylinder_volume
	 */
	public Integer getCylinder_volume() {
		return cylinder_volume;
	}

	/**
	 * @param cylinder_volume
	 *            the cylinder_volume to set
	 */
	public void setCylinder_volume(Integer cylinder_volume) {
		this.cylinder_volume = cylinder_volume;
	}

	/**
	 * @return the displacement
	 */
	public Double getDisplacement() {
		return displacement;
	}

	/**
	 * @param displacement
	 *            the displacement to set
	 */
	public void setDisplacement(Double displacement) {
		this.displacement = displacement;
	}

	/**
	 * @return the work_type
	 */
	public String getWork_type() {
		return work_type;
	}

	/**
	 * @param work_type
	 *            the work_type to set
	 */
	public void setWork_type(String work_type) {
		this.work_type = work_type;
	}

	/**
	 * @return the cylinder_form
	 */
	public String getCylinder_form() {
		return cylinder_form;
	}

	/**
	 * @param cylinder_form
	 *            the cylinder_form to set
	 */
	public void setCylinder_form(String cylinder_form) {
		this.cylinder_form = cylinder_form;
	}

	/**
	 * @return the cylinder_num
	 */
	public Integer getCylinder_num() {
		return cylinder_num;
	}

	/**
	 * @param cylinder_num
	 *            the cylinder_num to set
	 */
	public void setCylinder_num(Integer cylinder_num) {
		this.cylinder_num = cylinder_num;
	}

	/**
	 * @return the valves_num
	 */
	public Integer getValves_num() {
		return valves_num;
	}

	/**
	 * @param valves_num
	 *            the valves_num to set
	 */
	public void setValves_num(Integer valves_num) {
		this.valves_num = valves_num;
	}

	/**
	 * @return the compress_ratio
	 */
	public Double getCompress_ratio() {
		return compress_ratio;
	}

	/**
	 * @param compress_ratio
	 *            the compress_ratio to set
	 */
	public void setCompress_ratio(Double compress_ratio) {
		this.compress_ratio = compress_ratio;
	}

	/**
	 * @return the valve_structure
	 */
	public String getValve_structure() {
		return valve_structure;
	}

	/**
	 * @param valve_structure
	 *            the valve_structure to set
	 */
	public void setValve_structure(String valve_structure) {
		this.valve_structure = valve_structure;
	}

	/**
	 * @return the bore
	 */
	public Double getBore() {
		return bore;
	}

	/**
	 * @param bore
	 *            the bore to set
	 */
	public void setBore(Double bore) {
		this.bore = bore;
	}

	/**
	 * @return the stroke
	 */
	public Double getStroke() {
		return stroke;
	}

	/**
	 * @param stroke
	 *            the stroke to set
	 */
	public void setStroke(Double stroke) {
		this.stroke = stroke;
	}

	/**
	 * @return the max_horsepower
	 */
	public String getMax_horsepower() {
		return max_horsepower;
	}

	/**
	 * @param max_horsepower
	 *            the max_horsepower to set
	 */
	public void setMax_horsepower(String max_horsepower) {
		this.max_horsepower = max_horsepower;
	}

	/**
	 * @return the max_power
	 */
	public String getMax_power() {
		return max_power;
	}

	/**
	 * @param max_power
	 *            the max_power to set
	 */
	public void setMax_power(String max_power) {
		this.max_power = max_power;
	}

	/**
	 * @return the max_power_speed
	 */
	public String getMax_power_speed() {
		return max_power_speed;
	}

	/**
	 * @param max_power_speed
	 *            the max_power_speed to set
	 */
	public void setMax_power_speed(String max_power_speed) {
		this.max_power_speed = max_power_speed;
	}

	/**
	 * @return the max_torque
	 */
	public String getMax_torque() {
		return max_torque;
	}

	/**
	 * @param max_torque
	 *            the max_torque to set
	 */
	public void setMax_torque(String max_torque) {
		this.max_torque = max_torque;
	}

	/**
	 * @return the max_torque_speed
	 */
	public String getMax_torque_speed() {
		return max_torque_speed;
	}

	/**
	 * @param max_torque_speed
	 *            the max_torque_speed to set
	 */
	public void setMax_torque_speed(String max_torque_speed) {
		this.max_torque_speed = max_torque_speed;
	}

	/**
	 * @return the engine_echnology
	 */
	public String getEngine_echnology() {
		return engine_echnology;
	}

	/**
	 * @param engine_echnology
	 *            the engine_echnology to set
	 */
	public void setEngine_echnology(String engine_echnology) {
		this.engine_echnology = engine_echnology;
	}

	/**
	 * @return the fuel_type
	 */
	public String getFuel_type() {
		return fuel_type;
	}

	/**
	 * @param fuel_type
	 *            the fuel_type to set
	 */
	public void setFuel_type(String fuel_type) {
		this.fuel_type = fuel_type;
	}

	/**
	 * @return the fuel_label
	 */
	public String getFuel_label() {
		return fuel_label;
	}

	/**
	 * @param fuel_label
	 *            the fuel_label to set
	 */
	public void setFuel_label(String fuel_label) {
		this.fuel_label = fuel_label;
	}

	/**
	 * @return the fuel_way
	 */
	public String getFuel_way() {
		return fuel_way;
	}

	/**
	 * @param fuel_way
	 *            the fuel_way to set
	 */
	public void setFuel_way(String fuel_way) {
		this.fuel_way = fuel_way;
	}

	/**
	 * @return the cylinder_head_material
	 */
	public String getCylinder_head_material() {
		return cylinder_head_material;
	}

	/**
	 * @param cylinder_head_material
	 *            the cylinder_head_material to set
	 */
	public void setCylinder_head_material(String cylinder_head_material) {
		this.cylinder_head_material = cylinder_head_material;
	}

	/**
	 * @return the cylinder_body_material
	 */
	public String getCylinder_body_material() {
		return cylinder_body_material;
	}

	/**
	 * @param cylinder_body_material
	 *            the cylinder_body_material to set
	 */
	public void setCylinder_body_material(String cylinder_body_material) {
		this.cylinder_body_material = cylinder_body_material;
	}

	/**
	 * @return the ep_standards
	 */
	public String getEp_standards() {
		return ep_standards;
	}

	/**
	 * @param ep_standards
	 *            the ep_standards to set
	 */
	public void setEp_standards(String ep_standards) {
		this.ep_standards = ep_standards;
	}

	/**
	 * @return the gear_num
	 */
	public String getGear_num() {
		return gear_num;
	}

	/**
	 * @param gear_num
	 *            the gear_num to set
	 */
	public void setGear_num(String gear_num) {
		this.gear_num = gear_num;
	}

	/**
	 * @return the transmission_type
	 */
	public String getTransmission_type() {
		return transmission_type;
	}

	/**
	 * @param transmission_type
	 *            the transmission_type to set
	 */
	public void setTransmission_type(String transmission_type) {
		this.transmission_type = transmission_type;
	}

	/**
	 * @return the drive
	 */
	public String getDrive() {
		return drive;
	}

	/**
	 * @param drive
	 *            the drive to set
	 */
	public void setDrive(String drive) {
		this.drive = drive;
	}

	/**
	 * @return the front_suspension
	 */
	public String getFront_suspension() {
		return front_suspension;
	}

	/**
	 * @param front_suspension
	 *            the front_suspension to set
	 */
	public void setFront_suspension(String front_suspension) {
		this.front_suspension = front_suspension;
	}

	/**
	 * @return the rear_suspension
	 */
	public String getRear_suspension() {
		return rear_suspension;
	}

	/**
	 * @param rear_suspension
	 *            the rear_suspension to set
	 */
	public void setRear_suspension(String rear_suspension) {
		this.rear_suspension = rear_suspension;
	}

	/**
	 * @return the power_type
	 */
	public String getPower_type() {
		return power_type;
	}

	/**
	 * @param power_type
	 *            the power_type to set
	 */
	public void setPower_type(String power_type) {
		this.power_type = power_type;
	}

	/**
	 * @return the body_structure
	 */
	public String getBody_structure() {
		return body_structure;
	}

	/**
	 * @param body_structure
	 *            the body_structure to set
	 */
	public void setBody_structure(String body_structure) {
		this.body_structure = body_structure;
	}

	/**
	 * @return the front_brake
	 */
	public String getFront_brake() {
		return front_brake;
	}

	/**
	 * @param front_brake
	 *            the front_brake to set
	 */
	public void setFront_brake(String front_brake) {
		this.front_brake = front_brake;
	}

	/**
	 * @return the rear_brake
	 */
	public String getRear_brake() {
		return rear_brake;
	}

	/**
	 * @param rear_brake
	 *            the rear_brake to set
	 */
	public void setRear_brake(String rear_brake) {
		this.rear_brake = rear_brake;
	}

	/**
	 * @return the parking_brake
	 */
	public String getParking_brake() {
		return parking_brake;
	}

	/**
	 * @param parking_brake
	 *            the parking_brake to set
	 */
	public void setParking_brake(String parking_brake) {
		this.parking_brake = parking_brake;
	}

	/**
	 * @return the front_tire
	 */
	public String getFront_tire() {
		return front_tire;
	}

	/**
	 * @param front_tire
	 *            the front_tire to set
	 */
	public void setFront_tire(String front_tire) {
		this.front_tire = front_tire;
	}

	/**
	 * @return the rear_tire
	 */
	public String getRear_tire() {
		return rear_tire;
	}

	/**
	 * @param rear_tire
	 *            the rear_tire to set
	 */
	public void setRear_tire(String rear_tire) {
		this.rear_tire = rear_tire;
	}

	/**
	 * @return the spare_tire
	 */
	public String getSpare_tire() {
		return spare_tire;
	}

	/**
	 * @param spare_tire
	 *            the spare_tire to set
	 */
	public void setSpare_tire(String spare_tire) {
		this.spare_tire = spare_tire;
	}

	/**
	 * @return the seat_airbag
	 */
	public String getSeat_airbag() {
		return seat_airbag;
	}

	/**
	 * @param seat_airbag
	 *            the seat_airbag to set
	 */
	public void setSeat_airbag(String seat_airbag) {
		this.seat_airbag = seat_airbag;
	}

	/**
	 * @return the copilot_airbag
	 */
	public String getCopilot_airbag() {
		return copilot_airbag;
	}

	/**
	 * @param copilot_airbag
	 *            the copilot_airbag to set
	 */
	public void setCopilot_airbag(String copilot_airbag) {
		this.copilot_airbag = copilot_airbag;
	}

	/**
	 * @return the front_side_airbag
	 */
	public String getFront_side_airbag() {
		return front_side_airbag;
	}

	/**
	 * @param front_side_airbag
	 *            the front_side_airbag to set
	 */
	public void setFront_side_airbag(String front_side_airbag) {
		this.front_side_airbag = front_side_airbag;
	}

	/**
	 * @return the rear_side_airbag
	 */
	public String getRear_side_airbag() {
		return rear_side_airbag;
	}

	/**
	 * @param rear_side_airbag
	 *            the rear_side_airbag to set
	 */
	public void setRear_side_airbag(String rear_side_airbag) {
		this.rear_side_airbag = rear_side_airbag;
	}

	/**
	 * @return the front_head_airbag
	 */
	public String getFront_head_airbag() {
		return front_head_airbag;
	}

	/**
	 * @param front_head_airbag
	 *            the front_head_airbag to set
	 */
	public void setFront_head_airbag(String front_head_airbag) {
		this.front_head_airbag = front_head_airbag;
	}

	/**
	 * @return the rear_head_airbag
	 */
	public String getRear_head_airbag() {
		return rear_head_airbag;
	}

	/**
	 * @param rear_head_airbag
	 *            the rear_head_airbag to set
	 */
	public void setRear_head_airbag(String rear_head_airbag) {
		this.rear_head_airbag = rear_head_airbag;
	}

	/**
	 * @return the knee_airbag
	 */
	public String getKnee_airbag() {
		return knee_airbag;
	}

	/**
	 * @param knee_airbag
	 *            the knee_airbag to set
	 */
	public void setKnee_airbag(String knee_airbag) {
		this.knee_airbag = knee_airbag;
	}

	/**
	 * @return the tp_monitor_device
	 */
	public String getTp_monitor_device() {
		return tp_monitor_device;
	}

	/**
	 * @param tp_monitor_device
	 *            the tp_monitor_device to set
	 */
	public void setTp_monitor_device(String tp_monitor_device) {
		this.tp_monitor_device = tp_monitor_device;
	}

	/**
	 * @return the zero_tp_travel
	 */
	public String getZero_tp_travel() {
		return zero_tp_travel;
	}

	/**
	 * @param zero_tp_travel
	 *            the zero_tp_travel to set
	 */
	public void setZero_tp_travel(String zero_tp_travel) {
		this.zero_tp_travel = zero_tp_travel;
	}

	/**
	 * @return the seat_belt_tips
	 */
	public String getSeat_belt_tips() {
		return seat_belt_tips;
	}

	/**
	 * @param seat_belt_tips
	 *            the seat_belt_tips to set
	 */
	public void setSeat_belt_tips(String seat_belt_tips) {
		this.seat_belt_tips = seat_belt_tips;
	}

	/**
	 * @return the engine_security
	 */
	public String getEngine_security() {
		return engine_security;
	}

	/**
	 * @param engine_security
	 *            the engine_security to set
	 */
	public void setEngine_security(String engine_security) {
		this.engine_security = engine_security;
	}

	/**
	 * @return the central_lock
	 */
	public String getCentral_lock() {
		return central_lock;
	}

	/**
	 * @param central_lock
	 *            the central_lock to set
	 */
	public void setCentral_lock(String central_lock) {
		this.central_lock = central_lock;
	}

	/**
	 * @return the remote_key
	 */
	public String getRemote_key() {
		return remote_key;
	}

	/**
	 * @param remote_key
	 *            the remote_key to set
	 */
	public void setRemote_key(String remote_key) {
		this.remote_key = remote_key;
	}

	/**
	 * @return the keyless_start_system
	 */
	public String getKeyless_start_system() {
		return keyless_start_system;
	}

	/**
	 * @param keyless_start_system
	 *            the keyless_start_system to set
	 */
	public void setKeyless_start_system(String keyless_start_system) {
		this.keyless_start_system = keyless_start_system;
	}

	/**
	 * @return the abs_anti_lock
	 */
	public String getAbs_anti_lock() {
		return abs_anti_lock;
	}

	/**
	 * @param abs_anti_lock
	 *            the abs_anti_lock to set
	 */
	public void setAbs_anti_lock(String abs_anti_lock) {
		this.abs_anti_lock = abs_anti_lock;
	}

	/**
	 * @return the braking_force_distribution
	 */
	public String getBraking_force_distribution() {
		return braking_force_distribution;
	}

	/**
	 * @param braking_force_distribution
	 *            the braking_force_distribution to set
	 */
	public void setBraking_force_distribution(String braking_force_distribution) {
		this.braking_force_distribution = braking_force_distribution;
	}

	/**
	 * @return the brake_assist
	 */
	public String getBrake_assist() {
		return brake_assist;
	}

	/**
	 * @param brake_assist
	 *            the brake_assist to set
	 */
	public void setBrake_assist(String brake_assist) {
		this.brake_assist = brake_assist;
	}

	/**
	 * @return the traction_control
	 */
	public String getTraction_control() {
		return traction_control;
	}

	/**
	 * @param traction_control
	 *            the traction_control to set
	 */
	public void setTraction_control(String traction_control) {
		this.traction_control = traction_control;
	}

	/**
	 * @return the stability_control
	 */
	public String getStability_control() {
		return stability_control;
	}

	/**
	 * @param stability_control
	 *            the stability_control to set
	 */
	public void setStability_control(String stability_control) {
		this.stability_control = stability_control;
	}

	/**
	 * @return the auto_parking
	 */
	public String getAuto_parking() {
		return auto_parking;
	}

	/**
	 * @param auto_parking
	 *            the auto_parking to set
	 */
	public void setAuto_parking(String auto_parking) {
		this.auto_parking = auto_parking;
	}

	/**
	 * @return the hill_descent
	 */
	public String getHill_descent() {
		return hill_descent;
	}

	/**
	 * @param hill_descent
	 *            the hill_descent to set
	 */
	public void setHill_descent(String hill_descent) {
		this.hill_descent = hill_descent;
	}

	/**
	 * @return the adjustable_suspension
	 */
	public String getAdjustable_suspension() {
		return adjustable_suspension;
	}

	/**
	 * @param adjustable_suspension
	 *            the adjustable_suspension to set
	 */
	public void setAdjustable_suspension(String adjustable_suspension) {
		this.adjustable_suspension = adjustable_suspension;
	}

	/**
	 * @return the air_suspension
	 */
	public String getAir_suspension() {
		return air_suspension;
	}

	/**
	 * @param air_suspension
	 *            the air_suspension to set
	 */
	public void setAir_suspension(String air_suspension) {
		this.air_suspension = air_suspension;
	}

	/**
	 * @return the active_steering
	 */
	public String getActive_steering() {
		return active_steering;
	}

	/**
	 * @param active_steering
	 *            the active_steering to set
	 */
	public void setActive_steering(String active_steering) {
		this.active_steering = active_steering;
	}

	/**
	 * @return the electric_sunroof
	 */
	public String getElectric_sunroof() {
		return electric_sunroof;
	}

	/**
	 * @param electric_sunroof
	 *            the electric_sunroof to set
	 */
	public void setElectric_sunroof(String electric_sunroof) {
		this.electric_sunroof = electric_sunroof;
	}

	/**
	 * @return the panoramic_sunroof
	 */
	public String getPanoramic_sunroof() {
		return panoramic_sunroof;
	}

	/**
	 * @param panoramic_sunroof
	 *            the panoramic_sunroof to set
	 */
	public void setPanoramic_sunroof(String panoramic_sunroof) {
		this.panoramic_sunroof = panoramic_sunroof;
	}

	/**
	 * @return the sports_package
	 */
	public String getSports_package() {
		return sports_package;
	}

	/**
	 * @param sports_package
	 *            the sports_package to set
	 */
	public void setSports_package(String sports_package) {
		this.sports_package = sports_package;
	}

	/**
	 * @return the alloy_wheels
	 */
	public String getAlloy_wheels() {
		return alloy_wheels;
	}

	/**
	 * @param alloy_wheels
	 *            the alloy_wheels to set
	 */
	public void setAlloy_wheels(String alloy_wheels) {
		this.alloy_wheels = alloy_wheels;
	}

	/**
	 * @return the electric_door
	 */
	public String getElectric_door() {
		return electric_door;
	}

	/**
	 * @param electric_door
	 *            the electric_door to set
	 */
	public void setElectric_door(String electric_door) {
		this.electric_door = electric_door;
	}

	/**
	 * @return the corium_wheel
	 */
	public String getCorium_wheel() {
		return corium_wheel;
	}

	/**
	 * @param corium_wheel
	 *            the corium_wheel to set
	 */
	public void setCorium_wheel(String corium_wheel) {
		this.corium_wheel = corium_wheel;
	}

	/**
	 * @return the wheel_ud
	 */
	public String getWheel_ud() {
		return wheel_ud;
	}

	/**
	 * @param wheel_ud
	 *            the wheel_ud to set
	 */
	public void setWheel_ud(String wheel_ud) {
		this.wheel_ud = wheel_ud;
	}

	/**
	 * @return the wheel_fr
	 */
	public String getWheel_fr() {
		return wheel_fr;
	}

	/**
	 * @param wheel_fr
	 *            the wheel_fr to set
	 */
	public void setWheel_fr(String wheel_fr) {
		this.wheel_fr = wheel_fr;
	}

	/**
	 * @return the wheel_electric
	 */
	public String getWheel_electric() {
		return wheel_electric;
	}

	/**
	 * @param wheel_electric
	 *            the wheel_electric to set
	 */
	public void setWheel_electric(String wheel_electric) {
		this.wheel_electric = wheel_electric;
	}

	/**
	 * @return the multifunction_wheel
	 */
	public String getMultifunction_wheel() {
		return multifunction_wheel;
	}

	/**
	 * @param multifunction_wheel
	 *            the multifunction_wheel to set
	 */
	public void setMultifunction_wheel(String multifunction_wheel) {
		this.multifunction_wheel = multifunction_wheel;
	}

	/**
	 * @return the wheel_shift
	 */
	public String getWheel_shift() {
		return wheel_shift;
	}

	/**
	 * @param wheel_shift
	 *            the wheel_shift to set
	 */
	public void setWheel_shift(String wheel_shift) {
		this.wheel_shift = wheel_shift;
	}

	/**
	 * @return the cruise
	 */
	public String getCruise() {
		return cruise;
	}

	/**
	 * @param cruise
	 *            the cruise to set
	 */
	public void setCruise(String cruise) {
		this.cruise = cruise;
	}

	/**
	 * @return the park_assist
	 */
	public String getPark_assist() {
		return park_assist;
	}

	/**
	 * @param park_assist
	 *            the park_assist to set
	 */
	public void setPark_assist(String park_assist) {
		this.park_assist = park_assist;
	}

	/**
	 * @return the reverse_video
	 */
	public String getReverse_video() {
		return reverse_video;
	}

	/**
	 * @param reverse_video
	 *            the reverse_video to set
	 */
	public void setReverse_video(String reverse_video) {
		this.reverse_video = reverse_video;
	}

	/**
	 * @return the rrip_computer_display
	 */
	public String getRrip_computer_display() {
		return rrip_computer_display;
	}

	/**
	 * @param rrip_computer_display
	 *            the rrip_computer_display to set
	 */
	public void setRrip_computer_display(String rrip_computer_display) {
		this.rrip_computer_display = rrip_computer_display;
	}

	/**
	 * @return the hud_digital_display
	 */
	public String getHud_digital_display() {
		return hud_digital_display;
	}

	/**
	 * @param hud_digital_display
	 *            the hud_digital_display to set
	 */
	public void setHud_digital_display(String hud_digital_display) {
		this.hud_digital_display = hud_digital_display;
	}

	/**
	 * @return the corium_simulation_seat
	 */
	public String getCorium_simulation_seat() {
		return corium_simulation_seat;
	}

	/**
	 * @param corium_simulation_seat
	 *            the corium_simulation_seat to set
	 */
	public void setCorium_simulation_seat(String corium_simulation_seat) {
		this.corium_simulation_seat = corium_simulation_seat;
	}

	/**
	 * @return the sport_seat
	 */
	public String getSport_seat() {
		return sport_seat;
	}

	/**
	 * @param sport_seat
	 *            the sport_seat to set
	 */
	public void setSport_seat(String sport_seat) {
		this.sport_seat = sport_seat;
	}

	/**
	 * @return the seat_hl
	 */
	public String getSeat_hl() {
		return seat_hl;
	}

	/**
	 * @param seat_hl
	 *            the seat_hl to set
	 */
	public void setSeat_hl(String seat_hl) {
		this.seat_hl = seat_hl;
	}

	/**
	 * @return the waist_support
	 */
	public String getWaist_support() {
		return waist_support;
	}

	/**
	 * @param waist_support
	 *            the waist_support to set
	 */
	public void setWaist_support(String waist_support) {
		this.waist_support = waist_support;
	}

	/**
	 * @return the shoulder_support
	 */
	public String getShoulder_support() {
		return shoulder_support;
	}

	/**
	 * @param shoulder_support
	 *            the shoulder_support to set
	 */
	public void setShoulder_support(String shoulder_support) {
		this.shoulder_support = shoulder_support;
	}

	/**
	 * @return the front_seat_electric
	 */
	public String getFront_seat_electric() {
		return front_seat_electric;
	}

	/**
	 * @param front_seat_electric
	 *            the front_seat_electric to set
	 */
	public void setFront_seat_electric(String front_seat_electric) {
		this.front_seat_electric = front_seat_electric;
	}

	/**
	 * @return the second_back_angle
	 */
	public String getSecond_back_angle() {
		return second_back_angle;
	}

	/**
	 * @param second_back_angle
	 *            the second_back_angle to set
	 */
	public void setSecond_back_angle(String second_back_angle) {
		this.second_back_angle = second_back_angle;
	}

	/**
	 * @return the second_seat_move
	 */
	public String getSecond_seat_move() {
		return second_seat_move;
	}

	/**
	 * @param second_seat_move
	 *            the second_seat_move to set
	 */
	public void setSecond_seat_move(String second_seat_move) {
		this.second_seat_move = second_seat_move;
	}

	/**
	 * @return the rear_seat_electric
	 */
	public String getRear_seat_electric() {
		return rear_seat_electric;
	}

	/**
	 * @param rear_seat_electric
	 *            the rear_seat_electric to set
	 */
	public void setRear_seat_electric(String rear_seat_electric) {
		this.rear_seat_electric = rear_seat_electric;
	}

	/**
	 * @return the electric_seat_memory
	 */
	public String getElectric_seat_memory() {
		return electric_seat_memory;
	}

	/**
	 * @param electric_seat_memory
	 *            the electric_seat_memory to set
	 */
	public void setElectric_seat_memory(String electric_seat_memory) {
		this.electric_seat_memory = electric_seat_memory;
	}

	/**
	 * @return the front_seat_heating
	 */
	public String getFront_seat_heating() {
		return front_seat_heating;
	}

	/**
	 * @param front_seat_heating
	 *            the front_seat_heating to set
	 */
	public void setFront_seat_heating(String front_seat_heating) {
		this.front_seat_heating = front_seat_heating;
	}

	/**
	 * @return the rear_seat_heating
	 */
	public String getRear_seat_heating() {
		return rear_seat_heating;
	}

	/**
	 * @param rear_seat_heating
	 *            the rear_seat_heating to set
	 */
	public void setRear_seat_heating(String rear_seat_heating) {
		this.rear_seat_heating = rear_seat_heating;
	}

	/**
	 * @return the seat_airiness
	 */
	public String getSeat_airiness() {
		return seat_airiness;
	}

	/**
	 * @param seat_airiness
	 *            the seat_airiness to set
	 */
	public void setSeat_airiness(String seat_airiness) {
		this.seat_airiness = seat_airiness;
	}

	/**
	 * @return the seat_massage
	 */
	public String getSeat_massage() {
		return seat_massage;
	}

	/**
	 * @param seat_massage
	 *            the seat_massage to set
	 */
	public void setSeat_massage(String seat_massage) {
		this.seat_massage = seat_massage;
	}

	/**
	 * @return the rear_seat_overall
	 */
	public String getRear_seat_overall() {
		return rear_seat_overall;
	}

	/**
	 * @param rear_seat_overall
	 *            the rear_seat_overall to set
	 */
	public void setRear_seat_overall(String rear_seat_overall) {
		this.rear_seat_overall = rear_seat_overall;
	}

	/**
	 * @return the rear_seat_ratio
	 */
	public String getRear_seat_ratio() {
		return rear_seat_ratio;
	}

	/**
	 * @param rear_seat_ratio
	 *            the rear_seat_ratio to set
	 */
	public void setRear_seat_ratio(String rear_seat_ratio) {
		this.rear_seat_ratio = rear_seat_ratio;
	}

	/**
	 * @return the third_seat
	 */
	public String getThird_seat() {
		return third_seat;
	}

	/**
	 * @param third_seat
	 *            the third_seat to set
	 */
	public void setThird_seat(String third_seat) {
		this.third_seat = third_seat;
	}

	/**
	 * @return the front_center_armrest
	 */
	public String getFront_center_armrest() {
		return front_center_armrest;
	}

	/**
	 * @param front_center_armrest
	 *            the front_center_armrest to set
	 */
	public void setFront_center_armrest(String front_center_armrest) {
		this.front_center_armrest = front_center_armrest;
	}

	/**
	 * @return the rear_center_armrest
	 */
	public String getRear_center_armrest() {
		return rear_center_armrest;
	}

	/**
	 * @param rear_center_armrest
	 *            the rear_center_armrest to set
	 */
	public void setRear_center_armrest(String rear_center_armrest) {
		this.rear_center_armrest = rear_center_armrest;
	}

	/**
	 * @return the rear_cup_holder
	 */
	public String getRear_cup_holder() {
		return rear_cup_holder;
	}

	/**
	 * @param rear_cup_holder
	 *            the rear_cup_holder to set
	 */
	public void setRear_cup_holder(String rear_cup_holder) {
		this.rear_cup_holder = rear_cup_holder;
	}

	/**
	 * @return the electric_trunk
	 */
	public String getElectric_trunk() {
		return electric_trunk;
	}

	/**
	 * @param electric_trunk
	 *            the electric_trunk to set
	 */
	public void setElectric_trunk(String electric_trunk) {
		this.electric_trunk = electric_trunk;
	}

	/**
	 * @return the gps_navigate_system
	 */
	public String getGps_navigate_system() {
		return gps_navigate_system;
	}

	/**
	 * @param gps_navigate_system
	 *            the gps_navigate_system to set
	 */
	public void setGps_navigate_system(String gps_navigate_system) {
		this.gps_navigate_system = gps_navigate_system;
	}

	/**
	 * @return the locate_interaction_service
	 */
	public String getLocate_interaction_service() {
		return locate_interaction_service;
	}

	/**
	 * @param locate_interaction_service
	 *            the locate_interaction_service to set
	 */
	public void setLocate_interaction_service(String locate_interaction_service) {
		this.locate_interaction_service = locate_interaction_service;
	}

	/**
	 * @return the center_color_screen
	 */
	public String getCenter_color_screen() {
		return center_color_screen;
	}

	/**
	 * @param center_color_screen
	 *            the center_color_screen to set
	 */
	public void setCenter_color_screen(String center_color_screen) {
		this.center_color_screen = center_color_screen;
	}

	/**
	 * @return the human_computer_system
	 */
	public String getHuman_computer_system() {
		return human_computer_system;
	}

	/**
	 * @param human_computer_system
	 *            the human_computer_system to set
	 */
	public void setHuman_computer_system(String human_computer_system) {
		this.human_computer_system = human_computer_system;
	}

	/**
	 * @return the hard_drive
	 */
	public String getHard_drive() {
		return hard_drive;
	}

	/**
	 * @param hard_drive
	 *            the hard_drive to set
	 */
	public void setHard_drive(String hard_drive) {
		this.hard_drive = hard_drive;
	}

	/**
	 * @return the bluetooth_phone
	 */
	public String getBluetooth_phone() {
		return bluetooth_phone;
	}

	/**
	 * @param bluetooth_phone
	 *            the bluetooth_phone to set
	 */
	public void setBluetooth_phone(String bluetooth_phone) {
		this.bluetooth_phone = bluetooth_phone;
	}

	/**
	 * @return the car_tv
	 */
	public String getCar_tv() {
		return car_tv;
	}

	/**
	 * @param car_tv
	 *            the car_tv to set
	 */
	public void setCar_tv(String car_tv) {
		this.car_tv = car_tv;
	}

	/**
	 * @return the rear_lcd_screen
	 */
	public String getRear_lcd_screen() {
		return rear_lcd_screen;
	}

	/**
	 * @param rear_lcd_screen
	 *            the rear_lcd_screen to set
	 */
	public void setRear_lcd_screen(String rear_lcd_screen) {
		this.rear_lcd_screen = rear_lcd_screen;
	}

	/**
	 * @return the external_audio_interfaces
	 */
	public String getExternal_audio_interfaces() {
		return external_audio_interfaces;
	}

	/**
	 * @param external_audio_interfaces
	 *            the external_audio_interfaces to set
	 */
	public void setExternal_audio_interfaces(String external_audio_interfaces) {
		this.external_audio_interfaces = external_audio_interfaces;
	}

	/**
	 * @return the cd_support_mp3
	 */
	public String getCd_support_mp3() {
		return cd_support_mp3;
	}

	/**
	 * @param cd_support_mp3
	 *            the cd_support_mp3 to set
	 */
	public void setCd_support_mp3(String cd_support_mp3) {
		this.cd_support_mp3 = cd_support_mp3;
	}

	/**
	 * @return the single_cd
	 */
	public String getSingle_cd() {
		return single_cd;
	}

	/**
	 * @param single_cd
	 *            the single_cd to set
	 */
	public void setSingle_cd(String single_cd) {
		this.single_cd = single_cd;
	}

	/**
	 * @return the virtual_multi_cd
	 */
	public String getVirtual_multi_cd() {
		return virtual_multi_cd;
	}

	/**
	 * @param virtual_multi_cd
	 *            the virtual_multi_cd to set
	 */
	public void setVirtual_multi_cd(String virtual_multi_cd) {
		this.virtual_multi_cd = virtual_multi_cd;
	}

	/**
	 * @return the multi_cd_system
	 */
	public String getMulti_cd_system() {
		return multi_cd_system;
	}

	/**
	 * @param multi_cd_system
	 *            the multi_cd_system to set
	 */
	public void setMulti_cd_system(String multi_cd_system) {
		this.multi_cd_system = multi_cd_system;
	}

	/**
	 * @return the single_dvd
	 */
	public String getSingle_dvd() {
		return single_dvd;
	}

	/**
	 * @param single_dvd
	 *            the single_dvd to set
	 */
	public void setSingle_dvd(String single_dvd) {
		this.single_dvd = single_dvd;
	}

	/**
	 * @return the multi_dvd_system
	 */
	public String getMulti_dvd_system() {
		return multi_dvd_system;
	}

	/**
	 * @param multi_dvd_system
	 *            the multi_dvd_system to set
	 */
	public void setMulti_dvd_system(String multi_dvd_system) {
		this.multi_dvd_system = multi_dvd_system;
	}

	/**
	 * @return the two_speaker_system
	 */
	public String getTwo_speaker_system() {
		return two_speaker_system;
	}

	/**
	 * @param two_speaker_system
	 *            the two_speaker_system to set
	 */
	public void setTwo_speaker_system(String two_speaker_system) {
		this.two_speaker_system = two_speaker_system;
	}

	/**
	 * @return the four_speaker_system
	 */
	public String getFour_speaker_system() {
		return four_speaker_system;
	}

	/**
	 * @param four_speaker_system
	 *            the four_speaker_system to set
	 */
	public void setFour_speaker_system(String four_speaker_system) {
		this.four_speaker_system = four_speaker_system;
	}

	/**
	 * @return the six_speaker_system
	 */
	public String getSix_speaker_system() {
		return six_speaker_system;
	}

	/**
	 * @param six_speaker_system
	 *            the six_speaker_system to set
	 */
	public void setSix_speaker_system(String six_speaker_system) {
		this.six_speaker_system = six_speaker_system;
	}

	/**
	 * @return the eight_speaker_system
	 */
	public String getEight_speaker_system() {
		return eight_speaker_system;
	}

	/**
	 * @param eight_speaker_system
	 *            the eight_speaker_system to set
	 */
	public void setEight_speaker_system(String eight_speaker_system) {
		this.eight_speaker_system = eight_speaker_system;
	}

	/**
	 * @return the xenon_light
	 */
	public String getXenon_light() {
		return xenon_light;
	}

	/**
	 * @param xenon_light
	 *            the xenon_light to set
	 */
	public void setXenon_light(String xenon_light) {
		this.xenon_light = xenon_light;
	}

	/**
	 * @return the daytime_running_light
	 */
	public String getDaytime_running_light() {
		return daytime_running_light;
	}

	/**
	 * @param daytime_running_light
	 *            the daytime_running_light to set
	 */
	public void setDaytime_running_light(String daytime_running_light) {
		this.daytime_running_light = daytime_running_light;
	}

	/**
	 * @return the auto_headlight
	 */
	public String getAuto_headlight() {
		return auto_headlight;
	}

	/**
	 * @param auto_headlight
	 *            the auto_headlight to set
	 */
	public void setAuto_headlight(String auto_headlight) {
		this.auto_headlight = auto_headlight;
	}

	/**
	 * @return the steering_headlight
	 */
	public String getSteering_headlight() {
		return steering_headlight;
	}

	/**
	 * @param steering_headlight
	 *            the steering_headlight to set
	 */
	public void setSteering_headlight(String steering_headlight) {
		this.steering_headlight = steering_headlight;
	}

	/**
	 * @return the front_fog_light
	 */
	public String getFront_fog_light() {
		return front_fog_light;
	}

	/**
	 * @param front_fog_light
	 *            the front_fog_light to set
	 */
	public void setFront_fog_light(String front_fog_light) {
		this.front_fog_light = front_fog_light;
	}

	/**
	 * @return the light_height
	 */
	public String getLight_height() {
		return light_height;
	}

	/**
	 * @param light_height
	 *            the light_height to set
	 */
	public void setLight_height(String light_height) {
		this.light_height = light_height;
	}

	/**
	 * @return the light_clean_device
	 */
	public String getLight_clean_device() {
		return light_clean_device;
	}

	/**
	 * @param light_clean_device
	 *            the light_clean_device to set
	 */
	public void setLight_clean_device(String light_clean_device) {
		this.light_clean_device = light_clean_device;
	}

	/**
	 * @return the atmosphere_light
	 */
	public String getAtmosphere_light() {
		return atmosphere_light;
	}

	/**
	 * @param atmosphere_light
	 *            the atmosphere_light to set
	 */
	public void setAtmosphere_light(String atmosphere_light) {
		this.atmosphere_light = atmosphere_light;
	}

	/**
	 * @return the front_power_window
	 */
	public String getFront_power_window() {
		return front_power_window;
	}

	/**
	 * @param front_power_window
	 *            the front_power_window to set
	 */
	public void setFront_power_window(String front_power_window) {
		this.front_power_window = front_power_window;
	}

	/**
	 * @return the rear_power_window
	 */
	public String getRear_power_window() {
		return rear_power_window;
	}

	/**
	 * @param rear_power_window
	 *            the rear_power_window to set
	 */
	public void setRear_power_window(String rear_power_window) {
		this.rear_power_window = rear_power_window;
	}

	/**
	 * @return the window_anti_trap_hand
	 */
	public String getWindow_anti_trap_hand() {
		return window_anti_trap_hand;
	}

	/**
	 * @param window_anti_trap_hand
	 *            the window_anti_trap_hand to set
	 */
	public void setWindow_anti_trap_hand(String window_anti_trap_hand) {
		this.window_anti_trap_hand = window_anti_trap_hand;
	}

	/**
	 * @return the uv_insulated_glass
	 */
	public String getUv_insulated_glass() {
		return uv_insulated_glass;
	}

	/**
	 * @param uv_insulated_glass
	 *            the uv_insulated_glass to set
	 */
	public void setUv_insulated_glass(String uv_insulated_glass) {
		this.uv_insulated_glass = uv_insulated_glass;
	}

	/**
	 * @return the rearview_electric
	 */
	public String getRearview_electric() {
		return rearview_electric;
	}

	/**
	 * @param rearview_electric
	 *            the rearview_electric to set
	 */
	public void setRearview_electric(String rearview_electric) {
		this.rearview_electric = rearview_electric;
	}

	/**
	 * @return the rearview_heating
	 */
	public String getRearview_heating() {
		return rearview_heating;
	}

	/**
	 * @param rearview_heating
	 *            the rearview_heating to set
	 */
	public void setRearview_heating(String rearview_heating) {
		this.rearview_heating = rearview_heating;
	}

	/**
	 * @return the rearview_auto_anti_glare
	 */
	public String getRearview_auto_anti_glare() {
		return rearview_auto_anti_glare;
	}

	/**
	 * @param rearview_auto_anti_glare
	 *            the rearview_auto_anti_glare to set
	 */
	public void setRearview_auto_anti_glare(String rearview_auto_anti_glare) {
		this.rearview_auto_anti_glare = rearview_auto_anti_glare;
	}

	/**
	 * @return the rearview_electric_fold
	 */
	public String getRearview_electric_fold() {
		return rearview_electric_fold;
	}

	/**
	 * @param rearview_electric_fold
	 *            the rearview_electric_fold to set
	 */
	public void setRearview_electric_fold(String rearview_electric_fold) {
		this.rearview_electric_fold = rearview_electric_fold;
	}

	/**
	 * @return the rearview_memory
	 */
	public String getRearview_memory() {
		return rearview_memory;
	}

	/**
	 * @param rearview_memory
	 *            the rearview_memory to set
	 */
	public void setRearview_memory(String rearview_memory) {
		this.rearview_memory = rearview_memory;
	}

	/**
	 * @return the rear_wind_shade_curtain
	 */
	public String getRear_wind_shade_curtain() {
		return rear_wind_shade_curtain;
	}

	/**
	 * @param rear_wind_shade_curtain
	 *            the rear_wind_shade_curtain to set
	 */
	public void setRear_wind_shade_curtain(String rear_wind_shade_curtain) {
		this.rear_wind_shade_curtain = rear_wind_shade_curtain;
	}

	/**
	 * @return the rear_shade_curtain
	 */
	public String getRear_shade_curtain() {
		return rear_shade_curtain;
	}

	/**
	 * @param rear_shade_curtain
	 *            the rear_shade_curtain to set
	 */
	public void setRear_shade_curtain(String rear_shade_curtain) {
		this.rear_shade_curtain = rear_shade_curtain;
	}

	/**
	 * @return the shade_mirror
	 */
	public String getShade_mirror() {
		return shade_mirror;
	}

	/**
	 * @param shade_mirror
	 *            the shade_mirror to set
	 */
	public void setShade_mirror(String shade_mirror) {
		this.shade_mirror = shade_mirror;
	}

	/**
	 * @return the rear_wiper
	 */
	public String getRear_wiper() {
		return rear_wiper;
	}

	/**
	 * @param rear_wiper
	 *            the rear_wiper to set
	 */
	public void setRear_wiper(String rear_wiper) {
		this.rear_wiper = rear_wiper;
	}

	/**
	 * @return the sensing_wipers
	 */
	public String getSensing_wipers() {
		return sensing_wipers;
	}

	/**
	 * @param sensing_wipers
	 *            the sensing_wipers to set
	 */
	public void setSensing_wipers(String sensing_wipers) {
		this.sensing_wipers = sensing_wipers;
	}

	/**
	 * @return the manual_air
	 */
	public String getManual_air() {
		return manual_air;
	}

	/**
	 * @param manual_air
	 *            the manual_air to set
	 */
	public void setManual_air(String manual_air) {
		this.manual_air = manual_air;
	}

	/**
	 * @return the auto_air
	 */
	public String getAuto_air() {
		return auto_air;
	}

	/**
	 * @param auto_air
	 *            the auto_air to set
	 */
	public void setAuto_air(String auto_air) {
		this.auto_air = auto_air;
	}

	/**
	 * @return the rear_independent_air
	 */
	public String getRear_independent_air() {
		return rear_independent_air;
	}

	/**
	 * @param rear_independent_air
	 *            the rear_independent_air to set
	 */
	public void setRear_independent_air(String rear_independent_air) {
		this.rear_independent_air = rear_independent_air;
	}

	/**
	 * @return the rear_outlet
	 */
	public String getRear_outlet() {
		return rear_outlet;
	}

	/**
	 * @param rear_outlet
	 *            the rear_outlet to set
	 */
	public void setRear_outlet(String rear_outlet) {
		this.rear_outlet = rear_outlet;
	}

	/**
	 * @return the temperature_zone_control
	 */
	public String getTemperature_zone_control() {
		return temperature_zone_control;
	}

	/**
	 * @param temperature_zone_control
	 *            the temperature_zone_control to set
	 */
	public void setTemperature_zone_control(String temperature_zone_control) {
		this.temperature_zone_control = temperature_zone_control;
	}

	/**
	 * @return the air_control_pollen_filter
	 */
	public String getAir_control_pollen_filter() {
		return air_control_pollen_filter;
	}

	/**
	 * @param air_control_pollen_filter
	 *            the air_control_pollen_filter to set
	 */
	public void setAir_control_pollen_filter(String air_control_pollen_filter) {
		this.air_control_pollen_filter = air_control_pollen_filter;
	}

	/**
	 * @return the car_refrigerator
	 */
	public String getCar_refrigerator() {
		return car_refrigerator;
	}

	/**
	 * @param car_refrigerator
	 *            the car_refrigerator to set
	 */
	public void setCar_refrigerator(String car_refrigerator) {
		this.car_refrigerator = car_refrigerator;
	}

	/**
	 * @return the auto_parking_place
	 */
	public String getAuto_parking_place() {
		return auto_parking_place;
	}

	/**
	 * @param auto_parking_place
	 *            the auto_parking_place to set
	 */
	public void setAuto_parking_place(String auto_parking_place) {
		this.auto_parking_place = auto_parking_place;
	}

	/**
	 * @return the and_line_auxiliary
	 */
	public String getAnd_line_auxiliary() {
		return and_line_auxiliary;
	}

	/**
	 * @param and_line_auxiliary
	 *            the and_line_auxiliary to set
	 */
	public void setAnd_line_auxiliary(String and_line_auxiliary) {
		this.and_line_auxiliary = and_line_auxiliary;
	}

	/**
	 * @return the active_brake
	 */
	public String getActive_brake() {
		return active_brake;
	}

	/**
	 * @param active_brake
	 *            the active_brake to set
	 */
	public void setActive_brake(String active_brake) {
		this.active_brake = active_brake;
	}

	/**
	 * @return the overall_active_system
	 */
	public String getOverall_active_system() {
		return overall_active_system;
	}

	/**
	 * @param overall_active_system
	 *            the overall_active_system to set
	 */
	public void setOverall_active_system(String overall_active_system) {
		this.overall_active_system = overall_active_system;
	}

	/**
	 * @return the night_system
	 */
	public String getNight_system() {
		return night_system;
	}

	/**
	 * @param night_system
	 *            the night_system to set
	 */
	public void setNight_system(String night_system) {
		this.night_system = night_system;
	}

	/**
	 * @return the control_lcd_screen
	 */
	public String getControl_lcd_screen() {
		return control_lcd_screen;
	}

	/**
	 * @param control_lcd_screen
	 *            the control_lcd_screen to set
	 */
	public void setControl_lcd_screen(String control_lcd_screen) {
		this.control_lcd_screen = control_lcd_screen;
	}

	/**
	 * @return the adaptive_cruise
	 */
	public String getAdaptive_cruise() {
		return adaptive_cruise;
	}

	/**
	 * @param adaptive_cruise
	 *            the adaptive_cruise to set
	 */
	public void setAdaptive_cruise(String adaptive_cruise) {
		this.adaptive_cruise = adaptive_cruise;
	}

	/**
	 * @return the panoramic_camera
	 */
	public String getPanoramic_camera() {
		return panoramic_camera;
	}

	/**
	 * @param panoramic_camera
	 *            the panoramic_camera to set
	 */
	public void setPanoramic_camera(String panoramic_camera) {
		this.panoramic_camera = panoramic_camera;
	}

	/**
	 * @return the motor_model
	 */
	public String getMotor_model() {
		return motor_model;
	}

	/**
	 * @param motor_model
	 *            the motor_model to set
	 */
	public void setMotor_model(String motor_model) {
		this.motor_model = motor_model;
	}

	/**
	 * @return the battery_types
	 */
	public String getBattery_types() {
		return battery_types;
	}

	/**
	 * @param battery_types
	 *            the battery_types to set
	 */
	public void setBattery_types(String battery_types) {
		this.battery_types = battery_types;
	}

	/**
	 * @return the batteries
	 */
	public String getBatteries() {
		return batteries;
	}

	/**
	 * @param batteries
	 *            the batteries to set
	 */
	public void setBatteries(String batteries) {
		this.batteries = batteries;
	}

	/**
	 * @return the battery_voltage
	 */
	public String getBattery_voltage() {
		return battery_voltage;
	}

	/**
	 * @param battery_voltage
	 *            the battery_voltage to set
	 */
	public void setBattery_voltage(String battery_voltage) {
		this.battery_voltage = battery_voltage;
	}

	/**
	 * @return the quick_duration
	 */
	public String getQuick_duration() {
		return quick_duration;
	}

	/**
	 * @param quick_duration
	 *            the quick_duration to set
	 */
	public void setQuick_duration(String quick_duration) {
		this.quick_duration = quick_duration;
	}

	/**
	 * @return the slow_duration
	 */
	public String getSlow_duration() {
		return slow_duration;
	}

	/**
	 * @param slow_duration
	 *            the slow_duration to set
	 */
	public void setSlow_duration(String slow_duration) {
		this.slow_duration = slow_duration;
	}

	/**
	 * @return the peak_current
	 */
	public String getPeak_current() {
		return peak_current;
	}

	/**
	 * @param peak_current
	 *            the peak_current to set
	 */
	public void setPeak_current(String peak_current) {
		this.peak_current = peak_current;
	}

	/**
	 * @return the single_power
	 */
	public String getSingle_power() {
		return single_power;
	}

	/**
	 * @param single_power
	 *            the single_power to set
	 */
	public void setSingle_power(String single_power) {
		this.single_power = single_power;
	}

	/**
	 * @return the single_mileage
	 */
	public String getSingle_mileage() {
		return single_mileage;
	}

	/**
	 * @param single_mileage
	 *            the single_mileage to set
	 */
	public void setSingle_mileage(String single_mileage) {
		this.single_mileage = single_mileage;
	}

	/**
	 * @return the battery_capacity
	 */
	public String getBattery_capacity() {
		return battery_capacity;
	}

	/**
	 * @param battery_capacity
	 *            the battery_capacity to set
	 */
	public void setBattery_capacity(String battery_capacity) {
		this.battery_capacity = battery_capacity;
	}

	/**
	 * @return the battery_life
	 */
	public String getBattery_life() {
		return battery_life;
	}

	/**
	 * @param battery_life
	 *            the battery_life to set
	 */
	public void setBattery_life(String battery_life) {
		this.battery_life = battery_life;
	}

	/**
	 * @return the charging_ways
	 */
	public String getCharging_ways() {
		return charging_ways;
	}

	/**
	 * @param charging_ways
	 *            the charging_ways to set
	 */
	public void setCharging_ways(String charging_ways) {
		this.charging_ways = charging_ways;
	}

	/**
	 * @return the maximum_horsepower
	 */
	public String getMaximum_horsepower() {
		return maximum_horsepower;
	}

	/**
	 * @param maximum_horsepower
	 *            the maximum_horsepower to set
	 */
	public void setMaximum_horsepower(String maximum_horsepower) {
		this.maximum_horsepower = maximum_horsepower;
	}

	/**
	 * @return the maximum_power
	 */
	public String getMaximum_power() {
		return maximum_power;
	}

	/**
	 * @param maximum_power
	 *            the maximum_power to set
	 */
	public void setMaximum_power(String maximum_power) {
		this.maximum_power = maximum_power;
	}

	/**
	 * @return the maximum_torque
	 */
	public String getMaximum_torque() {
		return maximum_torque;
	}

	/**
	 * @param maximum_torque
	 *            the maximum_torque to set
	 */
	public void setMaximum_torque(String maximum_torque) {
		this.maximum_torque = maximum_torque;
	}

	/**
	 * @return the maximum_torque_speed
	 */
	public String getMaximum_torque_speed() {
		return maximum_torque_speed;
	}

	/**
	 * @param maximum_torque_speed
	 *            the maximum_torque_speed to set
	 */
	public void setMaximum_torque_speed(String maximum_torque_speed) {
		this.maximum_torque_speed = maximum_torque_speed;
	}

	/**
	 * @return the motor_type
	 */
	public String getMotor_type() {
		return motor_type;
	}

	/**
	 * @param motor_type
	 *            the motor_type to set
	 */
	public void setMotor_type(String motor_type) {
		this.motor_type = motor_type;
	}

	/**
	 * @return the motor_cooling_way
	 */
	public String getMotor_cooling_way() {
		return motor_cooling_way;
	}

	/**
	 * @param motor_cooling_way
	 *            the motor_cooling_way to set
	 */
	public void setMotor_cooling_way(String motor_cooling_way) {
		this.motor_cooling_way = motor_cooling_way;
	}

	/**
	 * @return the discharge_material
	 */
	public String getDischarge_material() {
		return discharge_material;
	}

	/**
	 * @param discharge_material
	 *            the discharge_material to set
	 */
	public void setDischarge_material(String discharge_material) {
		this.discharge_material = discharge_material;
	}

	/**
	 * @return the battery_weight
	 */
	public String getBattery_weight() {
		return battery_weight;
	}

	/**
	 * @param battery_weight
	 *            the battery_weight to set
	 */
	public void setBattery_weight(String battery_weight) {
		this.battery_weight = battery_weight;
	}

	/**
	 * @return the recharging_voltage
	 */
	public String getRecharging_voltage() {
		return recharging_voltage;
	}

	/**
	 * @param recharging_voltage
	 *            the recharging_voltage to set
	 */
	public void setRecharging_voltage(String recharging_voltage) {
		this.recharging_voltage = recharging_voltage;
	}

	/**
	 * @return the battery_design
	 */
	public String getBattery_design() {
		return battery_design;
	}

	/**
	 * @param battery_design
	 *            the battery_design to set
	 */
	public void setBattery_design(String battery_design) {
		this.battery_design = battery_design;
	}

	/**
	 * @return the maintenance_cycle
	 */
	public String getMaintenance_cycle() {
		return maintenance_cycle;
	}

	/**
	 * @param maintenance_cycle
	 *            the maintenance_cycle to set
	 */
	public void setMaintenance_cycle(String maintenance_cycle) {
		this.maintenance_cycle = maintenance_cycle;
	}

	/**
	 * @return the updateTime
	 */
	public Date getUpdateTime() {
		return updateTime;
	}

	/**
	 * @param updateTime
	 *            the updateTime to set
	 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public String getChild_seats() {
		return child_seats;
	}

	public void setChild_seats(String child_seats) {
		this.child_seats = child_seats;
	}

	public String getTo100Speed() {
		return to100Speed;
	}

	public void setTo100Speed(String to100Speed) {
		this.to100Speed = to100Speed;
	}

	public String getMaxSpeed_Circle() {
		return maxSpeed_Circle;
	}

	public void setMaxSpeed_Circle(String maxSpeed_Circle) {
		this.maxSpeed_Circle = maxSpeed_Circle;
	}

	public String getZaoyinInCar() {
		return zaoyinInCar;
	}

	public void setZaoyinInCar(String zaoyinInCar) {
		this.zaoyinInCar = zaoyinInCar;
	}

	public String getSpeedIn40() {
		return speedIn40;
	}

	public void setSpeedIn40(String speedIn40) {
		this.speedIn40 = speedIn40;
	}

	public String getSpeedIn60() {
		return speedIn60;
	}

	public void setSpeedIn60(String speedIn60) {
		this.speedIn60 = speedIn60;
	}

	public String getSpeedIn80() {
		return speedIn80;
	}

	public void setSpeedIn80(String speedIn80) {
		this.speedIn80 = speedIn80;
	}

	public String getSpeedIn100() {
		return speedIn100;
	}

	public void setSpeedIn100(String speedIn100) {
		this.speedIn100 = speedIn100;
	}

	public String getSpeedIn120() {
		return speedIn120;
	}

	public void setSpeedIn120(String speedIn120) {
		this.speedIn120 = speedIn120;
	}

	public String getSpeedScore() {
		return speedScore;
	}

	public void setSpeedScore(String speedScore) {
		this.speedScore = speedScore;
	}

	public String getSpeedComment() {
		return speedComment;
	}

	public void setSpeedComment(String speedComment) {
		this.speedComment = speedComment;
	}

	public String getZaoyinIn40() {
		return zaoyinIn40;
	}

	public void setZaoyinIn40(String zaoyinIn40) {
		this.zaoyinIn40 = zaoyinIn40;
	}

	public String getZaoyinIn60() {
		return zaoyinIn60;
	}

	public void setZaoyinIn60(String zaoyinIn60) {
		this.zaoyinIn60 = zaoyinIn60;
	}

	public String getZaoyinIn80() {
		return zaoyinIn80;
	}

	public void setZaoyinIn80(String zaoyinIn80) {
		this.zaoyinIn80 = zaoyinIn80;
	}

	public String getZaoyinIn100() {
		return zaoyinIn100;
	}

	public void setZaoyinIn100(String zaoyinIn100) {
		this.zaoyinIn100 = zaoyinIn100;
	}

	public String getZaoyinIn120() {
		return zaoyinIn120;
	}

	public void setZaoyinIn120(String zaoyinIn120) {
		this.zaoyinIn120 = zaoyinIn120;
	}

	public String getDianpingRongliang() {
		return dianpingRongliang;
	}

	public void setDianpingRongliang(String dianpingRongliang) {
		this.dianpingRongliang = dianpingRongliang;
	}

	public String getZaoyinScore() {
		return zaoyinScore;
	}

	public void setZaoyinScore(String zaoyinScore) {
		this.zaoyinScore = zaoyinScore;
	}

	public String getZaoyinComment() {
		return zaoyinComment;
	}

	public void setZaoyinComment(String zaoyinComment) {
		this.zaoyinComment = zaoyinComment;
	}

	public String getFrontWidth() {
		return frontWidth;
	}

	public void setFrontWidth(String frontWidth) {
		this.frontWidth = frontWidth;
	}

	public String getFrontHeight() {
		return frontHeight;
	}

	public void setFrontHeight(String frontHeight) {
		this.frontHeight = frontHeight;
	}

	public String getFrontMinForLeg() {
		return frontMinForLeg;
	}

	public void setFrontMinForLeg(String frontMinForLeg) {
		this.frontMinForLeg = frontMinForLeg;
	}

	public String getFrontMaxForLeg() {
		return frontMaxForLeg;
	}

	public void setFrontMaxForLeg(String frontMaxForLeg) {
		this.frontMaxForLeg = frontMaxForLeg;
	}

	public String getFrontSitLength() {
		return frontSitLength;
	}

	public void setFrontSitLength(String frontSitLength) {
		this.frontSitLength = frontSitLength;
	}

	public String getBackWidth() {
		return backWidth;
	}

	public void setBackWidth(String backWidth) {
		this.backWidth = backWidth;
	}

	public String getBackHeight() {
		return backHeight;
	}

	public void setBackHeight(String backHeight) {
		this.backHeight = backHeight;
	}

	public String getBackMinForLeg() {
		return backMinForLeg;
	}

	public void setBackMinForLeg(String backMinForLeg) {
		this.backMinForLeg = backMinForLeg;
	}

	public String getBackMaxForLeg() {
		return backMaxForLeg;
	}

	public void setBackMaxForLeg(String backMaxForLeg) {
		this.backMaxForLeg = backMaxForLeg;
	}

	public String getBackSitLength() {
		return backSitLength;
	}

	public void setBackSitLength(String backSitLength) {
		this.backSitLength = backSitLength;
	}

	public String getBackGroundHeight() {
		return backGroundHeight;
	}

	public void setBackGroundHeight(String backGroundHeight) {
		this.backGroundHeight = backGroundHeight;
	}

	public String getBackBoxWidth() {
		return backBoxWidth;
	}

	public void setBackBoxWidth(String backBoxWidth) {
		this.backBoxWidth = backBoxWidth;
	}

	public String getBackBoxHeight() {
		return backBoxHeight;
	}

	public void setBackBoxHeight(String backBoxHeight) {
		this.backBoxHeight = backBoxHeight;
	}

	public String getBackBoxDeep() {
		return backBoxDeep;
	}

	public void setBackBoxDeep(String backBoxDeep) {
		this.backBoxDeep = backBoxDeep;
	}

	public String getBackBoxDeepAfter() {
		return backBoxDeepAfter;
	}

	public void setBackBoxDeepAfter(String backBoxDeepAfter) {
		this.backBoxDeepAfter = backBoxDeepAfter;
	}

	public String getLedBigLamp2() {
		return ledBigLamp2;
	}

	public void setLedBigLamp2(String ledBigLamp2) {
		this.ledBigLamp2 = ledBigLamp2;
	}

	public Double getMaxHorsePower() {
		return maxHorsePower;
	}

	public void setMaxHorsePower(Double maxHorsePower) {
		this.maxHorsePower = maxHorsePower;
	}

	public String getJiasu50() {
		return jiasu50;
	}

	public void setJiasu50(String jiasu50) {
		this.jiasu50 = jiasu50;
	}

	public String getJiasu100() {
		return jiasu100;
	}

	public void setJiasu100(String jiasu100) {
		this.jiasu100 = jiasu100;
	}

	public String getZhidong100() {
		return zhidong100;
	}

	public void setZhidong100(String zhidong100) {
		this.zhidong100 = zhidong100;
	}

	public String getZaoyinds() {
		return zaoyinds;
	}

	public void setZaoyinds(String zaoyinds) {
		this.zaoyinds = zaoyinds;
	}

	public String getZaoyin60() {
		return zaoyin60;
	}

	public void setZaoyin60(String zaoyin60) {
		this.zaoyin60 = zaoyin60;
	}

	public String getZaoyin80() {
		return zaoyin80;
	}

	public void setZaoyin80(String zaoyin80) {
		this.zaoyin80 = zaoyin80;
	}

	public String getZaoyin100() {
		return zaoyin100;
	}

	public void setZaoyin100(String zaoyin100) {
		this.zaoyin100 = zaoyin100;
	}

	public String getFadongji60() {
		return fadongji60;
	}

	public void setFadongji60(String fadongji60) {
		this.fadongji60 = fadongji60;
	}

	public String getFadongji80() {
		return fadongji80;
	}

	public void setFadongji80(String fadongji80) {
		this.fadongji80 = fadongji80;
	}

	public String getFadongji100() {
		return fadongji100;
	}

	public void setFadongji100(String fadongji100) {
		this.fadongji100 = fadongji100;
	}

	public String getChesu60() {
		return chesu60;
	}

	public void setChesu60(String chesu60) {
		this.chesu60 = chesu60;
	}

	public String getChesu80() {
		return chesu80;
	}

	public void setChesu80(String chesu80) {
		this.chesu80 = chesu80;
	}

	public String getChesu100() {
		return chesu100;
	}

	public void setChesu100(String chesu100) {
		this.chesu100 = chesu100;
	}

	public String getDcfs_jiashi() {
		return dcfs_jiashi;
	}

	public void setDcfs_jiashi(String dcfs_jiashi) {
		this.dcfs_jiashi = dcfs_jiashi;
	}

	public String getDcfs_fujiashi() {
		return dcfs_fujiashi;
	}

	public void setDcfs_fujiashi(String dcfs_fujiashi) {
		this.dcfs_fujiashi = dcfs_fujiashi;
	}

	public String getDcfs_houpaizuoce() {
		return dcfs_houpaizuoce;
	}

	public void setDcfs_houpaizuoce(String dcfs_houpaizuoce) {
		this.dcfs_houpaizuoce = dcfs_houpaizuoce;
	}

	public String getDcfs_houpaizhongjian() {
		return dcfs_houpaizhongjian;
	}

	public void setDcfs_houpaizhongjian(String dcfs_houpaizhongjian) {
		this.dcfs_houpaizhongjian = dcfs_houpaizhongjian;
	}

	public String getDcfs_houpaiyouce() {
		return dcfs_houpaiyouce;
	}

	public void setDcfs_houpaiyouce(String dcfs_houpaiyouce) {
		this.dcfs_houpaiyouce = dcfs_houpaiyouce;
	}

	public String getDcfs_zhongkongtai() {
		return dcfs_zhongkongtai;
	}

	public void setDcfs_zhongkongtai(String dcfs_zhongkongtai) {
		this.dcfs_zhongkongtai = dcfs_zhongkongtai;
	}

	public String getDcfs_yibiaopan() {
		return dcfs_yibiaopan;
	}

	public void setDcfs_yibiaopan(String dcfs_yibiaopan) {
		this.dcfs_yibiaopan = dcfs_yibiaopan;
	}

	public String getLtgg_taikuan() {
		return ltgg_taikuan;
	}

	public void setLtgg_taikuan(String ltgg_taikuan) {
		this.ltgg_taikuan = ltgg_taikuan;
	}

	public String getLtgg_zhijing() {
		return ltgg_zhijing;
	}

	public void setLtgg_zhijing(String ltgg_zhijing) {
		this.ltgg_zhijing = ltgg_zhijing;
	}

	public String getLtgg_bianpingbi() {
		return ltgg_bianpingbi;
	}

	public void setLtgg_bianpingbi(String ltgg_bianpingbi) {
		this.ltgg_bianpingbi = ltgg_bianpingbi;
	}

	public String getLtgg_zuigaosudu() {
		return ltgg_zuigaosudu;
	}

	public void setLtgg_zuigaosudu(String ltgg_zuigaosudu) {
		this.ltgg_zuigaosudu = ltgg_zuigaosudu;
	}

	public String getLtgg_zuigaozaizhong() {
		return ltgg_zuigaozaizhong;
	}

	public void setLtgg_zuigaozaizhong(String ltgg_zuigaozaizhong) {
		this.ltgg_zuigaozaizhong = ltgg_zuigaozaizhong;
	}

	public String getLtgg_beitaizuigaosudu() {
		return ltgg_beitaizuigaosudu;
	}

	public void setLtgg_beitaizuigaosudu(String ltgg_beitaizuigaosudu) {
		this.ltgg_beitaizuigaosudu = ltgg_beitaizuigaosudu;
	}

	public String getLtgg_beitaizaizhong() {
		return ltgg_beitaizaizhong;
	}

	public void setLtgg_beitaizaizhong(String ltgg_beitaizaizhong) {
		this.ltgg_beitaizaizhong = ltgg_beitaizaizhong;
	}

	public String getRjyx_zhengbei() {
		return rjyx_zhengbei;
	}

	public void setRjyx_zhengbei(String rjyx_zhengbei) {
		this.rjyx_zhengbei = rjyx_zhengbei;
	}

	public String getRjyx_max() {
		return rjyx_max;
	}

	public void setRjyx_max(String rjyx_max) {
		this.rjyx_max = rjyx_max;
	}

	public String getRjyx_chengzai() {
		return rjyx_chengzai;
	}

	public void setRjyx_chengzai(String rjyx_chengzai) {
		this.rjyx_chengzai = rjyx_chengzai;
	}

	public String getRjyx_manzairenshu() {
		return rjyx_manzairenshu;
	}

	public void setRjyx_manzairenshu(String rjyx_manzairenshu) {
		this.rjyx_manzairenshu = rjyx_manzairenshu;
	}

	public String getRjyx_renjun() {
		return rjyx_renjun;
	}

	public void setRjyx_renjun(String rjyx_renjun) {
		this.rjyx_renjun = rjyx_renjun;
	}

	public String getMcfjs_zhujiashi() {
		return mcfjs_zhujiashi;
	}

	public void setMcfjs_zhujiashi(String mcfjs_zhujiashi) {
		this.mcfjs_zhujiashi = mcfjs_zhujiashi;
	}

	public String getMcfjs_fujiashi() {
		return mcfjs_fujiashi;
	}

	public void setMcfjs_fujiashi(String mcfjs_fujiashi) {
		this.mcfjs_fujiashi = mcfjs_fujiashi;
	}

	public String getMcfjs_houpai() {
		return mcfjs_houpai;
	}

	public void setMcfjs_houpai(String mcfjs_houpai) {
		this.mcfjs_houpai = mcfjs_houpai;
	}

	public String getMcfjs_tianchuang() {
		return mcfjs_tianchuang;
	}

	public void setMcfjs_tianchuang(String mcfjs_tianchuang) {
		this.mcfjs_tianchuang = mcfjs_tianchuang;
	}

	public String getZygg_qianzuodianchang() {
		return zygg_qianzuodianchang;
	}

	public void setZygg_qianzuodianchang(String zygg_qianzuodianchang) {
		this.zygg_qianzuodianchang = zygg_qianzuodianchang;
	}

	public String getZygg_qianzuodiankuan() {
		return zygg_qianzuodiankuan;
	}

	public void setZygg_qianzuodiankuan(String zygg_qianzuodiankuan) {
		this.zygg_qianzuodiankuan = zygg_qianzuodiankuan;
	}

	public String getZygg_qiankaodianchang() {
		return zygg_qiankaodianchang;
	}

	public void setZygg_qiankaodianchang(String zygg_qiankaodianchang) {
		this.zygg_qiankaodianchang = zygg_qiankaodianchang;
	}

	public String getZygg_qiankaodiankuan() {
		return zygg_qiankaodiankuan;
	}

	public void setZygg_qiankaodiankuan(String zygg_qiankaodiankuan) {
		this.zygg_qiankaodiankuan = zygg_qiankaodiankuan;
	}

	public String getZygg_houzuodianchang() {
		return zygg_houzuodianchang;
	}

	public void setZygg_houzuodianchang(String zygg_houzuodianchang) {
		this.zygg_houzuodianchang = zygg_houzuodianchang;
	}

	public String getZygg_houzuodiankuan() {
		return zygg_houzuodiankuan;
	}

	public void setZygg_houzuodiankuan(String zygg_houzuodiankuan) {
		this.zygg_houzuodiankuan = zygg_houzuodiankuan;
	}

	public String getZygg_houkaodianchang() {
		return zygg_houkaodianchang;
	}

	public void setZygg_houkaodianchang(String zygg_houkaodianchang) {
		this.zygg_houkaodianchang = zygg_houkaodianchang;
	}

	public String getZygg_houkaodiankuan() {
		return zygg_houkaodiankuan;
	}

	public void setZygg_houkaodiankuan(String zygg_houkaodiankuan) {
		this.zygg_houkaodiankuan = zygg_houkaodiankuan;
	}

	public String getCndb_qiandipan() {
		return cndb_qiandipan;
	}

	public void setCndb_qiandipan(String cndb_qiandipan) {
		this.cndb_qiandipan = cndb_qiandipan;
	}

	public String getCndb_houdipan() {
		return cndb_houdipan;
	}

	public void setCndb_houdipan(String cndb_houdipan) {
		this.cndb_houdipan = cndb_houdipan;
	}

	public String getHlz_dance() {
		return hlz_dance;
	}

	public void setHlz_dance(String hlz_dance) {
		this.hlz_dance = hlz_dance;
	}

	public String getHlz_jiaocha() {
		return hlz_jiaocha;
	}

	public void setHlz_jiaocha(String hlz_jiaocha) {
		this.hlz_jiaocha = hlz_jiaocha;
	}

	public String getHlz_sanlun() {
		return hlz_sanlun;
	}

	public void setHlz_sanlun(String hlz_sanlun) {
		this.hlz_sanlun = hlz_sanlun;
	}

	public String getHbxkj_kaikoumianji() {
		return hbxkj_kaikoumianji;
	}

	public void setHbxkj_kaikoumianji(String hbxkj_kaikoumianji) {
		this.hbxkj_kaikoumianji = hbxkj_kaikoumianji;
	}

	public String getHbxkj_houbeixiang() {
		return hbxkj_houbeixiang;
	}

	public void setHbxkj_houbeixiang(String hbxkj_houbeixiang) {
		this.hbxkj_houbeixiang = hbxkj_houbeixiang;
	}

	public String getHbxkj_houpaizuoyi() {
		return hbxkj_houpaizuoyi;
	}

	public void setHbxkj_houpaizuoyi(String hbxkj_houpaizuoyi) {
		this.hbxkj_houpaizuoyi = hbxkj_houpaizuoyi;
	}

	public String getHbxgd_kaikou() {
		return hbxgd_kaikou;
	}

	public void setHbxgd_kaikou(String hbxgd_kaikou) {
		this.hbxgd_kaikou = hbxgd_kaikou;
	}

	public String getHbxgd_kaiqihou() {
		return hbxgd_kaiqihou;
	}

	public void setHbxgd_kaiqihou(String hbxgd_kaiqihou) {
		this.hbxgd_kaiqihou = hbxgd_kaiqihou;
	}

	public String getLdjx_kongzai() {
		return ldjx_kongzai;
	}

	public void setLdjx_kongzai(String ldjx_kongzai) {
		this.ldjx_kongzai = ldjx_kongzai;
	}

	public String getLdjx_danren() {
		return ldjx_danren;
	}

	public void setLdjx_danren(String ldjx_danren) {
		this.ldjx_danren = ldjx_danren;
	}

	public String getLdjx_manzai() {
		return ldjx_manzai;
	}

	public void setLdjx_manzai(String ldjx_manzai) {
		this.ldjx_manzai = ldjx_manzai;
	}

	public String getDcld_zuiyuan() {
		return dcld_zuiyuan;
	}

	public void setDcld_zuiyuan(String dcld_zuiyuan) {
		this.dcld_zuiyuan = dcld_zuiyuan;
	}

	public String getDcld_jingshi() {
		return dcld_jingshi;
	}

	public void setDcld_jingshi(String dcld_jingshi) {
		this.dcld_jingshi = dcld_jingshi;
	}

	public String getDcld_mangqu() {
		return dcld_mangqu;
	}

	public void setDcld_mangqu(String dcld_mangqu) {
		this.dcld_mangqu = dcld_mangqu;
	}

	public String getDcyx_tigong() {
		return dcyx_tigong;
	}

	public void setDcyx_tigong(String dcyx_tigong) {
		this.dcyx_tigong = dcyx_tigong;
	}

	public String getDcyx_suidong() {
		return dcyx_suidong;
	}

	public void setDcyx_suidong(String dcyx_suidong) {
		this.dcyx_suidong = dcyx_suidong;
	}

	public String getDcyx_fanwei() {
		return dcyx_fanwei;
	}

	public void setDcyx_fanwei(String dcyx_fanwei) {
		this.dcyx_fanwei = dcyx_fanwei;
	}

	public String getHdl_danrendi() {
		return hdl_danrendi;
	}

	public void setHdl_danrendi(String hdl_danrendi) {
		this.hdl_danrendi = hdl_danrendi;
	}

	public String getHdl_danrengao() {
		return hdl_danrengao;
	}

	public void setHdl_danrengao(String hdl_danrengao) {
		this.hdl_danrengao = hdl_danrengao;
	}

	public String getHdl_manzaidi() {
		return hdl_manzaidi;
	}

	public void setHdl_manzaidi(String hdl_manzaidi) {
		this.hdl_manzaidi = hdl_manzaidi;
	}

	public String getHdl_manzaigao() {
		return hdl_manzaigao;
	}

	public void setHdl_manzaigao(String hdl_manzaigao) {
		this.hdl_manzaigao = hdl_manzaigao;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getCndb_qiangaodu() {
		return cndb_qiangaodu;
	}

	public void setCndb_qiangaodu(String cndb_qiangaodu) {
		this.cndb_qiangaodu = cndb_qiangaodu;
	}

	public String getCndb_hougaodu() {
		return cndb_hougaodu;
	}

	public void setCndb_hougaodu(String cndb_hougaodu) {
		this.cndb_hougaodu = cndb_hougaodu;
	}

	public String getHbxkj_kaikougaokuan() {
		return hbxkj_kaikougaokuan;
	}

	public void setHbxkj_kaikougaokuan(String hbxkj_kaikougaokuan) {
		this.hbxkj_kaikougaokuan = hbxkj_kaikougaokuan;
	}

	public String getLdjx_qian() {
		return ldjx_qian;
	}

	public void setLdjx_qian(String ldjx_qian) {
		this.ldjx_qian = ldjx_qian;
	}

	public String getLdjx_hou() {
		return ldjx_hou;
	}

	public void setLdjx_hou(String ldjx_hou) {
		this.ldjx_hou = ldjx_hou;
	}

	public String getDcld_zuijin() {
		return dcld_zuijin;
	}

	public void setDcld_zuijin(String dcld_zuijin) {
		this.dcld_zuijin = dcld_zuijin;
	}

	public String getOpen_purification_system() {
		return open_purification_system;
	}

	public void setOpen_purification_system(String open_purification_system) {
		this.open_purification_system = open_purification_system;
	}

	public String getOpen_inner_loop() {
		return open_inner_loop;
	}

	public void setOpen_inner_loop(String open_inner_loop) {
		this.open_inner_loop = open_inner_loop;
	}

	public String getOpen_outer_loop() {
		return open_outer_loop;
	}

	public void setOpen_outer_loop(String open_outer_loop) {
		this.open_outer_loop = open_outer_loop;
	}

	public String getOil_test() {
		return oil_test;
	}

	public void setOil_test(String oil_test) {
		this.oil_test = oil_test;
	}
	
}
