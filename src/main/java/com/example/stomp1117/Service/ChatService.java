package com.example.stomp1117.Service;


import com.example.stomp1117.DTO.Message;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ChatService {
    private final List<Message> messages=new ArrayList<>();

    public void saveMessage(Message message){
//        message.setTimestamp(LocalDateTime.now().toString()); // 현재 시간 설정
        messages.add(message);
    }
    public List<Message> getMessages(){
        System.out.println(messages);
        return new ArrayList<>(messages);
    }


}