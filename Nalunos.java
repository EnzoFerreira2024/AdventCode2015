/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.nalunos;
import java.util.Scanner;

/**
 *
 * @author PTC_AppDev_Trainee
 */
public class Nalunos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Indique por favor o número de alunos:");
        int nralunos = scanner.nextInt();

        int[] notas = new int[nralunos];
        for (int i = 0; i < nralunos; i++) {
            System.out.println("Indique por favor a nota número " + (i+1) + ":");
            int nota = scanner.nextInt();
            notas[i] = nota;
        }
        scanner.close();
    }
}

    

