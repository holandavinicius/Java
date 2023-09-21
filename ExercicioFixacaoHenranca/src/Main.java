import entities.Produto;
import entities.ProdutoImportado;
import entities.ProdutoUsado;

import javax.naming.ServiceUnavailableException;
import javax.xml.crypto.Data;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        int n;
        String opcao, nome, dataInput;
        double preco, taxa;
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy");

        Scanner sc = new Scanner(System.in);
        List<Produto> listaProdutos = new ArrayList<>();

        System.out.print("Digite o numero de produtos: ");
        n = sc.nextInt();

        for(int i=0; i<n; i++){
            System.out.print("Comum, usado ou importado (c/u/i)? ");
            opcao = sc.next();
            System.out.print("Nome do produto: ");
            nome = sc.next();
            System.out.print("Preço do produto: ");
            preco = sc.nextDouble();
            switch (opcao) {
                case "c" -> {
                    Produto produtoC = new Produto(nome, preco);
                    listaProdutos.add(produtoC);
                }
                case "u" -> {
                    System.out.println("Data de fabricacao (dd/mm/yyyy): ");
                    String dataString = sc.next();
                    Date data = dateFormat.parse(dataString);
                    Produto produtoU = new ProdutoUsado(nome, preco, data);
                    listaProdutos.add(produtoU);
                }
                case "i" -> {
                    System.out.print("Taxa de importacao: ");
                    taxa = sc.nextDouble();
                    Produto produtoI = new ProdutoImportado(nome, preco, taxa);
                    listaProdutos.add(produtoI);
                }
            }
        }
        for(Produto produto : listaProdutos){
            System.out.println("\n");
            System.out.println(produto.etiqueta());
        }
    }
}
