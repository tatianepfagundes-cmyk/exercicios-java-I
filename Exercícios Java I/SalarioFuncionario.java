import java.util.Scanner;

public class SalarioFuncionario {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        double salarioBase, gratificacao, imposto, salarioFinal;

        System.out.print("Digite o salário base: ");
        salarioBase = leia.nextDouble();

        gratificacao = salarioBase * 0.05;
        salarioBase = salarioBase + gratificacao;

        imposto = salarioBase * 0.07;
        salarioFinal = salarioBase - imposto;

        System.out.println("O salário a receber é: " + salarioFinal);

        leia.close();
    }
}
