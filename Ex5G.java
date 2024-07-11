
package com.mycompany.ex5g;

import java.util.Scanner;

public class Ex5G {

    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

        System.out.print(" insira uma frase: ");
        String frase = scanner.next();
        for (int i = frase.length() -1; i >= 0; i--) {
            System.out.println(frase.charAt(i));
        }
        scanner.close();
    }
}
