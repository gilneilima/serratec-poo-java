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
	
}
