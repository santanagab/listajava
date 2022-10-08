/* 7. Uma pousada estipulou o preço da diária em R$ 40,00 e mais uma taxa de serviços diários de:

        • R$ 15,00, se o número de dias for menor que 10;
        • R$ 8,00, se o número de dias for maior ou igual a 10.

Criar um programa em Java que informe o nome, o valor da conta de cada cliente e ao final o total arrecadado pela pousada. (Comando while) */

package lista;

import java.util.Scanner;

public class programa07 {
    public static void main(String[] args) {

        var cadastro_cliente = true;
        var valor_diaria = 40;
        var total = 0;


        while (cadastro_cliente == true) {


            Scanner ficha = new Scanner(System.in);
            System.out.print("Nome do hóspede: ");
            String nome = ficha.next();
            System.out.print("Diárias: ");
            float diaria = ficha.nextFloat();

            if (diaria < 10) {
                var conta = (diaria * valor_diaria) + (diaria * 15);
                total += conta ;
                System.out.println("Valor da hospedagem: R$ " + conta);
            }else {
                var conta = (diaria * valor_diaria) + (diaria * 8);
                total += conta ;
                System.out.println("Valor da hospedagem: R$ " + conta);

            }Scanner cadastrar = new Scanner(System.in);
            System.out.println("Deseja cadastrar outro hóspede? Digite 'SIM' para cotinuar  ou 'NAO' para finalizar o programa: ");
            String novo = cadastrar.next();


            if (novo.equals("SIM".toUpperCase())) {
                cadastro_cliente = true;

            }else {
                cadastro_cliente = false;
                System.out.println("Total arrecadado pela pousada: R$ " + total );
                System.out.println("Programa finalizado");
            }
        }

    }
}