package exercises;

import java.util.Scanner;

/* 
Exercício 1: Sistema de Gerenciamento de Veículos com Herança
Descrição
Neste exercício, você criará um sistema de gerenciamento de veículos utilizando
herança em Java.
Você deve implementar uma hierarquia de classes, seguindo a estrutura abaixo:
Classe Base: Veículo
A classe Veículo será a superclasse que contém atributos e métodos comuns a
todos os veículos.
Atributos:
marca (String): Marca do veículo.
modelo (String): Modelo do veículo.
ano (int): Ano de fabricação do veículo.
velocidadeAtual (int): Velocidade atual do veículo (inicialmente 0).
Métodos:
acelerar(int velocidade): Aumenta a velocidadeAtual em um valor
especificado.
frear(int velocidade): Reduz a velocidadeAtual, garantindo que não fique
negativa.
exibirDados(): Exibe as informações do veículo.
Subclasses que Herdam de Veículo
1. Classe Carro
Representa um automóvel de passeio.
Atributos adicionais:

numeroPortas (int): Quantidade de portas do carro.
Métodos específicos:

exibirDados(): Exibe os atributos comuns + o número de portas.
2. Classe Moto
Representa uma motocicleta.
Atributos adicionais:

temPartidaEletrica (boolean): Indica se a moto possui partida elétrica.
Métodos específicos:

exibirDados(): Exibe os atributos comuns + se possui partida elétrica.
3. Classe Caminhao
Representa um caminhão de carga.
Atributos adicionais:

capacidadeCarga (double): Capacidade máxima de carga (em toneladas).
Métodos específicos:

exibirDados(): Exibe os atributos comuns + a capacidade de carga.
Tarefas a serem realizadas
1. Criar a classe Veiculo com seus atributos e métodos básicos.
2. Criar as subclasses Carro, Moto e Caminhao, garantindo que herdam
corretamente de Veiculo.
3. Implementar os métodos de cada classe, sobrescrevendo exibirDados()
conforme necessário.
4. Testar o comportamento dos veículos, chamando acelerar(), frear() e
exibirDados() para cada um deles.
*/

public class Ex1 implements Exercise {

    @Override
    public void run(Scanner sc) {
        System.out.println("--- Exercício 1 ---\n");

        
    }
}