/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex7g;

/**
 *
 * @author PTC_AppDev_Trainee
 */
public class Ex7G {

    public static void main(String[] args) {
       int[] numeros = {11, 10};
                int maior = 0;
        for (int i = 0; i < numeros.length; i++) {

        if (numeros[i]>maior) {
            maior = numeros[i];
        }
        }
        System.out.println(maior);
    }
}
    
