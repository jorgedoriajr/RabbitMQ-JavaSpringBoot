![image](https://github.com/jorgedoriajr/RabbitMQ-JavaSpringBoot/assets/44978303/bf60b35a-be87-442d-9adb-9cf05311ae5e)

**PASSO 1:**

Adicione o RabbitMQ no Docker com o **docker-compose.yml** abaixo:


**PASSO 2:**


Adicione as variáveis de ambiante no **IntelliJ:**

No projeto: **PRODUCER-SERVICE-API**
-DServer.port=8081

No projeto: **CONSUMER-SERVICE-API**
-DServer.port=8080
-Dspring.amqp.deserialization.trust.all=true
