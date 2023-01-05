package br.com.dio.exercicios.euexercicios;

import java.text.BreakIterator;
import java.util.Scanner;

public class questao1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("digite um valor entre zero a dez: ");
        int nota = scan.nextInt();
        while (nota < 0 | nota > 10) {
            System.out.println("valor incorreto");
            System.out.println("digite outro valor: ");
            nota = scan.nextInt();
        }
        System.out.println("valor valido: "+ nota);
        
    }
}
