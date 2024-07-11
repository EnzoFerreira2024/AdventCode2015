package com.mycompany.primos;
import java.util.Scanner;
public class Primos {
    public static void main(String[] args) {
        Scanner ronaldooooo = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("Escolha uma opcao, DIGITE O NUMERO:");
            System.out.println("1. Verificar se um número é primo");
            System.out.println("2. Listar números primos até um limite");
            System.out.println("0. Sair");
            System.out.print("Insira uma operação: ");
            opcao = ronaldooooo.nextInt();
            switch (opcao) {
                case 1:
                    System.out.print("Insira um numero: ");
                    int numero = ronaldooooo.nextInt();
                    if (ePrimo(numero)) {
                        System.out.println(numero + " é um número primo.");
                    } else {
                        System.out.println(numero + " não é um número primo.");
                    }
                    break;
                case 2:
                    System.out.print("Insira um limite: ");
                    int limite = ronaldooooo.nextInt();
                    listarPrimosAte(limite);
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    break;
                default:
                    System.out.println("Opcao invalida. Tente novamente.");
                    break;
                    
            }
        } while (opcao != 0);
        ronaldooooo.close();
    }
    public static boolean ePrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void listarPrimosAte(int limite) {
        System.out.println("Números primos até " + limite + ":");
        for (int i = 2; i <= limite; i++) {
            if (ePrimo(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}