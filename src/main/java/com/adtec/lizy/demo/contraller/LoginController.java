package com.adtec.lizy.demo.contraller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

    @RequestMapping("/login.do")
    public String login() {
        System.out.println("LoginController.login()");
        return "login";
    }
}
