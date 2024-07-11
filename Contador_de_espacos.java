package com.mycompany.contador_de_espacos;
import java.util.Scanner;
public class Contador_de_espacos {

    public static void main(String[] args) {
        Scanner ronaldo = new Scanner(System.in);
        System.out.print("Digite uma frase: ");
        String frase = ronaldo.nextLine();
        int contarPalavras = contarPalavras(frase);
        System.out.println("Número de palavras na frase: " + contarPalavras++);
        ronaldo.close();
    }
    
    public static int contarPalavras(String frase) {
        
        if (frase == null) {
            return 0; 
        }
        
        int contar = 0;
        frase = frase.toLowerCase();
        
        //iterar por cada caractere da string desde o início até ao fim
        for (int i = 0; i < frase.length(); i++) {
            
            //extrai da string o caractare da posição i 
            char ch = frase.charAt(i);
          
            
            //char c = frase.charAt(i);
            //int asc = (int)c;
            
            System.out.println("codigo ascii: " + asc);
            
            //caso o caractere não seja uma vogal incrementa 1 à varíavel contar
            if (ch == ' ') {
                contar++;
            }
            
            //if(asc==32)
            //{
            //    contar++;
            //}

        }
        return contar;
        //return a;
    }
      
  }
 



