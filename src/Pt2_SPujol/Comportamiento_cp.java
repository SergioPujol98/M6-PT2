package Pt2_SPujol;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class Comportamiento_cp {
	public static void main(String[] args) throws IOException {
		File cp = new File("D:\\AMS2\\M6\\P2\\cp.txt");
		File a_cp = new File("D:\\AMS2\\M6\\P2\\frasesMatrix.txt");
		cp.createNewFile();
		
		//Hemos leido el archivo que queremos copiar.
		Scanner sc = new  Scanner(a_cp);
		String s1 = new String();
		
		//Esto nos permitira escribir dentro del archivo en el que vamos a copiar el contenido del anterior.
		PrintStream ps = new PrintStream(cp);
		
		//Este while, nos permitira copiar palabra por palabra el archivo.
		while (sc.hasNext()) {
			//Si quisiesemos copiarlo por lineas  simplemente tendriamos que poner sc.nextLine();
			//En este caso hemos pasado la palabra captada por el Scanner al String para insertarlo posteriormente en el fichero.
			s1 = sc.next();
			//He puesto un espacio despues del String para simular los espacios despues  de las  palabras captadas debido a que es un next().
			ps.print(s1+" ");
		}
		System.out.println("Se ha copiado el archivo");
		
	}

}
