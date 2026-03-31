package com.aniket.JaruratCareAssignment.service;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class ChatService {

    private final Map<String, String> replies = new HashMap<>();

    // Constructor to initialize replies
    public ChatService() {
        replies.put("hi", "Hello");
        replies.put("bye", "Goodbye");
        replies.put("myself aniket", "Hello Aniket, How are you?");
    }

    public String getReply(String message) {
        if (message == null) return "Invalid message";

        message = message.toLowerCase();

        return replies.getOrDefault(message, "I don't understand");
    }
}