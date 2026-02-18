import java.util.Scanner;

public class CelsiusParaFahrenheit {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        double celsius, fahrenheit;

        System.out.print("Digite a temperatura em Celsius: ");
        celsius = leia.nextDouble();

        fahrenheit = (9 * celsius) / 5 + 32;

        System.out.println("Temperatura em Fahrenheit: " + fahrenheit);

        leia.close();
    }
}
