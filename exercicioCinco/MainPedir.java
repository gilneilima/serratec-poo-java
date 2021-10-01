package exercicioCinco;

import java.time.LocalDate;

public class MainPedir {

    public static void main(String[] args) {
    	//Abordagens diferentes para o atributo data nos objetos.
    	LocalDate data =  LocalDate.now();    	
        Pedido pedido1 = new Pedido(1, LocalDate.now(), 3, 1.50);
        Pedido pedido2 = new Pedido(2, LocalDate.of(2021, 12, 19), 6, 10.00);
        Pedido pedido3 = new Pedido(3, data, 4, 2.50);

        pedido1.fecharPedido();
        pedido2.fecharPedido();
        pedido3.fecharPedido();
        
        System.out.println(pedido1.getTotal());
        System.out.println(pedido2.getTotal());
        System.out.println(pedido3.getTotal());
        }

    }