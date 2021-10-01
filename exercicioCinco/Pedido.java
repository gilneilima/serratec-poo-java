package exercicioCinco;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Pedido {
    private int numero;
    private LocalDate dataPedido;
    private int quantidade;
    private double valor;
    private double total;

    //Construtor da classe.
    public Pedido(int numero, LocalDate dataPedido, int quantidade, double valor) {
        this.numero = numero;
        this.dataPedido = dataPedido;
        this.quantidade = quantidade;
        this.valor = valor;

    }

    //Getters.
    public int getNumero() {
        return numero;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getValor() {
        return valor;
    }

    public double getTotal() {
        return total;
    }
    
    //Método para fechar pedido.
    public void fecharPedido() {
    	if (this.dataPedido.getDayOfWeek().equals(DayOfWeek.SUNDAY)) {//IMPORTANTE
    		this.total = (this.valor - (this.valor * 0.1)) * this.quantidade;
    	}
    	else {
    		this.total = this.valor * this.quantidade;
    	}
    }
}