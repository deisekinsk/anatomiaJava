import java.util.Locale;
import java.util.Scanner;

/**
 * <h1>Comece com Javadoc</h1>
 * O Javadoc aceita algumas sintaxes do HTML.
 * <p>
 * <b>Note: </b> A documentação ajuda a compreender o script.
 * 
 * @author Deise Kinsk - https://github.com/deisekinsk
 * https://www.linkedin.com/in/deise-kinsk-profile/
 *
 * <li> Javadoc possui tags próprias de documentação</li>
 * Tags: @see @author @version @param @return @exception @deprecated @since
 * 
 */

public class App {  
    
    public static Integer somar (int numA, int numB){
        return numA+numB;

    }

    public static String nomeCompleto(String primeiroNome, String ultimoNome){
        return primeiroNome.concat(" ").concat(ultimoNome);

    }

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
        
    }

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
        String resultadoIdade = calculaIdade>=18?" Maior de idade. Pode passar" : " Menor de idade. Necessário um/a responsável";
        System.out.println("Refatora: "+resultadoIdade);

        int resultadoIdadeA = calculaIdade>=18 ?calculaIdade : calculaIdade;
        System.out.println("Usuário tem " + resultadoIdadeA + " anos.");
    
    }
    //equals
    public static void comparaNome( String primeiroNome,
    String ultimoNome) {
        System.out.println(primeiroNome + " " + ultimoNome);
        System.out.println(primeiroNome.equals(ultimoNome));
        ultimoNome = new String ("Silva");
        System.out.println(ultimoNome.equals(ultimoNome));
        
    }
    /**
     * @param args
     */
    
    public static void main(String[] args) {
        
        int jogoDaSorte = 2023;
        int numeroRecebe = -7;
        numeroRecebe = numeroRecebe * -1;
   
        boolean carteiraCNH = false;

        String nomeCompleto = "Deise";

        //Objeto chama o método
        ControleSmartTV controleSmartTV = new ControleSmartTV();
        Metodos metodos = new Metodos();
        
        //print
        System.out.println("I'm "+
            nomeCompleto + " and I start with Java Doc.");
        System.out.println(2*+ jogoDaSorte);
        System.out.println(--numeroRecebe);
        System.out.println(!carteiraCNH + " Possui CNH");


        controleSmartTV.desligar();
        System.out.println("Ligada " +controleSmartTV.ligada);
        controleSmartTV.mudarCanal(12);
        System.out.println("Canal atual "+controleSmartTV.canal);
        controleSmartTV.diminiuVolume();
        System.out.println("Volume atual "+controleSmartTV.volume);

        System.out.println(
            metodos.dividir(20, 4));
        System.out.println(
            metodos.somar(1988,2023)
        );
        
        //metodos
        media(5,7,9);
        controleIdade(17);
        refatoraControleIdade(18);
        comparaNome("Deise","Silva");
        
        //Scan, obtém e imprimi os dados inseridos pelo usuário
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("|||Mudar Canal.|||\n ***Insira um número válido***");
        controleSmartTV.canal = scan.nextInt();

        System.out.println("Canal Atual é "+controleSmartTV.canal+".\n****Fim do programa****");
        

    }
}
