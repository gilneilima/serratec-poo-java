package exercicioTreze;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public abstract class DataTipo {

	public static void main(String[] args) {
		LocalDateTime dataNiver = LocalDateTime.of(1984, 2, 6, 10,10,10);
		DateTimeFormatter formatadora = DateTimeFormatter.ofPattern("dd/MM/yyyy.");
		LocalDateTime dataAgora = LocalDateTime.now();
		
		
		System.out.println("Anivers�rio: " + dataNiver.format(formatadora));
		System.out.println("Data de hoje: " + dataAgora.format(formatadora));
		
		if(dataNiver.toLocalDate().isLeapYear()) {
			System.out.println("Ano de Nascimento � Bissexto.");
		}
		else {
			System.out.println("Ano de Nascimento N�O � Bissexto.");
		}
	
		
		long dias = dataNiver.until(dataAgora, ChronoUnit.DAYS);
		long meses = dataNiver.until(dataAgora, ChronoUnit.MONTHS);
		long anos = dataNiver.until(dataAgora, ChronoUnit.YEARS);
	
		System.out.println("Voc� tem: " + dias + " dias de vida;\nOu "
		+ meses + " meses de vida;\nOu " + anos + " anos de vida.");

	}

}
