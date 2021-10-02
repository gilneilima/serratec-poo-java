package exercicioNove;

public class Telefone {
	private String numero;

	//Get
	public String getNumero() {
		return numero;
	}
	
	//Construtor
	public Telefone(String numero) {
		this.numero = numero;
	}	
	
	//toString
	@Override
	public String toString() {
		return String.format("Telefone: %s", this.numero); 
		}

}