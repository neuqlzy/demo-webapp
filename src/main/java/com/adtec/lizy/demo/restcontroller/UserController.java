package com.adtec.lizy.demo.restcontroller;

import com.adtec.lizy.demo.model.HelloJsonRequest;
import com.adtec.lizy.demo.model.HelloJsonResponse;
import com.adtec.lizy.demo.model.HelloXmlRequest;
import com.adtec.lizy.demo.model.HelloXmlResponse;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @RequestMapping(value = "/helloJson", method = RequestMethod.POST, consumes = "application/json")
    public HelloJsonResponse helloJson(@RequestBody HelloJsonRequest request) {
        HelloJsonResponse response = new HelloJsonResponse();
        response.setAuthor("李泽阳");
        response.setUrl("http://www.lizeyang.com");
        return response;
    }

    @RequestMapping(value = "/helloXml", method = RequestMethod.POST, consumes = "application/xml")
    public HelloXmlResponse helloXml(@RequestBody HelloXmlRequest request) {
        HelloXmlResponse response = new HelloXmlResponse();
        response.setAuthor("李泽阳");
        response.setUrl("http://www.lizeyang.com");
        return response;
    }
}
