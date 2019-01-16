package pojo;

public class Alumno {
	
	static final int ANIOS_DEF = 20;
	private String nombre;
	private int aniosEdad;
	private int mesesEdad;
	private int diasEdad;
	
	public Alumno(String nombre) {
		this.nombre = nombre;
		aniosEdad = ANIOS_DEF;
	}
	
	public int getAniosEdad() {
		return aniosEdad;
	}
	
	public void setAniosEdad(int nuevoAniosEdad) {
		aniosEdad = nuevoAniosEdad;
	}

}
