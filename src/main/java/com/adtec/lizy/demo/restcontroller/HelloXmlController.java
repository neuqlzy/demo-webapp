package com.adtec.lizy.demo.restcontroller;

import com.adtec.lizy.demo.model.HelloXmlRequest;
import com.adtec.lizy.demo.model.HelloXmlResponse;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloXmlController {

    @RequestMapping(value = "/helloXml", method = RequestMethod.POST,
            produces = "application/xml;charset=UTF-8")
    public HelloXmlResponse helloXml(@RequestBody HelloXmlRequest request) {
        HelloXmlResponse response = new HelloXmlResponse();
        response.setAuthor("李泽阳");
        response.setUrl("http://www.lizeyang.com");
        return response;
    }
}
