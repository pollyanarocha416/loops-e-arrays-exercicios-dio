package br.com.dio.exercicios.euexercicios;

import java.util.Scanner;

// Faça um programa que leia um nome de usuário e a sua senha 
//e não aceite a senha igual ao nome do usuário,
// mostrando uma mensagem de erro e voltando a pedir as informações.
public class questao2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite seu user: ");
        String usuario = scan.nextLine();

        System.out.println("Digite sua senha: ");
        String senha = scan.nextLine();

        while (usuario.equals(senha)) {
            System.out.println("sua senha/usuario não pode ser igual ao seu usuario/senha!");
            System.out.println("Digite novamente seu usuario: ");
            usuario = scan.nextLine();
            System.out.println("digite novamente sua senha: ");
            senha = scan.nextLine();
        }
        System.out.println("usuario e senha validos: "+usuario+ " "+senha );


    }
}
