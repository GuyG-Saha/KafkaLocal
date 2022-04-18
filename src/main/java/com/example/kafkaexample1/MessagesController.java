package com.example.kafkaexample1;

import com.example.kafkaexample1.dto.MessageRequest;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/publish")
public class MessagesController {
    private KafkaTemplate<String, String> kafkaTemplate;

    public MessagesController(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @PostMapping("/")
    public void publishMessage(@RequestBody MessageRequest request) {
        kafkaTemplate.send("main", request.getMessage());
    }

}
