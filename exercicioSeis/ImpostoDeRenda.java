package exercicioSeis;

public class ImpostoDeRenda {
	//Atributos da classe com PROTECTED
	protected String nome;
	protected String telefone;
	protected String email;
	protected double rendimentos;
	
	//Construtor da classe apenas com os campos solicitados
	public ImpostoDeRenda(String nome, double rendimentos) {
		this.nome = nome;
		this.rendimentos = rendimentos;
	}
	
	//M�todo gen�rico que ser� sobrescrito nas outras classes
	public void calculoImpostoRenda() {
		this.rendimentos = this.rendimentos * 1;
	}
		
}
