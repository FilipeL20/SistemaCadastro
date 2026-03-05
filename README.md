# 📋 Sistema de Cadastro de Usuários

![Java](https://img.shields.io/badge/Java-17+-orange)
![Status](https://img.shields.io/badge/status-em%20desenvolvimento-yellow)
![License](https://img.shields.io/badge/license-MIT-blue)

## 📖 Sobre o Projeto

Este projeto é um **Sistema de Cadastro de Usuários desenvolvido em Java**, criado com o objetivo de praticar conceitos fundamentais de **Programação Orientada a Objetos (POO)**, estrutura de **CRUD**, manipulação de **ArrayList** e organização de código.

O sistema funciona atualmente **via terminal (console)** e armazena os usuários **temporariamente em memória**, utilizando uma `ArrayList`, sem conexão com banco de dados.

Este projeto faz parte do processo de aprendizado em desenvolvimento Java e servirá como base para futuras melhorias.

---

## ⚙️ Funcionalidades

O sistema possui atualmente as seguintes funcionalidades:

* ➕ **Cadastrar usuário**
* 📋 **Listar usuários cadastrados**
* 🔐 **Login de usuário**
* ✏️ **Atualizar informações do usuário**
* ❌ **Remover usuário**

### 📌 Informações armazenadas de cada usuário

* ID (gerado automaticamente)
* Nome
* Email
* CPF
* Data de nascimento
* Senha

---

## 🛠 Tecnologias Utilizadas

* **Java**
* **Programação Orientada a Objetos (POO)**
* **ArrayList**
* **Scanner (entrada de dados no console)**

---

## 📂 Estrutura do Projeto

```id="50829"
src
│
├── usuario.java
│   Classe que representa o modelo de usuário.
│
├── usuarioService.java
│   Classe responsável pela lógica de negócio e manipulação dos usuários.
│
└── Main.java
    Classe principal que contém o menu interativo do sistema.
```

---

## 🧠 Conceitos aplicados

Este projeto utiliza diversos conceitos importantes da linguagem Java:

* Programação Orientada a Objetos
* Encapsulamento
* Construtores
* Métodos getters e setters
* Estruturas condicionais (`if`, `switch`)
* Estruturas de repetição (`for`, `do while`)
* Estrutura CRUD (Create, Read, Update, Delete)
* Manipulação de coleções com `ArrayList`

---

## 🚀 Melhorias planejadas (Roadmap)

Este projeto ainda está em desenvolvimento e algumas melhorias estão planejadas para as próximas versões:

### 🗄 Integração com banco de dados

Implementação de um banco de dados (ex: **MySQL ou PostgreSQL**) para armazenar os usuários de forma permanente.

### 🖥 Interface gráfica

Criação de uma interface gráfica para facilitar o uso do sistema utilizando tecnologias como:

* JavaFX
* Swing
* ou interface web futuramente.

### ✔ Validação de dados

Implementação de verificações automáticas para validar o formato de:

* Email
* CPF
* Data de nascimento

### 🔐 Segurança

* Criptografia de senha
* Melhor validação de entrada de dados

### 💾 Persistência de dados

Garantir que os dados continuem salvos mesmo após o fechamento do programa.

---

## 🎯 Objetivo do Projeto

O objetivo deste projeto é **praticar desenvolvimento em Java e estruturação de sistemas**, servindo como base para projetos mais complexos no futuro, incluindo aplicações com banco de dados e interface gráfica.

---

## 👨‍💻 Autor

**Filipe de Carvalho Lage**

Projeto desenvolvido como parte do processo de aprendizado em **Java e desenvolvimento de sistemas**.

---
