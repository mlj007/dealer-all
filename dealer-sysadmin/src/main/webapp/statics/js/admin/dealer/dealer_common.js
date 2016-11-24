//全部选中checkBox
function selectCheckBox(obj) {
    if (obj.checked) {
        selectCheckbox(true);
    }
    else {
        selectCheckbox(false);
    }
}

function selectCheckbox(bool) {
    $("input[type=checkbox]").each(function () { this.checked = bool; })
}

//获取所有checkbox的值,多个逗号分隔
function getSelectedCheckboxValues(checkboxName){
	var idx = 0;
	var ids = '';
	$("input[name='" + checkboxName + "']:checked").each(function(){ 
		if(idx == 0){
			ids = $(this).attr('value'); 
		}else{
			ids += ",";
			ids += $(this).attr('value'); 
		}		
		idx += 1; 		 
	}); 
	return ids;
}

//获取所单个checkbox的值
function getSelectedCheckboxValue(checkboxName){
	var id = '';
	var chk_value =[];    
	$("input[name='" + checkboxName + "']:checked").each(function(){ 
		chk_value.push($(this).val());
		id= $(this).attr('value'); 
	}); 
	if(chk_value.length==0 ){
		alert("你还没有选择任何内容！");
	}else if(chk_value.length>1){
		alert("只能选择一家经销商！");
	}else{
		return id;
	}
}
