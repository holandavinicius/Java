public class Conta {
    private long numConta;
    private String nomeTitular;
    private double saldo;

    public Conta (long numConta, String nomeTitular){
        this.nomeTitular = nomeTitular;
        this.numConta = numConta;
        this.toString();
    }

    public Conta (long numConta, String nomeTitular, double saldo){
        this.nomeTitular = nomeTitular;
        this.numConta = numConta;
        this.saldo = saldo;
    }

    public long getNumConta() {
        return numConta;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double deposito){
        this.setSaldo(deposito + this.saldo);
    }

    public void sacar(double sacar){
        this.setSaldo(this.saldo - sacar - 5);
    }

    @Override
    public String toString(){
            return "Conta numero: " + this.getNumConta() + "\n" +
                    "Titular: " + this.getNomeTitular() + "\n" +
                    "Saldo: " + this.getSaldo() + "\n";
    }
}
