package com.chexun.dealer.utils.common;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class LocalFile {
	public static void writeToFile(String text, String filename, String encode) {
		try {
			byte[] buf = text.getBytes(encode);
			FileOutputStream fos = new FileOutputStream(filename);
			fos.write(buf);
			fos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static String readFromFile(String filename, String encode) {
		try {
			FileInputStream fis = new FileInputStream(filename);
			byte[] buf = new byte[fis.available()];
			fis.read(buf);
			fis.close();
			return new String(buf, encode);
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
		return "";
	}
}
