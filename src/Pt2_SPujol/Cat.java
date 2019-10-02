package Pt2_SPujol;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Cat {
	public static void main(String[] args) throws FileNotFoundException {
		String ruta = "D:\\AMS2\\M6\\P2\\myFiles\\ficheroRenombrado.txt"; 
		File f = new File(ruta);
		
		if (f.isFile()) {
			System.out.println("La ruta introducida es correcta.");
			Scanner sc = new Scanner(f);
			System.out.println(sc.nextLine());
		}
		if (f.isDirectory()) {
			System.out.println("'ruta' no es un fichero, es un directorio.");
		}
		
	}

}
