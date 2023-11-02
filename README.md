# Projeto de Upload e Download de Arquivos com Spring Boot

Este projeto é uma demonstração de um sistema de upload e download de arquivos desenvolvido em Spring Boot 3.0.6 e utilizando Java 17. O objetivo é ilustrar como configurar e utilizar o Spring Boot para gerenciar operações de upload e download de arquivos em uma aplicação web.

## Tecnologias Utilizadas
- Spring Boot 3.0.6
- Java 17
- API REST Full com JpaRepository
- ImageUtils (compressImage e decompressImage)
- Utilização de HashMap e Spring Exception Handler (em andamento)

## Instruções de Configuração

Para configurar o ambiente de desenvolvimento local, certifique-se de ter as seguintes configurações:
- Java 17 instalado
- Maven instalado
- Um ambiente de desenvolvimento integrado (IDE) de sua escolha

## Instruções de Instalação

Para instalar as dependências do projeto, execute o seguinte comando:

```bash
mvn clean install
```

## Como Executar o Projeto

Siga estas etapas para executar a aplicação:

1. **Configure o arquivo `application.yml`** com as informações de conexão com o banco de dados.

2. Execute o seguinte comando para iniciar a aplicação:

```bash
mvn spring-boot:run
```

## Configuração do Banco de Dados
A configuração do banco de dados é feita no arquivo `application.yml`. Este arquivo define as propriedades de conexão com o MySQL, incluindo o URL, nome de usuário e senha para acesso ao banco de dados.

```yml
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.datasource.url=jdbc:mysql://localhost:3306/db-upload-and-download-file
spring.datasource.username=root
spring.datasource.password=Teste@123
spring.jpa.show-sql=true
spring.jpa.hibernate.ddl-auto=update
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL5Dialect
server.port=8090
```

## Uso do Projeto

O projeto permite realizar operações de upload e download de arquivos. Para testar essas funcionalidades, um arquivo de coleção do Postman está disponível na pasta `collection`. O arquivo `basic-auth-spring-with-mysql.postman_collection.json` contém solicitações de exemplo para interagir com o sistema.

- **upload-file**: Use esta solicitação para fazer upload de um arquivo. Ela requer a seleção de um arquivo de imagem.

- **download-file**: Esta solicitação permite o download de um arquivo com base no nome do arquivo fornecido.

## Classe de Utilidade para Compressão e Descompressão de Imagens

O projeto inclui uma classe de utilidade chamada `ImageUtils` que permite comprimir e descomprimir imagens. Isso é útil para economizar espaço de armazenamento e melhorar a eficiência de transferência de imagens.

## Estrutura do Projeto

O projeto segue uma estrutura organizada com pastas para entidades, serviços, controladores, configurações e segurança.

## Autores e Contato

Este projeto foi desenvolvido por Rayana Ribeiro Bonfanti. Para obter mais informações, entre em contato pelo e-mail [rayanabonfanti@gmail.com].

## Status do Projeto

Versão atual: 0.0.1-SNAPSHOT

## Contribuições

Este projeto está aberto a contribuições. Se você deseja adicionar recursos adicionais, corrigir bugs ou aprimorar a segurança, fique à vontade para abrir um pull request. Sua contribuição é bem-vinda!

Agradecemos a todos que contribuíram e nos inspiraram a criar este projeto. Esperamos que ele seja útil para entender as operações de upload e download de arquivos em uma aplicação Spring Boot.
