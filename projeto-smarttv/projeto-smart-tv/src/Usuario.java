public class Usuario {

public static void main (String[] args) throws Exception {

    SmartTv smartTv = new SmartTv();

    System.out.println ("Tv está ligada?  " + smartTv.ligada);
    System.out.println ("Canal atual?  " + smartTv.canal);
    System.out.println ("Volume atual?  " + smartTv.volume);

    smartTv.aumentarVolume ();
    System.out.println ("Novo status - Volume aumentado  " + smartTv.volume);

    smartTv.mudarCanal(81);
    System.out.println ("Novo canal - Novo Canal  " + smartTv.canal);

    smartTv.ligar ();
    System.out.println ("Novo status - Tv ligada  " + smartTv.ligada);

    smartTv.desligar ();
    System.out.println ("Novo status - Tv ligada  " + smartTv.ligada);

}   

}
