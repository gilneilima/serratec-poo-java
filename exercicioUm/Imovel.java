package exercicioUm;

public class Imovel {
		//Atributos de tipo primitivo.
		int codImovel;
		String bairro;
		String tipo;
		double valor;
		
	//Método de Reajuste.
	public void Reajuste(String type, double val) {
		
		if (type == "casa") {
			System.out.println("O valor reajustado para imóvel do tipo CASA é: " + (val = val * 1.05));
		}else if (type == "apto") {
			System.out.println("O valor reajustado para imóvel do tipo APTO é: " + (val = val * 1.08));
		}else {
			System.out.println("Tipo de imóvel não reconhecido");
		}
	}

	//Método de Classificação.
	public void Classificacao(double vl) {
		if (vl > 50000) {
			System.out.println("O imóvel é Classe A");
		}else if (vl >= 10000 && vl < 50000 ) {
			System.out.println("O imóvel é Classe B");
		}else if (vl < 10000) {
			System.out.println("O imóvel é Classe C");
		}
	}

}
