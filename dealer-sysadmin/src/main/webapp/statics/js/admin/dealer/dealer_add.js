/*!
 * Dealer Admin dealer modle page JS
 * Date : 2016-09-26 14:35:11
 * Copyright (c) 2009 - 2016 By Meng Ling Jie
 */
var userNameUrl="http://reg.chexun.com/logon.aspx?actionType=checkUserName";
var bindDealerUrl="http://reg.chexun.com/api/bindDealer.ashx";
var dealer_add = {};
$(document).ready(
		function() {
			// 省份城市加载
			initProvinceCity('provinceId', 'selectedProvinceId', 'cityId','selectedCityId', 'regionalId', 'selectedRegionalId');
			//经营品牌加载
			initCarBrandSeriesModel();
			 //时间控件加载
			 $("#beginTime").calendar();
			 $("#endTime").calendar();
			 $("#beginTime1").calendar();
			 $("#endTime1").calendar();
			 $("#contractbegin").calendar();
			 $("#contractend").calendar();
		});
//添加经销商表单验证
dealer_add.inputVerify = function(companyName, companyShortName, englishAlias,
		salePhone, companyAddress, companyType, provinceId, cityId, regionalId) {
	if (companyName == "") {
		alert("请输入经销商全称！");
		$('#companyName').focus();
		return false;
	} else {
		if (companyName.length < 6 || companyName.length > 30) {
			alert("标题最少6个汉字，最多30个汉字！");
			$('#companyName').focus();
			return false;
		}
	}
	if (companyShortName == "") {
		alert("请输入经销商简称！");
		$('#companyShortName').focus();
		return false;
	} else {
		if (companyShortName.length > 8) {
			alert("8个以内中文字！");
			$('#companyShortName').focus();
			return false;
		}
	}
	if (englishAlias == "") {
		alert("请输入英文别名！");
		$('#englishAlias').focus();
		return false;
	} else {
	}
	if (salePhone == "") {
		alert("请输入销售电话！");
		$('#salePhone').focus();
		return false;
	}
	if (companyAddress == "") {
		alert("请输入公司地址！");
		$('#companyAddress').focus();
		return false;
	}
	if (companyType < 1) {
		alert("请选择公司性质！");
		return false;
	}
	if (provinceId == 0 || provinceId == "") {
		alert("请选择所在省！");
		$('#provinceId').focus();
		return false;
	}
	if (cityId == 0 || cityId == "") {
		alert("请选择所在城市！");
		$('#cityId').focus();
		return false;
	}else{
		return true;
	}
}
//车商道权限合法校验
dealer_add.dealerPowerVerify = function(dealerlevel,pushcount,beginTime,endTime,state){
	if (dealerlevel == 0 || dealerlevel == "") {
		alert("请选会员级别！");
		$('#dealerlevel').focus();
		return false;
	}
	if (pushcount == "") {
		alert("请输入促销文章推送数量！");
		$('#pushcount').focus();
		return false;
	}
	if (beginTime == "") {
		alert("请输入有效期开始时间！");
		$('#beginTime').focus();
		return false;
	}
	if (endTime == "") {
		alert("请输入有效期结束时间！");
		$('#endTime').focus();
		return false;
	}
	if (state == 0 || state == "") {
		alert("请选状态！");
		$('#state').focus();
		return false;
	}else{
		return true;
	}
}
// 添加提交 或 下一步 obj=1提交  obj=2 下一步
dealer_add.addDealerInfo = function(obj) {
	var dealersId=$("#dealersId").val();
	var companyName = $('#companyName').val();
	var companyShortName = $('#companyShortName').val();
	var englishAlias = $('#englishAlias').val();
	var salePhone = $('#salePhone').val();
	var companyAddress = $('#companyAddress').val();
	var companyType = parseInt($("input[name=companyType]:checked").val());
	var provinceId = $('#provinceId').val();
	var cityId = $('#cityId').val();
	var regionalId = $('#regionalId').val();
	var seriesIds = '';
	var m=$("#m").val();
	// 表单验证是否合法
	var bool=dealer_add.inputVerify(companyName, companyShortName, englishAlias,salePhone, companyAddress, companyType, provinceId, cityId,regionalId);
	if(bool){
		// 读取选择的车系Id,已 逗号 “,” 分割
		$('.divid').each(function(index) {
			seriesIds += $("#seriesId" + index).val() + ",";
		});
		var params = {
			companyName : companyName,
			companyShortName : companyShortName,
			englishAlias : englishAlias,
			salePhone : salePhone,
			companyAddress : companyAddress,
			companyType : companyType,
			provinceId : provinceId,
			cityId : cityId,
			regionalId : regionalId,
			seriesIds : seriesIds,
			id:dealersId
		};
		
		$.ajax({
			url : "/admin/dealer/save",
			dataType : 'json',
			type : 'post',
			scriptCharset : 'utf-8',
			data : params,
			success : function(data) {
				if (data != '-1') {
					$("#saveOkstate").val(1);
					$("#dealersId").val(data);
					if(obj==1){
						alert("操作成功");
						window.location.href = "/admin/index?m="+m;
					}else if(obj==2){
						//进入绑定账号页面
						dealer_add.setTab(2,4);
					}
				} else {
					$("#saveOkstate").val(0);
					alert("操作失败!");
					return false;
				}
			},
		});
	}
}
//经销商用户绑定合法校验
dealer_add.dealerBindUserNameVerify = function(){
	var userName=$("#userName").val();
	//验证不能为空
	if (userName == "") {
        $("#userName").focus();
        alert("请输入用户名!");
        return false;
    }else{
    	//验证是否为合法用户
    	var params={
    			callback:'dealer_add.isExistUsersVerify',
    			userName:userName};
    	$.ajax({
    		url : userNameUrl,
    		dataType :'jsonp',
    		data : params	,
    		jsonp : 'dealer_add.isExistUsersVerify',
    		timeout : 3000
    	});
    }
}
//验证用户是否注册
dealer_add.isExistUsersVerify= function(data) {
    var arr = data.split("|");
    if (arr[0] == 1) {
    	//绑定经销商
    	dealer_add.bindDealer();
    } else if(arr[0] == 0){
    	alert("用户名不存在");
    }
}
//绑定经销商
dealer_add.bindDealer= function(data) {
	var dealersId=$("#dealersId").val();
	var userName=$("#userName").val();
	var params = {
			callback:'dealer_add.isBindDealersVerify',
			dealersid:dealersId,
			userName:userName
	}
	$.ajax({
		url :bindDealerUrl,
		dataType :'jsonp',
		type : 'post',
		scriptCharset : 'utf-8',
		data : params,
		jsonp : 'dealer_add.isBindDealersVerify',
		timeout : 3000
	});
}
//验证是否已绑定
dealer_add.isBindDealersVerify= function(data) {
    var arr = data.split("|");
    if (arr[0] == 1) {//绑定成功
    	//修改经销商信息
    	dealer_add.updUserName();
    }else if(arr[0] == -1){dealer_add.updUserName();
    	 alert("该账号注册后未激活，请先激活后在绑定。");
    }else if(arr[0] == -2){dealer_add.updUserName();
    	alert("该账号已经关联经销商！");
    }else if(arr[0] == -3){dealer_add.updUserName();
    	alert("该账号不是车讯网注册账号，请先注册并激活后在绑定。");
    }else if(arr[0] == -4){dealer_add.updUserName();
    	 alert("获取账号信息失败！");
    }else{
    	alert("设置失败！");
    }
}
//删除已选择的车系
dealer_add.deleteCar = function() {
	var seriesIds='';
	var dealersId=$("#dealersId").val();
	$('#selectCarList .tab-box-active').each(function() {
		var c = $(this).attr('cid');
		var s = $(this).attr('sid');
		seriesIds+= s + ",";
		if ($('#selectCar' + c + '>div').size() <= 1) {
			$(this).parent().parent().remove();
		} else {
			$(this).parent().remove();
		}
	});
	if(seriesIds==''){
		alert("请选择要删除的车系！");
	}else{
		var params = {
				callback:'dealer_add.isDeleteCar',
				dealerId:dealersId,
				seriesIds:seriesIds
			}
			$.ajax({
				url : "/admin/dealer/deleteCarModel",
				dataType : 'jsonp',
				type : 'post',
				scriptCharset :'utf-8',
				data : params,
			    jsonp:'dealer_add.isDeleteCar',
			    timeout:3000
			});	
	}
}
dealer_add.isDeleteCar=function(data) {
	if(parseInt(data)>0){
		alert("删除成功");
	}else if(parseInt(data)==-1){
		alert("删除失败");
	}else if(parseInt(data)==-2){
		alert("请选择要删除的车系！");
	}
}
//修改车商道权限
dealer_add.updDealerPower=function() {
	var dealersId=$("#dealersId").val();
	var dealerlevel=$("#dealerlevel").val();
	var pushcount=$("#pushcount").val();
	var beginTime=$("#beginTime").val();
	var endTime=$("#endTime").val();
	var state=$("#state").val();
	var bool=dealer_add.dealerPowerVerify(dealerlevel,pushcount,beginTime,endTime,state);
	if(bool){
		var params = {
				callback:'dealer_add.isUpdDealerPower',
				id:dealersId,
				dealerlevel:dealerlevel,
				pushcount:pushcount,
				beginTime:dealer_add.getDate(beginTime),
				endTime:dealer_add.getDate(endTime),
				state:state
			}
		$.ajax({
			url : "/admin/dealer/upddealersInfo",
			dataType : 'jsonp',
			type : 'post',
			scriptCharset :'utf-8',
			data : params,
	    	jsonp:'dealer_add.isUpdDealerPower',
	    	timeout:3000
		});	
	}
}

//验证车商道权限是否设置成功
dealer_add.isUpdDealerPower=function(data) {
	if(data=='1'){
		alert("设置成功!");
	}else{
		alert("更新经销商信息失败！");
	}
}


//添加经销商信息
dealer_add.updUserName=function() {
	var dealersId=$("#dealersId").val();
	var userName=$("#userName").val();
		var params = {
				callback:'dealer_add.isUpdDealersVerify',
				id:dealersId,
				username:userName
		}
		$.ajax({
			url : "/admin/dealer/upddealersInfo",
			dataType : 'jsonp',
			type : 'post',
			scriptCharset :'utf-8',
			data : params,
    		jsonp:'dealer_add.isUpdDealersVerify',
    		timeout:3000
		});
}
//验证用户是否设置成功
dealer_add.isUpdDealersVerify=function(data) {
	if(data=='1'){
		
		alert("设置成功");
	}else{
		alert("更新经销商信息失败！");
	}
}
//添加佣金
dealer_add.addCommission=function(){
	var dealersId=$("#dealersId").val();
	var backcash=$("#backcash").val();
	var hirecash=$("#hirecash").val();
	var bool=dealer_add.addCommissionVerify(backcash,hirecash);
	if(bool){
		var params = {
			callback:'dealer_add.isAddCommission',
			dealerid:dealersId,
			backcash:backcash,
			hirecash:hirecash
		}
		$.ajax({
			url : "/admin/dealer/addcarlog/save",
			dataType : 'jsonp',
			type : 'post',
			scriptCharset :'utf-8',
			data : params,
		    jsonp:'dealer_add.isAddCommission',
		    timeout:3000
		});	
	}
}
//添加佣金是否成功
dealer_add.isAddCommission=function(data){
	if(data=='1'){
		alert("保存成功!");
	}else{
		alert("保存失败！");
	}
}
//添加佣金合法校验
dealer_add.addCommissionVerify=function(backcash,hirecash){
	if (backcash == "") {
		alert("请输入回款金额！");
		$('#backcash').focus();
		return false;
	}
	if (hirecash == "") {
		alert("请输入电商佣金！");
		$('#hirecash').focus();
		return false;
	}else{
		return true;
	}
}
//添加车E购权限
dealer_add.addEbuyPower = function(){
	var dealersId=$("#dealersId").val();
	var contractnum=$("#contractnum").val();
	var contractmoney=$("#contractmoney").val();
	var contractcar=$("#contractcar").val();
	var contractbegin=$("#contractbegin").val();
	var contractend=$("#contractend").val();
	var contractsaler=$("#contractsaler").val();
	var contractremark=$("#contractremark").val();
	var bool=dealer_add.addEbuyPowerVerify(contractnum,contractmoney,contractcar,contractbegin,contractend,contractsaler,contractremark); 
	if(bool){
		var params = {
				callback:'dealer_add.isAddEbuyPower',
				dealerid:dealersId,
				contractnum:contractnum,
				contractmoney:contractmoney,
				contractcar:contractcar,
				contractbegin:dealer_add.getDate(contractbegin),
				contractend:dealer_add.getDate(contractend),
				contractsaler:contractsaler,
				contractremark:contractremark
			}
			$.ajax({
				url : "/admin/dealer/contract/save",
				dataType : 'jsonp',
				type : 'post',
				scriptCharset :'utf-8',
				data : params,
			    jsonp:'dealer_add.isAddEbuyPower',
			    timeout:3000
			});	
	}
}
//添加车E购权限是否成功
dealer_add.isAddEbuyPower=function(data){
	if(data=='1'){
		alert("保存成功!");
	}else{
		alert("保存失败！");
	}
}
//添加车E购权限合法校验
dealer_add.addEbuyPowerVerify = function(contractnum,contractmoney,contractcar,contractbegin,contractend,contractsaler,contractremark){
	if (contractnum == "") {
		alert("请输入合同编号！");
		$('#contractnum').focus();
		return false;
	}
	if (contractmoney == "") {
		alert("请输入合同金额！");
		$('#contractmoney').focus();
		return false;
	}if (contractcar == "") {
		alert("请输入合同台数！");
		$('#contractcar').focus();
		return false;
	}if (contractbegin == "") {
		alert("请输入合同起止时间！");
		$('#contractbegin').focus();
		return false;
	}if (contractend == "") {
		alert("请输入合同结束时间！");
		$('#contractend').focus();
		return false;
	}if (contractsaler == "") {
		alert("请输入渠道销售！");
		$('#contractsaler').focus();
		return false;
	}if (contractremark == "") {
		alert("请输入合同备注！");
		$('#contractremark').focus();
		return false;
	}else{
		return true;
	}
}
//选择车系修改选择样式
dealer_add.selectCarRemove = function(obj) {
	var selectCarclass = $(obj).find("a").attr("class");
	if (selectCarclass.indexOf("tab-box-active") > -1) {
		$(obj).find('a').removeClass("tab-box-active");
	} else {
		$(obj).find('a').addClass("tab-box-active");
	}
}

//通过审核
dealer_add.reviewedSuccess = function(reviewedState) {
	var dealersId=$("#dealersId").val();
	var bookNames = getSelectedCheckboxValues('did');
	var id=$("#buyCredentialsId").val();
	if(bookNames == null || bookNames == ''){
		alert("请选择要审核的证书！");
		return;
	}
	var params = {
			id:id,
			bookNames : bookNames,
			dealerid:dealersId,
			reviewedState:reviewedState
		}
	if (confirm("您确定要审核通过吗?")) {
		$.post("/admin/dealer/updCredentialsState",params,function(data){
			if(data == '1'){
				alert("审核成功!");
				dealer_add.setTab(6,7);
			}else{
				alert('更新失败');
			}
		});
	}
}
//不通过审核
dealer_add.reviewedLost= function() {
	 alert("请选择要不通过资质！");
     return false;
}


var indexs=0;
//选择车系
dealer_add.selectCar = function() {
	$('#companyId .tab-box-active').each(function(index) {
		var letter= $(this).attr("letter");	var bid = $(this).attr("bid");
		var bname = $(this).attr("bname");	var sid = $(this).attr("sid");
		var sname = $(this).attr("sname");	var cid = $(this).attr("cid");
		var cname = $(this).attr("cname");	var $selectCarList = $('#selectCarList');
		var selectCarDivId = $('#selectCar' + cid); var htmlout = "";
		if ($selectCarList.find('a[cid=' + cid + ']').size() <= 0) {
			if (selectCarDivId.size() <= 0) {
				htmlout = '<div id="selectCar' + cid + '" >';
				htmlout += '<h3><span class="companyLisr" >'+ cname + '</span></h3>';
				htmlout += '</div>';
				$selectCarList.append(htmlout);
			}
		}
		var selectCarDivId = $('#selectCar' + cid);
		if (selectCarDivId.find('a[sid=' + sid + ']').size() <= 0) {
				htmlout = '';
				htmlout += '<div class="divid" onclick="dealer_add.selectCarRemove(this)">';
				htmlout += $(this)[0].outerHTML;
				htmlout += '<input type="hidden" name="dealersCar['+ index + '].brandId"  id="brandId' + indexs+ '" value="' + bid + '">';
				htmlout += '<input type="hidden" name="dealersCar['+ index + '].brandName" id="brandName'+ indexs + '" value="' + bname + '">';
				htmlout += '<input type="hidden" name="dealersCar['+ index + '].companyId" id="companyId'+ indexs + '" value="' + cid + '">';
				htmlout += '<input type="hidden" name="dealersCar['+ index + '].companyName" id="companyName'+ index + '" value="' + cname + '">';
				htmlout += '<input type="hidden" name="dealersCar['+ index + '].seriesId" id="seriesId'+ indexs + '" value="' + sid + '">';
				htmlout += '<input type="hidden" name="dealersCar['+ index + '].seriesName" id="sname' + indexs+ '" value="' + sname + '">';
				htmlout += '</div>';
				var rows = 0;
				selectCarDivId.append(htmlout);
				$selectCarList.find('a').removeClass('tab-box-active');
		}
		indexs++;
	});
}
//搜索
dealer_add.query=function(){
	$('#searchForm').submit();
}
//选项卡
dealer_add.setTab=function(selectN, n) {
	var dealersId=$("#dealersId").val();
	if(selectN!=1&&(dealersId==null||dealersId=='')){
		alert("只有修改经销商才能访问！");
	}else{
		if(selectN==1){
			if(dealer_add.baseDataAddOrUpd(selectN,dealersId)){
				window.location.href="/admin/dealer/add";
			}else{
				window.location.href="/admin/dealer/add?id="+dealersId;
			}
		}else if(selectN==2){
			window.location.href="/admin/dealer/edit/bind/user?id="+dealersId;
		}else if(selectN==3){
			window.location.href="/admin/dealer/edit/dpower?id="+dealersId;
		}else if(selectN==4){
			window.location.href="/admin/dealer/edit/epower?id="+dealersId;
		}else if(selectN==5){
			window.location.href="/admin/dealer/apply/photo?id="+dealersId;
		}else if(selectN==6){
			window.location.href="/admin/dealer/reviewed/credentials?dealerid="+dealersId;
		}else if(selectN==7){
			window.location.href="/admin/dealer/record/list?dealerid="+dealersId;
		}
	}
}
//验证基础资料添加(true)/修改(false)
dealer_add.baseDataAddOrUpd=function(selectN,dealersId){
	if(selectN==1&&(dealersId==null||dealersId=='')){
		return true;
	}else if(selectN==1&&(dealersId!=null&&dealersId!='')){
		return false;
	}
}
//字符串转换时间
dealer_add.getDate=function(strDate) {
    var date = eval('new Date(' + strDate.replace(/\d+(?=-[^-]+$)/,    
     function (a) { return parseInt(a, 10) - 1; }).match(/\d+/g) + ')');    
    return date;    
} 