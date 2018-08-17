package javaaula1;


public class Avaliacao {
    
    Double notaProva1;
    Double notaProva2;
    Double notaTrabalho;
    
    // EXEMPLO 1 PARA CALCULAR MÉDIA
    Double calcularMedia(){
        return (notaProva1+notaProva2+notaTrabalho)/3;
    }
    
    // EXEMPLO 2 PARA CALCULAR MÉDIA
    Double calcularMedia2(){
        Double media = (notaProva1+notaProva2+notaTrabalho)/3;
        return media;
    }
    
    // EXEMPLO 3 PARA CALCULAR MÉDIA E MOSTRAR O RESULTADO
    void calcularMedia3(){
        Double media = (notaProva1+notaProva2+notaTrabalho)/3;
        System.out.println(media);
    }
    
    Double calcularSoma(){
        return notaProva1+notaProva2+notaTrabalho;
    }
    
    
}
