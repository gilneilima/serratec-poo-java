package exercicioOnze;

public class TesteVenda {

	public static void main(String[] args) {
		
		//Criação de obejtos. Instânciação.
		BebidaAlcoolica bebida1 = new BebidaAlcoolica("Cerveja", 12, "5%", 0);
		BebidaAlcoolica bebida2 = new BebidaAlcoolica("Vinho", 150, "9%", 10);
		Eletrodomestico eletro1 = new Eletrodomestico("TV", 2000, 110, 20); 
		Eletrodomestico eletro2 = new Eletrodomestico("Geladeira", 2353.64, 220, 10); 
		Eletrodomestico eletro3 = new Eletrodomestico("Rádio", 837.59, 110, 5);
		SomaCompra somaCompras = new SomaCompra();
		
		//Impressão de produtos instânciados.
		System.out.println(bebida1);
		System.out.println(bebida2);
		System.out.println(eletro1);
		System.out.println(eletro2);
		System.out.println(eletro3);
		
		//Acrescentar no estoque.
		bebida1.acrescentarEstoque(100);
		
		//Venda de bibidas.
		bebida1.Vender(5);
		somaCompras.somarCompraTotal(bebida1);
		bebida2.Vender(3);
		somaCompras.somarCompraTotal(bebida2);		
		
		//Venda de Eltrodomésticos.
		eletro1.Vender(9);
		somaCompras.somarCompraTotal(eletro1);
		eletro2.Vender(3);
		somaCompras.somarCompraTotal(eletro2);	
		eletro3.Vender(1);
		somaCompras.somarCompraTotal(eletro3);		
		
		//Venda superior ao estoque
		bebida2.Vender(9);
		
		//Acrescentar no estoque.
		bebida2.acrescentarEstoque(10);
		
		System.out.println("\nTotal da venda: R$" + somaCompras.getTotalPago());
	
	}
}
