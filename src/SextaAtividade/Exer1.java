package SextaAtividade;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exer1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner Leitura = new Scanner(System.in);

		Queue<String> Fila = new LinkedList<String>();
		int opcao;

		do {
			
			System.out.println("#################################################################################");
			System.out.println("#                                                                               #");
			System.out.println("#       1 - Adicionar um novo Cliente na fila.                                  #");
			System.out.println("#       2 - Listar de todos os Clientes na fila                                 #");
			System.out.println("#       3 - Retirar uma pessoa da fila                                          #");
			System.out.println("#       0 - Sair                                                                #");
			System.out.println("#                                                                               #");
			System.out.println("#################################################################################\n\n");
			

			System.out.println("\n                    -- Entre com a opção Desejada -- \n\n");
			opcao = Leitura.nextInt();

			switch (opcao) {

			case 1:
				System.out.println("\n    -- Digite o nome :  ");
				String Adiciona = Leitura.nextLine();
				Fila.add(Adiciona);
				Leitura.nextLine();
				System.out.println("\n Fila : \n"+Fila);
				System.out.println("\n    -- Cliente Adicionado a Fila ");
				break;

			case 2:
				
				Leitura.nextLine();
				System.out.println("\n    -- Listar Todos os Clientes na Fila \n" + Fila);
				break;

			case 3:

				Leitura.nextLine();
				System.out.println("\n\nDigite o Nome a retirar ");
				String Retira = Leitura.nextLine();
			    Fila.contains(Retira);
				
				System.out.println("\nFila Atualizada com susesso !!!");

				break;

			case 0:

				System.out.println("\n  -- Programa Finalizado!!!");
				break;
				default :
					System.out.println("\nOpção inválida...Tente novamente!!!");
			}
		} while (opcao != 0);

	}
}
