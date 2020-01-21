package com.adtec.lizy.demo.contraller.xml;

import com.adtec.lizy.demo.model.*;
import com.alibaba.fastjson.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/xml",
        produces = "application/xml;charset=UTF-8",
        consumes = "application/xml;charset=UTF-8")
public class HelloXmlController {
    private static Logger log = LoggerFactory.getLogger(HelloXmlController.class);

    @PostMapping("/helloXml")
    public HelloXmlResponse helloXml(@RequestBody HelloXmlRequest request) {
        HelloXmlResponse response = new HelloXmlResponse();
        response.setAuthor("李泽阳");
        response.setUrl("http://www.lizeyang.com");
        return response;
    }

    @PostMapping("/hello")
    public CommonResponse<HelloJsonResponse> hello(@RequestBody CommonRequest<HelloJsonRequest> request) {
        log.info(JSONObject.toJSONString(request));
        CommonResponse<HelloJsonResponse> commonResponse = new CommonResponse<>();
        HelloJsonResponse response = new HelloJsonResponse();
        response.setAuthor("李泽阳");
        response.setUrl("http://www.lizeyang.com");
        commonResponse.setRspCd("000000");
        commonResponse.setRspDesc("交易成功");
        commonResponse.setBody(response);
        return commonResponse;
    }
}
