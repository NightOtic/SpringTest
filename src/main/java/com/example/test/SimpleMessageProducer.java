package com.example.test;

import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class SimpleMessageProducer implements MessageProducer {
    public String getMessage() {
        return "Example message " + LocalDateTime.now();
    }
}