
package com.mycompany.temperatura;



import java.util.Scanner;

public class Temperatura {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcao;
//Escolhas
        do {
            System.out.println("Escolha o tipo de temperatura que deseja converter, DIGITE O NÚMERO:");
            System.out.println("1. Celsius para Fahrenheit");
            System.out.println("2. Fahrenheit para Celsius");
            System.out.println("0. Sair");
            System.out.print("Insira uma operação: ");
            opcao = input.nextInt();
//se para a temperatura
            if (opcao != 0) {
                System.out.print("Insira a temperatura: ");
                double temperatura = input.nextDouble();
                double resultado;
//switch para o case
                switch (opcao) {
                    case 1:
                        resultado = celsiusParaFahrenheit(temperatura);
                        System.out.printf("A temperatura em Fahrenheit é: %.2f°F\n", resultado);
                        break;
                    case 2:
                        resultado = fahrenheitParaCelsius(temperatura);
                        System.out.printf("A temperatura em Celsius é: %.2f°C\n", resultado);
                        break;
                    default:
                        System.out.println("ERRO");
                        break;
                }   
            }       
        } while (opcao != 0);

        System.out.println("FIM.");
        input.close();
    }
//Contas:
    public static double celsiusParaFahrenheit(double celsius) {
        return (celsius * 1.8) + 32;
    }
    public static double fahrenheitParaCelsius(double fahrenheit) {
        return (fahrenheit - 32) / 1.8;
    }
}
