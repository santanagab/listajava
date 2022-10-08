/* 3. Uma empresa decidiu dar 20% de aumento aos funcionários cujos salários são inferiores a 500 reais. Escreva um programa que leia o salário de vários funcionários se mostre o valor do salário reajustado ou uma mensagem caso o funcionário não tenha direito ao aumento. O programa será encerrado quando se digitar “fim” para o nome do funcionário. (Comando while) */ 

package lista;

import java.util.Scanner;

public class programa03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        var opcao = "";
        
        while (!opcao.equalsIgnoreCase("fim")){
            System.out.println("Informe o nome do Funcionario: ");
            String nomeFuncionario = sc.nextLine();

            System.out.println("Informe o salário: ");
            double salario = Double.parseDouble(sc.nextLine());

            if (salario < 500) {
                salario = salario + (salario * 0.2f);
                System.out.println("O novo salário é " + salario);
            } else {
                System.out.println("O funcionário " + nomeFuncionario + "não tem direito ao reajuste de 20%");
            }
            System.out.println("Digite FIM para finalizar o programa: ");
            opcao = sc.nextLine();
        }

    }
}

