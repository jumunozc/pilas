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
	public double desviacionEstandar(Grafo grafo)  {

		NodoGrafo conexiones =( NodoGrafo)grafo.listaNodos.head;
		int contador = 0;

		int promedio = promedioConexiones(grafo);

		while (conexiones!=null) {
			int sumatoria = 0;


			sumatoria=(int) Math.pow(conexiones.conexion.length()-promedio, 2);
			contador = contador + sumatoria;


			conexiones=conexiones.next;
		}

		int[]n = rangoConexiones(grafo);
		double desviacionEstandar = Math.sqrt(contador/n[0]);

		return desviacionEstandar;

	}

	public int[] rangoConexiones(Grafo grafo) {

		NodoGrafo numConexiones =(NodoGrafo)grafo.listaNodos.head;
		int conexion1 = 0;
		int conexion2 = 0;
		int conexion3 = 0;
		int conexion4 = 0;
		int conexion5 = 0;
		int conexion6 = 0;
		int conexion7 = 0;
		
		int[] contadorRango = new int[8];
		
		while (numConexiones!=null) {

			if(numConexiones.conexion.length()<=10) {
				conexion1++;
			}else if(numConexiones.conexion.length()> 10 &&numConexiones.conexion.length()<=50) {
				conexion2++;
			}else if(numConexiones.conexion.length()> 50 &&numConexiones.conexion.length()<=100) {
				conexion3++;
			}else if(numConexiones.conexion.length()> 100 &&numConexiones.conexion.length()<=300) {
				conexion4++;
			}else if(numConexiones.conexion.length()> 300 &&numConexiones.conexion.length()<=600) {
				conexion5++;
			}else if(numConexiones.conexion.length()> 600 &&numConexiones.conexion.length()<=1200) {
				conexion6++;
			}else if(numConexiones.conexion.length()>1200) {
				conexion7++;
			}

			numConexiones=numConexiones.next;
		}
		contadorRango[0] = conexion1;
		contadorRango[1] = conexion2;
		contadorRango[2] = conexion3;
		contadorRango[3] = conexion4;
		contadorRango[4] = conexion5;
		contadorRango[5] = conexion6;
		contadorRango[6] = conexion7;

		return contadorRango;

	}

}

