package com.example.kafkaexample1.dto;

import java.util.Calendar;

public class Order {

    private static Long idGenerator = 99L;
    private Long Id;
    private Calendar timestamp;
    private String description;

    public Order() {
        Id = ++idGenerator;
        timestamp = Calendar.getInstance();
        description = "Order placed!";
    }

    public Order(String description) {
        Id = 2L;
        timestamp = Calendar.getInstance();
        this.description = description;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public Calendar getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Calendar timestamp) {
        this.timestamp = timestamp;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Order{" +
                "Id= " + Id +
                ", timestamp=" + timestamp.getTime() +
                ", description='" + description + '\'' +
                '}';
    }
}
