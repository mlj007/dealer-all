//品牌、车系联动下拉框数据加载
var brandSelectorId;
var seriesSelectorId;
var modelSelectorId;
var brandHideId;
var seriesHideId;
var modelHideId;

var brandUrl = "http://api.tool.chexun.com/pc/downBrandInfo.do";
var seriesUrl = "http://api.tool.chexun.com/pc/downSeriesInfo.do";
var modelUrl = "http://api.tool.chexun.com/pc/downModelInfo.do";
//方法一 ：品牌车系车型加载 
function initBrandSeriesModel(brandSelector, brandHide, seriesSelector,seriesHide, modelSelector, modelHide) {
	brandSelectorId = brandSelector;
	brandHideId = brandHide;
	seriesSelectorId = seriesSelector;
	seriesHideId = seriesHide;
	modelSelectorId = modelSelector;
	modelHideId = modelHide;
	
	var brandParams = {
		callback : 'loadBrand'
	};
	// 绑定品牌的onchange事件
	$("#" + brandSelectorId).change(function() {
		changeBrand();
	});
	$.ajax({
		url : brandUrl,
		dataType : 'jsonp',
		data : brandParams,
		jsonp : 'loadBrand',
		timeout : 3000
	});
	// 如果有选中的品牌，初始化车系（此场景适用选中品牌/车系，点查询返回后页面初始加载时）
	var selectbrand = $("#" + brandHideId).val();
	if (selectbrand != null && selectbrand != '') {
		changeBrand();
	}
	// 如果有选中的品牌，初始化车系（此场景适用选中品牌/车系，点查询返回后页面初始加载时）
	var selectSeries = $("#" + seriesHideId).val();
	if (selectSeries != null && selectSeries != '') {
		changeSeries();
	}
	
	// 绑定车系的onchange事件
	$("#" + seriesSelectorId).change(function() {
		changeSeries();
	});
	
}
//方法二：品牌车系车型加载 
function initCarBrandSeriesModel() {
	var carbrandParams = {
			callback : 'loadCarbrand'
	};
	$.ajax({
		url : brandUrl,
		dataType : 'jsonp',
		data : carbrandParams,
		jsonp : 'loadCarbrand',
		timeout : 3000
	});
}
function loadBrand(result) {
	var selector = $('#' + brandSelectorId);
	selector.empty();
	selector.append('<option value="">--经营品牌-- </optiont>');
	var selectedBrandId = $('#' + brandHideId).val();
	// alert("result.length:" + result.length);
	for (var i = 0; i < result.length; i++) {
		if (selectedBrandId != null && selectedBrandId != ''&& selectedBrandId == result[i].brandId) {
			selector.append('<option value="' + result[i].brandId + '" selected>' + result[i].brandName + '</optiont>');
		} else {
			selector.append('<option value="' + result[i].brandId + '">'+ result[i].brandName + '</optiont>');
		}
	}
}

function changeBrand() {
	var brandIds=$('#' + brandSelectorId).val()==''?$('#' + brandHideId).val():$('#' + brandSelectorId).val();
	var params = {
		callback :'loadSeries',
		brandId : brandIds
	};
	$.ajax({
		url : seriesUrl,
		dataType : 'jsonp',
		data : params,
		jsonp :'loadSeries',
		timeout : 3000
	});
}

function loadSeries(result) {
	var selector = $('#' + seriesSelectorId);
	selector.empty();
	selector.append('<option value="">--经营车系--</optiont>');
	var selectedSeriesId = $('#' + seriesHideId).val();
	for (var i = 0; i < result.length; i++) {
		if (selectedSeriesId != null && selectedSeriesId == result[i].seriesId) {
			selector.append('<option value="' + result[i].seriesId+ '" selected>' + result[i].seriesName + '</optiont>');
		} else {
			selector.append('<option value="' + result[i].seriesId + '">'+ result[i].seriesName + '</optiont>');
		}
	}

}

function changeSeries(){
	var seriesIds=$('#' + seriesSelectorId).val()==''?$('#' + seriesHideId).val():$('#' + seriesSelectorId).val();
	var params = {
		callback:'loadModel',
		seriesId:seriesIds
	};
	$.ajax({  
        url:modelUrl,  
        dataType:'jsonp',    
        data:params,
        jsonp:'loadModel',    
        timeout:3000  
    });	
}

function loadModel(result){
	var selector = $('#' + modelSelectorId);
	selector.empty();
	selector.append('<option value="">--经营车型--</optiont>');
	var selectedModelId = $('#' + modelHideId).val();
	for(var i=0;i<result.length;i++) {
		if(selectedModelId != null && selectedModelId == result[i].modelId){
			selector.append('<option value="'+ result[i].modelId +'" selected>' + result[i].modelName + '</optiont>');
		}else{
			selector.append('<option value="'+ result[i].modelId +'">' + result[i].modelName + '</optiont>');
		}
	}
}

//回调函数，处理品牌结果绑定
function loadCarbrand(result) { 
	 var strHTML ='';
	if (result.length > 0) {
		for (var i = 0; i < result.length; i++) {
				strHTML +='<a class="brandList" bid="'+result[i].brandId+'" style="cursor: pointer">'+decodeURIComponent(result[i].brandName) +'</a>';
		}
		$('#brandId').html(strHTML);
		$('#brandId a').click(function () {
		$('#modelId').html('');
	        var BrandID=$(this).attr("bid");
	        changeCarBrand(this)
	    });
	}
}
function changeCarBrand(result) {
	var brandIds=$(result).attr("bid");
 	var params = {
 		callback :'loadCarSeries',
 		brandId : brandIds
 	};
 	$.ajax({
 		url : seriesUrl,
 		dataType : 'jsonp',
 		data : params,
 		jsonp :'loadCarSeries',
 		timeout : 3000
 	});
}

function loadCarSeries(data) {
	var strHTML ='';
	data.sort(getSortFun('asc', 'companyId'));
	if (data.length > 0) {
		var old=0;
	 	for (var i = 0; i < data.length; i++) {
	 	 	if(old!=data[i].companyId){
	 	 		old=data[i].companyId;
	 	 		strHTML +='<h3><span class="companyLisr" cid="'+data[i].companyId+'">'+data[i].companyName+'</span></h3>';
	 	 	}
		 	strHTML +='<a class="seriesList" letter="'+data[i].letter+'" cid="'+data[i].companyId+'" cname="'+data[i].companyName+'" bid="'+data[i].brandId+'" bname="'+data[i].brandName+'" sid="'+data[i].seriesId+'" sname="'+data[i].seriesName+'" style="cursor: pointer" sel="0">'+decodeURIComponent(data[i].seriesName) +'</a>';
		 }
	}else{
		$('#companyId').html('<span style="color:red">暂无数据</span>');
	}
		$("#companyId").html(strHTML);
		$('#companyId a').click(function () {
			var companyclass=$(this).attr("class");
			if(companyclass.indexOf("tab-box-active")>-1){
				$(this).removeClass("tab-box-active");
			}else{
				$(this).addClass("tab-box-active");
			}
    	});
}

function getSortFun(order, sortBy) {
    var ordAlpah = (order == 'asc') ? '>' : '<';
    var sortFun = new Function('a', 'b', 'return a.' + sortBy + ordAlpah + 'b.' + sortBy + '?1:-1');
    return sortFun;
}