package ProgramaçãoOrientObjeto;

import java.util.Scanner;

public class PessoaJuridica extends Pessoa implements Cliente{
	
	private static String cnpj ;
	private static String rg ;
	private static String Email;
	private static int Telefone;


	
	public PessoaJuridica(String nomeCliente, String paisDeOrigem, String sexo, int idade, int diasPorSemana) {
		super(nomeCliente, paisDeOrigem, sexo, idade);
		// TODO Auto-generated constructor stub
	}

	public static String getCnpj() {
		return cnpj;
	}

	public static void setCnpj(String cnpj) {
		PessoaJuridica.cnpj = cnpj;
	}

	public static String getRg() {
		return rg;
	}

	public static void setRg(String rg) {
		PessoaJuridica.rg = rg;
	}

	public static String getEmail() {
		return Email;
	}

	public static void setEmail(String email) {
		Email = email;
	}

	public static int getTelefone() {
		return Telefone;
	}

	public static void setTelefone(int telefone) {
		Telefone = telefone;
	}

	
	public void cadastroPJ() {
		Scanner ler = new Scanner(System.in);
    	
		
		System.out.println("\nDigite seu nome :");
		String nomecliente= ler.nextLine();
		setNomeCliente(nomecliente);
		ler.nextLine();
		
	    System.out.println("\nDigite sua Nascionaidade :");
	    String pais=ler.nextLine();
	    setPaisDeOrigem(pais);
	    ler.nextLine();
	    
	    System.out.println("\nDigite sexo :");
	    String sexobio = ler.nextLine();
	    setSexo(sexobio);
	    ler.nextLine();
	    
	 
	    System.out.println("\nDigite sua Idade : ");
	    int idade = ler.nextInt();
	    setIdade(idade);
	    ler.nextLine();
	    
	 /*   System.out.println("\nDigite quantos dias por semana vc esta aqui conosco :");
	    int frequencia = ler.nextInt();
	    setFrequencia(frequencia);
	    ler.nextLine();*/
	 
	    System.out.println("\nDigite seu CNPJ : ");
	    String cnpj = ler.nextLine();
	    setCnpj(cnpj);
	    ler.nextLine();
	    
	    System.out.println("\nDigite seu CNPJ : ");
	    String RG = ler.nextLine();
	    setRg(RG);
	    ler.nextLine();
	    
	    System.out.println("\nDigite seu Email : ");
	    String EMAIL = ler.nextLine();
	    setEmail(EMAIL);
	    ler.nextLine();
	    
	    System.out.println("\nDigite seu telefone : ");
	    int telefone = ler.nextInt();
	    setTelefone(telefone);
	    ler.nextLine();
	    
	    System.out.println("\n\nCadastro completo !!! \n");
	}

	

	public void cadastroInfoPJ() {
		
	System.out.println("\n Nome Cliente Pessoa Fisica :"+getNomeCliente());
	System.out.println("\n Email :" +getEmail());
	System.out.println("\n Telefone: "+ getTelefone());
	System.out.println("\n CPF: "+getCnpj());
	System.out.println("\n Sexo :"+getSexo());
	System.out.println("\n Pais de Origem :"+getPaisDeOrigem());
	System.out.println("\n Idade :"+getIdade());
//	System.out.println("\n Frequencia :"+getFrequencia());
	
	}


}
