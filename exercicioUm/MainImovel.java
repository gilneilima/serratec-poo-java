package exercicioUm;

public class MainImovel {

	public static void main(String[] args) {
		
		//primeiro objeto.
		Imovel imovel1 = new Imovel();
		imovel1.codImovel = 1;
		imovel1.bairro = "Centro";
		imovel1.tipo = "apto";
		imovel1.valor = 25000;
		
		//segundo objeto.
		Imovel imovel2 = new Imovel();
		imovel2.codImovel = 2;
		imovel2.bairro = "Quitandinha";
		imovel2.tipo = "casa";
		imovel2.valor = 98900;
		
		//Reajustar
		Imovel reajustando = new Imovel();
		reajustando.Reajuste(imovel1.tipo, imovel1.valor);
		
		Imovel reajustando2 = new Imovel();
		reajustando2.Reajuste(imovel2.tipo, imovel2.valor);
		
		//Classificar
		Imovel classificando = new Imovel();
		classificando.Classificacao(imovel1.valor);
		
		Imovel classificando2 = new Imovel();
		classificando2.Classificacao(imovel2.valor);
		
	}

}
