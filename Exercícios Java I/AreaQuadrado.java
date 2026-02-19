import java.util.Scanner;

public class AreaQuadrado {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        double lado, area;

        System.out.print("Digite o valor do lado do quadrado: ");
        lado = leia.nextDouble();

        area = lado * lado;

        System.out.println("A área do quadrado é: " + area);

        leia.close();
    }
}
