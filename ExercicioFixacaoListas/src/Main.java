import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        LinkedList<Funcionario> funcionarios = new LinkedList<>();

        int id;
        String nome;
        double salario;

        System.out.print("Numero de funcionarios: ");
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            System.out.print("ID do funcionario: ");
            id = sc.nextInt();

            System.out.print("Nome do funcionario: ");
            nome = sc.next();

            System.out.print("Salario do funcionario: ");
            salario = sc.nextDouble();

            Funcionario funcionario = new Funcionario(id,nome,salario);

            funcionarios.add(funcionario);
        }
        System.out.println("---------------------");
        for(Funcionario f: funcionarios){
            System.out.println("Nome: " + f.getNome());
            System.out.println("ID: " + f.getID());
            System.out.println("Salario: " + f.getSalario());
        }

        System.out.println("Qual ID do funcionario a aumentar salario? ");
        int id2 = sc.nextInt();

       if(funcionarios.stream().noneMatch(funcionario -> funcionario.getID() == id2)){
            System.out.println("This id does not exist!");
        }
        else {
           System.out.println();
           System.out.println("Qual a porcentagem do salario a aumentar? ");
           double porc = sc.nextDouble();

           funcionarios.stream().filter(x -> x.getID() == id2).forEach(funcionario -> funcionario.aumentarSalario(porc));
       }
        System.out.println("---------------------");
        for(Funcionario f: funcionarios){
            System.out.println("Nome: " + f.getNome());
            System.out.println("ID: " + f.getID());
            System.out.println("Salario: " + f.getSalario());
        }
        sc.close();
    }
}