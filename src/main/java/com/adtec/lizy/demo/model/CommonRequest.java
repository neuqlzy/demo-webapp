package com.adtec.lizy.demo.model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "xml")
public class CommonRequest<T> {
    // 流水号
    private String seqNo;
    // 机构编码
    private String brchNo;
    // 请求报文体
    private T body;

    public String getSeqNo() {
        return seqNo;
    }

    public void setSeqNo(String seqNo) {
        this.seqNo = seqNo;
    }

    public String getBrchNo() {
        return brchNo;
    }

    public void setBrchNo(String brchNo) {
        this.brchNo = brchNo;
    }

    public T getBody() {
        return body;
    }

    public void setBody(T body) {
        this.body = body;
    }
}
