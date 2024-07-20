import java.util.Scanner;

public class ControleSimplesDeSaques {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita o limite diário de saque
        System.out.print("Informe o limite diário de saque: ");
        double limiteDiario = scanner.nextDouble();

        // Loop for para iterar sobre os saques
        for (;;) { // Loop infinito, será encerrado com break
            System.out.print("Informe o valor do saque (ou 0 para encerrar): ");
            double valorSaque = scanner.nextDouble();

            if (valorSaque == 0) {
                System.out.println("Transações encerradas.");
                break; // Encerra o loop
            } else if (valorSaque < 0) {
                System.out.println("Valor de saque inválido. Insira um valor positivo ou 0 para encerrar.");
                continue; // Volta ao início do loop para nova entrada
            } else if (valorSaque > limiteDiario) {
                System.out.println("Limite diário de saque atingido. Transações encerradas.");
                break; // Encerra o loop
            } else {
                limiteDiario -= valorSaque;
                System.out.printf("Saque realizado. Limite restante: %.1f\n", limiteDiario);
            }
        }

        // Fechar o scanner para evitar vazamentos de recursos
        scanner.close();
    }
}

