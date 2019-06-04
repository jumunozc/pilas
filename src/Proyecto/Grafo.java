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
	public void mayorConexiones (Grafo grafo) {
		
		

	}
}
