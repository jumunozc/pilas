package Proyecto;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.OutputStreamWriter;

public class MainGrafo {

	public static void main(String[] args) {
		try {
			Grafo grafo = new Grafo();
			String cadena;

			FileReader bf = new FileReader("C:\\Users\\julian\\git\\pilas\\src\\Proyecto\\prueba");
			BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
			BufferedReader br = new BufferedReader(bf);
			cadena = br.readLine();

			while(cadena!=null) {

				String[] entrada = cadena.split(",");	

				int nodo = Integer.parseInt(entrada[0]);
				int arista = Integer.parseInt(entrada[1]);

				grafo.conexionesGrafo(new NodoGrafo (nodo), new NodoArista(arista));
				cadena=br.readLine();

			}
			
			grafo.imprimirGrafo();
			bw.write(" \n");
			bw.write("DESVIACION ESTANDAR"+"\n");
			bw.write("El grafo tiene una medida de : "+(int)grafo.desviacionEstandar(grafo) +" nodos de dispersión."+"\n");
			bw.write("PROMEDIO DE CONEXIONES"+"\n");
			bw.write("El promedio de conexiones por usuario es de :"+grafo.promedioConexiones(grafo)+" conexiones."+"\n");	
			bw.write("MAYOR CANTIDAD DE CONEXIONES"+"\n");
			bw.write(grafo.mayorConexiones(grafo));
			bw.flush();
			br.close();

		} catch (FileNotFoundException e) {
			System.out.println("NO SE ENCONTRO EL ARCHIVO");
		} catch(Exception es) {
			System.out.println("ERROR");
		}

	}

}
