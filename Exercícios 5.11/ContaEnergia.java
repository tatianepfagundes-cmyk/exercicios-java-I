import java.util.Scanner;

public class ContaEnergia {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        double salarioMinimo, quantidadeQuilowatts;
        double valorQuilowatt, valorTotal, desconto, valorComDesconto;

        System.out.print("Digite o valor do salário mínimo: ");
        salarioMinimo = leia.nextDouble();

        System.out.print("Digite a quantidade de quilowatts consumidos: ");
        quantidadeQuilowatts = leia.nextDouble();

        valorQuilowatt = salarioMinimo / 5;

        valorTotal = quantidadeQuilowatts * valorQuilowatt;

        desconto = valorTotal * 0.15;

        valorComDesconto = valorTotal - desconto;

        System.out.println("Valor de cada quilowatt: " + valorQuilowatt);
        System.out.println("Valor total da conta: " + valorTotal);
        System.out.println("Valor com desconto: " + valorComDesconto);

        leia.close();
    }
}
