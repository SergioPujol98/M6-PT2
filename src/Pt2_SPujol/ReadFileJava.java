package Pt2_SPujol;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;



//Lee hasta que  hay un espacio
public class ReadFileJava {
	public static void main(String[] args) throws FileNotFoundException {
		File archivo = new File("C:\\Users\\sergi\\eclipse-workspace\\M6\\src\\Pt2_SPujol\\ReadFileJava.java");
		try {
			Scanner n1 = new Scanner(archivo);
			while (n1.hasNext()) {
				System.out.println(n1.next()); 
			}
		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
		}
	}
}
