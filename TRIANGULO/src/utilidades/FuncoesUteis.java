package utilidades;//Pacote em que a classe está incluída
//Importação de pacotes externos
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class FuncoesUteis{
    //Definição dos atributos privados
    private int nA;
    private int nB;
    private int altura;
    private int soma;
    private String arquivo;

    //Definição dos construtuores públicos
    public FuncoesUteis(int nA, int nB, int altura, int soma, String arquivo){
        this.nA = nA;
        this.nB = nB;
        this.altura = altura;
        this.soma=soma;
        this.arquivo=arquivo;
    }

    public FuncoesUteis() {}

    //Método que realiza a soma
    public void Soma( int nA, int nB){
        System.out.println("\n==================SOMA===============");
        soma=nA+nB;
        System.out.println("\nSoma = "+ soma);
    }

    //Método que realiza o triângulo a partir da altura inserida
    public void Triangulo(int altura){
        System.out.println("\n================Criação do triângulo================");
        //For encapsulados
        for(int i=1; i<=altura;i++){
            for(int j=1; j<=i; j++){
                System.out.print(" x ");
            }
            System.out.println();
        } 
    }

    //Método que realiza a leitura de arquivo txt
    public void LeitorArquivo(String caminhoArquivo) throws FileNotFoundException{
        System.out.println("Caminho do arquivo: " + caminhoArquivo);//Exibe o caminho do arquivo

        File arquivo = new File(caminhoArquivo); //recebe o caminho do arquivo
        System.out.println("\n================Leitura do arquivo txt================");

        if (!arquivo.exists()) { //verificação se o arquivo existe
            System.out.println("O arquivo não existe.");
            return;
        }
        else{
            System.out.println("Arquivo encontrado. Lendo conteúdo...");
        }
        Scanner scn = new Scanner(arquivo);//Instanciando o scanner para receber o objeto do arquivo da main
       
        System.out.println("\n");
        //Exibição do conteúdo do arquivo txt
        while (scn.hasNextLine()) {
            System.out.println( scn.nextLine());
        }
        scn.close();
    }
}