package com.jayasurya.producer.service;

import com.jayasurya.producer.model.Order;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderProducer {

    private static final Logger log = LoggerFactory.getLogger(OrderProducer.class);

    private final KafkaTemplate<String, Order> kafkaTemplate;

    @Value("${app.kafka.topic}")
    private String topic;

    public void publish(Order order) {
        kafkaTemplate.send(topic, order);
        log.info("Order published: {}", order);
    }
}
