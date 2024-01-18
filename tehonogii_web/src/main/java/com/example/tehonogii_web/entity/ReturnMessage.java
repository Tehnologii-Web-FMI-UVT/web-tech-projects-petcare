package com.example.tehonogii_web.entity;

public class ReturnMessage {
    private String data;
    public ReturnMessage(String data){
        this.data=data;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
