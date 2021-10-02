package exercicioDoze;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class Carro extends Veiculo{//Carro herda de veículo.
	private String categoria;

	//Get
	public String getCategoria() {
		return categoria;
	}
	
	//Construtor
	public Carro(String modelo, LocalDate dataConserto, Proprietario proprietario, String categoria) {
		super(modelo, dataConserto, proprietario);
		this.categoria = categoria;
	}
	
	//Métodos
	@Override
	public double lavarVeiculo() {
		return super.valorCobrado += TipoServico.LAVAGEM.getValorPorServico();
	}
	
	@Override
	public double trocarOleo() {
		if(this.dataConserto.getDayOfWeek().equals(DayOfWeek.SATURDAY)) {
			super.valorCobrado += (TipoServico.OLEO.getValorPorServico() - 50);
		}
		else {
			super.valorCobrado += TipoServico.OLEO.getValorPorServico();
		}
		return super.valorCobrado;
	}
	
	@Override
	public double revisao() {
		double descontoDez = (TipoServico.REVISAO.getValorPorServico() * 0.10);//Uma variável (desconto) para encurtar código nas operações.
		if (this.dataConserto.getMonth().equals(Month.AUGUST)) {
			super.valorCobrado += (TipoServico.REVISAO.getValorPorServico() - descontoDez);
		}
		else {
			super.valorCobrado += TipoServico.REVISAO.getValorPorServico();
		}
		return super.valorCobrado;
	}

}
