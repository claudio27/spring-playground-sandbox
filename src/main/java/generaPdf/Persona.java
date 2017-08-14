package generaPdf;

public class Persona implements Comparable<Persona>{

	private String nombre;
	private Integer edad;

	public Persona(String nombre, Integer edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + "]";
	}

	public int compareTo(Persona o) {
		return (-1) * this.getEdad().compareTo(o.getEdad());
	}
	
	

}
