package com.mycompany.euromelhoes;

import java.util.Random;

public class Euromelhoes {

    public static void main(String[] args) {

        // declara um array (vazio) de inteiros de 6 posições
        int[] arrNumeros = new int[6];
        int[] arrEstrelas = new int[2];
        
        // declara variaável para armazenar a quantidade de números sorteados
        int numerosSorteados = 0;
        int estrelasSorteados = 0;
        
        // declara um object do tipo random para gerar valores aleatórios
        Random random = new Random();

        // ciclo que vai ser executado até serem gerados 6 números aleatórios
        while (numerosSorteados <= 5) {

            // gera um número aleatório entre 1 e 50
            int numero = random.nextInt(50) + 1;

            // imprime o valor aleatório gerado
            //System.out.println("Número sorteado:" + numero);
            //verifica se o número acabado de gerar existe no array
            boolean existe = numeroExisteNoArray(arrNumeros, numero);

            //caso o número gerado não exista é adicionado ao array
            if (existe == false) {
                //adiciona número gerado ao array
                arrNumeros[numerosSorteados] = numero;

                //incrementa várias com o número de valores sorteado (não repetidos)
                numerosSorteados++;
            }
                         
        }        

        // ciclo que vai ser executado até serem gerados 2 números aleatórios (estrelas)
        while (estrelasSorteados <= 1) {

            // gera um número aleatório entre 1 e 50
            int estrela = random.nextInt(12) + 1;

            // imprime o valor aleatório gerado
            //System.out.println("Número sorteado:" + numero);
            //verifica se o número acabado de gerar existe no array
            boolean existe = numeroExisteNoArray(arrEstrelas, estrela);

            //caso o número gerado não exista é adicionado ao array
            if (existe == false) {
                //adiciona número gerado ao array
                arrEstrelas[estrelasSorteados] = estrela;

                //incrementa várias com o número de valores sorteado (não rpetidos)
                estrelasSorteados++;
            }
        }
        //Chave gerada:
        //Numeros=12 4 23 50 45 10         
        //Estrelas=6 12
        
        // percorrer o arrayNumeros e imprimi-los na mesma linha separados por espaço
        System.out.print("Números=");
        for (int i = 0; i < arrNumeros.length; i++) {
            System.out.print(arrNumeros[i]+ " ");
        }
        System.out.println(" ");
        // percorrer o arrayEstrelas e imprimi-los na mesma linha separados por espaço
        System.out.print("Estrelas=");
        for (int i = 0; i < arrEstrelas.length; i++) {
            System.out.print(arrEstrelas[i]+ " ");
        }
    }
    
    public static boolean numeroExisteNoArray(int[] array, int num) {

        //ciclo for pela quantidade de vezes do array.length
        for (int i = 0; i < array.length; i++) {

            //se array for igual a numero
            if (array[i] == num) {
                //retorna valor verdadeiro (false) caso encontre valor já existente no array
                return true;
            }
        }
        return false;

    }
}
