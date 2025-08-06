# 📚 Exercícios SOLID - Capítulo 10

Este repositório contém implementações práticas dos 5 princípios SOLID em Java, demonstrando conceitos fundamentais de engenharia de software e design orientado a objetos.

## 🎯 Objetivos

- Compreender e aplicar os princípios SOLID
- Demonstrar boas práticas de design de software
- Implementar código limpo e maintível
- Exemplificar refatoração de código

## 📋 Estrutura do Projeto

```
📦 solid-exercises/
├── 📁 ex01/ - Single Responsibility Principle (SRP)
├── 📁 ex02/ - Open/Closed Principle (OCP)
├── 📁 ex03/ - Liskov Substitution Principle (LSP)
├── 📁 ex04/ - Interface Segregation Principle (ISP)
├── 📁 ex05/ - Dependency Inversion Principle (DIP) + Refatoração
└── 📄 README.md
```

## 🔧 Tecnologias Utilizadas

- **Java 11+**
- **Maven** (gerenciamento de dependências)
- **VS Code / NetBeans** (IDEs)

## 📚 Exercícios Implementados

### 🎯 Exercício 1: Single Responsibility Principle (SRP)

**Pasta:** `ex01/`

**Conceito:** Cada classe deve ter apenas uma razão para mudar.

**Classes:**
- `LeitorDeArquivo.java` - Responsável apenas por ler arquivos
- `AnalisadorDeConteudo.java` - Responsável apenas por analisar conteúdo
- `ExibidorDeResultados.java` - Responsável apenas por exibir resultados
- `ResultadoAnalise.java` - Modelo de dados para o resultado

**Execução:**
```bash
cd ex01/src/main/java
javac -d ../../../target/classes eng2/solid/ex01/*.java
cd ../../../target/classes
java eng2.solid.ex01.Ex01
```

---

### 🎯 Exercício 2: Open/Closed Principle (OCP)

**Pasta:** `ex02/`

**Conceito:** Classes devem estar abertas para extensão, mas fechadas para modificação.

**Classes:**
- `CalculoImposto.java` - Interface para estratégias de cálculo
- `CalculoICMS.java` - Implementação para ICMS (18%)
- `CalculoISS.java` - Implementação para ISS (5%)
- `CalculoIPI.java` - Implementação para IPI (10%)
- `CalculadoraImpostos.java` - Contexto que usa as estratégias
- `Main.java` - Demonstração do padrão Strategy

**Saída Esperada:**
```
--- Cálculos de Impostos (OCP) ---
Valor do ICMS a ser pago: 180.0
Valor do ISS a ser pago: 50.0
Valor do IPI a ser pago: 100.0
```

**Execução:**
```bash
cd ex02/src/main/java
javac -d ../../../target/classes eng2/solid/ex02/*.java
cd ../../../target/classes
java eng2.solid.ex02.Main
```

---

### 🎯 Exercício 3: Liskov Substitution Principle (LSP)

**Pasta:** `ex03/`

**Conceito:** Objetos de uma superclasse devem ser substituíveis por objetos de suas subclasses.

**Classes:**
- `FormaGeometrica.java` - Interface comum para formas
- `Retangulo.java` - Implementação para retângulos
- `Quadrado.java` - Implementação específica para quadrados
- `Main.java` - Demonstração da substituibilidade

**Saída Esperada:**
```
--- Cálculo de Áreas (LSP) ---
Área do retângulo: 50
Área do quadrado: 25
```

**Execução:**
```bash
cd ex03/src/main/java
javac -d ../../../target/classes eng2/solid/ex03/*.java
cd ../../../target/classes
java eng2.solid.ex03.Main
```

---

### 🎯 Exercício 4: Interface Segregation Principle (ISP)

**Pasta:** `ex04/`

**Conceito:** Clientes não devem ser forçados a depender de interfaces que não usam.

**Classes:**
- `Documento.java` - Interface básica (criar, visualizar)
- `Editavel.java` - Interface específica para edição
- `Imprimivel.java` - Interface específica para impressão
- `DocumentoTexto.java` - Implementa todas as interfaces
- `DocumentoPDF.java` - Implementa apenas Documento e Imprimivel
- `Main.java` - Demonstração da segregação

**Saída Esperada:**
```
--- Manipulando Documentos (ISP) ---

-- Documento de Texto --
Documento de texto criado.
Documento de texto visualizado.
Documento de texto editado.
Documento de texto impresso.

-- Documento PDF --
PDF criado.
PDF visualizado.
PDF impresso.
```

**Execução:**
```bash
cd ex04/src/main/java
javac -d ../../../target/classes eng2/solid/ex04/*.java
cd ../../../target/classes
java eng2.solid.ex04.Main
```

---

### 🎯 Exercício 5: Dependency Inversion Principle (DIP) + Refatoração

**Pasta:** `ex05/`

**Conceito:** Módulos de alto nível não devem depender de módulos de baixo nível. Ambos devem depender de abstrações.

**Classes:**
- `Livro.java` - Modelo de dados
- `Aluno.java` - Entidade com responsabilidade de criar empréstimos
- `Emprestimo.java` - Entidade especialista em cálculos de devolução
- `IEmprestarLivro.java` - Interface para caso de uso de empréstimo
- `EmprestarLivroController.java` - Controlador específico para empréstimos
- `Main.java` - Demonstração da inversão de dependência

**Saída Esperada:**
```
--- INICIANDO CASO DE USO: EMPRESTAR LIVRO ---
Aluno João Silva realizou um empréstimo.
Data de devolução calculada: 2025-08-19
--- FIM DO CASO DE USO ---
```

**Execução:**
```bash
cd ex05/src/main/java
javac -d ../../../target/classes eng2/solid/ex05/*.java
cd ../../../target/classes
java eng2.solid.ex05.Main
```

## 🚀 Como Executar

### Pré-requisitos
- Java 11 ou superior
- Maven (opcional, para builds automatizados)

### Execução Manual (todos os projetos)

1. **Clone o repositório:**
```bash
git clone https://github.com/[seu-usuario]/solid-exercises.git
cd solid-exercises
```

2. **Execute qualquer exercício:**
```bash
# Exemplo para ex02
cd ex02/src/main/java
javac -d ../../../target/classes eng2/solid/ex02/*.java
cd ../../../target/classes
java eng2.solid.ex02.Main
```

### Execução com Maven (se disponível)

```bash
cd ex02  # ou qualquer outro exercício
mvn clean compile exec:java
```

## 📖 Conceitos Aplicados

### 🔹 Single Responsibility Principle (SRP)
- Cada classe tem uma única responsabilidade
- Facilita manutenção e testes
- Reduz acoplamento

### 🔹 Open/Closed Principle (OCP)
- Padrão Strategy implementado
- Extensível sem modificação do código existente
- Novas estratégias podem ser adicionadas facilmente

### 🔹 Liskov Substitution Principle (LSP)
- Interfaces bem definidas
- Subtipos são verdadeiramente substituíveis
- Contratos respeitados em todas as implementações

### 🔹 Interface Segregation Principle (ISP)
- Interfaces específicas e coesas
- Clientes dependem apenas do que realmente usam
- Evita implementações desnecessárias

### 🔹 Dependency Inversion Principle (DIP)
- Dependências abstraídas através de interfaces
- Controladores específicos para cada caso de uso
- Baixo acoplamento entre camadas

## 🧪 Testes

Todos os exercícios foram testados e validados. Para executar:

```bash
# Teste rápido de todos os exercícios
./run-all-tests.sh  # (script que pode ser criado)
```

## 🤝 Contribuições

1. Fork o projeto
2. Crie uma branch para sua feature (`git checkout -b feature/nova-feature`)
3. Commit suas mudanças (`git commit -am 'Adiciona nova feature'`)
4. Push para a branch (`git push origin feature/nova-feature`)
5. Abra um Pull Request

## 📝 Licença

Este projeto está sob a licença MIT. Veja o arquivo [LICENSE](LICENSE) para mais detalhes.

## 👨‍💻 Autor

**João Cláudio Fernandes Michelato Colaço**

- 📧 Email: [seu-email@example.com]
- 💼 LinkedIn: [seu-linkedin]
- 🐙 GitHub: [seu-usuario]

## 📚 Referências

- Clean Code - Robert C. Martin
- Design Patterns - Gang of Four
- SOLID Principles - Robert C. Martin
- Princípios de Engenharia de Software

---

⭐ **Se este projeto foi útil para você, deixe uma estrela!** ⭐
