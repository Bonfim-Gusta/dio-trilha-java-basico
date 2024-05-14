public class Main {
    public static void main(String[] args)
    {
        SmartTv smartTv = new SmartTv();
        SmartTv smartTv2 = new SmartTv();

        System.out.println("TV ligada? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);

        System.out.println("-------------------Ligando--------------------");

        smartTv.ligar();

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();

        smartTv.pularCanal();
        smartTv.pularCanal();
        smartTv.pularCanal();
        smartTv.pularCanal();
        smartTv.pularCanal();
        smartTv.voltarCanal();
        smartTv.voltarCanal();
        smartTv.voltarCanal();
        smartTv.voltarCanal();
        smartTv.voltarCanal();
        smartTv.voltarCanal();
        smartTv.voltarCanal();
        smartTv.voltarCanal();
        smartTv.voltarCanal();
        smartTv.voltarCanal();

        smartTv.mudarCanal(8);

        smartTv.mudarCanal(28);
        System.out.println("TV ligada? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);

        System.out.println("------------------------------------------");

        System.out.println("TV ligada? " + smartTv2.ligada);
        System.out.println("Canal atual: " + smartTv2.canal);
        System.out.println("Volume atual: " + smartTv2.volume);

    }

}