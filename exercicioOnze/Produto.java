package exercicioOnze;

public abstract class Produto implements Venda{
	private String nome;
	private double valor;
	private int quantidadeDeItens;
	
	//Get Set
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public int getQuantidadeDeItens() {
		return quantidadeDeItens;
	}

	public void setQuantidadeDeItens(int quantidadeDeItens) {
		this.quantidadeDeItens = quantidadeDeItens;
	}

	//Construtor
	public Produto(String nome, double valor, int quantidadeDeItens) {
		this.nome = nome;
		this.valor = valor;
		this.quantidadeDeItens = quantidadeDeItens;
	}
	
	public Produto(int quantidadeDeItens) {
		this.quantidadeDeItens = quantidadeDeItens;
	}
	
	//toString
	@Override
	public String toString() {
		return String.format("%s %s", this.nome, this.valor); 
	}
	
	//Métodos
	public double Vender(int quantidadeDeItens) {
		double valorTotal = (this.getValor() * quantidadeDeItens);
		if(this.getQuantidadeDeItens() < quantidadeDeItens) {
			System.out.println("\nVenda NÃO realizada. Estoque insuficiente. " + 
					this.getNome() + " - Estoque Atual: " + this.getQuantidadeDeItens() + ".");
		}
		else {
			System.out.println("\nVenda Realizada! " + this.getNome() + ": " + quantidadeDeItens + 
					" Unidades." + " Valor Total: R$" + valorTotal + ".");
			quantidadeDeItens = this.getQuantidadeDeItens() - quantidadeDeItens;
			setQuantidadeDeItens(quantidadeDeItens);
		}
		return valorTotal;
	}
	
	
	public double acrescentarEstoque(int quantidadeDeItens) {
		System.out.println("\nEstoque Anterior: " + this.getQuantidadeDeItens() + ".");
		System.out.println(this.getNome() + ": " + quantidadeDeItens + 
				" Unidades. Adicionadas ao estoque.");
		quantidadeDeItens = this.getQuantidadeDeItens() + quantidadeDeItens;
		setQuantidadeDeItens(quantidadeDeItens);
		System.out.println("Estoque Atual: " + this.getQuantidadeDeItens() + ".");
		return quantidadeDeItens;
	}

}
