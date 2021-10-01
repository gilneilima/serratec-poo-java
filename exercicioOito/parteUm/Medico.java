package exercicioOito;

public class Medico extends Plano {
	
	protected String nome;
	private int crm;
	
	
	//Get
	public String getNome() {
		return nome;
	}
	
	public int getCrm() {
		return crm;
	}
	
	//Construtor
	public Medico(String empresa, String nome, int crm) {
		super(empresa);
		this.nome = nome;
		this.crm = crm;
	}
	
	//Métodos
	//To String
	@Override
	public String toString() {
		return String.format("Médico: %s, Valor Pago Médico: %.2f", this.nome, this.valorPago);
	}
	
	//Pagamento
	@Override
	public double calcularPagamento() {
		return this.valorPago = super.calcularPagamento() + (this.valorPago * 0.10);
	}
	
	
	
	
	
	
	
}
