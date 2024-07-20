import java.util.Scanner;

public class VerificadorElegibilidadeConta {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar ao usuário que digite sua idade
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        // Verificar se a idade do cliente é maior ou igual a 18
        if (idade >= 18) {
            System.out.println("Voce esta elegivel para criar uma conta bancaria.");
        } else {
            System.out.println("Voce nao esta elegivel para criar uma conta bancaria.");
        }

        // Fechar o scanner para evitar vazamentos de recursos
        scanner.close();
    }
}
