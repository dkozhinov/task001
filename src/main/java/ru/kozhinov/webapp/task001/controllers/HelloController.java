package ru.kozhinov.webapp.task001.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Dmitry Kozhinov d.kozhinov@mail.ru
 * Created on 17.06.2019
 */

@Controller
public class HelloController {

    @RequestMapping("/")
    @ResponseBody
    String hello() {
        return "Hello World!";
    }
}