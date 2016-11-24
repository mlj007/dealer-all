$(document).ready(function() {
    //左边折叠导航
	var oLeft=$('.left');
	var oLeftDiv=$('.left-con');
	var oRight=$('.right');
	var oShow=$('.left-show');
	var oHide=$('.left-hide');
	var lh=$(document).height();
	oLeft.height(lh);
	oRight.height(lh);
	oHide.click
	(
		function()
		{
			oLeftDiv.hide();	
			oLeft.animate({width:10})
			oHide.hide();
			oShow.show();
			oRight.animate({marginLeft:10});
		}
	)
	oShow.click(
		function()
		{
			oLeft.animate({width:240})
			oHide.show();
			oShow.hide();
			oRight.animate({marginLeft:240});
			oLeftDiv.show();		
			
		}
	)
	
	
	$(function($){
		$(".left-bd h3").bind("click",function(){
			if($(this).next().is(":visible"))
			{

				$(this).next().slideUp().end().removeClass("nav-cur");
			}
			else
			{
				$(".left-bd .nav-box-bd").slideUp();
				$(".left-bd h3").removeClass("nav-cur");
				$(this).next().slideDown().end().addClass("nav-cur");
			}
		});
		$(".nav-box-bd .nav-list").bind("click",function(){
			if($(this).next().is(":visible"))
			{
				$(this).next().slideUp().end().removeClass("nav-list-cur");
			}
			else
			{
				$(".nav-box-bd .last-nav").slideUp();
				$(".nav-box-bd .nav-list").removeClass("nav-list-cur");
				$(this).next().slideDown().end().addClass("nav-list-cur");
			}
		});
	});
	
	//tab隔行变色
	$('.help-sz').mouseover(function(){
		$('.help-sz span').css('display','block');
	},function(){
		 timer=setTimeout(function(){
         $('.help-sz span').css('display','block');
    	 },300);

	})

	$('.help-sz').mouseout(function(){
		$('.help-sz span').css('display','none');
	},function(){
		 timer=setTimeout(function(){
         $('.help-sz span').css('display','none');
    	 },300);

	})
	var oTab=document.getElementById('tab');
	if(oTab!=null){
		var aTr=oTab.getElementsByTagName('tr');
		var i=0;
		for(i=0;i<aTr.length;i++)
		{
			if(i%2==1)
			{
				aTr[i].style.background='#EEE';
			}	
		} 
	}

})
//选项卡
function setTab(selectN, n) {
   for (var i = 1; i <= n; i++)
   {
   		document.getElementById("tabs" + i).className = '';
   		document.getElementById("tabs-" + i).style.display = 'none';
   }
   document.getElementById("tabs" + selectN).className = 'active';
   document.getElementById("tabs-" + selectN).style.display = '';
}
 