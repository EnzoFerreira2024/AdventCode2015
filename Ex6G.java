
package com.mycompany.ex6g;
import java.util.Scanner;
public class Ex6G {

    public static void main(String[] args) {
  Scanner ronaldo = new Scanner(System.in);
        System.out.println("Digite uma palavra:");
        String p = ronaldo.nextLine();
        ronaldo.close();
        
        if (epalindromo(p)) {
            System.out.println(p + " e um palindromo.");
        } else {
            System.out.println(p + " nao e um palindromo.");
        }
    }
    
    public static boolean epalindromo(String pala) {
        
        pala = pala.replaceAll("s+", "").toLowerCase();
        
        int left = 0;
        int right = pala.length()- 1;
        
        while (left < right) {
            if (pala.charAt(left) != pala.charAt(right)) {
                
            }
            left++;
            right--;
        }
        
        return true;   
    }
}
