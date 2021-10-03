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
	
	//Métodos
	@Override
	public double Vender(int quantidadeDeItens) {
		double valorTotal = (super.getValor() * quantidadeDeItens);
		if(super.getQuantidadeDeItens() < quantidadeDeItens) {
			System.out.println("\nVenda NÃO realizada. Estoque insuficiente. " + 
					super.getNome() + " - Estoque Atual: " + super.getQuantidadeDeItens() + ".");
		}
		else {
			System.out.println("\nVenda Realizada! " + super.getNome() + ": " + quantidadeDeItens + 
					" Unidades." + " Valor Total: R$" + valorTotal + ".");
			quantidadeDeItens = this.getQuantidadeDeItens() - quantidadeDeItens;
			setQuantidadeDeItens(quantidadeDeItens);
		}
		return valorTotal;
	}	
	
	@Override
	public double acrescentarEstoque(int quantidadeDeItens) {
		System.out.println("\nEstoque Anterior: " + super.getQuantidadeDeItens() + ".");
		System.out.println(super.getNome() + ": " + quantidadeDeItens + 
				" Unidades. Adicionadas ao estoque de Bebidas.");
		quantidadeDeItens = super.getQuantidadeDeItens() + quantidadeDeItens;
		setQuantidadeDeItens(quantidadeDeItens);
		System.out.println("Estoque Atual: " + super.getQuantidadeDeItens() + ".");
		return quantidadeDeItens;
	}
	
	
}
