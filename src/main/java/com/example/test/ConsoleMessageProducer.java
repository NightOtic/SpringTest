package com.example.test;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Scanner;

@Component
class ConsoleMessageProducer implements MessageProducer {
    @Override
    public String getMessage() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text to print: ");
        return scanner.nextLine();
    }
}