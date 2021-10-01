package exercicioOito;

public class TestePlano {

	public static void main(String[] args) {
		
		Clinica clinica1 = new Clinica("Amil", "Vida Mais", "530.555.098/0001-43");
		Medico medico1 = new Medico("Golden Cross", "Gilnei Lima", 52446);
		Anestesista anestesista1 = new Anestesista("Unimed", "Joaquim Ferreira", 52887, "Geral");
		
		ControlePagamento ctrlPag = new ControlePagamento();
		
		clinica1.setValorPago(80.00);
		clinica1.setValorIss(5);
		clinica1.calcularPagamento();
		System.out.println(clinica1.toString());
	
		ctrlPag.calcularTotalPago(clinica1);
		
		medico1.setValorPago(80.00);
		medico1.setValorIss(5);
		medico1.calcularPagamento();
		System.out.println(medico1.toString());
	
		ctrlPag.calcularTotalPago(medico1);
		
		anestesista1.setValorPago(80.00);
		anestesista1.setValorIss(5);
		anestesista1.calcularPagamento();
		System.out.println(anestesista1.toString());
	
		ctrlPag.calcularTotalPago(anestesista1);
		
		
		System.out.println(ctrlPag.toString());
		
		
	}
	
}
