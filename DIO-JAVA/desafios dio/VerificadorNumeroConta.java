import java.util.Scanner;

public class VerificadorNumeroConta {

    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        try {
            // Solicita ao usuário que insira o número da conta bancária
            System.out.print("Digite o número da conta bancária: ");
            String numeroConta = scanner.nextLine();

            // Chama o método para verificar o número da conta
            verificarNumeroConta(numeroConta);

            // Caso nenhuma exceção seja lançada, imprime a mensagem de sucesso
            System.out.println("Número de conta válido.");
        } catch (IllegalArgumentException e) {
            // Informar que o número de conta é inválido e exibir a mensagem de erro
            System.out.println("Erro: " + e.getMessage());
        } finally {
            // Fecha o scanner para evitar vazamentos de recursos
            try {
                if (scanner != null) {
                    scanner.close();
                }
            } catch (Exception e) {
                System.out.println("Erro ao fechar o Scanner: " + e.getMessage());
            }
        }
    }

    // Método para verificar se o número da conta possui exatamente 8 dígitos
    private static void verificarNumeroConta(String numeroConta) {
        if (numeroConta.length() != 8) {
            // Lançar uma IllegalArgumentException com a seguinte mensagem:
            // "Número de conta inválido. Digite exatamente 8 dígitos."
            throw new IllegalArgumentException("Número de conta inválido. Digite exatamente 8 dígitos.");
        }
    }
}

