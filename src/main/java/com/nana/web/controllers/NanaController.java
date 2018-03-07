package com.nana.web.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wmp-2013112501 on 2018. 3. 7..
 */

@RestController
public class NanaController {

    @GetMapping("/hello")
    public String hello(){return "[ Love Nana ♥︎ ]" ;}

}
