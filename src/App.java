import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class App {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        Conta conta = null; 
        List<Transacao> transacoes = new ArrayList<>();

        
        while (true){
            System.out.println("========== Banco ==========");
            System.out.println("1 - Criar conta");
            System.out.println("2 - Entrar na conta");
            System.out.println("0 - Sair");
            
            System.out.println("Escolha a opção desejada: ");
            int opcao = input.nextInt();    

            if (opcao == 0){
                break;
            } else if (opcao == 1){
                System.out.print("Insira seu nome: ");
                String nome = input.next();
                System.out.println("--------------------------------");

                System.out.print("Insira seu CPF: ");
                String cpf = input.next();
                System.out.println("--------------------------------");

                System.out.print("Insira o número da sua conta: ");
                String numeroConta = input.next();
                System.out.println("--------------------------------");
                System.out.println("Conta salva com sucesso!");
                
                conta = new Conta(nome, cpf, numeroConta);
                
                while (conta != null){
                    System.out.println("---------------------------------------------------------------");
                    System.out.println("Bem-vinda " + conta.getNome() + ", seu saldo é: " + conta.getSaldo());
                    System.out.println("---------------------------------------------------------------");
                    System.out.println("1 - Depositar");
                    System.out.println("2 - Transferir");
                    System.out.println("3 - Histórico de transações");
                    System.out.println("0 - Sair");

                    System.out.print("Escolha a opção desejada: ");
                    int newOpcao = input.nextInt();

                    switch (newOpcao){
                        case 1:
                            System.out.println("Insira o valor que deseja depositar: ");
                            double valor = input.nextDouble();
                            conta.depositar(valor);
                            continue;
                        case 2:
                            System.out.println("Insira o valor que deseja transferir: ");
                            double valorTransferencia = input.nextDouble();
                            conta.transferir(valorTransferencia);
                            Transacao newTransacao = new Transacao(conta.getNome(), conta.getnumero(), valorTransferencia);
                            transacoes.add(newTransacao);
                            continue;
                        
                        case 3: 
                            System.out.println("Histórico de transações:");
                            for (Transacao t : transacoes){
                                System.out.println("Nome: " + t.getnome() + " | Número da conta: " + t.getnumeroConta() + " | Valor da transação: " + t.getvalorTransacao());
                            }


                        default:
                            System.out.println("--------------------------------");
                            System.out.println("Opção inválida!");
                            continue; 
                    }
                }
                
            }
            
        }
        
    }

}