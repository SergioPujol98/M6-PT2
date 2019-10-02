package Pt2_SPujol;

import java.io.File;
import java.io.IOException;

public class myFiles {
	public static void main(String[] args) throws IOException {
		//Primero creamos un directorio en la direccion que queramos.
		File myFiles = new File("D:\\AMS2\\M6\\P2\\myFiles");
		myFiles.mkdir();
		//Luego creamos los dos ficheros dentro del directorio que hemos creado anteriormente.
		File fichero1 = new File ("D:\\AMS2\\M6\\P2\\myFiles\\fichero1.txt");
		fichero1.createNewFile();
		File fichero2 = new File ("D:\\AMS2\\M6\\P2\\myFiles\\fichero2.txt");
		fichero2.createNewFile();
		
		//Hemos creadao un booleano el cual nos indicara si el renombrado del fichero ha sido satisfactorio o no.
		//Por otro lado hemos usado el renameTo para modificar el nombre del fichero.
		boolean renombrado = fichero2.renameTo(new File("D:\\AMS2\\M6\\P2\\myFiles\\ficheroRenombrado.txt"));
		
		if (renombrado) {
			System.out.println("El fichero ha sido renombrado correctamente");
		} else {
			System.out.println("El fichero no ha sido renombrado");
		}
		
		//Hemos metido la lista de files contenido dentro del directorio myFiles en un array y luego hemos recorrido
		//ese array para ver los files.
		String[] lista_files = myFiles.list();
		for (int j = 0; j < lista_files.length;j++) {
			System.out.println(lista_files[j]);
		}
		//Borramos el fichero1 con  el comando .delete()
		fichero1.delete();
		
		//Volvemos a ver la lista de files.
		System.out.println();
		System.out.println("Podemos ver que el fichero1 ha sido borrado correctamente");
		String[] lista_files2 = myFiles.list();
		for (int j = 0; j < lista_files2.length;j++) {
			System.out.println(lista_files2[j]);
		}
	}

}
