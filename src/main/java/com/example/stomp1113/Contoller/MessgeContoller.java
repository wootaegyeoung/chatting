package com.example.stomp1113.Contoller;

import com.example.stomp1113.DTO.Greeting;
import com.example.stomp1113.DTO.HelloMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

@Controller
public class MessgeContoller {

    @SendTo("/topic/greeting")
    @MessageMapping("hello")
    public Greeting greeting(HelloMessage message) throws Exception{
        Thread.sleep(1000);
        return new Greeting("Hello" + HtmlUtils.htmlEscape(message.getName()));
    }
}
