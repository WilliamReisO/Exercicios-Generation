package SextaAtividade;

import java.util.Scanner;
import java.util.Stack;

public class Exer2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner Ler = new 	Scanner(System.in);
	
	Stack<String> pilha = new Stack<String>();

	int opcao;
	
	do {
		
	System.out.println("\n");
	System.out.println("#################################################################################");
	System.out.println("#                                                                               #");
	System.out.println("#       1 - Adicionar um novo Livro a Pilha.                                    #");
	System.out.println("#       2 - Listar de todos os Livros na Pilha.                                 #");
	System.out.println("#       3 - Retirar um livro da Pilha                                           #");
	System.out.println("#       0 - Sair                                                                #");
	System.out.println("#                                                                               #");
	System.out.println("#################################################################################");
	opcao = Ler.nextInt();
		switch (opcao) {
		
		case 1 :
			System.out.print("\n - Adicionar um novo Livro a Pilha: \n");
			Ler.nextLine();
			String Addlivro = Ler.nextLine();
			pilha.push(Addlivro);
			System.out.println("\nPilha:  "+pilha);
			System.out.println("Livro adicionado!");
			break;
		case 2 :
			boolean vazia = pilha.isEmpty();
			if(vazia) {
				System.out.println("\nA pilha está Vazia !!!");
			}else {
			System.out.println("\nLista de Livros na Pilha:"+pilha);
			}
			break;
			
		case 3 :
		
			System.out.println("\nVerificar se a fila ésta limpa(vazia):" +pilha.isEmpty());
			
			
			
			
		}	
		
	}while(opcao != 0);
	
	}

}
