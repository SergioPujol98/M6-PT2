package Pt2_SPujol;

import java.io.File;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class ModificarEx1 {
	public static void main(String[] args) {
		//Creamos e insertamos datos en el HashMap.
		Map<String, Integer> h1 = new HashMap<String, Integer>();
		h1.put("Javi", 26);
		h1.put("Loco", 30);
		h1.put("Sato", 29);
		h1.put("Poto", 20);
		//Ruta del nuevo fichero
		File f1 = new File ("D:\\AMS2\\M6\\P2\\ModificarEx1.txt");
		

		try {
			String frase;
			f1.createNewFile();		
			PrintStream ps1 = new PrintStream(f1);
			//Printeamos lo que hay dentro del HashMap en el fichero.
			ps1.print(h1);
			Scanner sc1 = new  Scanner(f1);
			//Aqui mostramos si se ha insertado correctamente los datos del HashMap en el fichero.
			System.out.println(sc1.nextLine());
			
			//He creado las variables que creo que necesitare para pasar de un fichero a un HashMap.
			String key = null;
			int num;
			int contador = 2;
			//Aqui compruebo si hay datos dentro del fichero, si los hay, entra en el while
			while (sc1.hasNext()) {
				frase = sc1.next();
				//Si el contador es par, entra en el if, si no, en el else.
				if (contador % 2 == 0) {
					//Al saber que el primer valor es siempre la key en un HashMap, introduzco el primero valor en key y augmento el contador para que no se quede en bucle.
					key = frase;
					contador++;
				} else {
					//Cuando es impar, significa que no es la key del hashMap, por lo tanto, es un integer y lo meto en num, luego inserto los dos valores recogidos en el hashMap y empiezo otra vez.
					num = Integer.parseInt (frase);
					h1.put(key,num);
					contador++;
				}
			}
			//Aqui mostramos el HashMap
			System.out.println("");
			Set set = h1.entrySet();
			Iterator it = set.iterator();
			 while(it.hasNext()) {
			      Map.Entry me = (Map.Entry)it.next();
			      System.out.println("Persona: "+me.getKey() + ", Edad:  " + me.getValue()+"€");
			      
			    } 
			
			
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
	}

}
