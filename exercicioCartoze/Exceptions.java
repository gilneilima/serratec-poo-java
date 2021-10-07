package exercicioTreze;

public class Exceptions {

	public static void main(String[] args) {
		
		int[] numerador = {1, 2, 3, 4, 5};
		int[] denominador = {3, 0, 2};
		
		for (int i = 0; i < numerador.length; i++) {
			try {
			System.out.println("Operação de Divisão: " + numerador[i] + " / " + denominador[i] + " = " 
		+ (numerador[i]/denominador[i]));
			
			}catch (ArithmeticException log1) {
				System.out.println("Deu ruim! Não pode dividir por ZERO.");
				
			}catch (ArrayIndexOutOfBoundsException log2) {
				System.out.println("Deu ruim novamente! Teu vetor é menor. Sem índice.");
			}
		}
	}
}
