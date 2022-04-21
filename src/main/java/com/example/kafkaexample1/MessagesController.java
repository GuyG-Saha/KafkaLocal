package com.example.kafkaexample1;

import com.example.kafkaexample1.dto.MessageRequest;
import com.example.kafkaexample1.dto.Order;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/publish")
public class MessagesController {
    private KafkaTemplate<String, String> kafkaTemplate;
    private KafkaTemplate<String, Order> kafkaTemplateJs;

    public MessagesController(KafkaTemplate<String, String> kafkaTemplate,
                              KafkaTemplate<String, Order> kafkaTemplateJs) {
        this.kafkaTemplate = kafkaTemplate;
        this.kafkaTemplateJs = kafkaTemplateJs;
    }

    @PostMapping("/")
    public void publishMessage(@RequestBody MessageRequest request) {
        kafkaTemplate.send("main", request.getMessage());
    }
    @PostMapping("/order")
    public void publishOrder(@RequestBody Order order) {
        kafkaTemplateJs.send("orders", order);
    }

}
