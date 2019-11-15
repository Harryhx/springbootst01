package com.harryst.util;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by harryhx on 2019/11/14.
 */
public final class LoggerUtils {
    public static final String LOGGER_RETURN = "_logger_return";
    private LoggerUtils(){};

    /**
     * 获取客户端ip的地址
     * @param request
     * @return
     */
    public static String getClientIp(HttpServletRequest request) throws Exception{
        request.setCharacterEncoding("UTF-8");
        String ip = request.getHeader("x-forwarded-for");
        if(ip == null || ip.trim() == "" || "unknown".equalsIgnoreCase(ip)){
            ip = request.getHeader("Proxy-Client-IP");
        }
        if(ip == null || ip.trim() == "" || "unknown".equalsIgnoreCase(ip)){
            ip = request.getHeader("WL-Proxy-Client-IP");
        }
        if(ip == null || ip.trim() == "" || "unknown".equalsIgnoreCase(ip) ){
            ip = request.getRemoteAddr();
        }
        //多个路由时，取第一个非unknown的ip
        final String[] arr = ip.split(",");
        for(final String str : arr){
            if(!"unknown".equalsIgnoreCase(str)){
                ip = str;
                break;
            }
        }
        return ip;
    }
    public static String getRequestType(HttpServletRequest request){
        return request.getHeader("X-Requested-With");
    }

}
