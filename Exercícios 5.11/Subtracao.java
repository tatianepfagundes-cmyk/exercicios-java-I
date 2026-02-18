import java.util.Scanner;

public class Subtracao {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        double numero1, numero2, resultado;

        System.out.print("Digite o primeiro número: ");
        numero1 = leia.nextDouble();

        System.out.print("Digite o segundo número: ");
        numero2 = leia.nextDouble();

        resultado = numero1 - numero2;

        System.out.println("O resultado da subtração é: " + resultado);

        leia.close();
    }
}
