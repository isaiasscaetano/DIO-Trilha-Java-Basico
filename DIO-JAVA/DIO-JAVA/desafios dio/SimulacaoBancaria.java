import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0; // Saldo inicial conforme o exemplo fornecido
        double limiteDiario = 0; // Limite diário de saque conforme o exemplo fornecido
        boolean continuar = true;

        while (continuar) {
            System.out.println("Escolha uma opção:");
            System.out.println("1: Depositar");
            System.out.println("2: Sacar");
            System.out.println("3: Consultar Saldo");
            System.out.println("0: Encerrar");

            int opcao;
            try {
                opcao = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Erro ao ler a opção. Por favor, digite um número válido.");
                scanner.nextLine(); // Limpar o buffer do scanner
                continue;
            }

            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor a ser depositado: ");
                    double deposito;
                    try {
                        deposito = scanner.nextDouble();
                    } catch (Exception e) {
                        System.out.println("Valor de depósito inválido. Por favor, digite um número válido.");
                        scanner.nextLine(); // Limpar o buffer do scanner
                        continue;
                    }
                    if (deposito > 0) {
                        saldo += deposito;
                        System.out.printf("Saldo atual: %.1f\n", saldo);
                    } else {
                        System.out.println("Valor de depósito inválido.");
                    }
                    break;
                case 2:
                    System.out.print("Digite o valor do saque: ");
                    double saque;
                    try {
                        saque = scanner.nextDouble();
                    } catch (Exception e) {
                        System.out.println("Valor de saque inválido. Por favor, digite um número válido.");
                        scanner.nextLine(); // Limpar o buffer do scanner
                        continue;
                    }
                    if (saque > 0) {
                        if (saque <= saldo) {
                            if (saque <= limiteDiario) {
                                saldo -= saque;
                                limiteDiario -= saque;
                                System.out.printf("Saldo atual: %.1f\n", saldo);
                            } else {
                                System.out.println("Limite diário de saque excedido.");
                            }
                        } else {
                            System.out.println("Saldo insuficiente.");
                        }
                    } else {
                        System.out.println("Valor de saque inválido.");
                    }
                    break;
                case 3:
                    System.out.printf("Saldo atual: %.1f\n", saldo);
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }
}



