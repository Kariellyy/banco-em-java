
class Conta {
    private static int contador;
    private String agencia; 
    private int numeroConta;
    private double saldo;

    public Conta(String agencia) {
        this.agencia = agencia;
        this.numeroConta = ++contador;
        this.saldo = 0;
    }

    public String getAgencia(){
        return agencia;
    }

    public int getNumero() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Seu depósito foi realizado com sucesso!");
        } else {
            System.out.println("Não foi possível realizar o depósito");
        }
    }

    public void transferir(double valor) {
        if (valor > 0 && this.saldo >= valor) {
            this.saldo -= valor;
            System.out.println("Transferência realizada com sucesso!");
        } else {
            System.out.println("Não foi possível realizar a transferência");
        }
    }
}










