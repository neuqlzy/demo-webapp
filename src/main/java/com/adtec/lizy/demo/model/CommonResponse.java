package com.adtec.lizy.demo.model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "xml")
public class CommonResponse<T> {
    // 响应码
    private String rspCd;
    // 响应描述
    private String rspDesc;
    // 响应报文体
    private T body;

    public String getRspCd() {
        return rspCd;
    }

    public void setRspCd(String rspCd) {
        this.rspCd = rspCd;
    }

    public String getRspDesc() {
        return rspDesc;
    }

    public void setRspDesc(String rspDesc) {
        this.rspDesc = rspDesc;
    }

    public T getBody() {
        return body;
    }

    public void setBody(T body) {
        this.body = body;
    }
}
