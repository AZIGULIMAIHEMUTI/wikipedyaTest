package com.wikipedya;

import org.apache.log4j.Logger;

public class Log4j {

    private static final Logger log = Logger.getLogger(Log4j.class);

    public static void info(String message) {
        log.info("\033[42;30;4m" + message + "\033[0m");
    }

    public static void error(String message) {
        log.error("\033[41;30;4m" + message + "\033[0m");
    }
}

