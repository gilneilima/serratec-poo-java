package aula;

public class TestaFuncionario {

	public static void main(String[] args) {
		//Construção do vetor com 2 posições.
		Funcionario[] funcionario = new Funcionario[3];
		
		//Instanciação de objeto Funcionario, dentro de cada posição do array.
		funcionario[0] = new Funcionario(null, null, 0);//Instaciação vazia.
		//Entrada de valores.
		funcionario[0].setNome("Leonardo");
		funcionario[0].setCargo("Programador Sênior");
		funcionario[0].setSalario(15000.99);
		
		funcionario[1] = new Funcionario(null, null, 0);
		funcionario[1].setNome("Daniel");
		funcionario[1].setCargo("Programador Junior");
		funcionario[1].setSalario(2000.99);
		
		funcionario[2] = new Funcionario("Gilnei", "Assessor", 1000.99);
		
		
		for (Funcionario func : funcionario) {// For In
			double abono = 300;
			func.abonoSalarial(abono);
			System.out.printf("%s - Abono: %.2f\n", func, abono);
		}
		

	}

}
