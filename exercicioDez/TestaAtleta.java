package exercicioDez;

public class TestaAtleta {

	public static void main(String[] args) {

		Pais pais1 = new Pais("Brasil");
		Pais pais2 = new Pais("Espanha");
		
		Boxeador boxer1 = new Boxeador("Gilnei", 100.01, "Boxe", 1, pais1);
		Boxeador boxer2 = new Boxeador("Rafael", 59.90, "Boxe", 1, pais2);
		Boxeador boxer3 = new Boxeador("Diego", 93, "Boxe", 1, pais1);
		
		
		System.out.println(boxer1.verificaSituacao());
		System.out.println(boxer1.getModalidade());
		
		System.out.println(boxer2.verificaSituacao());
		System.out.println(boxer2.getModalidade());
		
		System.out.println(boxer3.verificaSituacao());
		System.out.println(boxer3.getModalidade());
		

	}

}
