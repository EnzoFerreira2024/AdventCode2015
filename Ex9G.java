
package com.mycompany.ex9g;

public class Ex9G {
    public static void main(String[] args) {
        int[] notas = {12, 7, 14, 10, 9, 8, 19, 20, 13, 2};

        double soma = 0;
        for (int nota : notas) {
            soma += nota;
        }
        double media = soma / notas.length;

        int notaMaisAlta = notas[0]; //int notaMaisAlta = notas[0];
        int notaMaisBaixa = notas[0];
        for (int nota : notas) {
            if (nota > notaMaisAlta) {
                notaMaisAlta = nota;
            }
            if (nota < notaMaisBaixa) {
                notaMaisBaixa = nota;
            }
        }

        int notaminima = 10;

        int nAlunosAprovados = 0;
        int nAlunosReprovados = 0;
        for (int nota : notas) {
            if (nota >= notaminima) {
                nAlunosAprovados++;
            } else {
                nAlunosReprovados++;
            }
        }

        System.out.println("Média das notas: " +media);
        System.out.println("Nota mais alta: " + notaMaisAlta);
        System.out.println("Nota mais baixa: " + notaMaisBaixa);
        System.out.println("Número de alunos aprovados: " + nAlunosAprovados);
        System.out.println("Número de alunos reprovados: " + nAlunosReprovados);
    }
}
