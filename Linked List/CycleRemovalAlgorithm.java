public class CycleRemovalAlgorithm {
	public class Node{
		int data;
		Node next;
	}
	
	private Node head;
	private Node tail;
	private int size;
	
	//O(1)
	public void Addfirst(int item) {
		Node nn = new Node();
		nn.data = item; 
		if(size==0) {
			head = nn;
			tail = nn;
			size++;
		}else {
			nn.next = head;
			head = nn;
			size++;
		}
	}
	
	//O(1)
	public void Addlast(int item) {
		if(size==0) { 
			Addfirst(item);
		}else {
			Node nn = new Node();
			nn.data = item;
			tail.next = nn;
			tail = nn;
			size++;
		}
	}
	
	public void Display() {
		Node temp = head;
		while(temp!=null) {
			System.out.print(temp.data + "-->");
			temp = temp.next;
		}
		System.out.println(".");
	}
	public static void main(String[] args) {
		CycleRemovalAlgorithm cy = new CycleRemovalAlgorithm();
		cy.Addlast(1);
		cy.Addlast(2);
		cy.Addlast(3);
		cy.Addlast(4);
		cy.Addlast(5);
		cy.Addlast(6);
		cy.Addlast(7);
		cy.Addlast(8);
		cy.Display();
		
		
	}
}
