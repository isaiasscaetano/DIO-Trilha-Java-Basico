public class Opreradores5 {
    public static void main(String[] args) {
        String nomeUmm = "ISaias";
        String nomeDoiss = new String("ISaias");

        System.out.println(nomeUmm == nomeDoiss);

        String nomeUm = "Isaias";
        String nomeDois = "Isaias";

        System.out.println(nomeUm == nomeDois);

        int numero1 = 2;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        if (numero1 < numero2) {
            System.out.println("a nossa condiçao e verdadeira ");
        } else if (numero1 == numero2) {
            System.out.println("a minha condiçao e verdade");
        }
        System.out.println("numeroUm e igual a numeroDois? " + simNao);

        simNao = numero1 != numero2;

        System.out.println("numeroUm e direfernte a numeroDois? " + simNao);

        simNao = numero1 > numero2;

        System.out.println("numeroUm e maior que numeroDois? " + simNao);
    }
}
