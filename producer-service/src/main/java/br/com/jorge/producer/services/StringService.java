package br.com.jorge.producer.services;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

import static org.rabbitmq.constants.RabbitMQConstants.EXG_NAME_MARKETPLACE;
import static org.rabbitmq.constants.RabbitMQConstants.RK_PRODUCT_LOG;

@Log4j2
@Service
@RequiredArgsConstructor
public class StringService {

    private final RabbitTemplate rabbitTemplate;

    public void produce(String message) {
        log.info("Sending a message " + message);
        rabbitTemplate.convertAndSend(EXG_NAME_MARKETPLACE, RK_PRODUCT_LOG, message);
    }
}