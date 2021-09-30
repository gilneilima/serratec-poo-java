package exercicioSeis;

public class PessoaFisica extends ImpostoDeRenda {//usando o comando EXTENDS para
	//indicar que essa classe herda da classe ImpostoDeRenda
	//Atributos da classe PessoaFisica
	private String cpf;
	private String rg;
	
	
	//M�todo construtor de classe com heran�a
	public PessoaFisica(String nome, double rendimentos, String cpf, String rg) {
		super(nome, rendimentos);
		this.cpf = cpf;
		this.rg = rg;
	}
	
	//Sobrescri��o de m�todo para calcular para est� classe
	@Override
	public void calculoImpostoRenda() {
		this.rendimentos = this.rendimentos - (this.rendimentos * 0.012);
	}
	
	
	//Sobrescri��o de m�todo para formatar resultado do objeto
	@Override
	public String toString() {
		return String.format("Pessoa F�sica - Nome: %s, Rendimentos: %.2f, CPF: %s, RG: %s", 
				this.nome, this.rendimentos, this.cpf, this.rg);
	}
	
	
}
