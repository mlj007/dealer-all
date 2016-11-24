package com.chexun.dealer.utils.common;

public class PhotoUrl {
	/**
	 * 后台上传图片域名
	 */
	//public static final String 	PHOTO_URL = "http://photo.jumastation.com/images";
	//线上使用
	public static final String 	PHOTO_URL_0 = "http://i0.chexun.net/images";
	public static final String 	PHOTO_URL_1 = "http://i2.chexun.net/images";
	public static final String 	PHOTO_URL_2 = "http://i2.chexun.net/images";
	public static final String 	PHOTO_URL_3 = "http://i3.chexun.net/images";
	public static final String 	PHOTO_URL_4 = "http://i0.chexun.net/images";
	public static final String 	PHOTO_URL_5 = "http://i1.chexun.net/images";
	public static final String 	PHOTO_URL_6 = "http://i2.chexun.net/images";
	public static final String 	PHOTO_URL_7 = "http://i3.chexun.net/images";
	public static final String 	PHOTO_URL_8 = "http://i0.chexun.net/images";
	public static final String 	PHOTO_URL_9 = "http://i1.chexun.net/images";
	public static final String 	PHOTO_URL_10 = "http://i2.chexun.net/images";
	
	
	public static String getUrl(int intUrl){
		String url ="";
		switch(intUrl) 
		{ 
		   case 0: 
			   url =  PhotoUrl.PHOTO_URL_0;
		       break; 
		   case 1: 
			   url =  PhotoUrl.PHOTO_URL_1; 
		       break; 
		   case 2: 
			   url =  PhotoUrl.PHOTO_URL_2; 
			   break; 
		   case 3: 
			   url =  PhotoUrl.PHOTO_URL_3;  
		       break; 
		   case 4: 
			   url =  PhotoUrl.PHOTO_URL_4;  
			   break; 
		   case 5: 
			   url =  PhotoUrl.PHOTO_URL_5;  
			   break; 
		   case 6: 
			   url =  PhotoUrl.PHOTO_URL_6;  
			   break; 
		   case 7: 
			   url =  PhotoUrl.PHOTO_URL_7;  
			   break; 
		   case 8: 
			   url =  PhotoUrl.PHOTO_URL_8;  
			   break; 
		   case 9: 
			   url =  PhotoUrl.PHOTO_URL_9;  
			   break; 
		   case 10: 
			   url =  PhotoUrl.PHOTO_URL_10;  
			   break; 
		} 
		return url;
	}
}
