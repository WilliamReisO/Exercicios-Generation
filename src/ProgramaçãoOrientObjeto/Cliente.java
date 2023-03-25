package ProgramaçãoOrientObjeto;

public class Cliente {

	private String NomeCliente ;
	private String PaisDeOrigem;
	private String Sexo;
	private int Idade;
	private int DiasPorSemana;
	
	
	public Cliente(String nomeCliente, String paisDeOrigem, String sexo, int idade, int diasPorSemana) {
		super();
		NomeCliente = nomeCliente;
		PaisDeOrigem = paisDeOrigem;
		Sexo = sexo;
		Idade = idade;
		DiasPorSemana = diasPorSemana;
	}





	public String getNomeCliente() {
		return NomeCliente;
	}





	public void setNomeCliente(String nomeCliente) {
		NomeCliente = nomeCliente;
	}





	public String getPaisDeOrigem() {
		return PaisDeOrigem;
	}





	public void setPaisDeOrigem(String paisDeOrigem) {
		PaisDeOrigem = paisDeOrigem;
	}





	public String getSexo() {
		return Sexo;
	}





	public void setSexo(String sexo) {
		Sexo = sexo;
	}





	public int getIdade() {
		return Idade;
	}





	public void setIdade(int idade) {
		Idade = idade;
	}





	public int getDiasPorSemana() {
		return DiasPorSemana;
	}





	public void setDiasPorSemana(int diasPorSemana) {
		DiasPorSemana = diasPorSemana;
	}





	public void vizualizarInfo() {
		
		System.out.println("\nCliente "+NomeCliente+"se trata de um/a "+Sexo+" nascido no "+ PaisDeOrigem +" ,que tem idade de "+ Idade
			 +" anos é frequenta nossa Academia "+DiasPorSemana+" dias na semana\n\n");
		
	}

	public void naoCadastros() {
		System.out.println("\nFunçao não Habilitada, ja iremos solucionar o Problema");
	}
	

}
