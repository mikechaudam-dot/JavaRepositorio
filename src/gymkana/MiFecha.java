package gymkana;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class MiFecha {

	public static void main(String[] args) {
		
		//Fase 1 Primer contacto cn java.time 
		
		LocalDate miFechaNacimiento = LocalDate.of(1991,06,11); 
		
		Locale idioma = Locale.forLanguageTag("es");
		
		System.out.println("Día: " + miFechaNacimiento.getDayOfMonth());
		System.out.println("Mes: " + miFechaNacimiento.getMonthValue());
		System.out.println("Año: " + miFechaNacimiento.getDayOfYear());
		System.out.println("Mes: " + miFechaNacimiento.getMonth().getDisplayName(TextStyle.FULL, idioma).toUpperCase());
		System.out.println("Día: " + miFechaNacimiento.getDayOfWeek().getDisplayName(TextStyle.FULL, idioma).toUpperCase());
		

	}

}
