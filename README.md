# queen platgform

## Running
Passos para testar localmente

1. Levantar MySQL:
```shell
   docker-compose up -d
```
2. Buildar projeto:
```shell
   mvn clean package
```
3. Rodar projeto:
```shell
   mvn spring-boot:run
```
*Ou via Run Configuration do IntelliJ*

# TODOs

- TODO: Implementar Programação Orientada a Aspectos com AOP
@Aspect | @Component | @Before | @After | @Around | @Pointcut
- TODO: Implementar @Transactional
- TODO: Implementar AOP para métodos (com custom annotation)
- TODO: Implementar RabbitMQ

