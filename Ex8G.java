/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex8g;

/**
 *
 * @author PTC_AppDev_Trainee
 */
public class Ex8G {

    public static void main(String[] args) {
 int[] numeros = {11, 10};
        int menor = numeros[0];
        for (int i = 0; i < numeros.length - 1; i++) {
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }
        System.out.println(menor);
    }
}
