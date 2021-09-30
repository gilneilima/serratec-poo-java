package exercicioSeis;

public class PessoaFisica extends ImpostoDeRenda {//usando o comando EXTENDS para
	//indicar que essa classe herda da classe ImpostoDeRenda
	//Atributos da classe PessoaFisica
	private String cpf;
	private String rg;
	
	
	//Método construtor de classe com herança
	public PessoaFisica(String nome, double rendimentos, String cpf, String rg) {
		super(nome, rendimentos);
		this.cpf = cpf;
		this.rg = rg;
	}
	
	//Sobrescrição de método para calcular para está classe
	@Override
	public void calculoImpostoRenda() {
		this.rendimentos = this.rendimentos - (this.rendimentos * 0.012);
	}
	
	
	//Sobrescrição de método para formatar resultado do objeto
	@Override
	public String toString() {
		return String.format("Pessoa Física - Nome: %s, Rendimentos: %.2f, CPF: %s, RG: %s", 
				this.nome, this.rendimentos, this.cpf, this.rg);
	}
	
	
}
