//省份、城市联动下拉框数据加载
var provinceSelectorId;
var citySelectorId;
var regionalSelectorId;
var provinceHideId;
var cityHideId;
var regionalHideId;

var provinceUrl = "http://dealer.chexun.com/api/GetProvinceInfo.ashx";
var cityUrl = "http://dealer.chexun.com/api/GetCityInfo.ashx";
var regionalUrl = "http://dealer.chexun.com/api/GetRegionalInfoHandler.ashx";

function initProvinceCity(provinceSelector, provinceHide, citySelector,cityHide, regionalSelector, regionalHide) {
	provinceSelectorId = provinceSelector;
	provinceHideId = provinceHide;
	citySelectorId = citySelector;
	cityHideId = cityHide;
	regionalSelectorId = regionalSelector;
	regionalHideId = regionalHide;

	var provinceParams = {
		callback : 'loadProvince'
	};
	// 绑定省份的onchange事件
	$("#" + provinceSelectorId).change(function() {
		changeProvince();
	});
	$.ajax({
		url : provinceUrl,
		dataType : 'jsonp',
		data : provinceParams,
		jsonp : 'loadProvince',
		timeout : 3000
	});
	// 如果有选中的省份，初始化城市（此场景适用选中省份/城市，点查询返回后页面初始加载时）
	var selectProvince = $("#" + provinceHideId).val();
	// alert("selectProvince:" + selectProvince);
	if (selectProvince != null && selectProvince != '') {
		changeProvince();
	}
	
	// 如果有选中的省份，初始化城市（此场景适用选中省份/城市，点查询返回后页面初始加载时）
	var selectCity = $("#" + cityHideId).val();
	if (selectCity != null && selectCity != '') {
		changeCity();
	}
	
	// 绑定城市的onchange事件
	$("#" + citySelectorId).change(function() {
		changeCity();
	});
}

function loadProvince(result) {
	var selector = $('#' + provinceSelectorId);
	selector.empty();
	selector.append('<option value="">--所在省份-- </optiont>');
	var selectedProvinceId = $('#' + provinceHideId).val();
	// alert("result.length:" + result.length);
	for (var i = 0; i < result.length; i++) {
		if (selectedProvinceId != null && selectedProvinceId != ''
				&& selectedProvinceId == result[i].provinceId) {
			selector.append('<option value="' + result[i].provinceId
					+ '" selected>' + result[i].provinceName + '</optiont>');
		} else {
			selector.append('<option value="' + result[i].provinceId + '">'
					+ result[i].provinceName + '</optiont>');
		}
	}
}

function changeProvince() {
	var provinceIds=$('#' + provinceSelectorId).val()==''?$('#' + provinceHideId).val():$('#' + provinceSelectorId).val();
	var params = {
		callback : 'loadCity',
		provinceId :provinceIds
	};
	$.ajax({
		url : cityUrl,
		dataType : 'jsonp',
		data : params,
		jsonp : 'loadCity',
		timeout : 3000
	});
}

function loadCity(result) {
	var selector = $('#' + citySelectorId);
	selector.empty();
	selector.append('<option value="">--所在城市--</optiont>');
	var selectedCityId = $('#' + cityHideId).val();
	for (var i = 0; i < result.length; i++) {
		if (selectedCityId != null && selectedCityId == result[i].cityId) {
			// alert("selectedCityId2:" + selectedCityId);
			selector.append('<option value="' + result[i].cityId
					+ '" selected>' + result[i].cityName + '</optiont>');
		} else {
			selector.append('<option value="' + result[i].cityId + '">'
					+ result[i].cityName + '</optiont>');
		}
	}
}

function changeCity(){
	var cityIDs=$('#' + citySelectorId).val()==''?$('#' + cityHideId).val():$('#' + citySelectorId).val();
	var params = {
		callback:'loadRegional',
		cityID:cityIDs
	};
	$.ajax({  
        url:regionalUrl,  
        dataType:'jsonp',    
        data:params,
        jsonp:'loadRegional',    
        timeout:3000  
    });	
}
function loadRegional(result){
	var selector = $('#' + regionalSelectorId);
	selector.empty();
	selector.append('<option value="">--所在地区--</optiont>');
	var selectedRegionalId = $('#' + regionalHideId).val();	
	for(var i=0;i<result.length;i++) {
		if(selectedRegionalId != null && selectedRegionalId == result[i].ID){
			selector.append('<option value="'+ result[i].ID +'" selected>' + result[i].NAME + '</optiont>');
		}else{
			selector.append('<option value="'+ result[i].ID +'">' + result[i].NAME + '</optiont>');
		}
	}
}



