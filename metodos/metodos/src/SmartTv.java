public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar()
    {
        ligada = true;
    }

    public void desligar()
    {
        ligada = false;
    }

    public void aumentarVolume()
    {
        volume++;
    }

    public void diminuirVolume()
    {
        volume--;
    }

    public void pularCanal()
    {
        canal++;
    }

    public void voltarCanal()
    {
        canal--;
        if (canal < 1)
        {
            canal = 1;
        }
    }

    public void mudarCanal(int novoCanal)
    {
        if (novoCanal <= 25)
        {
            canal = novoCanal;
        }
    }
}
