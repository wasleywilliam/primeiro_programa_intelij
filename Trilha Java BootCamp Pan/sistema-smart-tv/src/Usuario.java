

public class Usuario {

    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();
            System.out.println("TV Ligada? "+smartTv.ligada);
            System.out.println("Canal Atual? "+smartTv.canal);
            System.out.println("Volume Atual? "+smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo Status - Tv Ligada? "+smartTv.ligada);

       /* smartTv.desligar();
            System.out.println("Novo Status - Tv Ligada? "+smartTv.ligada);
*/
        /*smartTv.aumentarvolume();
            System.out.println("Novo Status - Volume ? "+smartTv.volume);*/

            smartTv.diminuirVolume();
            smartTv.diminuirVolume();
            smartTv.diminuirVolume();
            smartTv.diminuirVolume();
            System.out.println("Novo Status - Volume ? "+smartTv.volume);

            System.out.println("Novo canal é - canal ? "+smartTv.canal);
            smartTv.mudarCanal(17);
            System.out.println("Novo canal é - canal ? "+smartTv.canal);

    }
    
}
