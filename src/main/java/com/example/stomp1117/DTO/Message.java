package com.example.stomp1117.DTO;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;


public class Message {
    private String channelId;
    private String sender;
    private String content;
    private String timestamp;

    public Message() {
        this.timestamp = LocalDateTime.now().toString(); // 생성 시 현재 시간 설정
    }

    public String getChannelId() {
        return channelId;
    }

    public String getSender() {
        return sender;
    }

    public String getContent() {
        return content;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }
}
