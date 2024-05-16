//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        double valorTotal = 1000.0;
        double entrada = 100.0;
        int parcelas = 4;

        try {
            Financiamento f = new Financiamento(valorTotal, entrada, parcelas);
            System.out.println(f.prestacao());
        }
        catch (RuntimeException e)
        {
            System.out.println(e.getMessage());
        }
        System.out.println("Tudo seguiu normalmente");
    }

}