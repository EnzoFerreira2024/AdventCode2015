/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.inverter;

import java.util.Scanner;



/**
 *
 * @author PTC_AppDev_Trainee
 */

   public class Main {
    public static void main(String[] args) {
       String original = "trtrtrtr";
       String invertida = "";
       for(int i = original.length() -1; i>= 0 ; i--){
           invertida+= original.charAt(i);
       }
        System.out.println(invertida);
    }
}

    

