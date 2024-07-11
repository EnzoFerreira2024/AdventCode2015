
package com.mycompany.troca_de_linha;

public class Troca_de_linha {

    public static void main(String[] args) {
int nu = 5; 
        printAsteriskTriangle(nu);
    }

    public static void printAsteriskTriangle(int lines) {
        for (int i = 1; i <= lines; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}    
   
