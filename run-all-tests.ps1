# Script PowerShell para executar todos os exercícios SOLID

Write-Host "🚀 Executando todos os exercícios SOLID..." -ForegroundColor Green
Write-Host "=========================================" -ForegroundColor Green

# Exercício 1 - SRP
Write-Host ""
Write-Host "📋 Exercício 1 - Single Responsibility Principle (SRP)" -ForegroundColor Cyan
Write-Host "-----------------------------------------------------" -ForegroundColor Cyan
Set-Location "ex01\src\main\java"
javac -d "..\..\..\target\classes" eng2\solid\ex01\*.java
Set-Location "..\..\..\target\classes"
java eng2.solid.ex01.Ex01
Set-Location "..\..\..\.."

# Exercício 2 - OCP  
Write-Host ""
Write-Host "📋 Exercício 2 - Open/Closed Principle (OCP)" -ForegroundColor Cyan
Write-Host "---------------------------------------------" -ForegroundColor Cyan
Set-Location "ex02\src\main\java"
javac -d "..\..\..\target\classes" eng2\solid\ex02\*.java
Set-Location "..\..\..\target\classes"
java eng2.solid.ex02.Main
Set-Location "..\..\..\.."

# Exercício 3 - LSP
Write-Host ""
Write-Host "📋 Exercício 3 - Liskov Substitution Principle (LSP)" -ForegroundColor Cyan
Write-Host "---------------------------------------------------" -ForegroundColor Cyan
Set-Location "ex03\src\main\java"
javac -d "..\..\..\target\classes" eng2\solid\ex03\*.java
Set-Location "..\..\..\target\classes"
java eng2.solid.ex03.Main
Set-Location "..\..\..\.."

# Exercício 4 - ISP
Write-Host ""
Write-Host "📋 Exercício 4 - Interface Segregation Principle (ISP)" -ForegroundColor Cyan
Write-Host "-----------------------------------------------------" -ForegroundColor Cyan
Set-Location "ex04\src\main\java"
javac -d "..\..\..\target\classes" eng2\solid\ex04\*.java
Set-Location "..\..\..\target\classes"
java eng2.solid.ex04.Main
Set-Location "..\..\..\.."

# Exercício 5 - DIP + Refatoração
Write-Host ""
Write-Host "📋 Exercício 5 - Dependency Inversion Principle (DIP)" -ForegroundColor Cyan
Write-Host "----------------------------------------------------" -ForegroundColor Cyan
Set-Location "ex05\src\main\java"
javac -d "..\..\..\target\classes" eng2\solid\ex05\*.java
Set-Location "..\..\..\target\classes"
java eng2.solid.ex05.Main
Set-Location "..\..\..\.."

Write-Host ""
Write-Host "✅ Todos os exercícios executados com sucesso!" -ForegroundColor Green
Write-Host "=============================================" -ForegroundColor Green
