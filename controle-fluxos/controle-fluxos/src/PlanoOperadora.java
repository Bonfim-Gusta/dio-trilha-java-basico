public class PlanoOperadora {
    public static void main(String[] args) {
        String plano = "T";

        //T -> 100 minutos de ligação / Whatsapp e Instagram grátis / 5GB de Youtube
        //M -> 100 minutos de ligação / Whatsapp e Instagram grátis
        //B -> 100 minutos de ligação


        switch (plano)
        {
            case "T": {
                System.out.println("5Gb Youtube");
            }
            case "M": {
                System.out.println("WhatsApp e Instagram grátis");
            }
            case "B": {
                System.out.println("100 minutos de ligação");
            }
            default:
                System.out.println("Inválido");
                break;
        }

        /*A ordem de grandeza inversa dos beneficios deixa o código menos verboso
        e dispensa a utilização do break nesse caso
         */
    }
}
