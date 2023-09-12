
class Conta {
    private String nome;
    private String cpf;
    private String numeroConta;
    private double saldo;

    public Conta(String nome, String cpf, String numeroConta) {
        this.nome = nome;
        this.cpf = cpf;
        this.numeroConta = numeroConta;
        this.saldo = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getnumero() {
        return numeroConta;
    }

    public void setnumero(String numeroConta) {
        this.numeroConta = numeroConta;
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










