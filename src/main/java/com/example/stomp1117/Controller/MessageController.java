package com.example.stomp1117.Controller;

import com.example.stomp1117.DTO.Message;
import com.example.stomp1117.Service.ChatService;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.SimpMessageSendingOperations;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MessageController {

    private final SimpMessageSendingOperations messageTemplate;

    private final ChatService chatService;

    public MessageController(SimpMessageSendingOperations simpMessageSendingOperations, ChatService chatService){
        this.messageTemplate=simpMessageSendingOperations;
        this.chatService=chatService;
    }

    @MessageMapping("/chat/message")
    public void sendMessage(Message message) {
        System.out.println("Received message: " + message.getContent()); // 추가된 로그
        chatService.saveMessage(message);
        messageTemplate.convertAndSend("/sub/chat/" + message.getChannelId(), message);
    }

    @GetMapping("/api/chat/messages")
    public List<Message> getMessages() {
        System.out.println("Messges Setting");
        return chatService.getMessages();
    }
}
