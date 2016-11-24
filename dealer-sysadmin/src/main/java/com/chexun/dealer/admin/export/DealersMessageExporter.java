package com.chexun.dealer.admin.export;

import java.text.SimpleDateFormat;
import java.util.List;

import com.chexun.dealer.po.clue.DealersMessagesPo;
import com.chexun.dealer.utils.ExcelExporter;

//留言信息导出
public class DealersMessageExporter extends ExcelExporter<DealersMessagesPo> {

	public DealersMessageExporter() {
		setFileName("留言信息导出");//导出文件名
		setTitles(new String[]{"问题","提问时间","回复内容","经销商"});//各列的标题
		setColWiths(new int[]{60,20, 50, 32});//设置各列的宽度（单位：字符）
	}
	
	@Override
	protected void createContents(List<DealersMessagesPo> dataList) {		
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String date = null;
		Object[] rowValues = new Object[4];
		for(DealersMessagesPo p : dataList) {
			rowValues[0] = p.getMessageContent();			
			date = null;
			try{
				if(p.getCreateTime() != null){
					date = format.format(p.getCreateTime());
				}
			}catch(Exception ex){
				date = "";
			}
			rowValues[1] = date;
			rowValues[2] = p.getReplyContent();
			rowValues[3] = p.getDealerName();
			createRow(rowValues);
		}
	}

}
