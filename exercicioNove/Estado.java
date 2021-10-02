package exercicioNove;

public class Estado {
	private String nomeEstado;
	private String sigla;
	
	//Get
	public String getNomeEstado() {
		return nomeEstado;
	}
	
	public String getSigla() {
		return sigla;
	}
	
	//Construtor
	public Estado(String nomeEstado, String sigla) {
		this.nomeEstado = nomeEstado;
		this.sigla = sigla;
	}
	
	//toString
		@Override
		public String toString() {
			return String.format("Estado: %s. UF: %s", 
					this.nomeEstado, this.sigla); 
		}
	
	
	
}