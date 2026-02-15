# 🎰 Cassino Console em Java

Projeto de um cassino desenvolvido em Java para execução no terminal, com foco em aprendizado de lógica, arquitetura, organização de código e Programação Orientada a Objetos.

O objetivo não é criar apenas um jogo isolado, mas sim construir uma estrutura expansível onde novos jogos possam ser adicionados progressivamente.

---

## 📌 Sobre o Projeto

O sistema simula um cassino onde o jogador pode acessar diferentes jogos.

Atualmente implementado:

- 🎰 Jackpot

Planejado para futuras versões:

- 💣 Mines
- ♠ Poker
- 🎲 Dados
- 🎡 Roleta
- 🃏 Outros jogos baseados em sorte ou estratégia

O projeto está sendo construído com mentalidade de expansão, permitindo adicionar novos jogos sem modificar a estrutura principal do sistema.

---

## 🧠 Objetivos de Aprendizado

Este projeto foi criado para desenvolver:

- Programação Orientada a Objetos (POO)
- Organização em pacotes
- Separação de responsabilidades
- Estrutura modular
- Controle de fluxo com loops
- Validação de entradas
- Refatoração contínua
- Versionamento profissional com Git

---

## 🏗 Estrutura Atual

```
cassino-java/
│
├── model/
│   ├── Jogador.java
│   ├── Jogos.java
│   └── Jackpot.java
│
└── Cassino.java
```

A estrutura poderá evoluir conforme novos jogos forem adicionados.

---

## 🎮 Como Funciona

1. O jogador inicia com saldo.
2. Escolhe um jogo disponível.
3. Define valor da aposta.
4. O jogo executa sua lógica específica.
5. O saldo é atualizado automaticamente.

Cada jogo implementa a interface `Jogos`, permitindo fácil expansão do sistema.

---

## 🔄 Roadmap (Evolução do Projeto)

- [x] Implementação do Jackpot
- [ ] Remover recursões internas e melhorar fluxo
- [ ] Sistema de múltiplos jogos dinâmicos
- [ ] Implementar Mines
- [ ] Implementar Roleta
- [ ] Implementar Poker simplificado
- [ ] Histórico de apostas
- [ ] Sistema de ranking
- [ ] Persistência de dados
- [ ] Separação completa entre lógica e interface

---

## 🚀 Como Executar

### IntelliJ
Executar a classe `Cassino`.

### Terminal

```bash
javac Cassino.java
java Cassino
```

---

## 📌 Status

🚧 Projeto em desenvolvimento contínuo  
Construído como prática de evolução técnica em Java

---

## 👨‍💻 Autor

Projeto pessoal para aprimoramento em Java e arquitetura de sistemas.
