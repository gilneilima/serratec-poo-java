package exercicioDoze;

import java.time.LocalDate;

public class Moto extends Veiculo{
	private int cilindradas;
	
	//Construtor
	public Moto(String modelo, LocalDate dataConserto, Proprietario proprietario, int cilindradas) {
		super(modelo, dataConserto, proprietario);
		this.cilindradas = cilindradas;
	}
		
	//Métodos
	@Override
	public double lavarVeiculo() {
		return super.valorCobrado += TipoServico.LAVAGEM.getValorPorServico();
	}
		
	@Override
	public double trocarOleo() {
		return super.valorCobrado += TipoServico.OLEO.getValorPorServico();
	}
		
	@Override
	public double revisao() {
		return super.valorCobrado += TipoServico.REVISAO.getValorPorServico();
	}
	
	
}
