/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex4g;

import java.util.Scanner;

/**
 *
 * @author PTC_AppDev_Trainee
 */
public class Ex4G {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(" insira uma frase: ");
        String frase = scanner.next();

        for (int i = 0; i < frase.length(); i++) {
            System.out.println(frase.charAt(i));
        }
        scanner.close();
    }
}