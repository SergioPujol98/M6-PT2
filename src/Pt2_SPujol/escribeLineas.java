package Pt2_SPujol;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class escribeLineas {
	public static void main(String[] args) throws IOException {
		
		File escribeLineas = new File ("D:\\AMS2\\M6\\\\P2\\escribeLineas.txt");
		//Primero borramos el archivo por si lo hemos creado anteriormente y luego lo creamos.
		escribeLineas.delete();
		escribeLineas.createNewFile();
		
		
		PrintStream ps = new PrintStream(escribeLineas);
		int lineas = 0;
		for (int j = 0; j < 10; j++) {
			ps.println("Linea: " +lineas);
			ps.println();
			lineas++;
		}
		System.out.println("El archivo  ha sido creado correctamente");
	}
}
