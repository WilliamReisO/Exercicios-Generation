package ProgramaçãoOrientObjeto;

import java.util.Scanner;

public class TesteCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PessoaFisica ClientePF = null  ;
		PessoaJuridica ClientePJ = null ;
		//CRIAR UM METODO Lista de cadastro em pessoa .
	//	listaCdastro Lista = 

		Scanner ler = new Scanner(System.in);
		int opcao, cliente;

		do {
			
			opcao = ler.nextInt();

				switch (opcao) {

				case 1:
						ClientePF.confirmaInfoPf();
					
					System.out.println("\n\nCadastro completo !!! \n");

				case 2:
					ClientePJ.cadastroInfoPJ();
					System.out.println("\n\nCadastro completo !!! \n");
					break;
				

				case 3 :

				System.out.println("\n 1 - Pessoa Fisica");
				System.out.println("\n 2 - Pessoa Juridica\n");
				cliente = ler.nextInt();
	 

	}

}while (opcao != 0);
		
		System.out.println("\n\nPrograma Encerrado !!");
	}
	}