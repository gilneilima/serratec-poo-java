package exercicioSete;

public class Funcionario {
	protected String nome;
	protected String cpf;
	protected double salario;
	protected String turno;
	
	public Funcionario(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
	}
	
	//Sobrescri��o de m�todo para formatar resultado do objeto
		@Override
		public String toString() {
			return String.format("Nome Funcion�rio: %s, Sal�rio: %.2f", 
					this.nome, this.salario);
		}
		
	//M�todo para calcular participa��o de 1%
		public void adicionarParticipacao() {
			this.salario = this.salario + (this.salario * 0.01);			
		}
		
			
		
		
}
