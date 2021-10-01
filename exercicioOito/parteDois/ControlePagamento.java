package exercicioOito;

public class ControlePagamento{
	private double totalPago;

	//Get
	public double getTotalPago() {
		return totalPago;
	}
	
	//M�todo
	public void calcularTotalPago(Plano plano) {
		this.totalPago += plano.getValorPago();
	}
	
	
	//toString
	@Override
	public String toString() {
		return String.format("Valor Total Pago: %.2f", this.totalPago);
	}
	
}
