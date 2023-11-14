import entities.Contribuintes;
import entities.PessoaFisica;
import entities.PessoaJuridica;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);
        List<Contribuintes> list = new ArrayList<>();

        System.out.print("Digite o número de contribuintes: ");
        int n = sc.nextInt();

        for (int i = 1; i<=n; i++){
            System.out.println("Dados do contribuinte #" + i + ": ");
            System.out.print("Pessoa física ou jurídica (f/j)?");
            char ch = sc.next().charAt(0);
            if (ch == 'f'){
                System.out.print("Nome: ");
                String nome = sc.next();
                System.out.print("Renda anual: ");
                double renda = sc.nextDouble();
                System.out.println("Valor gasto com saúde:");
                double gastosComSaude = sc.nextDouble();

                list.add(new PessoaFisica(nome, renda, gastosComSaude));
            }

            else{
                System.out.print("Nome da empresa: ");
                String nome = sc.next();
                System.out.print("Renda anual: ");
                double renda = sc.nextDouble();
                System.out.print("Número de funcionários: ");
                int numeroDeFuncionarios = sc.nextInt();
                sc.nextLine();

                list.add(new PessoaJuridica(nome,renda,numeroDeFuncionarios));

            }

        }
        System.out.println();
        System.out.print("Impostos pagos: ");
        for (Contribuintes c : list) {
            System.out.println();
            System.out.print(c);
        }
        System.out.println();
        System.out.print("Valor total das taxas: ");
        double soma = 0;
        for (Contribuintes c : list) {
            soma += c.imposto();
        }
        System.out.printf("R$ %.2f%n", soma);
        sc.close();
    }
}