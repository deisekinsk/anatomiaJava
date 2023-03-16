/**
 * Sintaxe Java - Operações
 * . = , valor que aplica atribuição
 */


public class Operacoes{

    String nome = "KINSK";
    double peso = 68.5;
    char sexo = 'A';
    boolean CNHA = false;
    //Date dataNascimento = new Date();

    
    //ublic anoAtual = 2023;
    //public int idade = 1988 - anotAtual;


    //Operadores Aritiméticos

    double somaDouble = 10.5 + 1.2;
    int subtracao = 100 - 13;
    int multiplica = 4*5;
    int dividi = 15/3;
    int moduloResto = 18%3;
    double resultado = (10*7) + (20/4);

    //converter positivo ou negativo
     int numeroRecebe = 5;
     numeroRecebe = numeroRecebe * -1;

     //incremento e decremento
     numeroRecebe = 1;     
     numeroRecebe = numeroRecebe +1;
     numeroRecebe ++; //recebe a variável e depois incrementa
     ++ numeroRecebe; //incrementa antes
     -- numeroRecebe; //sinal negativo derementa

     //inversão de valor boolean com '!'
     boolean carteiraCNH = false;
     //!carteiraCNH;

     //operadores lógicos && ou ||

     boolean verdadeiro = true;
     boolean falso = false;

     if(verdadeiro && falso){
        System.out.println("Condições atendidas");
     }else{
        System.out.println("Não atende os critérios");
     };

}