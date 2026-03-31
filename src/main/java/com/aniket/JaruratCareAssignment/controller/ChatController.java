package com.aniket.JaruratCareAssignment.controller;

import com.aniket.JaruratCareAssignment.service.ChatService;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/webhook")
public class ChatController {

    private final ChatService chatService;

    // Constructor Injection
    public ChatController(ChatService chatService) {
        this.chatService = chatService;
    }

    @PostMapping
    public Map<String, String> receiveMessage(@RequestBody Map<String, String> request) {

        String message = request.get("message");

        System.out.println("Received message: " + message);

        String reply = chatService.getReply(message);

        Map<String, String> response = new HashMap<>();
        response.put("reply", reply);

        return response;
    }
}