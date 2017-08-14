package generaPdf;

import java.util.Comparator;

public class ComparadorDePersonas implements Comparator<Persona> {

	public int compare(Persona o1, Persona o2) {
		return o1.getEdad().compareTo(o2.getEdad());
	}

	
	
}
