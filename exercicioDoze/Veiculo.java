package exercicioDoze;

import java.time.LocalDate;

public abstract class Veiculo implements Oficina {//IMPLEMENTS para relacionar a uma interface.
	
	protected String modelo;
	protected double valorCobrado;
	protected LocalDate dataConserto;
	protected Proprietario proprietario;//O atributo é do tipo de uma outra classe.
	
	//Get
	public double getValorCobrado() {
		return valorCobrado;
	}
	
	//Construtor
	public Veiculo(String modelo, LocalDate dataConserto, Proprietario proprietario) {
		this.modelo = modelo;
		this.dataConserto = dataConserto;
		this.proprietario = proprietario;
	}
	
	//toString
	@Override
	public String toString() {
		return String.format("Modelo: %s. Data Conserto: %s. Proprietário: %s. Valor Cobrado: %.2f.", 
				this.modelo, this.dataConserto, this.proprietario, this.valorCobrado); 
	}	
	
}
