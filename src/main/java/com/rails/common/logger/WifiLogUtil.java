package com.rails.common.logger;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.apache.log4j.Logger;

/**
 * Class Name: WifiLogUtil.java Function: 处理日志 * Modifications: * @author
 * huangww DateTime 2015-1-7 下午7:45:19
 * 
 * @version 1.0 *
 */

public class WifiLogUtil {
    private static Logger logger = Logger.getLogger(WifiLogUtil.class);
    private static final String LS = "|";
    private static final String CS = ",";
    private static Logger wifiLog = Logger.getLogger("wifiLog");

    /**
     * 
     * Function: 记录info信息
     * 
     * @author huangww DateTime 2015-1-8 下午9:37:54
     * @param key
     * @param values
     */
    public static void writeLogInfo(String key, Object... values) {
	StringBuilder sb = new StringBuilder();
	SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
	String curTime = dateFormat.format(Calendar.getInstance().getTime());
	sb.append(curTime).append(CS);
	sb.append(key).append(CS);
	for (int i = 0; i < values.length; i++) {
	    sb.append(values[i]);
	    if (i != values.length - 1) {
		sb.append(CS);
	    }
	}
	sb.append(LS);
	logger.info(sb.toString());
    }

    private static void writeLogInfo(Logger logger, String key,
	    Object... values) {
	StringBuilder sb = new StringBuilder();
	SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
	String curTime = dateFormat.format(Calendar.getInstance().getTime());
	sb.append(curTime).append(CS);
	sb.append(key).append(CS);
	for (int i = 0; i < values.length; i++) {
	    sb.append(values[i]);
	    if (i != values.length - 1) {
		sb.append(CS);
	    }
	}
	sb.append(LS);
	logger.info(sb.toString());
    }

    /**
     * 
     * Function: 记录error信息
     * 
     * @author huangww DateTime 2015-1-8 下午9:38:15
     * @param key
     * @param values
     */
    public static void writeLogError(String key, Object... values) {
	StringBuilder sb = new StringBuilder();
	SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
	String curTime = dateFormat.format(Calendar.getInstance().getTime());
	sb.append(curTime).append(CS);
	sb.append(key).append(CS);
	for (int i = 0; i < values.length; i++) {
	    sb.append(values[i]);
	    if (i != values.length - 1) {
		sb.append(CS);
	    }
	}
	sb.append(LS);
	logger.error(sb.toString());
    }

    private static void writeLogError(Logger logger, String key,
	    Object... values) {
	StringBuilder sb = new StringBuilder();
	SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
	String curTime = dateFormat.format(Calendar.getInstance().getTime());
	sb.append(curTime).append(CS);
	sb.append(key).append(CS);
	for (int i = 0; i < values.length; i++) {
	    sb.append(values[i]);
	    if (i != values.length - 1) {
		sb.append(CS);
	    }
	}
	sb.append(LS);
	logger.error(sb.toString());
    }

    /**
     * 
     * Function: 对外提供调用接口
     * 
     * @author huangww DateTime 2015-1-8 下午9:38:56
     * @param key
     * @param values
     */
    public static void wifiLogInfo(String key, Object... values) {
	writeLogInfo(wifiLog, "wifiLogInfo==>" + key, values);
    }

    /**
     * 
     * Function: 对外提供调用接口
     * 
     * @author huangww DateTime 2015-1-8 下午9:39:38
     * @param key
     * @param values
     */
    public static void wifiLogError(String key, Object... values) {
	writeLogError(wifiLog, "wifiLogError==>" + key, values);
    }

}
