package ProgramaçãoOrientObjeto;

public class Funcionario {

	private String nomeFuncionario;
	private String endereco;
	private String localdeNascimento;
	private int idade;
	private int filhos;


	public Funcionario(String nomeFuncionario, String endereco, String localdeNascimento, int idade, int filhos) {
		super();
		this.nomeFuncionario = nomeFuncionario;
		this.endereco = endereco;
		this.localdeNascimento = localdeNascimento;
		this.idade = idade;
		this.filhos = filhos;
	}
	

	public String getNomeFuncionario() {
		return nomeFuncionario;
	}


	public void setNomeFuncionario(String nomeFuncionario) {
		this.nomeFuncionario = nomeFuncionario;
	}


	public String getEndereco() {
		return endereco;
	}


	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}


	public String getLocaldeNascimento() {
		return localdeNascimento;
	}


	public void setLocaldeNascimento(String localdeNascimento) {
		this.localdeNascimento = localdeNascimento;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}


	public int getFilhos() {
		return filhos;
	}


	public void setFilhos(int filhos) {
		this.filhos = filhos;
	}

	public void textoDeConfimaçãoInf() {
		if (filhos > 0) {
		System.out.printf("\nO Funcionario ",nomeFuncionario,", residencia no endereço ",endereco,"nasceu em ",localdeNascimento,""
				+ "tem "+filhos+" filhos ");
		}else {
			System.out.printf("\nO Funcionario ",nomeFuncionario,", residencia no endereço ",endereco," nasceu em ",localdeNascimento,","
					+ "tem "+idade+" de idade é não tem  filhos  ");
		}
	}
	public void MenuDeinformacao() {
		
	}
}
