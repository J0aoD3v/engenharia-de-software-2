#!/bin/bash

echo "🚀 Executando todos os exercícios SOLID..."
echo "========================================="

# Exercício 1 - SRP
echo ""
echo "📋 Exercício 1 - Single Responsibility Principle (SRP)"
echo "-----------------------------------------------------"
cd ex01/src/main/java
javac -d ../../../target/classes eng2/solid/ex01/*.java 2>/dev/null
cd ../../../target/classes
java eng2.solid.ex01.Ex01
cd ../../../../

# Exercício 2 - OCP  
echo ""
echo "📋 Exercício 2 - Open/Closed Principle (OCP)"
echo "---------------------------------------------"
cd ex02/src/main/java
javac -d ../../../target/classes eng2/solid/ex02/*.java 2>/dev/null
cd ../../../target/classes
java eng2.solid.ex02.Main
cd ../../../../

# Exercício 3 - LSP
echo ""
echo "📋 Exercício 3 - Liskov Substitution Principle (LSP)"
echo "---------------------------------------------------"
cd ex03/src/main/java
javac -d ../../../target/classes eng2/solid/ex03/*.java 2>/dev/null
cd ../../../target/classes
java eng2.solid.ex03.Main
cd ../../../../

# Exercício 4 - ISP
echo ""
echo "📋 Exercício 4 - Interface Segregation Principle (ISP)"
echo "-----------------------------------------------------"
cd ex04/src/main/java
javac -d ../../../target/classes eng2/solid/ex04/*.java 2>/dev/null
cd ../../../target/classes
java eng2.solid.ex04.Main
cd ../../../../

# Exercício 5 - DIP + Refatoração
echo ""
echo "📋 Exercício 5 - Dependency Inversion Principle (DIP)"
echo "----------------------------------------------------"
cd ex05/src/main/java
javac -d ../../../target/classes eng2/solid/ex05/*.java 2>/dev/null
cd ../../../target/classes
java eng2.solid.ex05.Main
cd ../../../../

echo ""
echo "✅ Todos os exercícios executados com sucesso!"
echo "=============================================="
