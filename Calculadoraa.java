package com.mycompany.calculadoraa;

import java.util.Scanner;

public class Calculadoraa {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("Escolha a opera√ß√£o, coloque o numero:");
            System.out.println("1. +");
            System.out.println("2. -");
            System.out.println("3. *");
            System.out.println("4. /");
            System.out.println("insira uma op√ß√£o ");
            opcao = input.nextInt();
            if (opcao != 0) {
                System.out.println("Insira o primeiro n∫");
            }
            double n1 = input.nextDouble();
            System.out.println("Insira o segundo n∫");
            double n2 = input.nextDouble();
            switch (opcao) {
                case 1:
                    System.out.println("Soma: " + (n1 + n2));
                    System.out.println(" ");
                    break;
                case 2:
                    System.out.println("SubtraÁ„o: " + (n1 - n2));
                    System.out.println(" ");
                    break;
                case 3:
                    System.out.println("Multiplicasao: " + (n1 * n2));
                    System.out.println(" ");
                    break;
                case 4:
                    System.out.println("Divisao: " + (n1 / n2));
                    System.out.println(" ");
                    System.out.println(" ");
            }
        } while (opcao != 0);
        System.err.println("Programa errado");
    }
}
