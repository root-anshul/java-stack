package stack;

import java.util.Stack;

public class nge_2_version {
public static void main(String[] args) {
	int arr[]= {3,5,9,6,7,8,10};
	int []ans=new int[arr.length];
	//2 5  9  3  1 12 6  8  7
	//5 9 12 12 12 -1 8 -1 -1 
	
	Stack<Integer> st= new Stack<>();
	st.push(0);
	//System.out.print(st.peek());
	for(int i=1;i<arr.length;i++) { 
		while(st.size()>0 && arr[i]>arr[st.peek()]) {
			int pos=st.peek();
			ans[pos]=arr[i];
			st.pop();			
		}
			st.push(i);
	
	}
	while(st.size()>0) {
		int pos=st.peek();
		ans[pos]=-1;
		st.pop();
	}
	for(int i=0;i<arr.length;i++) {
		System.out.print(ans[i]+" ");
	}
}
}
