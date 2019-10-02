package Pt2_SPujol;

import java.io.File;
import java.util.Scanner;


//Lee hasta que haya un espacio.
public class ReadLineFileJava {
	public static void main(String[] args) {
		File archivo = new File("C:\\Users\\sergi\\eclipse-workspace\\M6\\src\\Pt2_SPujol\\ReadLineFileJava.java");
		try {
			Scanner n1 = new Scanner(archivo);
			while (n1.hasNextLine()) {
				System.out.println(n1.nextLine());
			}
		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
		}
	}

}
