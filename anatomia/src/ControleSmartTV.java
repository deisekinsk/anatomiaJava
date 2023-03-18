/**
 * <h1>Comece com Javadoc</h1>
 * O Javadoc aceita algumas sintaxes do HTML.
 * <p>
 * <b>Note: </b> A documentação ajuda a compreender o script.
 * 
 * @author Deise Kinsk - https://github.com/deisekinsk
 * https://www.linkedin.com/in/deise-kinsk-profile/
 */


public class ControleSmartTV {
/**
 * Os metodos abaixo foram criados para simular as ações de ligar/desligar; trocar de canal; e aumentar/diminuir o volume de um controle remoto de uma SmartTV.
 * @param novoCanal recebe valor inteiro, para mudar para um canal específico da SmatTV.
 * @return essa classe não possui métodos com retorno
 */

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
