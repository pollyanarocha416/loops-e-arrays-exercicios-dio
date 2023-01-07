package br.com.dio.exercicios.euexercicios;

import java.util.Scanner;

public class questaoconsoante {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // Abertura da entrada de fluxo de dados através do teclado
        String vogais = ""; // iniciando a String vazia
        int quantidadeDeVogais = 0;

        while (quantidadeDeVogais < 6) {
            System.out.print("Letra: "); // Peça uma letra
            String letra = scan.next(); // capture essa letra e atribua a variável letra.

            // se a letra informada não for uma vogal
            if (!(letra.equalsIgnoreCase("a") ||
                    letra.equalsIgnoreCase("e") ||
                    letra.equalsIgnoreCase("i") ||
                    letra.equalsIgnoreCase("o") ||
                    letra.equalsIgnoreCase("u"))) {
                // adicione a letra à String de consoantes
                vogais += letra + " ";
                quantidadeDeVogais++;
            }
        }

        System.out.println("Vogais: " + vogais);
        System.out.println("Quantidade de vogais: " + quantidadeDeVogais);

    }
}
