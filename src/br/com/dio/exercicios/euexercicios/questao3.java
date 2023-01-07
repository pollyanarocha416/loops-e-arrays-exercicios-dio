package br.com.dio.exercicios.euexercicios;

import java.util.Scanner;

//Faça um programa que leia e valide as seguintes 
//informações:
//Nome: maior que 3 caracteres;
//Idade: entre 0 e 150;
//Salário: maior que zero;
//Sexo: 'f' ou 'm';
//Estado Civil: 's', 'c', 'v', 'd';
public class questao3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String[] letras = new String[6];

        // o nome tem q ter no minimo 3 caractere

        System.out.println("Digite seu nome: ");
        String nome = scan.next();

        System.out.println("Digite seu idade: ");
        int idade = scan.nextInt();
        
        System.out.println("Digite seu Salario: ");
        int Salario = scan.nextInt();
        
        System.out.println("Digite seu sexo: ");
        String sexo = scan.next();

        System.out.println("Digite seu Estado Civil: S(solteiro), C(casado), V(viuvo) ou D(divorciado) ");
        String estadocvl = scan.next();
    }
}
