/* 2. Faça um programa que leia 10 números inteiros e exiba na tela a mensagem ‘Par’ se ele for um número par, ou ‘Ímpar’ se ele for um número ímpar. (Comando if). */

package lista;

import java.util.Scanner;

public class programa02 {
    public static void main(String[] args) {
        
        int i = 1;

        while (i <= 10) {

            Scanner entrada = new Scanner(System.in);
            System.out.println("Informe um número: ");
            int numero = entrada.nextInt();
            i = i + 1;
            
            if (numero % 2 == 0) {
                System.out.println(numero + " É PAR!");
            } 
            else {
                System.out.println(numero + " É ÍMPAR!");
            }       
        }
    }
}
