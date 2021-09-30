package exercicioSeis;

public class PessoaJuridica extends ImpostoDeRenda {//usando o comando EXTENDS para
	//indicar que esta classe herda da classe ImpostoDeRenda
	//Atributos da classe PessoaJuridica
	private String cnpj;
	private String inscEstadual;
	
	//M�todo construtor de classe com heran�a
	public PessoaJuridica(String nome, double rendimentos, String cnpj, String inscEstadual) {
		super(nome, rendimentos);
		this.cnpj = cnpj;
		this.inscEstadual = inscEstadual;
	}
	
	//Sobrescri��o de m�todo para calcular para est� classe
	@Override
	public void calculoImpostoRenda() {
		this.rendimentos = this.rendimentos - (this.rendimentos * 0.018);
	}
	
	
	//Sobrescri��o de m�todo para formatar resultado do objeto
	@Override
	public String toString() {
		return String.format("Pessoa Jur�dica - Nome: %s, Rendimentos: %.2f, CNPJ: %s, Inscri��o Estadual: %s", 
				this.nome, this.rendimentos, this.cnpj, this.inscEstadual);
	}
	
}
