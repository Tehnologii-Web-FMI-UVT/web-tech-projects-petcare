package com.example.tehonogii_web.entity;

import java.util.List;

public class JsonFormat {
    List<Object> data;

    public JsonFormat(List<Object> data) {
        this.data = data;
    }
    public JsonFormat(){}

    public List<Object> getData() {
        return data;
    }

    public void setData(List<Object> data) {
        this.data = data;
    }
}
