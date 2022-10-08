/*Faça um programa que receba duas notas de seis alunos, calcule e mostre (comando for):

    • A média aritmética das duas notas de cada aluno;
    • A mensagem que está na tabela a seguir:

        Média aritmética Mensagem:

        • Abaixo de 3.0 -> Reprovado
        • de 3.0 a 7.0 -> Exame
        • Acima de 7.0 -> Aprovado


    • O total de alunos aprovados;
    • O total de alunos de exame;
    • Total de alunos reprovados;
    • A média da classe. */

package lista;

import java.text.DecimalFormat;
import java.util.Scanner;

public class programa06 {
    static DecimalFormat df = new DecimalFormat("0.0");

    public static void main(String[] args) {

        var aluno = 1;
        var aprovados = 0;
        var exame = 0;
        var reprovados = 0;
        var classe_media = 0;
        var total_aluno = 0;
        var total = 0;

        for (int i = 0; i < 6; i++){

            Scanner nota = new Scanner(System.in);
            System.out.println("Aluno: "+ aluno++);
            System.out.println("Primeira nota: ");
            float nota1 = nota.nextFloat();
            System.out.println("Segunda nota: ");
            float nota2 = nota.nextFloat();

            var media = (nota1 + nota2) / 2;
            System.out.println("Média: " +df.format(media));

            classe_media += nota1 + nota2;
            total_aluno++;
            var media_alunos = classe_media / total_aluno;
            total = media_alunos;

            if (media < 3){
                System.out.println("Reprovado");
                reprovados++;

            }else if (media >= 3 & media <= 7){
                System.out.println("Exame");
                exame++;

            }else{
                System.out.println("Aprovado");
                aprovados++;
            }
        }

        System.out.println("Total alunos aprovados: " + aprovados);
        System.out.println("Total alunos reprovados: " + reprovados);
        System.out.println("Total alunos em exame: " + exame);
        System.out.println("Médida da classe: " +df.format(total));
    }


}
