package linear;
//node class
class Node{
	int data;
	Node next; //It is the reference variable for node class
	//It initialize the instance variable
	public Node(int data) {  //Constructor
		this.data=data;
		next=null;
	}
}
//methods class
class Methods{
	static Node head=null;
	static int count=0;
	public static void insertAtBeg(int data) {
		Node newNode=new Node(data);
		if(head==null) {
			head=newNode;
		}
		else {			
			newNode.next=head;
			head=newNode;
		}
		count++;
	}
	public static void insertAtEnd(int data) {
		Node newNode=new Node(data);
		Node temp=head;
		if(head==null) {
			head=newNode;
			count++;
			return;
		}
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next=newNode;
		count++;
	}
	public static void insertAtPos(int data,int pos) {
		Node newNode=new Node(data);
		Node temp=head;
		if(head==null && pos!=0) {
			System.out.println("Invalid position");
			return;
		}
		if(pos==0) {
			insertAtBeg(data);
			return;
		}
		for(int i=0;i!=pos-1;i++) {
			if(temp.next==null) {
				System.out.println("Invalid");
				return;
			}
			temp=temp.next;
		}
		newNode.next=temp.next;
		temp.next=newNode;
		count++;
	}
	public static void deleteAtbeg(){
		Node temp=head;
		head=head.next;
		temp.next=null;
		count--;
	}
	public static void deleteAtEnd() {
		Node temp=head;
		while(temp.next.next!=null) {
			temp=temp.next;
		}
		temp.next=null;
		count--;
	}
	public static void deleteAtPos(int pos) {
		Node temp=head;
		if(pos==0) deleteAtbeg();
		for(int i=1;i<pos;i++) {
			temp=temp.next;
		}
		temp.next=temp.next.next;
		count--;
	}
	public static void display() {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
		System.out.println("The length of list:"+ count);
	}
}
//main class
public class Singly_Linked_List extends Methods{

	public static void main(String[] args) {
		insertAtBeg(44);
		insertAtBeg(142);
		insertAtBeg(42);
		insertAtEnd(53);
		insertAtEnd(63);
		insertAtPos(111,2);
		deleteAtbeg();
		deleteAtEnd();
		deleteAtPos(3);
		display();
	}
}
