/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex3g;

import java.util.Scanner;

/**
 *
 * @author PTC_AppDev_Trainee
 */
public class Ex3G {

    public static void main(String[] args) {
        Scanner ronaldooooo = new Scanner(System.in); 
        Ex3Gsm a = new Ex3Gsm();
        System.out.println("Digite uma frase");
        a.Frase = ronaldooooo.next();
        System.out.println("A sua frase tem um total de caracteres de: "+a.Frase.length()+ " caracteres");
    }
}
