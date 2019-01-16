package main;

import pojo.Alumno;

public class UsoAlumno {

	public static void main(String[] args) {
		Alumno pepe = new Alumno("Pepe");
		
		// Cuántos años tiene Pepe
		int aniosPepe = pepe.getAniosEdad();
		System.out.println(aniosPepe);
		
		// suma 1 a aniosEdad
		pepe.setAniosEdad(aniosPepe + 1);
		
		aniosPepe = pepe.getAniosEdad();
		System.out.println(aniosPepe);

	}

}
