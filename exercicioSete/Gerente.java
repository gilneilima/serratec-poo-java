package exercicioSete;

public class Gerente extends Funcionario {//Herança
	private String nivel;
	
//Construtor de classe
	public Gerente(String nome, double salario) {
		super(nome, salario);//Chamando atributos herdados.
	}
	
//Sobrescrição de método para calcular participação do gerente mais 200 reais.
	@Override
	public void adicionarParticipacao() {
		super.adicionarParticipacao();//busca o Método de uma classe herdada (super.).			
		this.salario = this.salario + 200;
	}
	
	
	
	
	
}
