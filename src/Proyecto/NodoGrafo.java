package Proyecto;
import  LinearDataStructures.*;
public class NodoGrafo implements Node {
	
	int dato;
	List conexion;
	NodoGrafo next = null;
	
	public NodoGrafo(int dato) {
		this.dato = dato;
		this.conexion = new List();
	}

	@Override
	public void setNext(Node node) {
		this.next = (NodoGrafo)node;
	}

	@Override
	public Node getNext() {
		return this.next;
	}

	@Override
	public Node clone() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isEqual(Node node) {
		
		NodoGrafo temp = (NodoGrafo)node;
		return this.dato == temp.dato ? true : false;
	}

	@Override
	public boolean isLessThan(Node node) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public String toString()
	{
		return ("Usuario: "+ this.dato + " conexiones: ");
	}

}
