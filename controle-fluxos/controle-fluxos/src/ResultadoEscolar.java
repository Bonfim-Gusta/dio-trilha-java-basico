public class ResultadoEscolar {
    public static void main(String[] args) {
        double nota = 5;

        if (nota >= 7)
        {
            System.out.println("Aprovado");
        }
        else if (nota >= 5 && nota < 7)
        {
            System.out.println("Em recuperação");
        }
        else
        {
            System.out.println("Reprovado");
        }

        //String resultado = nota >= 7 ? "Aprovado" : "Reprovado";

    }
}
