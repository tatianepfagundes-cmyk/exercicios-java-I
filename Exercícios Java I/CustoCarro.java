import java.util.Scanner;

public class CustoCarro {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        double precoFabrica, percentualLucro, percentualImpostos;
        double lucro, impostos, precoFinal;

        System.out.print("Digite o preço de fábrica: ");
        precoFabrica = leia.nextDouble();

        System.out.print("Digite o percentual de lucro do distribuidor: ");
        percentualLucro = leia.nextDouble();

        System.out.print("Digite o percentual de impostos: ");
        percentualImpostos = leia.nextDouble();

        lucro = precoFabrica * (percentualLucro / 100);
        impostos = precoFabrica * (percentualImpostos / 100);

        precoFinal = precoFabrica + lucro + impostos;

        System.out.println("Valor do lucro do distribuidor: " + lucro);
        System.out.println("Valor dos impostos: " + impostos);
        System.out.println("Preço final do carro: " + precoFinal);

        leia.close();
    }
}
