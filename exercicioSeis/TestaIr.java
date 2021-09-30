package exercicioSeis;

public class TestaIr {

	public static void main(String[] args) {
		//Instâncias de classes
		PessoaFisica pessoa1 = new PessoaFisica("Gilnei", 20000.00, "123", "gil@hotmail");
		PessoaJuridica pessoa2 = new PessoaJuridica("Rafael", 30000.99, "456", "rafa@gmail");
		
		//Método para calcular Imposto de Renda
		pessoa1.calculoImpostoRenda();
		pessoa2.calculoImpostoRenda();
		
		//Impressão do objeto, após formatar: toString
		System.out.println(pessoa1);
		System.out.println(pessoa2);
	}

}
