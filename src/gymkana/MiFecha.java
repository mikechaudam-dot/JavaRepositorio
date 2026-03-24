package gymkana;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
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
		
		//Fase 2 Mi edad
		
		LocalDate fechaHoy = LocalDate.now();
		Period edad =Period.between(miFechaNacimiento, fechaHoy);
		
		System.out.println("Fecha de nacimiento: " + miFechaNacimiento);
		System.out.println("Fecha de hoy " + fechaHoy);
		System.out.println("Edad exacta: " + edad.getYears() + " años, " + edad.getMonths() + " meses y " + edad.getDays() + " diás" );
		System.out.println("Total días vividos: " + ChronoUnit.DAYS.between(miFechaNacimiento, fechaHoy));
		System.out.println("Semanas completas: " + ChronoUnit.WEEKS.between(miFechaNacimiento, fechaHoy));
		
		//Fase 3 Proximo cumple
		
		miFechaNacimiento = miFechaNacimiento.withYear(2026);
		enum DiaFinSemana{
			SATURDAY,
			SUNDAY
		}
		
		System.out.println("Tu proximo cumpleaños " + miFechaNacimiento);
		System.out.println("Dias que faltan: " + ChronoUnit.DAYS.between(fechaHoy, miFechaNacimiento));
		System.out.println("Caera en: " + miFechaNacimiento.getDayOfWeek().getDisplayName(TextStyle.FULL,idioma).toUpperCase() );
		
		if( miFechaNacimiento.getDayOfWeek() != DiaFinSemana) {
			System.out.println();
		}
		System.out.println("Tipo de dia " + miFechaNacimiento.DayOf);

	}

}
