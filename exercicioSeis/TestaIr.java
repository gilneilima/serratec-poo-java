package exercicioSeis;

public class TestaIr {

	public static void main(String[] args) {
		//Inst�ncias de classes
		PessoaFisica pessoa1 = new PessoaFisica("Gilnei", 20000.00, "123", "gil@hotmail");
		PessoaJuridica pessoa2 = new PessoaJuridica("Rafael", 30000.99, "456", "rafa@gmail");
		
		//M�todo para calcular Imposto de Renda
		pessoa1.calculoImpostoRenda();
		pessoa2.calculoImpostoRenda();
		
		//Impress�o do objeto, ap�s formatar: toString
		System.out.println(pessoa1);
		System.out.println(pessoa2);
	}

}
