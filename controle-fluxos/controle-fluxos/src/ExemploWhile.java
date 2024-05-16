import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile
{
    public static void main(String[] args)
    {
        int mesada = 50;
        int itens = 0;

        while (mesada != 0)
        {
            int compra = valorAleatorio();
            if (compra > mesada)
            {
                compra = mesada;
            }

            itens++;
            mesada = mesada - compra;
            System.out.println("Valor atual: " + mesada);
        }

        System.out.println("Acabou a mesada e foram comprados " + itens + " itens");


    }

    private static int valorAleatorio()
    {
        return ThreadLocalRandom.current().nextInt(1,8);
    }
}
