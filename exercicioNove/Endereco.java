package exercicioNove;

public class Endereco {
	private String rua;
	private String bairro;
	private String cep;
	private Cidade cidade;
	
	//Get
	public String getRua() {
		return rua;
	}
	
	public String getBairro() {
		return bairro;
	}
	
	public String getCep() {
		return cep;
	}
	
	//Construtor
	public Endereco(String rua, String bairro, String cep, Cidade cidade) {
		this.rua = rua;
		this.bairro = bairro;
		this.cep = cep;
		this.cidade = cidade;
	}
	
	//toString
	@Override
	public String toString() {
		return String.format("%s. Bairro: %s. CEP: %s. Cidade: %s", 
				this.rua, this.bairro, this.cep, this.cidade); 
	}
	
}
