package com.adtec.lizy.demo.contraller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
    private Logger log = LoggerFactory.getLogger(LoginController.class);

    @RequestMapping("/login")
    public String login() {
        log.info("LoginController.login(), ==> login.jsp ??");
        return "login";
    }
}
