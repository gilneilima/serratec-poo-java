package exercicioOito;

public class Clinica extends Plano{

	private String nome;
	private String cgc;
	
	//Get
	public String getNome() {
		return nome;
	}
	
	public String getCgc() {
		return cgc;
	}
	
	//Construtor
	public Clinica(String empresa, String nome, String cgc) {
		super(empresa);
		this.nome = nome;
		this.cgc = cgc;
	}
	
	//M�todos
	//To String
	@Override
	public String toString() {
		return String.format("Cl�nica: %s, Valor Pago Cl�nica: %.2f", this.nome, this.valorPago);
	}
	
	}
