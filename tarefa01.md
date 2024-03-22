# Pesquisa REST API

## Definição
Uma REST API (Representational State Transfer Application Programming Interface) é um conjunto de protocolos, definições e regras que permite a integração e interação com serviços Web, além da comunicação desses sistemas. É uma API baseada nos princípios da arquitetura REST, que é um estilo de arquitetura de software para sistemas distribuídos. 
Ela utiliza URLs (endpoints) para acessar e manipular recursos e dados, além de permitir a solicitação e compartilhamento de funcionalidades e/ou serviços entre aplicativos, de forma eficiente e segura.

## Características 
Como a API segue os conceitos da arquitetura REST, existem muitas características indispensáveis no desenvolvimento de uma REST API, algumas delas são:

- **Cliente Servidor:** Separação de responsabilidades entre cliente e servidor, onde o cliente envia solicitações para o servidor, que processa e envia respostas a esse.
- **Stateless:** Cada solicitação para o servidor contém todas as informações necessárias para que o servidor entenda e processe, ou seja, ele não fica responsável em manter nenhum estado da sessão do cliente.
- **Endpoints:** São URLs específicas que representam os recursos e são usados para solicitar operações HTTP.
- **Operações HTTP:** A API deve ser capaz de realizar as operações básicas de CRUD (Create, Read, Update, Delete), essas que são mapeadas para os métodos HTTP: GET, POST, PUT/PATCH e DELETE. Dessa forma, a interação com recursos é feita de forma uniforme e previsível.
- **Representação de Recursos:** Os recursos, seja de solicitação ao servidor ou a resposta do mesmo, devem ser representados em um formato específico estruturado, como por exemplo, JSON ou XML. Isso permite que os sistemas entendam e processem os dados de maneira eficiente e padronizada.
- **Segurança:** Essas APIs são geralmente protegidas usando técnicas e arquiteturas de autenticação e autorização, como por exemplo, os tokens JWT. Isso garante que apenas usuários autorizados possam acessar determinados recursos e executar determinadas operações.