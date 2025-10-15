# Agenda-de-Contatos - Utilizando Spring Boot 

Este projeto é uma Agenda de Contatos desenvolvida com o objetivo de aprofundar o conhecimento em desenvolvimento web moderno utilizando Java e o framework Spring Boot.
A aplicação segue o padrão de arquitetura MVC (Model-View-Controller), o que proporciona uma melhor organização do código e uma separação clara das responsabilidades entre as camadas.

<h1>Aplicação na Pratica</h1>
Primeira visão do usuario, tela Inicial:
<img width="1875" height="929" alt="Agenda de contatos sem contatos" src="https://github.com/user-attachments/assets/70c78fc9-ceac-4027-95bc-b89fbf1fb647" />
<br>
Adicionando Contatos: 
<img width="1875" height="932" alt="Agenda de contatos adicionando" src="https://github.com/user-attachments/assets/00d5f33b-84f0-4c90-8e04-3be379a96393" />
<br>
Filtro de pesquisa:
<img width="1875" height="927" alt="Agenda de contatos Filtro de pesquisa" src="https://github.com/user-attachments/assets/421aaa7e-685c-4757-949b-436291505e73" />
<br>
Edição de contatos:
<img width="1875" height="931" alt="Agenda de contatos edição" src="https://github.com/user-attachments/assets/46f787c4-1517-4613-b113-cf31ea612374" />
<br>
<br>

<h1>Arquitetura e Aspectos Técnicos</h1>
Esta seção descreve em detalhe as tecnologias utilizadas no projeto e a arquitetura adotada, além das motivações por trás de cada escolha:

<h3>Arquitetura</h3>
O projeto adota o padrão de arquitetura Model-View-Controller (MVC), que organiza a aplicação em camadas bem definidas para facilitar a manutenção e a escalabilidade do código.
A camada Model é composta pelas classes de entidades, implementadas com JPA/Hibernate, e pelos repositórios desenvolvidos com Spring Data JPA, responsáveis pela interação com o banco de dados H2.
A camada View pode ser implementada com tecnologias como Thymeleaf ou JSP, caso o frontend seja integrado diretamente ao Spring. No entanto, se o frontend for desenvolvido separadamente (por exemplo, com React ou Vue.js), o Spring Boot atua apenas como API REST, servindo os dados para a interface do usuário.
Por fim, a camada Controller é responsável por gerenciar as requisições e coordenar o fluxo de dados entre o Model e a View, garantindo a comunicação eficiente entre as partes da aplicação.
<br>
<h3>API Rest</h3>
A aplicação conta com uma API REST que permite a comunicação entre o frontend e o backend, utilizando os métodos HTTP padrão — GET, POST, PUT e DELETE — para a manipulação dos dados de contatos. Essa abordagem garante flexibilidade, independência entre as camadas e facilidade na integração com diferentes interfaces.
<br>
<h3>Tecnologias Utilizadas</h3>
O projeto foi desenvolvido com o objetivo de aplicar boas práticas e explorar ferramentas modernas do ecossistema Java. Abaixo estão as principais tecnologias adotadas:

- Linguagem: Java (JDK 17+)

- Framework: Spring Boot 3.x.x (foco em desenvolvimento Web e API REST)

- Persistência: Spring Data JPA (Mapeamento Objeto-Relacional com ORM)

- Banco de Dados: H2 Database (banco em memória, ideal para desenvolvimento e testes)

- Gerenciador de Dependências: Maven
