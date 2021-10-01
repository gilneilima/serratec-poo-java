package exercicioOito;

public class Plano {

	protected String empresa;
	protected double valorPago;
	protected double valorIss;
	
	//Get
	public double getValorPago() {
		return valorPago;
	}
	
	//Set
	public void setValorPago(double valorPago) {
		this.valorPago = valorPago;
	}
	
	public void setValorIss(double valorIss) {
		this.valorIss = valorIss/100;
	}
	
	//Construtor
	public Plano(String empresa) {
		this.empresa = empresa;
	}
	
	//Métodos
	//To String
	@Override
	public String toString() {
		return String.format("Empresa: %s. Valor Pago Plano: %.2f. ISS: %s.", 
				this.empresa, this.valorPago, this.valorIss);
	}
	
	//Pagamento
	public double calcularPagamento() {
		return this.valorPago = this.valorPago - (this.valorPago * this.valorIss);
	}

}