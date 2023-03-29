package ProgramaçãoOrientObjeto;

import java.util.Scanner;

public class Pessoa implements Cliente {
	private static String NomeCliente;
	private static String PaisDeOrigem;
	private static String Sexo;
	private static int Idade;
	
	
	public Pessoa(String nomeCliente, String paisDeOrigem, String sexo, int idade) {
		super();
		NomeCliente = nomeCliente;
		PaisDeOrigem = paisDeOrigem;
		Sexo = sexo;
		Idade = idade;
	}


	public static String getNomeCliente() {
		return NomeCliente;
	}


	public static void setNomeCliente(String nomeCliente) {
		NomeCliente = nomeCliente;
	}


	public static String getPaisDeOrigem() {
		return PaisDeOrigem;
	}


	public static void setPaisDeOrigem(String paisDeOrigem) {
		PaisDeOrigem = paisDeOrigem;
	}


	public static String getSexo() {
		return Sexo;
	}


	public static void setSexo(String sexo) {
		Sexo = sexo;
	}


	public static int getIdade() {
		return Idade;
	}


	public static void setIdade(int idade) {
		Idade = idade;
	}


	public void cadastradoInfo() {
		
	/*	System.out.println("\n Nome Cliente :"+this.NomeCliente);
		System.out.println("\n Sexo :"+this.Sexo);
		System.out.println("\n Pais de Origem :"+this.PaisDeOrigem);
		System.out.println("\n Idade :"+this.Idade);
		System.out.println("\n Frequencia :"+this.DiasPorSemana);*/
	}
	

	public void vizualizarInfo() {
		
	/*	System.out.println("\nCliente :"+NomeCliente+"se trata de um/a "+Sexo+" nascido no "+ PaisDeOrigem +" ,que tem idade de "+ Idade
			 +" anos é frequenta nossa Academia "+DiasPorSemana+" dias na semana\n\n");*/
		
	}

	public void naoCadastros() {
		System.out.println("\nFunçao não Habilitada, ja iremos solucionar o Problema");
	}
	
    public static void menuDeopcao1() {
    	Scanner ler = new Scanner(System.in);
    	System.out.println("--------------------------ACADEMIA--DO--WILLIAM----------------------------------");
		System.out.println("#                                                                                #");
		System.out.println("#                                                                                #");
		System.out.println("#                      1 - Novo Cadastro de clientePF.                           #");
		System.out.println("#                      2 - Novo Cadastro de clientePJ.                           #");
		System.out.println("#                      3 - informaçoes Cadastradas.                              #");
		System.out.println("#                      4 - Apagar Cadatro.                                       #");
		System.out.println("#                      0 - Sair                                                  #");
		System.out.println("#                                                                                #");
		System.out.println("#                                                                                #");
		System.out.println("---------------------------------------------------------------------------------\n\n");
		
    }
}
