public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 25.0;
        double valorSolicitado = 2;

        if (valorSolicitado < saldo)
        {
            saldo = saldo - valorSolicitado;
            System.out.println("Saldo atual é de: " + saldo);
        }
        else
        {
            System.out.println("Saldo insuficiente");
        }
    }
}

