package Proyecto;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class MainGrafo {

	public static void main(String[] args) {
		try {
			Grafo grafo = new Grafo();
			String cadena;
			
			FileReader bf = new FileReader("C:\\Users\\julian\\git\\pilas\\src\\Proyecto\\prueba");
			BufferedReader br = new BufferedReader(bf);
			cadena = br.readLine();
	
			while(cadena!=null) {
				String[] entrada = cadena.split(" ");
				int nodo = Integer.parseInt(entrada[0]);
				int arista = Integer.parseInt(entrada[1]);
				grafo.conexionesGrafo(new NodoGrafo (nodo), new NodoArista(arista));
				cadena=br.readLine();
			}
			grafo.imprimirGrafo();
			grafo.mayorConexiones(grafo);
			br.close();

		} catch (FileNotFoundException e) {
			System.out.println("NO SE ENCONTRO EL ARCHIVO");
		} catch(Exception es) {

		}

	}

}
