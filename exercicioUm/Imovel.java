package exercicioUm;

public class Imovel {
		//Atributos de tipo primitivo.
		int codImovel;
		String bairro;
		String tipo;
		double valor;
		
	//M�todo de Reajuste.
	public void Reajuste(String type, double val) {
		
		if (type == "casa") {
			System.out.println("O valor reajustado para im�vel do tipo CASA �: " + (val = val * 1.05));
		}else if (type == "apto") {
			System.out.println("O valor reajustado para im�vel do tipo APTO �: " + (val = val * 1.08));
		}else {
			System.out.println("Tipo de im�vel n�o reconhecido");
		}
	}

	//M�todo de Classifica��o.
	public void Classificacao(double vl) {
		if (vl > 50000) {
			System.out.println("O im�vel � Classe A");
		}else if (vl >= 10000 && vl < 50000 ) {
			System.out.println("O im�vel � Classe B");
		}else if (vl < 10000) {
			System.out.println("O im�vel � Classe C");
		}
	}

}
