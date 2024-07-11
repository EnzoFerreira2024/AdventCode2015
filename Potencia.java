package com.mycompany.potencia;
import java.util.Scanner;
public class Potencia {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Solicita ao usuário a2 base e o expoente
        System.out.print("Digite a base: ");
        long base = scanner.nextInt();
        System.out.print("Digite o expoente: ");
        long expoente = scanner.nextInt();
        long resultado = 1;
        for (long i = 0; i < expoente; i++) {
            resultado *= base;
        }
        // resultado
        System.out.println("O resultado de " + base + "^" + expoente + " e: " + resultado);
    }
}