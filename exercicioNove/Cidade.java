package exercicioNove;

public class Cidade {
	private String nomeCidade;
	private Estado estado;
	
	
	//Get
	public String getNomeCidade() {
		return nomeCidade;
	}
	
	public Estado getEstado() {
		return estado;
	}
	
	//Construtor
	public Cidade(String nomeCidade, Estado estado) {
		this.nomeCidade = nomeCidade;
		this.estado = estado;
	}
	
	//toString
	@Override
	public String toString() {
		return String.format("%s. %s", this.nomeCidade, this.estado); 
	}
	
}
