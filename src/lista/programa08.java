/* 8. Leia uma relação de pacientes de uma clínica, cada um com o nome, o sexo, o peso, a idade e a altura. Para sinalizar o fim da lista será fornecido “fim” no nome do último paciente. */

package lista;

import java.util.Scanner;

public class programa08 {

    public static void main(String[] args) {


        var cont_paciente = 0;
        var cont_H = 0;
        var media_H = 0;
        var cont_M = 0;
        var cont_idade = 0;
        var dezoito_vintecinco = 0;
        var altura_MIN = 1.60;
        var altura_MAX = 1.70;
        var idade_velho = 0;
        var nome_velho = "";
        var mulher_baixa = 0.0;
        var nome_mulher_baixa = "";


        var continuar = true;

        while (continuar == true){


            Scanner cadastro = new Scanner(System.in);
            System.out.print("Digite o nome do paciente ou 'FIM' para encerrar o programa:");
            String nome = cadastro.next().toUpperCase();


            if (nome.equals("FIM")) {
                continuar = false;


            }else{
                cont_paciente++;


                System.out.println("Informe o sexo do paciente, sendo 'F' (feminino) e 'M' (masculino): ");
                String sexo = cadastro.next();
                System.out.println("Digite o peso: ");
                float peso = cadastro.nextFloat();
                System.out.println("Digite a idade: ");
                int idade = cadastro.nextInt();
                System.out.println("Digite a altura: ");
                float altura = cadastro.nextFloat();


                if (sexo.equals("F") && altura >= altura_MIN && altura <= altura_MAX && peso > 70) {
                    cont_M ++;


                }if (sexo.equals("M")){
                    cont_H++;
                    cont_idade+= idade;
                    media_H = cont_idade /cont_H;


                }if (sexo.equals("F") || (sexo.equals("M") && idade >= 18 && idade <= 25 )){
                    dezoito_vintecinco++;


                }if (sexo.equals("F")){
                    if (altura > mulher_baixa);{
                        mulher_baixa = altura;
                        nome_mulher_baixa = nome;
                    }


                    if (sexo.equals("F") || (sexo.equals("M"))){

                    }if (idade > idade_velho){
                        idade_velho = idade;
                        nome_velho = nome;

                    }

                }


            }



        }
        System.out.println("Total pacientes: " + cont_paciente);
        System.out.println("Média de idade dos homens: " + media_H);
        System.out.println("Total mulheres com altura entre 1,60 e 1,70 e peso acima de 70kg:" + cont_M);
        System.out.println("Total pessoas com idade entre 18 anos e 25 anos: " + dezoito_vintecinco);
        System.out.println("Nome paciente mais velho:" + nome_velho);
        System.out.println("Nome mulher mais baixa:" + nome_mulher_baixa);

    }

}
