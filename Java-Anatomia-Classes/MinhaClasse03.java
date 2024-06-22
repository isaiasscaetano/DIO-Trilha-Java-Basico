public class MinhaClasse03 {
    public static void main(String[] args) {
        String meuNome = "isaias";

        int anoFabricacao = 2023;

        boolean verdadeira = true;
        boolean falsa = false;

        anoFabricacao = 2018;

        String primeiroNome = "isaias";
        String SegundoNome = "rute";

        String nomeCompleto = nomeCompleto(primeiroNome,SegundoNome);
        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return "Resultado do metodo" +  primeiroNome.concat(" ").concat(segundoNome);
    }
}
