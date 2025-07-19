package com.hendo.ws.EmailNotification.listener;

import com.ws.core.event.ProductCreatedEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaHandler;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@KafkaListener(topics = "${spring.kafka.topic.product-created-events}")
@Slf4j
public class ProductCreatedEventListener {

    @KafkaHandler
    public void handle(ProductCreatedEvent productCreatedEvent) {
        log.info("received an event {} ", productCreatedEvent.getTitle());
    }
}
