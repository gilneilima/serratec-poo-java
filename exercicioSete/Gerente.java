package exercicioSete;

public class Gerente extends Funcionario {//Heran�a
	private String nivel;
	
//Construtor de classe
	public Gerente(String nome, double salario) {
		super(nome, salario);//Chamando atributos herdados.
	}
	
//Sobrescri��o de m�todo para calcular participa��o do gerente mais 200 reais.
	@Override
	public void adicionarParticipacao() {
		super.adicionarParticipacao();//busca o M�todo de uma classe herdada (super.).			
		this.salario = this.salario + 200;
	}
	
	
	
	
	
}
