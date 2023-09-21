public class Funcionario {
    private int ID;
    private String nome;
    private double salario;

    public Funcionario(int id, String nome, double salario){
        this.ID = id;
        this.nome = nome;
        this.salario = salario;
    }

    public int getID() {
        return ID;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    public void aumentarSalario(double porc){
        setSalario(getSalario() * (1 + porc));
    }
}
