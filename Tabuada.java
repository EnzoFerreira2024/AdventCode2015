/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tabuada;

import java.util.Scanner;

/**
 *
 * @author PTC_AppDev_Trainee
 */
public class Tabuada {

    public static void main(String[] args) {
Scanner ronaldooooo = new Scanner(System.in);   
        System.out.println("Digite um nº para a sua taboada");
       int n = ronaldooooo.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(n*i);
            
        }
  

    }
}
