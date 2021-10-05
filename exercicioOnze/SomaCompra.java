package exercicioOnze;

public class SomaCompra {
	
	private double totalSoma;
	
	
	public double getTotalPago() {
		return totalSoma;
	}

	public double somarCompraTotal(Produto produto) {
	
	this.totalSoma += produto.getsomaTotal();	
	return totalSoma;
	}
	

}
