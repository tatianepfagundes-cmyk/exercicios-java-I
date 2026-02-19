import java.util.Scanner;

public class MediaPonderada {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        double nota1, nota2, nota3;
        double peso1, peso2, peso3;
        double somaProdutos, somaPesos, media;

        System.out.print("Digite a primeira nota: ");
        nota1 = leia.nextDouble();
        System.out.print("Digite o peso da primeira nota: ");
        peso1 = leia.nextDouble();

        System.out.print("Digite a segunda nota: ");
        nota2 = leia.nextDouble();
        System.out.print("Digite o peso da segunda nota: ");
        peso2 = leia.nextDouble();

        System.out.print("Digite a terceira nota: ");
        nota3 = leia.nextDouble();
        System.out.print("Digite o peso da terceira nota: ");
        peso3 = leia.nextDouble();

        somaProdutos = (nota1 * peso1) + (nota2 * peso2) + (nota3 * peso3);
        somaPesos = peso1 + peso2 + peso3;

        media = somaProdutos / somaPesos;

        System.out.println("A média ponderada é: " + media);

        leia.close();
    }
}
