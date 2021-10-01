package exercicioSete;

public class testeFuncionario {

	public static void main(String[] args) {
		
	//Cria��o de objetos das classes
		Gerente gerente1 = new Gerente("Leandro Fita", 16000.75);
		Assistente assistente1 = new Assistente("Diego Farias", 3000.80, 1500.99);

	//Aplica��o do m�todo, entregando como argumento a vari�vel 
	//de refer�ncia do objeto.
		adicionarBonificacao(gerente1);
		adicionarBonificacao(assistente1);
	}
	
	//M�todo fora da MAIN para aplicar a bonifica��o para funcionario 
	//dos objetos gerados.
	//s� rodou com STATIC.
	//Vari�vel de par�metro do tipo Funcionario.
		public static void adicionarBonificacao(Funcionario funcionario) {
			funcionario.adicionarParticipacao();
			System.out.println(funcionario);
		}
}
