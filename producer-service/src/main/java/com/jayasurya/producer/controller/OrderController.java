package com.jayasurya.producer.controller;

import com.jayasurya.producer.model.Order;
import com.jayasurya.producer.service.OrderProducer;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
@RequiredArgsConstructor
public class OrderController {

    private final OrderProducer producer;

    @PostMapping
    public ResponseEntity<String> sendOrder(@Valid @RequestBody Order order) {
        producer.publish(order);
        return ResponseEntity.ok("Order Published Successfully");
    }
}
