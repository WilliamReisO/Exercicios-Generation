package ProgramaçãoOrientObjeto;

import java.util.Scanner;

public class TesteCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PessoaFisica pessoaFisica = new PessoaFisica(null, null, null, 0, 0);
		PessoaJuridica pessoaJuri = new PessoaJuridica(null, null, null, 0, 0);
		Cliente consta = new Cliente(null, null, null, 0, 0);

		Scanner ler = new Scanner(System.in);
		int opcao, cliente;

		do {
			Cliente.menuDeopcao1();
			opcao = ler.nextInt();

				switch (opcao) {

				case 1:
					
					pessoaFisica.confirmaInfoPf();
					
					System.out.println("\n\nCadastro completo !!! \n");

				case 2:
					pessoaJuri.cadastroInfoPJ();
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