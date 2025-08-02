package linear;
class CirNode{
	int data;
	CirNode next;
	public CirNode(int data) {
		this.data=data;
		next=null;
	}
}
class CirMethods{
	static CirNode head,tail;
	public static void insertAtbeg(int data) {
		CirNode node=new CirNode(data);
		if(head==null) {
			head=node;
			tail=node;
			node.next=head;
			return;
		}
		else {
			node.next=head;
			head=node;
			tail.next=head;
		}
	}
	public static void insertAtEnd(int data) {
		CirNode node=new CirNode(data);
		if(head==null) {
			head=node;
			tail=node;
			node.next=head;
			return;
		}
		else {
			tail.next=node;
			node.next=head;
			tail=node;
		}
	}
	public static void insertAtPos(int data,int pos){
		CirNode node=new CirNode(data);
	}
	public static void deleteAtBeg() {
		CirNode temp=head;
		if(head==null && tail==null) {
			System.out.println("List is Empty");
		}
		else {
			tail.next=head.next;
			head=head.next;
			temp.next=null;
		}
	}
	public static void deleteAtEnd() {
		
	}
	public static void deleteAtPos() {
		
	}
	
	public static void display() {
		CirNode temp=head;
		do {
			System.out.print(temp.data+" ");
			temp=temp.next;
		} while(temp!=head) ;
		System.out.println();
	}
}
public class Circular_Singly_Linked_List extends CirMethods {

	public static void main(String[] args) {
		insertAtbeg(5);
		insertAtbeg(15);
		insertAtEnd(25);
		insertAtEnd(35);
		insertAtPos(45,2);
		deleteAtBeg();
		deleteAtEnd();
		deleteAtPos();
		display();

	}

}
