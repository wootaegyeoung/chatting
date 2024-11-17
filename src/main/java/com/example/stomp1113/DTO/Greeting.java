package com.example.stomp1113.DTO;


import com.fasterxml.jackson.annotation.JsonSetter;

public class Greeting {
    private String content;

    public Greeting() {}

    public Greeting(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}

