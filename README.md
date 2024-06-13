**PASSO 1:**

Adicione o RabbitMQ no Docker com o **docker-compose.yml** abaixo:

version: "3.2"
services:
  rabbitmq:
    image: rabbitmq:3-management-alpine
    container_name: 'rabbitmq'
    ports:
        - 5672:5672
        - 15672:15672
    volumes:
        - ~/.docker-conf/rabbitmq/data/:/var/lib/rabbitmq/
        - ~/.docker-conf/rabbitmq/log/:/var/log/rabbitmq
    networks:
        - rabbitmq_curso

networks:
  rabbitmq_curso:
    driver: bridge


**PASSO 2:**


Adicione as variáveis de ambiante no IntelliJ:

No projeto: **PRODUCER-SERVICE-API**
-DServer.port=8081

No projeto: **CONSUMER-SERVICE-API**
-DServer.port=8080
-Dspring.amqp.deserialization.trust.all=true
