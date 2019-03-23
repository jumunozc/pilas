package LinearDS_Problems;
//https://www.urionlinejudge.com.br/judge/en/problems/view/1281

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import LinearDataStructures.*;


public class GoingToTheMarket implements Node {
	public double data;
	public String producto;
	
	public GoingToTheMarket next =null;
	
	public GoingToTheMarket(int x,String item) {
		this.data = x;
		this.producto = item;
	}

	@Override
	public void setNext(Node node) {
		this.next=(GoingToTheMarket)node;
	}

	@Override
	public Node getNext() {
		// TODO Auto-generated method stub
		return this.next;
	}

	@Override
	public Node clone() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isEqual(Node node) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isLessThan(Node node) {
		// TODO Auto-generated method stub
		return false;
	}
	public String toString() {
		return " "+this.data;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ));
		BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( System.out ));
		
		List listaConPrecios = new List();

		
		int cantViajes =Integer.parseInt(br.readLine());
		int cantProductos =Integer.parseInt(br.readLine());
		
		
	}
	
	

}
