package ProgramaçãoOrientObjeto;

import java.util.Scanner;

public abstract class PessoaFisica extends Pessoa implements  Cliente {
	
	private  String CPF;
	private  String Email;
	private  double Telefone;
	


	public PessoaFisica(String nomeCliente, String paisDeOrigem, String sexo, int idade) {
		super(nomeCliente, paisDeOrigem, sexo, idade);
		// TODO Auto-generated constructor stub
	}


	public String getCPF() {
		return CPF;
	}


	public void setCPF(String cPF) {
		CPF = cPF;
	}


	public String getEmail() {
		return Email;
	}


	public void setEmail(String email) {
		Email = email;
	}


	public double getTelefone() {
		return Telefone;
	}


	public void setTelefone(double telefone) {
		Telefone = telefone;
	}


	@Override
	public void novocadastroPF() {
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
	    
	  /*  System.out.println("\nDigite quantos dias por semana vc esta aqui conosco :");
	    int frequencia = ler.nextInt();
	    setFrequencia(frequencia);
	    ler.nextLine();*/
	 
	    System.out.println("\nDigite seu CPF : ");
	    String CPF = ler.nextLine();
	    setCPF(CPF);
	    ler.nextLine();
	    
	    System.out.println("\nDigite seu Email : ");
	    String EMAIL = ler.nextLine();
	    setEmail(EMAIL);
	    ler.nextLine();
	    
	    System.out.println("\nDigite seu telefone : ");
	    double telefone = ler.nextInt();
	    setTelefone(telefone);
	    ler.nextLine();
	    
	    System.out.println("\n\nCadastro completo !!! \n");
	    
	    return;
		
		
	}
	
    @Override
	public void  confirmaInfoPf() { 
		System.out.println("\n Nome Cliente Pessoa Fisica :"+getNomeCliente());
		System.out.println("\n Email :" + getEmail());
		System.out.println("\n Telefone: "+getTelefone());
		System.out.println("\n CPF: "+getCPF());
		System.out.println("\n Sexo :"+getSexo());
		System.out.println("\n Pais de Origem :"+getPaisDeOrigem());
		System.out.println("\n Idade :"+getIdade());
		//System.out.println("\n Frequencia :"+getDiasPorSemana());
	}



}
