package ProgramaçãoOrientObjeto;
import java.util.Scanner;

public class TesteCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cliente Apresenta = new Cliente(null,null,null, 0 , 0);
		Cliente consta = new Cliente(null, null, null, 0, 0);
		
		Scanner ler = new Scanner(System.in);
		int opcao;
		
		
		
		do {
		System.out.println("--------------------------ACADEMIA--DO--WILLIAM----------------------------------");
		System.out.println("#                                                                                #");
		System.out.println("#                                                                                #");
		System.out.println("#                      1 - Novo Cadastro de cliente.                             #");
		System.out.println("#                      2 - informaçoes Cadastradas.                              #");
		System.out.println("#                      3 - Apagar Cadatro.                                       #");
		System.out.println("#                      0 - Sair                                                  #");
		System.out.println("#                                                                                #");
		System.out.println("#                                                                                #");
		System.out.println("---------------------------------------------------------------------------------\n\n");
		opcao= ler.nextInt();
		
		
		
			
			if (opcao == 1) {
				
				System.out.println("\nDigite seu nome :");
				String nomecliente= ler.nextLine();
				Apresenta.setNomeCliente(nomecliente);
				ler.nextLine();
				
			    System.out.println("\nDigite sua Nascionaidade :");
			    String pais=ler.nextLine();
			    Apresenta.setPaisDeOrigem(pais);
			    ler.nextLine();
			    
			    System.out.println("\nDigite sexo :");
			    String sexobio = ler.nextLine();
			    Apresenta.setSexo(sexobio);
			    ler.nextLine();
			    
			    System.out.println("\nDigite sua Idade : ");
			    int idade = ler.nextInt();
			    Apresenta.setIdade(idade);
			    ler.nextLine();
			    
			    System.out.println("\nDigite quantos dias por semana vc esta aqui conosco :");
			    int frequencia = ler.nextInt();
			    Apresenta.setDiasPorSemana(frequencia);
			    ler.nextLine();
			    
			    System.out.println("\n\nCadastro completo !!! \n");
			    Apresenta.vizualizarInfo(); 
			    
			}else if (opcao == 2){
				System.out.println(Apresenta);
				
			}else if (opcao == 3) {
				consta.naoCadastros();
			}else {
				opcao=0;
			System.out.println("\n\n Opção não Disponivel");
			}
		}while(opcao!=0);
	}				
	


}
