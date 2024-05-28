# Library System with Lending

## Resumo do Projeto

Este projeto é um sistema de gerenciamento de biblioteca que permite adicionar livros e usuários, realizar empréstimos de livros e devoluções. A aplicação é implementada em Java.

## Funcionalidades

- **Adicionar Livros**: Permite adicionar novos livros à biblioteca.
- **Adicionar Usuários**: Permite adicionar novos usuários à biblioteca.
- **Emprestar Livros**: Permite que os usuários peguem livros emprestados.
- **Devolver Livros**: Permite que os usuários devolvam livros emprestados.
- **Notificações**: Notifica os usuários sobre o status dos empréstimos.

## Estrutura do Projeto

### Classes Principais

1. **Book**: Representa um livro na biblioteca.
2. **User**: Representa um usuário da biblioteca.
3. **Loan**: Representa um empréstimo de um livro.
4. **Library**: Gerencia os livros, usuários e empréstimos.

### Exceções

1. **BookUnavailableException**: Exceção lançada quando um livro não está disponível para empréstimo.

### Interface

1. **Notification**: Interface para enviar notificações aos usuários.