package exercicioDoze;

public class Proprietario {
	private String nome;
	
	//Get
	public String getNome() {
		return nome;
	}

	//Construtor
	public Proprietario(String nome) {
		this.nome = nome;
	}
		
	//toString
	@Override
	public String toString() {
		return String.format("%s", this.nome); 
	}	
	
	
}
