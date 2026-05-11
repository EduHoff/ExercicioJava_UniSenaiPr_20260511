package exercises;

import java.util.Scanner;

//import entities.ex3.*;

/* 
Exercício 3: Sistema de Contas Bancárias
Descrição
Neste exercício, você criará um sistema de gerenciamento de contas bancárias
utilizando herança em Java.
Você deve implementar a hierarquia de classes abaixo:
Classe Base: ContaBancaria
A classe ContaBancaria será a superclasse que contém atributos e métodos
comuns a todos os tipos de conta.
Atributos:
titular (String): Nome do titular da conta.
saldo (double): Saldo disponível na conta.
numeroConta (String): Número da conta bancária.
Métodos:
depositar(double valor): Adiciona um valor ao saldo.
sacar(double valor): Subtrai um valor do saldo, caso haja saldo suficiente.
exibirDados(): Exibe as informações da conta.
Subclasses que Herdam de ContaBancaria
1. Classe ContaCorrente
Representa uma conta corrente.
Atributos adicionais:

taxaManutencao (double): Valor da taxa de manutenção mensal da conta.
Métodos específicos:
descontarTaxa(): Subtrai a taxa de manutenção do saldo.
exibirDados(): Exibe os atributos comuns + a taxa de manutenção.
2. Classe ContaPoupanca
Representa uma conta poupança.
Atributos adicionais:

taxaRendimento (double): Percentual de rendimento mensal da conta.
Métodos específicos:
aplicarRendimento(): Aumenta o saldo com base na taxa de rendimento.
exibirDados(): Exibe os atributos comuns + a taxa de rendimento.
3. Classe ContaSalario
Representa uma conta específica para recebimento de salário.
Atributos adicionais:

empresa (String): Nome da empresa que faz os depósitos na conta.
Métodos específicos:
receberSalario(double valor): Adiciona um valor ao saldo (simulando o
pagamento de salário).
exibirDados(): Exibe os atributos comuns + a empresa associada.
Tarefas a serem realizadas
1. Criar a classe ContaBancaria com seus atributos e métodos básicos.
2. Criar as subclasses ContaCorrente, ContaPoupanca e ContaSalario,
garantindo que herdam corretamente de ContaBancaria.
3. Implementar os métodos de cada classe, sobrescrevendo exibirDados()
conforme necessário.
4. Simular operações bancárias, chamando os métodos como depositar(),
sacar(), descontarTaxa(), aplicarRendimento() e receberSalario().
5. Exibir os dados das contas, verificando o saldo final após as operações.
*/

public class Ex3 implements Exercise {

    @Override
    public void run(Scanner sc) {
        System.out.println("--- Exercício 3 ---\n");

        
    }
}