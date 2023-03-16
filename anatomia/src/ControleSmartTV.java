public class ControleSmartTV {
    boolean ligada = false;
    int canal = 1;
    int volume = 12;

    //App > Usuario

    public void ligar(){
        ligada=true;
    }

    
    public void desligar(){
        ligada=false;
    }

    public void aumentaVolume(){
        volume++;
    }
    
    public void diminiuVolume(){
        volume--;
    }

    public void aumentaCanal(){
        canal++;
    }

    
    public void diminuiCanal(){
        canal++;
    }

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }
}
