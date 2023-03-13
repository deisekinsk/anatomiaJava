/*
 * Comece com Javadoc
 * <p> Javadoc reconhece HTML</p>
 * <li> Usa tags de documentação</li>
 * Tags: @see @author @version @param @return @exception @deprecated @since
 * 
 * @author Deise Kinsk, kinsk@msn.com
 * Linkedin: https://www.linkedin.com/in/deise-kinsk-profile/
 */

public class App {  
    
    public static Integer somar (int numA, int numB){
        return numA+numB;

    };

    public static String nomeCompleto(String primeiroNome, String ultimoNome){
        return primeiroNome.concat(" ").concat(ultimoNome);

    };

    public static void media(int notaA, int notaB, int notaC){
        int mediaFinal;
        mediaFinal = (notaA + notaB + notaC) / 3;

        if (mediaFinal > 6){
            System.out.println("APROVADO");
        }else if(mediaFinal == 6){
            System.out.println("PROVA RECUPERAÇÂO");
        }else{
            System.out.println("REPROVADO");
        }    
        
    };

    public static void controleIdade(int calculaIdade) {
        boolean resultadoIdade = true;

        if(calculaIdade>=18){
            resultadoIdade = true;
            System.out.println( resultadoIdade + " Maior de idade. Pode passar");
        }else{
            resultadoIdade = false;
            System.out.println(resultadoIdade + " Menor de idade. Necessário um/a responsável");
        }
    }
    //Operador ternário
    public static void refatoraControleIdade(int calculaIdade) {
        //boolean resultadoIdade = true;
        String resultadoIdade = calculaIdade>=18?" Maior de idade. Pode passar" : " Menor de idade. Necessário um/a responsável";
        System.out.println("Refatora: "+resultadoIdade);
    
    }   
    /**
     * @param args
     */
    public static void main(String[] args) {
        
        String primeiroNome = "Deise";
        String ultimoNome = "Silva";
        
        int jogoDaSorte = 2023;
        int numeroRecebe = -7;
        numeroRecebe = numeroRecebe * -1;
   

        String nomeCompleto = nomeCompleto(primeiroNome, ultimoNome);
        boolean carteiraCNH = false;
        
        //print
        System.out.println("I'm "+
            nomeCompleto + " and I start with Java Doc.");
        System.out.println(" " + primeiroNome + " " + ultimoNome);
        System.out.println(2*+ jogoDaSorte);
        System.out.println(--numeroRecebe);
        System.out.println(!carteiraCNH + " Possui CNH");
        
        //metodos
        media(5,7,9);
        controleIdade(17);
        refatoraControleIdade(18);

    }
}
