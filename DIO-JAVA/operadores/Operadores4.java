public class Operadores4 {

    public static void main(String[] args) {
        int a, b;
        a = 6;
        b = 6;

        String resultado = "";
        if (a==b)
            resultado = "verdade";
        else
            resultado = "falso";

        System.out.println(resultado);

        int c, d;
        c = 4;
        d = 4;

        int  resultados = a == b ? 1 : 0;

        System.out.println(resultados);
    }

}
