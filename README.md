# Microserviço de envio de email

Este é um microserviço para envio de emails, desenvolvido com Spring Boot, Java 17, e Maven. Ele utiliza o SMTP do Gmail para envio de mensagens e o banco de dados PostgreSQL 16 para persistência. A gestão do banco pode ser realizada pelo pgAdmin 4.

## Tecnologias Utilizadas

- **Java 17**
- **Spring Boot** (versão mais recente)
- **Maven**
- **PostgreSQL 16**
- **pgAdmin 4**
- **Lombok** (para reduzir boilerplate no código)
- **SMTP do Gmail** (para envio de emails)

---

## Configuração do Ambiente

### 1. Requisitos Pré-Instalação
Certifique-se de que os seguintes componentes estejam instalados:
- **Java 17**
- **Maven**
- **PostgreSQL 16**
- **pgAdmin 4**

### 2. Configuração do Banco de Dados
1. Instale o PostgreSQL e o pgAdmin 4.
2. Crie um banco de dados chamado `ms/email`.
3. Configure um usuário e senha no PostgreSQL (exemplo: `username=postgres`, `password=admin`).
4. Atualize as credenciais no arquivo `application.properties` do projeto.

### 3. Configuração do SMTP do Gmail
1. Ative o acesso de "Aplicativos menos seguros" na sua conta do Gmail.
2. Gere uma senha de aplicativo nas configurações de segurança do Gmail.
3. Atualize o arquivo `application.properties` com suas credenciais do Gmail:

```properties
spring.mail.host=smtp.gmail.com
spring.mail.port=587
spring.mail.username=seu_email@gmail.com
spring.mail.password=sua_senha_de_aplicativo //não é a sua senha do gmail, e sim uma senha criada no modo segurança do google.
spring.mail.properties.mail.smtp.auth=true
spring.mail.properties.mail.smtp.starttls.enable=true
```

---

## Instruções para Executar o Projeto

### 1. Clone o Repositório
```bash
git clone https://github.com/seu-repositorio/ms-email.git
cd ms-email
```

### 2. Compile o Projeto
```bash
mvn clean install
```

### 3. Execute o Serviço
```bash
mvn spring-boot:run
