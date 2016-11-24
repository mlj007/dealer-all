package com.chexun.dealer.utils;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.CellRangeAddress;

/**
 * 导出Excel
 * 抽象类
 * 子类需要实现createContents方法，完成具体的生产Excel的功能
 * @author
 * @date
 * @version 1.0 
 *
 * @param <T>
 */
public abstract class ExcelExporter<T> {
	
	public static final short TITLE_BG = IndexedColors.BLUE_GREY.getIndex();
	public static final short TITLE_FG = IndexedColors.WHITE.getIndex();
	private String fileName;//导出文件名称
	protected String[] titles;//标题	
	protected int startRow = 0;//起始行
	protected int startColnum = 0;//起始列
	private Sheet sheet;//excel的sheet对象
	private int[] colWiths;//列的宽度（单位字符）
	/** 标题样式 */
	protected CellStyle headerStyle;	
	/** 内容样式 */
	protected CellStyle contentStyle;
	/**
	 * 四分之一字符尺寸 64
	 */
	public static final short SIZE_FACTOR = 64;
	/**
	 * 默认行高
	 */
	public static final short ROW_HEIGHT_DEFAULT = SIZE_FACTOR * 6;
	/**
	 * 双倍行高
	 */
	public static final short ROW_HEIGHT_DOUBLE = SIZE_FACTOR * 9;
	
	public ExcelExporter() {		
	}
	
	public ExcelExporter(String fileName) {
		this.fileName = fileName;
	}

	/**
	 * 生成Excel 
	 * 
	 * @param response HTTP response
	 * @param dataList 数据列表
	 * @param fileName 文件名称
	 */
	public void writeExcel(HttpServletResponse response, List<T> dataList ) {
		OutputStream out = null;
		if (fileName == null || fileName.trim().equals("")) {
			fileName = "导出文件";
		}
		
		try {
			try {
				response.reset();
				response.setContentType("application/vnd.ms-excel");
				response.setHeader("Connection", "close");
				response.setHeader("Content-disposition",
						"attachment; filename="
								+ new String(this.fileName.getBytes("gb2312"),
										"iso8859-1") + ".xls");
			} catch (Exception ue) {
			}
			out = response.getOutputStream();
			Workbook wb = createExcel(dataList);
			wb.write(out);
			out.flush();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (out != null) {
				try {
					out.close();
				} catch (Exception ex) {
				}
			}
		}
	}
	/**
	 * 
	 * @param dataList
	 * @return
	 */
	private Workbook createExcel(List<T> dataList) {
		HSSFWorkbook wb = new HSSFWorkbook();
		initCellStyle(wb);
		sheet = wb.createSheet(this.fileName);		
		createTitle(titles);
		createContents(dataList);//生成内容抽象方法，在子类中实现
		if(this.colWiths != null && this.colWiths.length > 0){
			setSheetColWiths(this.colWiths);
		}
		return wb;
	}
	
	/**
	 * 生成内容抽象方法，在子类中实现
	 * @param wb
	 * @param sheet
	 * @param dataList
	 */
	protected abstract void createContents(List<T> dataList);
	
	/**
	 * 创建行
	 * 
	 * @param sheet
	 * @param rownum
	 * @param height
	 * @return
	 */
	protected Row createRowWithHeight(Sheet sheet, int rownum, short height) {
		Row row = sheet.createRow(rownum);
		row.setHeight(height);
		return row;
	}
	
	/**
	 * 创建行
	 * 
	 * @param sheet
	 * @param statRow
	 * @param args
	 * @return
	 */
	protected Row createRow(Object... args) {
		Row row = sheet.createRow(startRow);
		row.setHeight(ROW_HEIGHT_DEFAULT);
		
		int startCol = this.startColnum;
		if(args != null && args.length > 0) {
			for(Object o: args) {
				createCell(row, startCol++, contentStyle, o);
			}
		}
		startRow ++ ;
		return row;
	}
	
	/**
	 * 创建标题行
	 * 
	 * @param sheet
	 * @param statRow	：行
	 * @param startCol	：开始列
	 * @param titles	：标题 
	 * @return
	 */
	protected Row createTitle(String... titles) {
		Row row = sheet.createRow(startRow);
		row.setHeight(ROW_HEIGHT_DEFAULT);
		int startCol = this.startColnum;
		if(titles != null && titles.length > 0) {
			for(String title: titles) {
				createHeaderCell(row, startCol++, title);
			}
		}
		startRow ++;
		return row;
	}
	
	/**
	 * 创建单元格
	 * 
	 * @param row	：行对象
	 * @param col	：列
	 * @param style	：样式
	 * @param value	：单元格内容
	 * @return
	 */
	protected Cell createCell(Row row, int col, CellStyle style, Object value) {
		Cell cell = row.createCell(col);
		cell.setCellValue(value==null?"":value.toString());
		cell.setCellStyle(style);
		
		return cell;
	}
	
	/**
	 * 创建单元格
	 * 
	 * @param row	：行对象
	 * @param col	：列
	 * @param style	：样式
	 * @param value	：单元格内容
	 * @return
	 */
	protected Cell createCell(Row row, int col, CellStyle style, Object value,int cellType) {
		Cell cell = row.createCell(col,cellType);
		//cell.setCellType(cellType);
		cell.setCellValue(value==null?"":value.toString());
		cell.setCellStyle(style);
		
		return cell;
	}
	
	
	/**
	 * 创建标题单元格
	 * 
	 * @param row
	 * @param col
	 * @param title
	 * @return 
	 */
	protected Cell createHeaderCell(Row row, int col, String title) {
		return createCell(row, col, headerStyle, title,Cell.CELL_TYPE_STRING);
	}
	
	/**
	 * 设置列的宽度,单位为一个字符
	 * 
	 * @param sheet
	 * @param widths
	 */
	private void setSheetColWiths(int... widths) {
		int colnumIdx = this.startColnum;
		for(int w: widths) {
			sheet.setColumnWidth(colnumIdx++, SIZE_FACTOR * 4 * w);
		}
	}
	
	
	/**
	 * 创建普通单元格样式
	 * 
	 * @param wb
	 * @param align	对齐方式
	 * @return
	 */
	protected CellStyle createValueStyle(org.apache.poi.ss.usermodel.Workbook wb,
			Short align) {
		CellStyle style = wb.createCellStyle();

		if(align == null) {
			align = CellStyle.ALIGN_CENTER;
		} else {
			if (!align.equals(CellStyle.ALIGN_LEFT) 
					&& !align.equals(CellStyle.ALIGN_CENTER) 
					&& !align.equals(CellStyle.ALIGN_RIGHT) ) {
				align = CellStyle.ALIGN_LEFT;
			}
		}
		style.setAlignment(align);
		// 
		style.setWrapText(true); 
		
		// 边框颜色
		style.setBorderBottom(CellStyle.BORDER_THIN);
		style.setBottomBorderColor(IndexedColors.GREY_80_PERCENT.getIndex());
		style.setBorderLeft(CellStyle.BORDER_THIN);
		style.setLeftBorderColor(IndexedColors.GREY_80_PERCENT.getIndex());
		style.setBorderRight(CellStyle.BORDER_THIN);
		style.setRightBorderColor(IndexedColors.GREY_80_PERCENT.getIndex());
		style.setBorderTop(CellStyle.BORDER_THIN);
		style.setTopBorderColor(IndexedColors.GREY_80_PERCENT.getIndex());
		style.setFillBackgroundColor(IndexedColors.GREY_80_PERCENT.getIndex());

		return style;
	}

	/**
	 * 获取标题单元格样式
	 * 
	 * @param wb
	 * @return
	 */
	protected CellStyle getHeaderCellStyle(
			org.apache.poi.ss.usermodel.Workbook wb) {
		CellStyle style = wb.createCellStyle();

		// 对齐方式
		style.setAlignment(CellStyle.ALIGN_CENTER);
		style.setVerticalAlignment(CellStyle.VERTICAL_CENTER);

		// 边框颜色
		style.setBorderBottom(CellStyle.BORDER_THIN);
		style.setBottomBorderColor(IndexedColors.GREY_25_PERCENT.getIndex());
		style.setBorderLeft(CellStyle.BORDER_THIN);
		style.setLeftBorderColor(IndexedColors.GREY_25_PERCENT.getIndex());
		style.setBorderRight(CellStyle.BORDER_THIN);
		style.setRightBorderColor(IndexedColors.GREY_25_PERCENT.getIndex());
		style.setBorderTop(CellStyle.BORDER_THIN);
		style.setTopBorderColor(IndexedColors.GREY_25_PERCENT.getIndex());
		style.setFillBackgroundColor(IndexedColors.GREY_25_PERCENT.getIndex());

		// 背景颜色
		style.setFillForegroundColor(TITLE_BG);
		style.setFillPattern(CellStyle.SOLID_FOREGROUND);

		// 字体
		Font font = wb.createFont();
		font.setColor(TITLE_FG);
		font.setBoldweight(Font.BOLDWEIGHT_BOLD);
		style.setFont(font);

		return style;
	}

	/**
	 * 初始化默认样式
	 * 
	 * @param hssWb
	 */
	private void initCellStyle(HSSFWorkbook hssWb) {
		contentStyle = createValueStyle(hssWb, CellStyle.ALIGN_LEFT);
		//cellStyleCenter = this.createValueStyle(hssWb, CellStyle.ALIGN_CENTER);
		//cellStyleRight = this.createValueStyle(hssWb, CellStyle.ALIGN_RIGHT);
		headerStyle = getHeaderCellStyle(hssWb);
		// 
		//cellStyleTitle = this.createValueStyle(hssWb, CellStyle.ALIGN_CENTER);
		//Font font = hssWb.createFont();
		//font.setColor(IndexedColors.BLACK.getIndex());
		//font.setBoldweight(Font.BOLDWEIGHT_BOLD);
		//font.setFontHeightInPoints(new Integer(20).shortValue());
		//cellStyleTitle.setFont(font);
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String[] getTitles() {
		return titles;
	}

	public void setTitles(String[] titles) {
		this.titles = titles;
	}

	public int[] getColWiths() {
		return colWiths;
	}

	public void setColWiths(int[] colWiths) {
		this.colWiths = colWiths;
	}
	
	
	
//
//	/**
//	 * just for test 
//	 * 
//	 * print all colors in poi excel
//	 */
//	@SuppressWarnings("unchecked")
//	private static void printAllColors() {
//		Hashtable t = HSSFColor.getTripletHash();
//		Iterator iter = t.entrySet().iterator();
//		for (; iter.hasNext();) {
//			Map.Entry en = (Map.Entry) iter.next();
//			HSSFColor c = (HSSFColor) en.getValue();
//			short[] triplet = c.getTriplet();
//
//			StringBuffer strb = new StringBuffer();
//			for (short sh : triplet) {
//				String cstr = Integer.toHexString(sh);
//				if (cstr.length() <= 1)
//					strb.append("0");
//				strb.append(cstr);
//			}
//
//			System.out.println("<div style=\"background-color:#"
//					+ strb.toString() + "; width:100px; height:22px\">" + c
//					+ "| " + strb.toString() + "</div>");
//		}
//	}
//
//	public static void main(String... args) {
//		printAllColors();
//	}
}
