package exercicioSete;

public class Assistente extends Funcionario {//Herança
	private double adicional;
	
//Construtor de classe.
	public Assistente(String nome, double salario, double adicional) {
		super(nome, salario);//Chamando atributos herdados.
		this.adicional = adicional;
	}
	
//Sobrescrever método para adicionar ao salário o adicional.
	@Override
	public void adicionarParticipacao() {
		super.adicionarParticipacao();//chamando método herdado.
		this.salario = this.salario + this.adicional;
	}
	
	
	
}
