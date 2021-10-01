package exercicioSete;

public class testeFuncionario {

	public static void main(String[] args) {
		
	//Criação de objetos das classes
		Gerente gerente1 = new Gerente("Leandro Fita", 16000.75);
		Assistente assistente1 = new Assistente("Diego Farias", 3000.80, 1500.99);

	//Aplicação do método, entregando como argumento a variável 
	//de referência do objeto.
		adicionarBonificacao(gerente1);
		adicionarBonificacao(assistente1);
	}
	
	//Método fora da MAIN para aplicar a bonificação para funcionario 
	//dos objetos gerados.
	//só rodou com STATIC.
	//Variável de parâmetro do tipo Funcionario.
		public static void adicionarBonificacao(Funcionario funcionario) {
			funcionario.adicionarParticipacao();
			System.out.println(funcionario);
		}
}
