package exercises;

import java.util.Scanner;

import entities.ex2.*;

/* 
Exercício 2: Sistema de Funcionários de uma Empresa
Descrição
Neste exercício, você implementará um sistema de gerenciamento de
funcionários utilizando herança em Java.
Você deve criar uma hierarquia de classes baseada na estrutura abaixo:
Classe Base: Funcionario
A classe Funcionario será a superclasse que contém atributos e métodos comuns
a todos os funcionários.
Atributos:
nome (String): Nome do funcionário.
cpf (String): CPF do funcionário.
salarioBase (double): Salário base do funcionário.
Métodos:
calcularSalario(): Retorna o salário do funcionário (pode ser sobrescrito
nas subclasses).
exibirDados(): Exibe as informações do funcionário.
Subclasses que Herdam de Funcionario
1. Classe Gerente
Representa um gerente dentro da empresa.
Atributos adicionais:

bonus (double): Valor do bônus mensal do gerente.
Métodos específicos:
calcularSalario(): O salário final é salarioBase + bonus.
exibirDados(): Exibe os atributos comuns + o bônus.
2. Classe Desenvolvedor
Representa um desenvolvedor de software da empresa.
Atributos adicionais:

linguagem (String): Linguagem de programação principal do desenvolvedor.
Métodos específicos:
calcularSalario(): O salário final é o salarioBase, mas pode ser futuramente
ajustado para incluir bônus por projeto.
exibirDados(): Exibe os atributos comuns + a linguagem de programação.
3. Classe Estagiario
Representa um estagiário na empresa.
Atributos adicionais:
horasTrabalhadas (int): Quantidade de horas trabalhadas no mês.
valorHora (double): Valor da hora de trabalho do estagiário.
Métodos específicos:
calcularSalario(): O salário final é horasTrabalhadas * valorHora.
exibirDados(): Exibe os atributos comuns + as horas trabalhadas e o valor
da hora.
Tarefas a serem realizadas
1. Criar a classe Funcionario com seus atributos e métodos básicos.
2. Criar as subclasses Gerente, Desenvolvedor e Estagiario, garantindo
que herdam corretamente de Funcionario.
3. Implementar os métodos de cada classe, sobrescrevendo
calcularSalario() e exibirDados() conforme necessário.
4. Testar o comportamento dos funcionários, chamando calcularSalario() e
exibirDados() para cada um deles.
*/

public class Ex2 implements Exercise {

    @Override
    public void run(Scanner sc) {
        System.out.println("--- Exercício 2 ---\n");

        Gerente gerente = new Gerente("Carlos", "111.111.111-11", 8000,2500);

        Desenvolvedor desenvolvedor = new Desenvolvedor("Ana", "222.222.222-22", 6000, "Java");

        Estagiario estagiario = new Estagiario("Pedro", "333.333.333-33", 0, 120, 15);

        System.out.println("=== GERENTE ===");
        gerente.exibirDados();

        System.out.println();

        System.out.println("=== DESENVOLVEDOR ===");
        desenvolvedor.exibirDados();

        System.out.println();

        System.out.println("=== ESTAGIÁRIO ===");
        estagiario.exibirDados();
    }
}