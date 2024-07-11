/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ex13g;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author PTC_AppDev_Trainee
 */
public class Ex13G {

    public static void main(String[] args) {
//         Scanner portugal = new Scanner(System.in);      
//        System.out.print("Digite o nº de vezes para um nº aleatório ser gerado: ");
//        int numero = portugal.nextInt();
//        
//        
//        
//        for (int i = 0; i < numero; i++) {      
//           Random gerador = new Random(); 
//           int moeda = gerador.nextInt(1); 
//           if (moeda==moeda) {
//                System.out.println(moeda+"=cara");
//            }else{
//                System.out.println(moeda+"=coroa");  
//   
        Scanner portugal = new Scanner(System.in);
        System.out.print("Digite o nº de vezes para um nº aleatório ser gerado: ");

        int numero = portugal.nextInt();

        int caras= 0;
        int coroas = 0;
        for (int i = 0; i < numero; i++) {
            Random gerador = new Random();
            int moeda = gerador.nextInt(2) + 1;
//           int moeda = gerador.nextInt(1); 

            if (moeda == 1) {
                System.out.println(moeda + "=cara");
                caras++;
            } else if (moeda == 2) {
                System.out.println(moeda + "=coroa");
                coroas++;             
            }
        }
        double percentagemCaras = (double)(caras/numero)*100;
        double percentagemCoroas = (coroas/numero)*100;
        System.out.println("caras:" + caras);
        System.out.println("coroas:" + coroas);
        System.out.println("%caras:" + percentagemCaras);
        System.out.println("%coroas: " + percentagemCoroas);
    }
}
