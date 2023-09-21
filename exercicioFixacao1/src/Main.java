import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double opcao;

        Scanner escolher = new Scanner(System.in);
        System.out.println("Criando conta");
        Conta conta1 = new Conta(11123, "Vinicius");
        System.out.println(conta1.toString());
        System.out.print("Valor deposito: ");
        opcao = escolher.nextDouble();
        conta1.depositar(opcao);
        System.out.println(conta1.toString());
        System.out.print("Valor sacar: ");
        opcao = escolher.nextDouble();
        conta1.sacar(opcao);
        System.out.println(conta1.toString());

    }
}