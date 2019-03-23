package LinearDataStructures;

public class Prueba	implements Node{
		public int data;

		public Prueba next=null;

		public Prueba(int x) {
			this.data=x;
		}

		@Override
		public void setNext(Node node) {
			// TODO Auto-generated method stub
			this.next=(Prueba)node;
		}

		@Override
		public Node getNext() {
			// TODO Auto-generated method stub
			return next;
		}

		@Override
		public Node clone() {
			// TODO Auto-generated method stub
			Prueba temp=new Prueba(this.data);
			return temp;
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
		public static void main(String[] args) {
			List x= new List();
			Queue cola=new Queue();
			cola.enqueue(new Prueba(1));
			cola.enqueue(new Prueba(3));
			/*x.insertAtBegin(new Prueba(2));
			x.insertAtBegin(new Prueba(3));
			x.insertAtBegin(new Prueba(4));
			x.insertAtEnd(new Prueba(1));
			x.insertAtIndex(new Prueba(5), 2);
			
			List p = x.cloneList();
			p.printList();*/
			System.out.println();
			x.deleteAtEnd();
			//System.out.println(x.get(3).toString());
			x.printList();

		}
	}