import java.util.Scanner;

public class ConversaoMedidas {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        double pes, polegadas, jardas, milhas;

        System.out.print("Digite a medida em pés: ");
        pes = leia.nextDouble();

        polegadas = pes * 12;
        jardas = pes / 3;
        milhas = pes / 5280;

        System.out.println("Em polegadas: " + polegadas);
        System.out.println("Em jardas: " + jardas);
        System.out.println("Em milhas: " + milhas);

        leia.close();
    }
}
