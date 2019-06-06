package Proyecto;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import  LinearDataStructures.*;


public class Grafo {

	public List listaNodos;

	public Grafo () {
		this.listaNodos = new List();
	}

	public void insertarNodo (NodoGrafo nodo) {

		listaNodos.insertAtEnd(nodo);
	}

	public void conexionesGrafo(NodoGrafo nodo,NodoArista arista) {


		if(listaNodos.linealSearch(nodo) == null) {
			insertarNodo(nodo);
			nodo.conexion.insertAtEnd(arista);

		}else {
			NodoGrafo busqueda =(NodoGrafo)listaNodos.linealSearch(nodo);
			busqueda.conexion.insertAtEnd(arista);
		}
	}

	public void imprimirGrafo() {

		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));

		NodoGrafo temp=(NodoGrafo)this.listaNodos.head;
		try {

			while(temp!=null) {
				bw.write(temp.toString()+" ");
				bw.flush();
				temp.conexion.printList();
				bw.write(" \n");
				temp=(NodoGrafo)temp.getNext();

			}

		} catch (Exception e) {

			e.printStackTrace();
		}
	}
	public String mayorConexiones (Grafo grafo) {


		NodoGrafo mayorConexiones=(NodoGrafo)grafo.listaNodos.head;

		int mayor = mayorConexiones.conexion.length();
		int usuario = mayorConexiones.dato;

		while (mayorConexiones != null) {

			if(mayorConexiones.conexion.length()> mayor  ) {

				mayor = mayorConexiones.conexion.length();
				usuario = mayorConexiones.dato;

			}

			mayorConexiones = mayorConexiones.next;

		}
		return "El usuario #: "+usuario+" tiene la mayor cantidad de conexiones equivalentes a: "+mayor;

	}

	public int promedioConexiones(Grafo grafo) {

		NodoGrafo mayorConexiones=(NodoGrafo)grafo.listaNodos.head;

		int mayor = mayorConexiones.conexion.length();


		while (mayorConexiones != null) {

			if(mayorConexiones.conexion.length()> mayor  ) {

				mayor = mayorConexiones.conexion.length();

			}

			mayorConexiones = mayorConexiones.next;

		}
		return mayor/grafo.listaNodos.length();
	}
	
	public int desviacionEstandar(Grafo grafo)  {

		NodoGrafo conexiones =( NodoGrafo)grafo.listaNodos.head;
		int contador = 0;

		int promedio = promedioConexiones(grafo);

		while (conexiones!=null) {
			
			int sumatoria = 0;


			sumatoria=(int) Math.pow(conexiones.conexion.length()-promedio, 2);
			contador = contador + sumatoria;


			conexiones=conexiones.next;
		}

		int[]numeroConexiones = rangoConexiones(grafo);
		
		int desviacionEstandar =(int) Math.sqrt(contador/(numeroConexiones[0]-1));

		return desviacionEstandar;

	}

	public int[] rangoConexiones(Grafo grafo) {

		NodoGrafo numConexiones =(NodoGrafo)grafo.listaNodos.head;
		int conexion1 = 0;
		int conexion2 = 0;
		
		int[] contadorRango = new int[2];
		
		
		do {
			if(numConexiones.conexion.length()<=10) {
				conexion1++;
			
			}else if(numConexiones.conexion.length()> 10 ) {
				conexion2++;
			
			}

			numConexiones=numConexiones.next;
			
		} while (numConexiones!=null);
		
		contadorRango[0] = conexion1;
		contadorRango[1] = conexion2;


		return contadorRango;

	}

}

