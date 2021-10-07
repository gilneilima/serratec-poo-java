package exercicioQuatorze;

import java.util.HashMap;
import java.util.Map;

public class AulaMap {

	public static void main(String[] args) {
		Map<String, String> carros = new HashMap<String, String>();
		carros.put("VOLKSWAGEN", "Gol");
		carros.put("FIAT", "Siena");
		carros.put("FORD", "Fiesta");
		carros.put("RENAULT", "Sandero");
		
		//Imprime as chaves
		for(String chaves : carros.keySet()) {
			System.out.println(chaves);
		}
		
		//Imprime as chaves e respectivos valores.
		for(Map.Entry<String, String> entrada : carros.entrySet()) {
			System.out.println(entrada);
		}
		
	}

}
