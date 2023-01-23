package org.example;

import org.example.controller.ControllerMain;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;



public class Main {
    static Logger rootLogger = LogManager.getRootLogger();
    static Logger userLogger = LogManager.getLogger(ControllerMain.class);
    public static void main(String[] args) {
        userLogger.info("Программа запущена");
        ControllerMain c = new ControllerMain();
        c.run();
    }
}