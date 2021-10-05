package exercicioOnze;

public abstract class Produto implements Venda{
	private String nome;
	private double valor;
	private int quantidadeDeItens;
	private double somaTotal;
	
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
	
	public double getsomaTotal() {
		return somaTotal;
	}

	//Construtor
	public Produto(String nome, double valor, int quantidadeDeItens) {
		this.nome = nome;
		this.valor = valor;
		this.quantidadeDeItens = quantidadeDeItens;
	}
	
	//toString
	@Override
	public String toString() {
		return String.format("%s %s", this.nome, this.valor); 
	}
	
	//Métodos
	@Override
	public double Vender(int quantidadeDeItens) {
		double valorTotal = (this.getValor() * quantidadeDeItens);
		this.somaTotal += valorTotal;
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
		
		return this.somaTotal;
	}
	
	
	public double acrescentarEstoque(int quantidadeDeItens) {
		System.out.println("\n" + this.nome + "\nEstoque Anterior: " + this.getQuantidadeDeItens() + ".");
		System.out.println(quantidadeDeItens + " Unidades. Adicionadas ao estoque.");
		quantidadeDeItens = this.getQuantidadeDeItens() + quantidadeDeItens;
		setQuantidadeDeItens(quantidadeDeItens);
		System.out.println("Estoque Atual: " + this.getQuantidadeDeItens() + ".");
		return quantidadeDeItens;
	}
	
}
