package exercicioDoze;

import java.time.LocalDate;

public class TesteOficina {

	public static void main(String[] args) {
		
		Proprietario proprietario1 = new Proprietario("Daniel");
		
		Carro carro1 = new Carro("BMW X6", LocalDate.of(2021, 8, 14), proprietario1, "SUV");
		
		Moto moto1 = new Moto("Ducati Superleggera V4", LocalDate.of(2021, 10, 2), proprietario1, 1103);
		
		carro1.trocarOleo();
		carro1.revisao();
		carro1.lavarVeiculo();
		
		moto1.trocarOleo();
		moto1.revisao();
		moto1.lavarVeiculo();
			
		System.out.println(carro1);//Já chama direto o toString.
		System.out.println(moto1.toString());
	}

}
