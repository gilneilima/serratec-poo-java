package exercicioOnze;

public class Eletrodomestico extends Produto{
	private int voltagem;

	//Get Set
	public int getVoltagem() {
		return voltagem;
	}

	public void setVoltagem(int voltagem) {
		this.voltagem = voltagem;
	}	

	//Construtor
	public Eletrodomestico(String nome, double valor, int voltagem, int quantidadeDeItens) {
		super(nome, valor, quantidadeDeItens);
		this.voltagem = voltagem;
	}
	
	//toString
	@Override
	public String toString() {
		return String.format("\nProduto: %s. Valor: R$%.2f. Voltagem: %sv. Estoque: %d Unidades.", 
			super.getNome(), super.getValor(), this.voltagem, super.getQuantidadeDeItens()); 
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
				" Unidades. Adicionadas ao estoque de Eletrodomésticos.");
		quantidadeDeItens = super.getQuantidadeDeItens() + quantidadeDeItens;
		setQuantidadeDeItens(quantidadeDeItens);
		System.out.println("Estoque Atual: " + super.getQuantidadeDeItens() + ".");
		return quantidadeDeItens;
	}
	
}
