package Pt2_SPujol;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class frasesMatrix {
	public static void main(String[] args) throws IOException {
		//Indicamos la ruta y el nombre que le queremos dar al nuevo archivo que creemos.
		File Matrix = new File ("D:\\AMS2\\M6\\P2\\frasesMatrix.txt");
		//Comprobamos si el archivo ya existe, si no existe, lo creamos.
		if (!Matrix.exists()) {
		Matrix.createNewFile();
		System.out.println("Fichero creado");
		} else {
			System.out.println("El fichero ya existe");
		}
		
		// Te permite escribir cosas dentro del fichero.
		PrintStream ps = new PrintStream(Matrix); 
		Scanner s = new Scanner(Matrix);
		
		//Comprobamos si ya existe texto dentro del fichero o no.
		if (!s.hasNext()) {
			ps.print("Yo sólo puedo mostrarte la puerta, tú eres quien la tiene que atravesar. Si ejecutas el programa dos veces, ¿Qué ocurre? ¿Cómo lo solucionamos?");
			System.out.println("Fichero escrito");
		} else {
			System.out.println("El fichero ya esta escrito");
		}
		
	}
}
