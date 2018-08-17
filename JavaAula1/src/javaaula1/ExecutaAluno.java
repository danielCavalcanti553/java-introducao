package javaaula1;

import java.util.Scanner;

public class ExecutaAluno {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        Aluno aluno = new Aluno();
        
        System.out.println("Digite o nome do aluno");
        aluno.nome = sc.next();
        System.out.println("Digite o endereco do Aluno");
        aluno.endereco = sc.next();
        System.out.println("Digite a idade do Aluno");
        aluno.idade = sc.nextInt();
        
        aluno.cadastrar();
    }
    
}
