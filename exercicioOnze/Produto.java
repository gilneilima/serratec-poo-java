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
		return quantidadeDeItens;
	}
	
	public double acrescentarEstoque(int quantidadeDeItens) {
		return quantidadeDeItens;
	}

}
