package com.example.kafkaexample1.dto;

import java.util.Calendar;
import java.util.Date;

public class Order {

    private Long Id;
    private Calendar calendar;
    private String description;

    public Order() {
        Id = 1L;
        calendar = Calendar.getInstance();
        description = "Order placed!";
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public Calendar getCalendar() {
        return calendar;
    }

    public void setCalendar(Calendar calendar) {
        this.calendar = calendar;
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
                ", calendar=" + calendar.getTime() +
                ", description='" + description + '\'' +
                '}';
    }
}
