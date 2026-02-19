import java.util.Scanner;

public class CalculoIdade {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int anoNascimento, anoAtual, idadeAnos;
        int idadeMeses, idadeDias, idadeSemanas;

        System.out.print("Digite o ano de nascimento: ");
        anoNascimento = leia.nextInt();

        System.out.print("Digite o ano atual: ");
        anoAtual = leia.nextInt();

        idadeAnos = anoAtual - anoNascimento;

        idadeMeses = idadeAnos * 12;
        idadeDias = idadeAnos * 365;
        idadeSemanas = idadeAnos * 52;

        System.out.println("Idade em anos: " + idadeAnos);
        System.out.println("Idade em meses: " + idadeMeses);
        System.out.println("Idade em dias: " + idadeDias);
        System.out.println("Idade em semanas: " + idadeSemanas);

        leia.close();
    }
}
