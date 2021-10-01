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
	
	//Sobrescrição de método para formatar resultado do objeto
		@Override
		public String toString() {
			return String.format("Nome Funcionário: %s, Salário: %.2f", 
					this.nome, this.salario);
		}
		
	//Método para calcular participação de 1%
		public void adicionarParticipacao() {
			this.salario = this.salario + (this.salario * 0.01);			
		}
		
			
		
		
}
