## Terminal e Argumentos em Java
COm a JVM é possível criar um executável.

Localizar o diretório do projeto > Estar na pasta bin do projeto

Jornada: Cria classe > Compila > Executa

### Comando no terminal
cd > acessar uma pasta
dir > verificar diretórios
cls > limpar o terminal
java App.java param param > Executar o programa com os argumentos (args)/parametros

>Exemplo java App.java args
public static void main(String args){
    String nome = args [0];
    int anoNascimento = args[1];
}
