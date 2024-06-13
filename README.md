Adicione as variáveis de ambiante no IntelliJ:

No projeto: PRODUCER-SERVICE-API
-DServer.port=8081

No projeto: CONSUMER-SERVICE-API:
-DServer.port=8080
-Dspring.amqp.deserialization.trust.all=true
