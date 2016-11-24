package com.chexun.dealer.utils.common;

public class PageUtil {
	public static String pageStr (PageInfo pageInfo){

		Integer pageNo = pageInfo.getPageNo();
		Integer pageSize = pageInfo.getPageSize();
		Integer recordCount = pageInfo.getTotalCount();
		String method = "openPage";

		method = "javascript:" + method + "(";

		pageSize = pageSize == 0 ? pageSize = 20 : pageSize;

		int pageCount = (recordCount + pageSize - 1) / pageSize;

		StringBuilder sb = new StringBuilder();

		sb.append("<div class=\"pagelist\">\r\n");
		if (recordCount == 0) {
			sb.append("<strong>没有可显示的项目</strong>\r\n");
		} else {
			if (pageNo > pageCount)
				pageNo = pageCount;
			if (pageNo < 1) {
				pageNo = 1;
			}
			if (pageNo == 1){
				sb.append("<span class=\"disabled\">").append("上一页").append("</span>");
			}else{
				sb.append("<a class=\"prebtn\" href=\"").append(method).append(
						pageNo - 1).append(")\">上一页</a>\r\n");
			}

			int start = 1;
			if (pageNo > 4) {
				start = pageNo - 1;
				sb.append("<a href=\"").append(method).append("1)\">1</a>\r\n");
				sb.append("<a href=\"").append(method).append("2)\">2</a>\r\n");
				sb.append("&hellip;\r\n");
			}

			int end = pageNo + 1;
			if (end > pageCount) {
				end = pageCount;
			}
			for (int i = start; i <= end; ++i) {
				if (pageNo == i)
					sb.append("<span class=\"current\">").append(i).append(
							"</span>\r\n");
				else {
					sb.append("<a href=\"").append(method).append(i)
							.append(")\">").append(i).append("</a>\r\n");
				}
			}

			if (end < pageCount - 2) {
				sb.append("&hellip;\r\n");
			}
			if (end < pageCount - 1) {
				sb.append("<a href=\"").append(method).append(
						pageCount - 1).append(")\">").append(pageCount - 1)
						.append("</a>\r\n");
			}
			if (end < pageCount) {
				sb.append("<a href=\"").append(method).append(
						pageCount).append(")\">").append(pageCount).append(
						"</a>\r\n");
			}

			if (pageNo == pageCount) {
				sb.append("<span class=\"disabled\">下一页").append("</span>");
			}else {
				sb.append("<a class=\"nextbtn\" href=\"").append(method).append(
						pageNo + 1).append(")\">下一页</a>\r\n");
			}
		}

		sb.append("</div>\r\n");
		sb.append("<script type=\"text/javascript\">");
		sb.append("_pagePara.pageSize="+pageInfo.getPageSize()+";");
		sb.append("_pagePara.recordCount="+pageInfo.getTotalCount()+";");
		sb.append("</script>");
		return sb.toString();

	}
	/**
	 * 和上边方法的区别是如果第一页出现定制页面，则要可以正常点击第一页
	 * */
	public static String customerPageStr (PageInfo pageInfo){

		Integer pageNo = pageInfo.getPageNo();
		Integer pageSize = pageInfo.getPageSize();
		Integer recordCount = pageInfo.getTotalCount();
		String method = "openPage";

		method = "javascript:" + method + "(";

		pageSize = pageSize == 0 ? pageSize = 20 : pageSize;

		int pageCount = (recordCount + pageSize - 1) / pageSize;

		StringBuilder sb = new StringBuilder();

		sb.append("<div class=\"pagelist\">\r\n");
		if (recordCount == 0) {
			sb.append("<strong>没有可显示的项目</strong>\r\n");
		} else {
			if (pageNo > pageCount)
				pageNo = pageCount;
			if (pageNo < 1) {
				pageNo = 1;
			}
			if (pageNo == 1){
				sb.append("<span class=\"disabled\">").append("上一页").append("</span>");
			}else{
				sb.append("<a class=\"prebtn\" href=\"").append(method).append(
						pageNo - 1).append(")\">上一页</a>\r\n");
			}

			int start = 1;
			if (pageNo > 4) {
				start = pageNo - 1;
				sb.append("<a href=\"").append(method).append("1)\">1</a>\r\n");
				sb.append("<a href=\"").append(method).append("2)\">2</a>\r\n");
				sb.append("&hellip;\r\n");
			}

			int end = pageNo + 1;
			if (end > pageCount) {
				end = pageCount;
			}
			for (int i = start; i <= end; ++i) {
					sb.append("<a href=\"").append(method).append(i)
							.append(")\">").append(i).append("</a>\r\n");
			}

			if (end < pageCount - 2) {
				sb.append("&hellip;\r\n");
			}
			if (end < pageCount - 1) {
				sb.append("<a href=\"").append(method).append(
						pageCount - 1).append(")\">").append(pageCount - 1)
						.append("</a>\r\n");
			}
			if (end < pageCount) {
				sb.append("<a href=\"").append(method).append(
						pageCount).append(")\">").append(pageCount).append(
						"</a>\r\n");
			}

			if (pageNo == pageCount) {
				sb.append("<span class=\"disabled\">下一页").append("</span>");
			}else {
				sb.append("<a class=\"nextbtn\" href=\"").append(method).append(
						pageNo + 1).append(")\">下一页</a>\r\n");
			}
		}

		sb.append("</div>\r\n");
		sb.append("<script type=\"text/javascript\">");
		sb.append("_pagePara.pageSize="+pageInfo.getPageSize()+";");
		sb.append("_pagePara.recordCount="+pageInfo.getTotalCount()+";");
		sb.append("</script>");
		return sb.toString();

	}
}
