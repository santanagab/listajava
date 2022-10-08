package lista;

public class programa09 {

    public void emprestimo(String nome,int idade, double valorEmprestimo, double jurosEmprestimo,int mesesParaPagar) {

        if (idade >= 18 & idade < 23) {
            double calculo =  (valorEmprestimo / mesesParaPagar) * jurosEmprestimo;
            String resultado = String.format("%.2f", calculo);
            String calculo_emprest = String.format("%.2f", valorEmprestimo);

            System.out.println("Nome do cliente: " + nome);
            System.out.println("Valor do empréstimo: R$ " + valorEmprestimo);
            System.out.println("Juros: " + jurosEmprestimo + " %");
            System.out.println("Total de meses: " + mesesParaPagar);
            System.out.println("Valor total do empréstimo: R$" + resultado);

        } else if (idade > 23 && idade <= 33) {
            double calculo = (valorEmprestimo * mesesParaPagar) / jurosEmprestimo;
            String resultado = String.format("%.2f", calculo);
            String calculo_emprest = String.format("%.2f", valorEmprestimo);

            System.out.println("Nome do cliente: " + nome);
            System.out.println("Valor do empréstimo: R$ " + calculo_emprest);
            System.out.println("Juros: " + jurosEmprestimo + " %");
            System.out.println("Total de meses: " + mesesParaPagar);
            System.out.println("Valor total do empréstimo: R$" + resultado);
        }
    }
}

