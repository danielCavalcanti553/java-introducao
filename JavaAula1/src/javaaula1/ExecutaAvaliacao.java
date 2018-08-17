package javaaula1;

import java.util.Scanner;

public class ExecutaAvaliacao {
    
    public static void main(String args[]){
        
        // Classe Scanner para pegar os dados por linha
        // de comando, necessário importar
        Scanner sc = new Scanner(System.in);
        
        // Instanciando a Classe Avaliação
        // A partir daqui, posso utilizar seus atributos e métodos
        Avaliacao avaliacao = new Avaliacao();
        
        
        System.out.println("Digite a Nota 1");// Solicitando nota1
        avaliacao.notaProva1 = sc.nextDouble();// Capturando nota1
        
        System.out.println("Digite a Nota 2");
        avaliacao.notaProva2 = sc.nextDouble();
        
        System.out.println("Digite Nota Trabalho");
        avaliacao.notaTrabalho = sc.nextDouble();
        
        //System.out.println(avaliacao.calcularMedia());
        //System.out.println(avaliacao.calcularMedia2());
        avaliacao.calcularMedia3();
    }
            
}
