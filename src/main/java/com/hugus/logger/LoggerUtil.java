package com.hugus.logger;

//import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;

import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggerUtil {

//    private static Logger logger = LoggerFactory.getLogger(LoggerUtil.class);
    private static final Logger myLog = Logger.getLogger("com.hugus.logger.LoggerUtil");


    public static void main(String[] args) {
        myLog.setLevel(Level.ALL);
        Logger.getGlobal().info("Hello every body");
        myLog.info("这种日志使用场景太少太少了,还是要学习日志框架的使用 - log4j & self4j等");

        myLog.info("Hello girls..");

        boolean result = testLogger("Ok","Debug");
        myLog.info("result:"+result);

    }

    public static boolean testLogger(String name,String level){
        myLog.setLevel(Level.ALL);
        myLog.entering("com.hugus.logger.LoggerUtil","testLogger",new Object[] {name,level});
        boolean result = false;
        if("ok".equalsIgnoreCase(name)){
            result = true;
        }
        myLog.exiting("com.hugus.logger.LoggerUtil","testLogger",result);
        return result;
    }

}
