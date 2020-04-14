package linkedlist;

public class LinkedList {
	static Node head;
	private static void createNode(int data) {
		Node node=new Node();
		node.data=data;
		node.address=null;
		if (head==null) {
			head=node;
		}
		else {
			Node n=head;
			while (n.address!=null) {
				n=n.address;
			}
			n.address=node;
		}		
	}
	private static void createAtFirst(int data) {
		Node node=new Node();
		node.data=data;
		node.address=null;
		node.address=head;
		head=node;		
	}
	private static void createAtPosition(int index, int data) {
		Node node=new Node();
		node.data=data;
		node.address=null;
		if (index==0) {
			createAtFirst(data);
		}
		Node n=head;
		for (int i = 0; i < index; i++) {
			n=n.address;
		}
		n.address=node.address;
		n.address=node;		
	}
	private static void deleteNode(int index) {
		if (index==0) {
			head=head.address;
		}
		Node n=head;
		Node n1=head;
		for (int i = 0; i < index; i++) {
			n=n.address;
		}
		n1=n.address;
		n.address=n1.address;
		n1=null;
	}
	private static void displayNodes() {
		Node node=head;
		while (node.address!=null) {
			System.out.println(node.data);
			node=node.address;
		}
		System.out.println(node.data);
		
	}

	public static void main(String[] args) {
		LinkedList.createNode(1);
		LinkedList.createNode(2);
		LinkedList.createAtFirst(4);
		LinkedList.createAtPosition(1,5);
		LinkedList.deleteNode(1);
		LinkedList.displayNodes();
	}
}
