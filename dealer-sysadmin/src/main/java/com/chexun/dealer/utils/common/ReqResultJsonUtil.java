package com.chexun.dealer.utils.common;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Administrator on 2015/8/24.
 */
public class ReqResultJsonUtil {
    static Log log = LogFactory.getLog(ReqResultJsonUtil.class);

    public static void writeResponse(HttpServletResponse response,String callback,String content){
        response.setHeader("Content-Type", "text/json");
        response.setHeader("Pragma", "no-cache");
        response.addHeader("Cache-Control", "must-revalidate");
        response.addHeader("Cache-Control", "no-cache");
        response.addHeader("Cache-Control", "no-store");
        response.setDateHeader("Expires", 0);
        PrintWriter out;
        try {
            out = response.getWriter();
            if(callback != null){
                out.print(callback+"({\"content\":\""+content+"\"})");
            }else{
                out.print(content);
            }
            out.flush();
            out.close();
        } catch (IOException e) {
            log.error(e);
        }
    }
}
