package exercicioNove;

public class Contato {
	private String nome;
	private Endereco endereco;
	private Telefone[] telefones;
	
	//Get Set
	public Telefone[] getTelefones() {
		return telefones;
	}
	
	public void setTelefones(Telefone[] telefones) {
		this.telefones = telefones;
	}
	
	public String getNome() {
		return nome;
	}
	
	public Endereco getEndereco() {
		return endereco;
	}
	
	//Construtor
	public Contato(String nome, Endereco endereco) {
		this.nome = nome;
		this.endereco = endereco;
	}
	
	//Métodos
	public void mostrarTelefones() {
		
	}
	
	//toString
	@Override
	public String toString() {
		return String.format("Nome: %s. Endereço: %s. Telefone: %s.", 
				this.nome, this.endereco, this.telefones); 
	}
	
}
