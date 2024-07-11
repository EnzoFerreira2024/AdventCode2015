package com.mycompany.imc;

import java.util.Scanner;

public class IMC {

    public static void main(String[] args) {

        //IMC = peso / (altura x altura)
        Scanner ronaldooooo = new Scanner(System.in); 
        dados a = new dados();
        System.out.println("Digite o seu peso");
        a.peso = ronaldooooo.nextDouble();
        System.out.println("Digite a sua altura");
        a.altura = ronaldooooo.nextDouble();
        
        double imc=a.peso/(a.altura*a.altura);
        System.out.println(imc);
        
        if (imc<18.5) {
            System.out.println("magreza");
        }else if (imc<24.9){
            System.out.println("normal");            
        }else if (imc < 30){
            System.out.println("sobrepeso");
        }else if (imc > 30){
            System.out.println("obsidade");
        }
            
        
    }
}
