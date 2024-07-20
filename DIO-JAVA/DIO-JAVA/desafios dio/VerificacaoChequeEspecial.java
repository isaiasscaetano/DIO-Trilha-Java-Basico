import java.util.Scanner;

public class VerificacaoChequeEspecial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita o saldo atual da conta bancária
        System.out.print("Informe o saldo atual da conta bancária: ");
        double saldo = scanner.nextDouble();

        // Solicita o valor do saque desejado
        System.out.print("Informe o valor do saque desejado: ");
        double saque = scanner.nextDouble();

        // Define o limite para o cheque especial
        double limiteChequeEspecial = 500;

        // Verifica se o saque é possível com o saldo disponível
        if (saque <= saldo) {
            System.out.println("Transação realizada com sucesso.");
        } else {
            // Verifica se o saque ultrapassa o limite do cheque especial
            if (saque <= saldo + limiteChequeEspecial) {
                System.out.println("Transação realizada com sucesso utilizando o cheque especial.");
            } else {
                System.out.println("Transação não realizada. Limite do cheque especial excedido.");
            }
        }

        // Fecha o scanner para evitar vazamentos de recursos
        scanner.close();
    }
}

