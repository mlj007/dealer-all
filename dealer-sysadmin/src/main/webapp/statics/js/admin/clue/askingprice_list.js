
//初始化
$(document).ready(function(){
  	initProvinceCity('provinceId','selectedProvinceId','cityId','selectedCityId');
  	initBrandSeriesModel('brandId','selectedBrandId','seriesId','selectedSeriedId');
  	$("#timeStart").calendar();
  	$("#timeEnd").calendar();
});

//搜索
function query(){
	$('#searchForm').submit();
}

//切换标签查询
function queryByState(st){
	$("#state").val(st);
	$('#searchForm').submit();
}

