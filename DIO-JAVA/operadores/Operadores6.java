public class Operadores6 {
    public static void main(String[] args) {
        boolean condicao1 = true;

        boolean condicao2 = true;

        if (condicao1 && condicao2) {
            System.out.println("as tres  condiçoes sao verdadeiras");
        }
        if (condicao1 && (7 > 4)) {
            System.out.println("sim");
        }
        if (condicao1 || condicao2) {
            System.out.println("uma das condiçoes e  verdadeiras");
        }

        System.out.println("fim.");
    }
}
