/*!
 * Dealer Admin dealer modle page JS
 * Date : 2016-10-13 14:35:11
 * Copyright (c) 2009 - 2016 By Meng Ling Jie
 */
var dealerVerify = {};
//审核操作 修改状态为 为 1
dealerVerify.updaDealerState=function(dealerId){
	var params={
			callback:'dealerVerify.isupdaDealerState',
			dealerId:dealerId
			};
	
	$.post("/admin/dealer/updstateVerify",params,function(data){
		if(data == '1'){
			alert("审核成功!");
			 window.location.href = window.location.href;
		}else{
			alert('更新失败');
		}
	});
}