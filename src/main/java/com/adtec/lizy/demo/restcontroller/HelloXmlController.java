package com.adtec.lizy.demo.restcontroller;

import com.adtec.lizy.demo.model.HelloJsonRequest;
import com.adtec.lizy.demo.model.HelloJsonResponse;
import com.adtec.lizy.demo.model.HelloXmlRequest;
import com.adtec.lizy.demo.model.HelloXmlResponse;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloXmlController {

    @RequestMapping(value = "/helloXml", method = RequestMethod.POST,
            produces = MediaType.APPLICATION_XML_VALUE)
    public HelloXmlResponse helloXml(@RequestBody HelloXmlRequest request) {
        HelloXmlResponse response = new HelloXmlResponse();
        response.setAuthor("李泽阳");
        response.setUrl("http://www.lizeyang.com");
        return response;
    }
}
