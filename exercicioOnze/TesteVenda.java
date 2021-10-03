package exercicioOnze;

public class TesteVenda {

	public static void main(String[] args) {
		
		//Criação de obejtos. Instânciação.
		BebidaAlcoolica bebida1 = new BebidaAlcoolica("Cerveja", 12, "5%", 0);
		BebidaAlcoolica bebida2 = new BebidaAlcoolica("Vinho", 150, "9%", 10);
		Eletrodomestico eletro1 = new Eletrodomestico("TV", 2000, 110, 20); 
		Eletrodomestico eletro2 = new Eletrodomestico("Geladeira", 2353.64, 220, 10); 
		Eletrodomestico eletro3 = new Eletrodomestico("Rádio", 837.59, 110, 5);
		
		//Impressão de produtos instânciados.
		System.out.println(bebida1);
		System.out.println(bebida2);
		System.out.println(eletro1);
		System.out.println(eletro2);
		System.out.println(eletro3);	
		
		//Acrescentar no estoque.
		bebida1.acrescentarEstoque(100);
		
		//Venda de bibidas.
		System.out.println(bebida1.Vender(5));
		System.out.println(bebida2.Vender(3));
		
		//Venda de Eltrodomésticos.
		System.out.println(eletro1.Vender(9));
		System.out.println(eletro2.Vender(3));
		System.out.println(eletro3.Vender(1));
		
		//Venda superior ao estoque
		bebida2.Vender(9);
	
	}
}
