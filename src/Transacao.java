public class Transacao {
    private String nome;
    private String numeroConta;
    private double valorTransacao;

    public Transacao(String nome, String numeroConta, double valorTransacao){
        this.nome = nome;
        this.numeroConta = numeroConta;
        this.valorTransacao = valorTransacao;

    }

    public String getnome(){
        return nome;
    }

    public void setnome(String nome){
        this.nome = nome;
    }

    public String getnumeroConta(){
        return numeroConta;
    }

    public void setnumeroConta(String numeroConta){
        this.numeroConta = numeroConta;
    }

    public double getvalorTransacao(){
        return valorTransacao;
    }

    public void setvalorTransacao(double valorTransacao){
        this.valorTransacao = valorTransacao;
    }

}
