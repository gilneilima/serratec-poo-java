package exercicioDoze;

public enum TipoServico {
	//ENUMS
	OLEO(100), LAVAGEM(50), REVISAO(200);
	
	//Atributo
	private double valorPorServico;

	//Get
	public double getValorPorServico() {
		return valorPorServico;
	}
	
	//Construtor
	private TipoServico(double valorPorServico) {
		this.valorPorServico = valorPorServico;
	}
	
}
