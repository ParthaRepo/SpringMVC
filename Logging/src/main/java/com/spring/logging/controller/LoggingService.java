package com.spring.logging.controller;


import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class LoggingService {

   public static final Logger LOGGER = Logger.getLogger(LoggingService.class);

    @RequestMapping("logging")
    public String logger(){
        LOGGER.info("Inside logger method ...");

        if(LOGGER.isTraceEnabled())
            LOGGER.error("inside logger method error ...");
        return "Success";

    }
}
