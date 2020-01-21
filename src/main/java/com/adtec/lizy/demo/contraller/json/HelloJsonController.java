package com.adtec.lizy.demo.contraller.json;

import com.adtec.lizy.demo.model.CommonRequest;
import com.adtec.lizy.demo.model.CommonResponse;
import com.adtec.lizy.demo.model.HelloJsonRequest;
import com.adtec.lizy.demo.model.HelloJsonResponse;
import com.alibaba.fastjson.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/json",
        produces = "application/json;charset=UTF-8",
        consumes = "application/json;charset=UTF-8")
public class HelloJsonController {
    private static Logger log = LoggerFactory.getLogger(HelloJsonController.class);

    @PostMapping("/helloJson")
    public HelloJsonResponse helloJson(@RequestBody HelloJsonRequest request) {
        HelloJsonResponse response = new HelloJsonResponse();
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
