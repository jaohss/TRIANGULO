package aplicacao;
import utilidades.FuncoesUteis;
import java.io.FileNotFoundException;


public class Main {
    public static void main(String[] args) {
        FuncoesUteis funcao = new FuncoesUteis();

        try{
        funcao.Triangulo(10);
        funcao.Soma(5, 2);
        funcao.LeitorArquivo("/Users/joaoh/Downloads/TRIANGULO/Teste.txt");
        } 

        catch(FileNotFoundException e){
            System.out.println("Arquivo não encontrado: " + e.getMessage());
        }
    }
}