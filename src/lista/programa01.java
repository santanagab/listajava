/* 1. Faça um programa que receba o valor dos créditos galácticos de um Star trooper e o percentual de aumento, calcule e mostre os créditos galácticos com o novo aumento. */

package lista;

import java.util.Scanner;

public class programa01 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o valor dos Créditos Galáticos (CG$): ");
        float creditos = entrada.nextFloat();

        System.out.println("Informe o % de aumento: ");
        float percentual = entrada.nextFloat();

        percentual = (percentual/100);
        float valorAumento = creditos * percentual;
        float novoValor = creditos + valorAumento;
        System.out.println("Créditos Galáticos: CG$ " + creditos);
        System.out.println("Aumento: CG$ " + valorAumento);
        System.out.println("Novo valor dos Créditos Galáticos: CG$ " + novoValor);
    }
}

