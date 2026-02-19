import java.util.Scanner;

public class DescontoProduto {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        double preco, novoPreco;

        System.out.print("Digite o preço do produto: ");
        preco = leia.nextDouble();

        novoPreco = preco - (preco * 0.10);

        System.out.println("O novo preço com desconto é: " + novoPreco);

        leia.close();
    }
}
