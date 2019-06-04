package Proyecto;
import  LinearDataStructures.*;
public class NodoArista implements Node{

	int dato;
	NodoArista next = null;
	
	public NodoArista(int dato) {
		this.dato = dato;
		
	}

	@Override
	public void setNext(Node node) {
		this.next = (NodoArista)node;
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
		
		return false;
	}

	@Override
	public boolean isLessThan(Node node) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public String toString()
	{
		return (this.dato+",");
	}

}
