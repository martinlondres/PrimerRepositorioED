package main;

import pojo.Alumno;

public class UsoAlumno {

	public static void main(String[] args) {
		Alumno pepe = new Alumno("Pepe");
		
		// Cu�ntos a�os tiene Pepe
		int aniosPepe = pepe.getAniosEdad();
		System.out.println(aniosPepe);
		
		// suma 1 a aniosEdad
		pepe.setAniosEdad(aniosPepe + 1);
		
		aniosPepe = pepe.getAniosEdad();
		System.out.println(aniosPepe);

	}

}
