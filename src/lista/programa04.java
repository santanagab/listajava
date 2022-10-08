/* 4. Um motorista parou no posto de gasolina, comprou dois refrigerantes e abasteceu o seu carro com gasolina. Leia a quantidade de litros de gasolina foram necessários para abastecer o veículo e informe o valor total da conta desse cliente,
sabendo-se que cada refrigerante custou R$3,00 e o litro de gasolina está custando R$2,50. */

package lista;

import java.util.Scanner;

public class programa04 {
    public static void main(String[] args) {

        Scanner gasolina = new Scanner(System.in);
        System.out.println("Informe o total de litros de gasolina para abastecimento: ".toUpperCase());
        float litragem_gasolina = gasolina.nextFloat();

        var preco_gasolina = 2.50;
        var abastecimento = litragem_gasolina * preco_gasolina;
        var num_refri = 2;
        var preco_refri = 3;
        var total_refri = num_refri * preco_refri;
        var total = total_refri + abastecimento;

        System.out.println("Total litros gasolina: " + litragem_gasolina);
        System.out.println("Valor do litro: " + preco_gasolina);
        System.out.println("Total abastecimento: " + abastecimento);
        System.out.println("Unidades de refrigerante: " + num_refri);
        System.out.println("Valor unitário: R$ " + preco_refri);
        System.out.println("Valor total de bebidas: R$ " + total_refri);
        System.out.println("Valor final: R$ " + total);
    }
    
}
