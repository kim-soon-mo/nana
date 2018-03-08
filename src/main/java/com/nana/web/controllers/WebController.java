package com.nana.web.controllers;

import lombok.AllArgsConstructor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by wmp-2013112501 on 2018. 3. 8..
 */
@Controller
@AllArgsConstructor
public class WebController {
    private static Logger logger = LogManager.getLogger(WebRestController.class);

    @GetMapping("/main")
    public String main(){
        logger.info("################################### MAIN TEST ###########################################");
        return "main";
    }
}
