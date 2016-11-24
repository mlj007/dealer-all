
//初始化
$(document).ready(function(){
	initProvinceCity('provinceId','selectedProvinceId','cityId','selectedCityId');  	
  	$("#timeStart").calendar();
  	$("#timeEnd").calendar();
});

//搜索
function query(){
	$('#searchForm').submit();
}

//导出
function exportToExcel(){
	var queryUrl = $('#searchForm').attr('action');
	$('#searchForm').attr('action',"/admin/clue/message/export");
	$('#searchForm').submit();
	$('#searchForm').attr('action',queryUrl);
}

//切换标签查询
function queryByState(st){
	if(st == -1){
		$("#isReply").val('');
	}else{
		$("#isReply").val(st);
	}
	$('#searchForm').submit();
}

//删除留言
function delMessage(messageId){
	var params = {
		ids : messageId
	}
	$.post("/admin/clue/message/delete",params,function(data){
		if(data != null && data == '1'){
			$('#row_' + messageId).remove();
		}else{
			alert('删除失败');
		}
	});
}

//删除按钮
function delSelected(){
	var ids = getSelectedCheckboxValues('selecedId');
	if(ids == null || ids == ''){
		return;
	}
	var params = {
			ids : ids
		}
	$.post("/admin/clue/message/delete",params,function(data){
		if(data != null && data == '1'){
			query();
		}else{
			alert('删除失败');
		}
	});
}

//打开回复对话框
function showReplyBox(msgId) {
    $("#bg").show();
    $("#pop").show();

    $("#messageId").val(msgId);

    var content = $("#replyContent_" + msgId).html();
    $("#replyBoxContent").val($.trim(content));

    var message = $("#message_" + msgId).html();
    $("#messageContent").html(message);
    //getReplyContent(msgId, "SetReplyContent");
}

//保存回复内容
function saveRepley(){
	
	var params = {
		messageId:$('#messageId').val(),
		replyContent:$('#replyBoxContent').val()
	};
	if(params.replyContent == null || params.replyContent == ''){
		alert('回复内容不能为空！');
		return;
	}else if(params.replyContent.length() > 1000){
		alert('回复内容不能超过1000字！');
		return;
	}
	$.post('/admin/clue/message/reply',params,function(data){
		if(data == '1'){
			$("#replyContent_" + params.messageId).html(params.replyContent);
			$("#pop").hide();
		}else{
			alert('保存回复内容失败！');
		}
	});
}

//取消回复按钮
function cancelRepley(){
	$("#pop").hide();
}


