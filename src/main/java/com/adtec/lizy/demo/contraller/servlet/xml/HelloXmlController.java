package com.adtec.lizy.demo.contraller.servlet.xml;

import com.adtec.lizy.demo.model.HelloXmlRequest;
import com.adtec.lizy.demo.model.HelloXmlResponse;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/servlet/xml",
        produces = "application/xml;charset=UTF-8",
        consumes = "application/xml;charset=UTF-8")
public class HelloXmlController {

    @PostMapping("/helloXml")
    public HelloXmlResponse helloXml(@RequestBody HelloXmlRequest request) {
        HelloXmlResponse response = new HelloXmlResponse();
        response.setAuthor("李泽阳");
        response.setUrl("http://www.lizeyang.com");
        return response;
    }
}
