package com.mycompany.ex10g;
import java.util.Scanner;

public class Ex10G {
    public static void main(String[] args) {
        
        int limite = 1000;
        System.out.println("Números primos até " + limite + ":");
        for (int i = 2; i <= limite; i++) {
            if (ePrimo(i)) {
                System.out.print(i + " ");
            }
        }
        
    }
    
    public static boolean ePrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}
