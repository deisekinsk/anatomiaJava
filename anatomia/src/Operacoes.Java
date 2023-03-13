/**
 * Sintaxe Java - Operações
 * . = , valor que aplica atribuição
 */


public class Operacoes{

    String nome = "KINSK";
    double peso = 68.5;
    char sexo = 'N/A';
    boolean CNHA = false;
    Date dataNascimento = new Date();

    public int idade = 1988 - ANO_ATUAL;
    public final ANO_ATUAL = 2023;


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
     !carteiraCNH;

}