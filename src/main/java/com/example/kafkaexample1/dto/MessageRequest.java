package com.example.kafkaexample1.dto;

public class MessageRequest {
    private String message;

    public MessageRequest() {
        this.message = "";
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
