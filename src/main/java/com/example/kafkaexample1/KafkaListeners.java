package com.example.kafkaexample1;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import java.util.Calendar;

@Component
public class KafkaListeners {

    @KafkaListener(topics = "main", groupId = "1")
    void listener(String data) {
        System.out.println("Listener received: " + data);
    }

    @KafkaListener(topics = "main", groupId = "2")
    void anotherListener(String data) {
        System.out.println("Listener2 received: " + data);
    }

    @KafkaListener(topics = "orders", groupId = "3")
    void JsListener(String data) {
        System.out.println("Consumed message: " + data);
    }
}
