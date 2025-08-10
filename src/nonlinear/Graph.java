package nonlinear;

import java.util.Queue;
import java.util.LinkedList;

public class Graph {
	static int[][] matrix;
	static int vertices;
	public Graph(int vert) {
		vertices=vert;
		matrix=new int[vertices][vertices];
	}
	public static void print() {
		for(int i=0;i<vertices;i++) {
			for(int j=0;j<vertices;j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void addEdge(int src,int des) {
		matrix[src][des]=1;
		matrix[des][src]=1;
	}
	public static void bfs(int start) {
		boolean[]visited=new boolean[vertices];
		Queue<Integer> data=new LinkedList<>();
		visited[start]=true;
		data.add(start);
		while(!data.isEmpty()) {
			int current=data.poll();
			System.out.print(current+" ");
			for(int i=0;i<vertices;i++) {
				if(matrix[current][i]==1 && !visited[i]) {
					visited[i]=true;
					data.add(i);
				}
			}
		}
	}
	public static void dfsutil(int start,boolean visited[]) {
		visited[start]=true;
		System.out.print(start+" ");
		for(int i=0;i<vertices;i++) {
			if(matrix[start][i]==1 && !visited[i]) {
				dfsutil(i,visited);
			}
		}
	}
	public static void dfs(int start) {
		boolean[] visited=new boolean[vertices];
		dfsutil(start,visited);
	}
	public static void main(String[] args) {
		Graph as=new Graph(5);
		addEdge(0,1);
		addEdge(0,2);
		addEdge(2,1);
		addEdge(2,3);
		addEdge(3,4);
		addEdge(4,1);
		print();
		System.out.println();
		System.out.println("BFS:");
		bfs(0);
		System.out.println("\n");
		System.out.println("DFS:");
		dfs(0);
	}

}
