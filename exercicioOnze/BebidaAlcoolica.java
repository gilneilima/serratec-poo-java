package exercicioOnze;

public class BebidaAlcoolica extends Produto{
	private String teorAlcoolico;

	//Get Set
	public String getTeorAlcoolico() {
		return teorAlcoolico;
	}

	public void setTeorAlcoolico(String teorAlcoolico) {
		this.teorAlcoolico = teorAlcoolico;
	}

	//Construtor
	public BebidaAlcoolica(String nome, double valor, String teorAlcoolico, int quantidadeDeItens) {
		super(nome, valor, quantidadeDeItens);
		this.teorAlcoolico = teorAlcoolico;
	}
	
	//toString
	@Override
	public String toString() {
		return String.format("\nProduto: %s. Valor: R$%.2f. Teor Alcoólico: %s. Estoque: %d Unidades.", 
			super.getNome(), super.getValor(), this.teorAlcoolico, super.getQuantidadeDeItens()); 
	}	
	
}
