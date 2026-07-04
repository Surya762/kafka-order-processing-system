package com.jayasurya.consumer.consumer;

import com.jayasurya.consumer.model.Order;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class OrderConsumer {

    private static final Logger log = LoggerFactory.getLogger(OrderConsumer.class);

    @Value("${app.kafka.topic}")
    private String topic;

    @KafkaListener(topics = "${app.kafka.topic}", groupId = "order-group")
    public void consume(Order order) {
        log.info("Order received from topic {}: {}", topic, order);
    }
}
