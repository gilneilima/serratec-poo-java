package exercicioTreze;

import java.util.Scanner;

public class Exceptions2 {

	public static void main(String[] args) {
		
		System.out.println("Digite um n�mero inteiro");
		
		try {
			int num = lerNumero();
			System.out.println("O n�mero digitado �: " + num);			
			
		}catch (Exception log) {
			System.out.println("O digitado N�O � um inteiro!");
		}

	}

	public static int lerNumero() throws Exception{
		Scanner entrada = new Scanner(System.in);
		int numero = entrada.nextInt();
		entrada.close();
		return numero;
	}
	
}
