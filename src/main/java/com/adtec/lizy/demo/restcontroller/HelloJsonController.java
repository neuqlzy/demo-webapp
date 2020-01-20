package com.adtec.lizy.demo.restcontroller;

import com.adtec.lizy.demo.model.HelloJsonRequest;
import com.adtec.lizy.demo.model.HelloJsonResponse;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloJsonController {

    @RequestMapping(value = "/helloJson", method = RequestMethod.POST,
            produces = "application/json;charset=UTF-8")
    public HelloJsonResponse helloJson(@RequestBody HelloJsonRequest request) {
        HelloJsonResponse response = new HelloJsonResponse();
        response.setAuthor("李泽阳");
        response.setUrl("http://www.lizeyang.com");
        return response;
    }
}
