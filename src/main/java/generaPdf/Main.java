package generaPdf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Main {
	
	public static void main(String[] args) throws InterruptedException {
		
		Persona p1 = new Persona("Claudio", 30);
		Persona p2 = new Persona("Anita", 30);
		Persona p3 = new Persona("Nadia", 31);
		Persona p4 = new Persona("Java", 23);
		Persona p5 = new Persona("Python", 10);
		
		
		List<Persona> list = new ArrayList<Persona>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		list.add(p5);
		
		for (Persona persona : list) {
			System.out.println(persona);
		}		
		

		// Comparar por nombres en orden inverso
//		Collections.sort(list, new Comparator<Persona>() {
//			public int compare(Persona o1, Persona o2) {
//				return (-1) * o1.getNombre().compareTo(o2.getNombre());
//			}
//		});
		

		// Compara haciendo uso la implementacion de Comparable que tiene Persona
//		Collections.sort(list);
	
		// Comparar por nombres en orden ascendente
//		Collections.sort(list, new ComparadorDePersonas());
		
		Collections.sort(list, new Comparator<Persona>(){
			public int compare(Persona p1, Persona p2){
				return -1 * p1.getEdad().compareTo(p2.getEdad());
			}
		});
		

		for (Persona persona : list) {
			System.out.println(persona);
		}		
		
	}

}
