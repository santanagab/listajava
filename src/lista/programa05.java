/* 5. A prefeitura de João Pessoa abriu uma linha de crédito para os funcionários municipais. O valor máximo da prestação não poderá ultrapassar 30% do salário bruto. Fazer um algoritmo que permita entrar com o salário bruto e o valor da
prestação e informar se o empréstimo pode ou não ser concedido. (comando if) */

package lista;

import java.util.Scanner;

public class programa05 {

    public static void main(String[] args) {

        Scanner dados = new Scanner(System.in);
        System.out.println("Informe nome do(a) funionário(a): ");
        System.out.println("Informe salário: R$ ");
        float salario_bruto = dados.nextFloat();

        System.out.println("Informe valor da parcela do emprestimo: R$ ");
        var parcela = dados.nextFloat();

        double percent = (30 / 100);
        var max = salario_bruto * percent;

        if (parcela > salario_bruto) {
            System.out.println("ATENÇÃO: EMPRÉSTIMO RECUSADO. Valor da parcela extrapola 30% do salário informado");

        }else{
            System.out.println("ATENÇÃO: EMPRÉSTIMO APROVADO! Entre em contato com a nossa Central através do número 0800 1313 500 para mais informações");
        }
    }
}
