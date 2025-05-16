# 🚘 Sistema de Veículos

Este projeto tem como objetivo modelar e gerenciar um sistema de veículos, abrangendo desde automóveis até bicicletas e skates. A aplicação utiliza o Java e o framework JPA/Hibernate para persistir os dados em um banco de dados relacional.

## ⚒️Arquitetura
Java: Linguagem de programação principal.
JPA/Hibernate: Framework de persistência de objetos para interação com o banco de dados.
Banco de dados: SQL Server
IDE: Eclipse (ou outra IDE de sua preferência)

## 🤹Classes Principais

**Veiculo**: Classe base para todos os tipos de veículos, com atributos comuns como modelo, ano e montadora.

**Automovel**: Extende Veiculo e adiciona atributos específicos para automóveis, como número de passageiros, tipo de freio e airbag.

**Motocicleta**: Extende Veiculo e adiciona atributos específicos para motocicletas, como cilindrada e torque.

**Caminhao**: Extende Veiculo e adiciona atributos específicos para caminhões, como quantidade de eixos e peso bruto.

**Bicicleta**: Extende Veiculo e adiciona atributos específicos para bicicletas, como material, quantidade de marchas e amortecedor.

**Skate**: Extende Veiculo e adiciona atributos específicos para skates, como tipo de roda.

**Main**: Classe responsável por realizar as operações de persistência no banco de dados.


## 🔎Pré-requisitos

Java Development Kit (JDK): Versão [especificar a versão]. 

Baixe em https://www.oracle.com/java/technologies/downloads/

Ambiente de desenvolvimento: Eclipse (https://www.eclipse.org/) ou IntelliJ IDEA (https://www.jetbrains.com/idea/)

Banco de dados: [Especificar o banco de dados e a versão, e.g., MySQL 8.0]

Driver JDBC: Para conectar ao banco de dados (especificar o driver necessário).

## ⚙️Instalação e Configuração
Clone o repositório: Se o projeto estiver em um repositório Git, clone-o para sua máquina local.

Configure o banco de dados: Crie um banco de dados e as tabelas correspondentes às classes do projeto.

Configure o arquivo persistence.xml: Defina as propriedades de conexão com o banco de dados.

Importe o projeto: Importe o projeto para sua IDE preferida.

Execute a aplicação: Execute a classe principal do projeto para iniciar a aplicação.


## 🤝Contribuições
Contribuições são bem-vindas! Para contribuir, por favor, siga estes passos:

Fork este repositório.
Crie um novo branch para sua feature.
Faça suas alterações e commit.
Envie um pull request.
Licença
Este projeto está licenciado sob a licença [especificar a licença, e.g., MIT].

## Documentação:
file:///C:/Users/felip/eclipse-workspace/SISTEMA_VEICULOS/doc/index.html

![image](https://github.com/user-attachments/assets/eec8d531-5db3-4a06-8b13-7cbb5cb80ec0)

## ✒️Autores
Felipe Bonfim: Desenvolvimento inicial - Criação da estrutura básica do projeto.
[Adicionar outros autores]


