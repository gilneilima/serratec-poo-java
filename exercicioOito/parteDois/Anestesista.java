package exercicioOito;

public class Anestesista extends Medico {

	private String tipoAnestesista;

	//Get
	public String getTipoAnestesista() {
		return tipoAnestesista;
	}

	//Set
	public void setTipoAnestesista(String tipoAnestesista) {
		this.tipoAnestesista = tipoAnestesista;
	}
	
	//Construtor
	public Anestesista(String empresa, String nome, int crm, String tipoAnestesista) {
		super(empresa, nome, crm);
		this.tipoAnestesista = tipoAnestesista;
	}
	
	//Métodos
	//To String
	@Override
	public String toString() {
		return String.format("Tipo Anestesista: %s, Valor Pago Anestesista: %.2f", this.tipoAnestesista, this.valorPago);
	}
	
	//Pagamento
	@Override
	public double calcularPagamento() {
		return this.valorPago = super.calcularPagamento() + 1000;
	}
	
	
	
	
}
