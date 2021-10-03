package exercicioDez;

public abstract class Atleta implements Olimpiada {

	private String nome;
	private double peso;
	private String modalidade;
	private int totalParticipantes;
	private Pais pais;
	
	//Get Set
	public String getModalidade() {
		return modalidade;
	}

	public void setModalidade(String modalidade) {
		this.modalidade = modalidade;
	}

	public String getNome() {
		return nome;
	}

	public double getPeso() {
		return peso;
	}

	public int getTotalParticipantes() {
		return totalParticipantes;
	}

	public Pais getPais() {
		return pais;
	}

	//Construtor
	public Atleta(String nome, double peso, String modalidade, int totalParticipantes, Pais pais) {
		this.nome = nome;
		this.peso = peso;
		this.modalidade = modalidade;
		this.totalParticipantes = totalParticipantes;
		this.pais = pais;
	}
	
	//M�todo
	@Override
	public String verificaSituacao() {
		String verifica = " ";
		if (this.peso > 90) {
		this.modalidade = "Peso Pesado";
		verifica = "Participar�"; 
		}
		else if (this.peso >= 60 && this.peso <= 90){
			this.modalidade = "Peso M�dio";
			verifica = "Participar�";
		}
		else {
			this.modalidade = "N�o Classificado";
			verifica = "N�o Participar�";
		}
		return verifica;		
	}
	
}
