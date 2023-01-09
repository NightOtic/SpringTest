package com.example;

import com.example.test.MessageProducer;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class MessagePrinter {

    private final List<MessageProducer> messageProducers;

    public MessagePrinter(List<MessageProducer> messageProducers) {
        this.messageProducers = messageProducers;
    }

    public void printMessage() {
        for (MessageProducer messageProducer : messageProducers) {
            String message = messageProducer.getMessage();
            System.out.println(message + LocalDateTime.now());
        }
    }
}