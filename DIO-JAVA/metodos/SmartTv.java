import java.sql.SQLOutput;

public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void mudarCanal (int novoCanal){
        canal = novoCanal;
    }
   public void aumentarCanal(){
       canal ++;
   }
   public void diminuirCanal(){
       canal --;
   }
    public void aumentarVolume(){
        System.out.println("Aumentar o volume: " + volume);
        //volume = volume + 1;//
        volume ++;
    }

    public void diminuirVolume(){
        System.out.println("Diminuir o volume: " + volume);
        //volume = volume - 1;//
        volume --;
    }

    public  void  ligar(){
        ligada=true;
    }

    public void desligar(){
        ligada=false;
    }
}
