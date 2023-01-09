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
        // o nome tem q ter no minimo 3 caractere
        

        String name;
        do { // Keep asking for the name until it is valid
        System.out.print("Enter your name: ");
        name = scan.nextLine(); // Read in a line of input

        if (name.length() < 3) {
            System.out.println("Name must be at least 3 characters long. Please try again.");
        }
        } while (name.length() < 3); // Repeat if the name is not long enough

        System.out.println("Valid name!");
    

        int salario;
        do {
            System.out.println("Digite seu Salario: ");
            salario = scan.nextInt();

            if (salario == 0) {
                System.out.println("salario nao valido");
            }
            } while (salario == 0);
            System.out.println("Valid salario!");
        
        
    }
}
