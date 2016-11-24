/*!
 * Dealer Admin dealer modle page JS
 * Date : 2016-09-26 14:35:11
 * Copyright (c) 2009 - 2016 By Meng Ling Jie
 */
var dealer_list = {};
$(document).ready(function(){
	//品牌车系车型加载
	initBrandSeriesModel('brandId','selectedBrandId','seriesId','selectedSeriesId','modelId','selectedModelId');
	//省份城市加载
	initProvinceCity('provinceId','selectedProvinceId','cityId','selectedCityId','regionalId','selectedRegionalId');
	//日历控件
	$("#createbeginTime").calendar();
    $("#createendTime").calendar();
    $("#expirebeginTime").calendar();
    $("#expireendTime").calendar();
});
//搜索
function query(){
	$('#searchForm').submit();
}
//隐藏
dealer_list.updstate = function(data){
	var ids = getSelectedCheckboxValues('did');
	if(ids == null || ids == ''){
		return;
	}
	var params = {
			ids : ids
		}
	$.post("/admin/dealer/updstate",params,function(data){
		if(data != null && data == '1'){
			query();
		}else{
			alert('修改失败');
		}
	});
}

//推荐
dealer_list.updisrecommendfirst = function(data){
	var ids = getSelectedCheckboxValues('did');
	if(ids == null || ids == ''){
		return;
	}
	var params = {
			ids : ids
		}
	$.post("/admin/dealer/updisrecommendfirst",params,function(data){
		if(data != null && data == '1'){
			query();
		}else{
			alert('修改失败');
		}
	});
}
//查看前台
dealer_list.viewwebsite = function(data){
	var id = getSelectedCheckboxValue('did');
	if(id == null || id == ''){
		return;
	}
	var params = {
			ids : id
		}
	$.post("/admin/dealer/viewwebsite",params,function(data){
		if(data != null && data != ''){
			window.open('http://dealer.chexun.com/'+data);
		}else{
			alert('失败');
		}
	});
}
//查看后台
dealer_list.viewsystem= function(data){
	var id = getSelectedCheckboxValue('did');
	if(id == null || id == ''){
		return;
	}
	var params = {
			ids : id
		}
	$.post("/manage/index",params,function(data){
		if(data != null && data != ''){
			window.open('http://dealer.chexun.com/'+data);
		}else{
			alert('失败');
		}
	});
}
//更新报价,实际操作是帮经销商，更新一下经销商车的创建时间
dealer_list.updCreatTime = function(data){
	
	var ids = getSelectedCheckboxValues('did');
	if(ids == null || ids == ''){
		alert("请选择要更改的经销商！");
		return;
	}
	var params = {
			ids : ids
		}
	if (confirm("您确定要更新经销商的全部报价吗?")) {
		$.post("/admin/dealer/upddatetime",params,function(data){
			if(data != null && data != '0'){
				alert("报价成功更新"+data+"个，失败0个！");
				query();
			}else{
				alert('更新失败');
			}
		});
	}
}
//修改信息
dealer_list.updDealerInfo = function(data){
	var id = getSelectedCheckboxValue('did');
	if(id == null || id == ''){
		return;
	}
	window.open('/admin/dealer/add?id='+id);
	
}