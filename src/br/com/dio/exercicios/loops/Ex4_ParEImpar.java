package br.com.dio.exercicios.loops;

import java.util.Scanner;

/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*/
public class Ex4_ParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantNumeros;//qtd de numeros q eu quero
        int numero;
        int quantPares = 0, quantImpares = 0;

        System.out.println("Quantidade de números: ");
        quantNumeros = scan.nextInt();

        //o contador primeiro
        int count = 0;// pra parar o loop
        do {
            System.out.println("Número: ");
            numero = scan.nextInt();
//          pra verificar e incrementa o val de impar e par
            if (numero % 2 == 0 ) quantPares++;//vai ser atribuido 1 ao quantPares, pra contar os nums de par
            else quantImpares++;

            count++;// ele vai fica a vida inteira se nao tiver ele
        } while(count < quantNumeros);// a qtd que foi enformada em qtdd

        System.out.println("Quantidade Par: " + quantPares);
        System.out.println("Quantidade Ímpar: " + quantImpares);
    }
}
