package com.jy.controller.index;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping("say")
    String sayHello(String name) {
        System.out.println("你好：" + name);
        return "list";
    }
}
