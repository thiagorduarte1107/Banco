package banco;

import java.util.Scanner;

public class test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int idConta = 0; // Este valor será incrementado a cada nova conta criada

        // Variáveis para armazenar informações da conta
        String nomeConta = "";
        double saldo = 0.0;

        System.out.println("---Bem vindo ao Banco BB---");
        System.out.println("1 - Acessar conta\n2 - Criar conta");

        System.out.print("Escolha uma opção: ");
        int escolhaInicial = scanner.nextInt();

        if (escolhaInicial == 2) {
            // Lógica para criar conta
            idConta++; // Incrementa o ID da conta
            System.out.print("Digite o nome da conta: ");
            nomeConta = scanner.next(); // Para nomes compostos, considere mudar para scanner.nextLine()
            System.out.print("Digite o valor do depósito inicial: ");
            double depositoInicial = scanner.nextDouble();
            while (depositoInicial <= 0) {
                System.out.println("O valor do depósito inicial deve ser maior que 0. Por favor, tente novamente.");
                System.out.print("Digite o valor do depósito inicial: ");
                depositoInicial = scanner.nextDouble();
            }
            saldo = depositoInicial;
            System.out.println("Conta criada com sucesso! ID da Conta: " + idConta + ". Depósito inicial: " + depositoInicial);
        }

        boolean continuar = true;
        while (continuar) {
            System.out.println("\n1 - Depositar\n2 - Sacar\n3 - Saldo\n4 - Mostrar dados da conta\n5 - Sair");
            System.out.print("Escolha uma operação: ");
            int operacao = scanner.nextInt();

            switch (operacao) {
                case 1: // Depositar
                    System.out.print("Digite o valor a depositar: ");
                    double valorDeposito = scanner.nextDouble();
                    saldo += valorDeposito;
                    System.out.println("Depósito realizado com sucesso!");
                    break;

                case 2: // Sacar
                    System.out.print("Digite o valor a sacar: ");
                    double valorSaque = scanner.nextDouble();
                    if (valorSaque <= saldo) {
                        saldo -= valorSaque;
                        System.out.println("Saque realizado com sucesso!");
                    } else {
                        System.out.println("Saldo insuficiente!");
                    }
                    break;


                case 3: // Saldo
                   // Aplica o rendimento de 6, 21 % ao saldo como se fosse um Título público(Tesouro Selic 2024)
                    double rendimento = saldo * 0.0621; // Calcula o rendimento
                    double saldoTotal = saldo + rendimento; // Atualiza o saldo com o rendimento
                    System.out.println("Saldo inicial: " + saldo);
                    System.out.println("Valor total do Rendimento (Tesouro Selic 2024): " + rendimento);
                    System.out.println("Saldo disponivel: " + saldoTotal);
                    break;

                case 4:
                    System.out.println("Dados bancarios do usuario:\n Numero da conta: " + idConta + "\n Cliente: " + nomeConta + "\n Saldo: " + saldoTotal);
                    break;

                case 5: // Sair
                    System.out.println("Obrigado por usar o Banco BB. Até mais!");
                    continuar = false; // Encerra o loop
                    break;

                default:
                    System.out.println("Opção inválida. Por favor, tente novamente.");
                    break;
            }
        }

        scanner.close();
    }
}
