import java.util.Scanner;

public class CalculoSalario {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        double horasTrabalhadas;
        double salarioMinimo;
        double valorHora, salarioBruto, imposto, salarioFinal;

        System.out.print("Digite o número de horas trabalhadas: ");
        horasTrabalhadas = leia.nextDouble();

        System.out.print("Digite o valor do salário mínimo: ");
        salarioMinimo = leia.nextDouble();

        valorHora = salarioMinimo / 10;

        salarioBruto = horasTrabalhadas * valorHora;

        imposto = salarioBruto * 0.03;

        salarioFinal = salarioBruto - imposto;

        System.out.println("Valor da hora trabalhada: " + valorHora);
        System.out.println("Salário bruto: " + salarioBruto);
        System.out.println("Imposto: " + imposto);
        System.out.println("Salário a receber: " + salarioFinal);

        leia.close();
    }
}