package nonlinear;

import java.util.ArrayList;
import java.util.List;

public class Graph_Linked_List {
	static List<List<Integer>> al=new ArrayList<>();
	public Graph_Linked_List(int vertices) {
		for(int i=0;i<vertices;i++) {
			al.add(new ArrayList<Integer>());
		}
	}
	public static void insert(int src,int des) {
		al.get(src).add(des);
		al.get(des).add(src);
	}
	public static void display() {
		int k=0;
		for(List<Integer> i:al) {
			System.out.println(k++ +"--->"+ i);
		}
	}
	public static void main(String[] args) {
		Graph_Linked_List as=new Graph_Linked_List(5);
		insert(0,1);
		insert(0,2);
		insert(2,1);
		insert(2,3);
		insert(3,4);
		insert(4,1);
		display();
	}

}
