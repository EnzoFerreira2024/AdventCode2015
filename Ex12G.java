/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex12g;

import java.util.Random;

/**
 *
 * @author PTC_AppDev_Trainee
 */
public class Ex12G {

    public static void main(String[] args) {
Random gerador = new Random();
        int dado1 = gerador.nextInt(6)+1; 
        System.out.println("Dado 1: " + dado1);
         int dado2 = gerador.nextInt(6); 
        System.out.println("Dado 2: " + dado2);
            int res=dado1+dado2;

        if (dado1==dado2) {
            System.out.println("Soma dos dados " + res);
            System.out.println("Double de " +dado1);
        }else if (dado1!=dado2) {
            System.out.println("Soma dos dados " + res);           
        }
    }
}
