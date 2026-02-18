import java.util.Scanner;

public class SalarioComComissao {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        double salarioFixo, vendas, comissao, salarioFinal;

        System.out.print("Digite o salário fixo: ");
        salarioFixo = leia.nextDouble();

        System.out.print("Digite o valor das vendas: ");
        vendas = leia.nextDouble();

        comissao = vendas * 0.04;
        salarioFinal = salarioFixo + comissao;

        System.out.println("A comissão é: " + comissao);
        System.out.println("O salário final é: " + salarioFinal);

        leia.close();
    }
}
