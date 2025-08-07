package nonlinear;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;
public class Collection {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		List<Integer> li=new LinkedList<>();
		for(int i:arr) {
			li.add(i);
		}
		int l=0;
		int[] brr=new int[li.size()];
		for(Integer k:li) {
			brr[l]=li.get(l);
			l++;
		}
		System.out.println();
//		List<Integer> al=new ArrayList<>();
//		List<Integer> stack=new Stack<>();
//		List<Integer> vector=new Vector<>();

	}

}
