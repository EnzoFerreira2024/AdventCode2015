/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex11g;

import java.util.Scanner;

/**
 *
 * @author PTC_AppDev_Trainee
 */
public class Ex11G {

    public static void main(String[] args) {
        Scanner portugal = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        String numero = portugal.nextLine();
        
        int soma = somaDigitos(numero);
        
        System.out.println("A soma dos numeros é:" + soma);
        
        portugal.close();
    }
    
    public static int somaDigitos(String numero) {
        int soma = 0;
        for (int i = 0; i < numero.length(); i++) {
            char digitoChar = numero.charAt(i);
            int digito = Character.getNumericValue(digitoChar);
            soma += digito;
        }
        return soma;
    }
}
