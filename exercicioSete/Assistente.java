package exercicioSete;

public class Assistente extends Funcionario {//Heran�a
	private double adicional;
	
//Construtor de classe.
	public Assistente(String nome, double salario, double adicional) {
		super(nome, salario);//Chamando atributos herdados.
		this.adicional = adicional;
	}
	
//Sobrescrever m�todo para adicionar ao sal�rio o adicional.
	@Override
	public void adicionarParticipacao() {
		super.adicionarParticipacao();//chamando m�todo herdado.
		this.salario = this.salario + this.adicional;
	}
	
	
	
}
