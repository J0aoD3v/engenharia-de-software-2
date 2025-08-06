# 📚 Engenharia de Software 2 ### 🏗️ **Seção 3 - Arqui## 📁 Estrutura do Repositórioetura de Software** Material de Estudos

Este repositório contém materiais práticos e exercícios da disciplina **Engenharia de Software 2**, baseados no livro **"Engenharia de Software: Do Requisito ao Projeto"** do Professor **André Menolli** (2024).

## 📖 Sobre o Livro Base

**Título:** Engenharia de Software: Do Requisito ao Projeto  
**Autor:** André Menolli  
**Ano:** 2024  
**Objetivo:** Guiar o leitor através do ciclo de vida completo do desenvolvimento de software, com foco no paradigma Orientado a Objetos, demonstrando como transformar requisitos iniciais em um projeto de software robusto, coeso e de baixo acoplamento.

## 🎯 Estrutura da Disciplina

O material didático é estruturado em **cinco seções principais**, cobrindo as fases essenciais da engenharia de software:

### 📋 **Seção 1 - Requisitos**

Técnicas modernas e tradicionais para levantamento e documentação de requisitos:

- **Histórias de Usuário (User Stories)** - Técnica ágil para capturar funcionalidades
- **Casos de Uso (Use Cases)** - Técnica formal para descrever interações sistema-ator
- **Diagrama de Atividades** - Visualização de fluxos de trabalho e processos complexos

### 🔍 **Seção 2 - Análise de Projeto**

Tradução dos requisitos em modelo conceitual do sistema:

- **Modelo de Classe de Análise** - Identificação de classes, atributos e relacionamentos
- **Conceitos de Projeto de Software** - Abstração, encapsulamento, coesão e acoplamento

### �️ **Seção 3 - Arquitetura de Software**

Design de alto nível do sistema:

- **Importância da Arquitetura** - Tipos e visões arquiteturais
- **Atributos de Qualidade** - Desempenho, segurança, modificabilidade
- **Padrões Arquiteturais** - Camadas, MVC, Cliente-Servidor

### 🛠️ **Seção 4 - Projeto de Software** _(Foco Principal)_

Construção detalhada do projeto de software:

- **Modelo de Projeto de Domínio** - Evolução do modelo de análise com padrões GRASP
- **Princípios SOLID** - _[Implementado neste repositório]_ ✅
- **Diagrama de Sequência** - Modelagem de interações dinâmicas entre objetos
- **Projeto da Interface com o Usuário** - Padrões MVC e MVP
- **Persistência de Dados** - ORM (Hibernate/JPA), NoSQL, padrões DAO e Factory

### 🧪 **Seção 5 - Teste de Software**

Verificação e validação:

- **Tipos de Teste** - Unidade, integração, sistema
- **Categorias** - Caixa preta, caixa branca, caixa cinza

## � Estrutura do Repositório

```
📦 engenharia-de-software-2/
├── 📁 capitulo10-principios-solid/     # ✅ IMPLEMENTADO
│   ├── 📁 exercicio01-srp/             # Single Responsibility Principle
│   ├── 📁 exercicio02-ocp/             # Open/Closed Principle
│   ├── 📁 exercicio03-lsp/             # Liskov Substitution Principle
│   ├── 📁 exercicio04-isp/             # Interface Segregation Principle
│   ├── 📁 exercicio05-dip/             # Dependency Inversion Principle + GRASP
│   ├── 📄 README.md                    # Documentação específica do capítulo
│   ├── 📄 LICENSE                      # Licença MIT
│   └── 📄 "João Cláudio Fernandes... - Exercícios SOLID.pdf"
├── 📁 capitulo-XX-requisitos/          # 🚧 PLANEJADO
├── 📁 capitulo-XX-analise/             # 🚧 PLANEJADO
├── 📁 capitulo-XX-arquitetura/         # 🚧 PLANEJADO
├── 📁 capitulo-XX-padroes-grasp/       # 🚧 PLANEJADO
├── 📁 capitulo-XX-persistencia/        # 🚧 PLANEJADO
├── 📁 capitulo-XX-testes/              # 🚧 PLANEJADO
└── 📄 README.md                        # Este arquivo - Visão geral da disciplina
```

## 🎓 Material Implementado

### ✅ **Capítulo 10 - Princípios SOLID**

**Status:** Completamente implementado e testado

Implementação prática dos 5 princípios SOLID em Java, demonstrando violações e refatorações conforme especificação acadêmica:

1. **SRP** - Single Responsibility Principle
2. **OCP** - Open/Closed Principle
3. **LSP** - Liskov Substitution Principle
4. **ISP** - Interface Segregation Principle
5. **DIP** - Dependency Inversion Principle + Padrões GRASP

**🔗 Acesse:** [`capitulo10-principios-solid/`](./capitulo10-principios-solid/)

## 🔧 Tecnologias Utilizadas

- **Java 11+** - Linguagem principal para implementações
- **Maven** - Gerenciamento de dependências e build
- **Git** - Controle de versão
- **VS Code / NetBeans** - IDEs de desenvolvimento
- **JUnit** - Framework de testes (quando aplicável)

## 🚀 Como Usar Este Repositório

### Para Estudantes:

1. **Clone o repositório:** `git clone https://github.com/J0aoD3v/engenharia-de-software-2.git`
2. **Navegue pelos capítulos** conforme o cronograma da disciplina
3. **Execute os exemplos** seguindo as instruções de cada pasta
4. **Estude o código** comparando com a teoria do livro

### Para Professores:

- Material pronto para uso em aulas práticas
- Exemplos implementados seguindo boas práticas acadêmicas
- Documentação detalhada para facilitar explicações

## 📚 Referências Bibliográficas

### 📘 Livro Base

**MENOLLI, André.** _Engenharia de Software: Do Requisito ao Projeto._ 2024.

### 📖 Bibliografia Complementar Selecionada

- **LARMAN, Craig.** _Utilizando UML e Padrões._ 3ª edição, Bookman, 2007.
- **MARTIN, Robert C.** _Design principles and design patterns._ Object Mentor, 2000.
- **GAMMA, E., et al.** _Padrões de Projeto._ Ed Bookman.
- **FOWLER, Martin.** _UML Essencial: Um breve guia para a linguagem-padrão de modelagem de objetos._ Pearson Education, 2004.
- **PRESSMAN, R., MAXIM, B.** _Engenharia de Software._ 8ª/9ª edição, AMGH, 2016/2021.

> 📝 **Nota:** Lista completa de referências disponível no material fonte do Professor André Menolli.

## 🤝 Contribuições

Este é um material educacional em constante evolução. Contribuições são bem-vindas:

1. **Fork** o projeto
2. **Crie uma branch** para sua contribuição (`git checkout -b feature/nova-implementacao`)
3. **Commit** suas mudanças (`git commit -am 'Adiciona implementação do Capítulo X'`)
4. **Push** para a branch (`git push origin feature/nova-implementacao`)
5. **Abra um Pull Request**

## 📝 Licença

Este projeto está sob a licença MIT. Veja o arquivo [capitulo10-principios-solid/LICENSE](capitulo10-principios-solid/LICENSE) para mais detalhes.

## 👨‍💻 Autor & Mantenedor

**Desenvolvido por:** [Seu Nome]  
**Baseado no livro de:** Prof. André Menolli  
**Disciplina:** Engenharia de Software 2

- 📧 Email: [seu-email@university.edu]
- 💼 LinkedIn: [seu-linkedin]
- 🐙 GitHub: [@J0aoD3v](https://github.com/J0aoD3v)

---

⭐ **Se este material foi útil para seus estudos, deixe uma estrela!** ⭐

> 💡 **Dica de Estudo:** Cada capítulo implementado neste repositório corresponde diretamente aos conceitos teóricos apresentados no livro. Recomenda-se estudar a teoria antes de analisar o código prático.
