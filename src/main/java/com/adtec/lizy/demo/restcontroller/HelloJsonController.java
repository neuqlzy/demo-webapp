package com.adtec.lizy.demo.restcontroller;

import com.adtec.lizy.demo.model.HelloJsonRequest;
import com.adtec.lizy.demo.model.HelloJsonResponse;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloJsonController {

    @RequestMapping(value = "/helloJson", method = RequestMethod.POST,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public HelloJsonResponse helloJson(@RequestBody HelloJsonRequest request) {
        HelloJsonResponse response = new HelloJsonResponse();
        response.setAuthor("李泽阳");
        response.setUrl("http://www.lizeyang.com");
        return response;
    }
}
