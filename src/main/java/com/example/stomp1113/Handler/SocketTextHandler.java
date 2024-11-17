package com.example.stomp1113.Handler;

import com.google.gson.Gson;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import com.example.stomp1113.DTO.UserMessage;

public class SocketTextHandler extends TextWebSocketHandler {
    private final Set<WebSocketSession> sessions= ConcurrentHashMap.newKeySet();

    @Override
    public void afterConnectionEstablished(WebSocketSession session) throws Exception{
        sessions.add(session);
    }

    @Override
    protected void handleTextMessage(WebSocketSession session, TextMessage textMessage) throws Exception {
        String payload = textMessage.getPayload();
        Gson gson = new Gson();
        UserMessage userMessage = gson.fromJson(payload, UserMessage.class); // JSON을 DTO로 변환

        for (WebSocketSession s : sessions) {
            s.sendMessage(new TextMessage("Hi " + userMessage.getUser() + "!"));
        }
    }
    @Override
    public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws Exception{
        sessions.remove(session);
    }


}
