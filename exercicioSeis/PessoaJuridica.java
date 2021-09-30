package exercicioSeis;

public class PessoaJuridica extends ImpostoDeRenda {//usando o comando EXTENDS para
	//indicar que esta classe herda da classe ImpostoDeRenda
	//Atributos da classe PessoaJuridica
	private String cnpj;
	private String inscEstadual;
	
	//Método construtor de classe com herança
	public PessoaJuridica(String nome, double rendimentos, String cnpj, String inscEstadual) {
		super(nome, rendimentos);
		this.cnpj = cnpj;
		this.inscEstadual = inscEstadual;
	}
	
	//Sobrescrição de método para calcular para está classe
	@Override
	public void calculoImpostoRenda() {
		this.rendimentos = this.rendimentos - (this.rendimentos * 0.018);
	}
	
	
	//Sobrescrição de método para formatar resultado do objeto
	@Override
	public String toString() {
		return String.format("Pessoa Jurídica - Nome: %s, Rendimentos: %.2f, CNPJ: %s, Inscrição Estadual: %s", 
				this.nome, this.rendimentos, this.cnpj, this.inscEstadual);
	}
	
}
