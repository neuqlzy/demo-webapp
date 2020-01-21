package com.adtec.lizy.demo.contraller.servlet.json;

import com.adtec.lizy.demo.model.HelloJsonRequest;
import com.adtec.lizy.demo.model.HelloJsonResponse;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/servlet/json",
        produces = "application/json;charset=UTF-8",
        consumes = "application/json;charset=UTF-8" )
public class HelloJsonController {

    @PostMapping("/helloJson")
    public HelloJsonResponse helloJson(@RequestBody HelloJsonRequest request) {
        HelloJsonResponse response = new HelloJsonResponse();
        response.setAuthor("李泽阳");
        response.setUrl("http://www.lizeyang.com");
        return response;
    }
}
