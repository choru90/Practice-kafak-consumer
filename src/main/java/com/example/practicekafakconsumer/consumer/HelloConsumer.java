package com.example.practicekafakconsumer.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class HelloConsumer {

    @KafkaListener(
            topics = "${kafka.hello.topic}",
            groupId = "${spring.kafka.consumer.group-id}"
    )
    public void listen(@Payload String message){
        log.info(">>>> kafka message consume = {}", message);
    }
}
