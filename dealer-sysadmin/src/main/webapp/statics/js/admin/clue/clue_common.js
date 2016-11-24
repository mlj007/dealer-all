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
