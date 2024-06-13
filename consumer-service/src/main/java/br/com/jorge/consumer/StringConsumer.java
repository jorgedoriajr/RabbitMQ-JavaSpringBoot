/*
package br.com.jorge.consumer;

import lombok.extern.log4j.Log4j2;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import static org.rabbitmq.constants.RabbitMQConstants.RK_PRODUCT_LOG;

@Log4j2
@Component
public class StringConsumer {

    @RabbitListener(queues = {RK_PRODUCT_LOG})
    public void consumerLog(String message) {
        log.info("Consumer received a message {}", message);
    }

}*/