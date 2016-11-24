/**
 * 创建日期: 2013-5-17
 * @author: 安李勇
 * @email: anlystar@gmail.com
 */
package com.chexun.common.utils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Properties;

import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;
import org.apache.velocity.app.VelocityEngine;

/**
 * @author 安李勇
 *
 */
public class VelocityHelper {

	public static String ENCODING_UTF_8 = "UTF-8";
	
	private static Log logger = LogFactory.getLog(VelocityHelper.class);
	
	public static boolean updateVelocity(String vmPath, String vmName, VelocityContext context, String filePath, String encoding) {

		boolean result = true;
		try {
			encoding = encoding == null || "".equals(encoding.trim()) ? ENCODING_UTF_8 : encoding;
			VelocityEngine ve = new VelocityEngine();
			Properties p = new Properties();
			p.setProperty(Velocity.FILE_RESOURCE_LOADER_PATH, vmPath);
			p.setProperty(Velocity.INPUT_ENCODING, encoding);
			p.setProperty(Velocity.OUTPUT_ENCODING, encoding);
			ve.init(p);
			Template template = ve.getTemplate(vmName, encoding);
			makeDirs(filePath);
			File dest = new File(filePath);
			FileOutputStream fos = new FileOutputStream(dest);
		    BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(fos, encoding)); //设置写入的文件编码,解决中文问题  
		    template.merge(context, writer);
		    writer.close();
		    fos.close();
		} catch (Exception e) {
			e.printStackTrace();
			result = false;
		}
		return result;
	}
	
	public static void mergeTemplate(HttpServletResponse response, String vmPath, String vmName, VelocityContext context, String fileName, String encoding) {
		try {
			encoding = encoding == null || "".equals(encoding.trim()) ? ENCODING_UTF_8 : encoding;
			VelocityEngine ve = new VelocityEngine();
			Properties p = new Properties();
			p.setProperty(Velocity.FILE_RESOURCE_LOADER_PATH, vmPath);
			p.setProperty(Velocity.INPUT_ENCODING, encoding);
			p.setProperty(Velocity.OUTPUT_ENCODING, encoding);
			ve.init(p);
			response.addHeader("Content-Type", "application/octet-stream;charset=UTF-8");
			response.addHeader("Content-Disposition", "attachment;filename=" + fileName);
			ve.mergeTemplate(vmName, context, response.getWriter());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static String generate(String vmPath, String vmName, VelocityContext context, String filePath, String encoding) {
		
		try {
			encoding = encoding == null || "".equals(encoding.trim()) ? ENCODING_UTF_8 : encoding;
			VelocityEngine ve = new VelocityEngine();
			Properties p = new Properties();
			p.setProperty(Velocity.FILE_RESOURCE_LOADER_PATH, vmPath);
			p.setProperty(Velocity.INPUT_ENCODING, encoding);
			p.setProperty(Velocity.OUTPUT_ENCODING, encoding);
			ve.init(p);
			Template template = ve.getTemplate(vmName, encoding);
		    Writer writer = new StringWriter();
		    template.merge(context, writer);
		    String result = writer.toString();
		    writer.close();
		    return result;
		} catch (Exception e) {
			logger.error(e.getMessage());
			return null;
		}
	}
	
	private static void makeDirs(String path) {
		try {
			path = path.replace("\\", "/");
			int i = path.lastIndexOf("/");
			path = path.substring(0, i);
			File file = new File(path);
			if (!file.exists()) {
				file.mkdirs();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
