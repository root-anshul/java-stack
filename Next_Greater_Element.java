package stack;

import java.util.Stack;

public class Next_Greater_Element {

	public static void main(String[] args) {
		int arr[]= {2,5,9 , 3,  1 ,12 ,6 , 8,  7};
		int []ans=new int[arr.length];
		Stack<Integer> st=new Stack<>();
		
		ans[arr.length-1]=-1;
		st.push(arr[arr.length-1]);
		
		for(int i=arr.length-2;i>=0;i--) {
		while(st.size()>0 && arr[i]>=st.peek() ) {
			st.pop();
		}
		if(st.size()==0) {
			ans[i]=-1;
		}else {
			ans[i]=st.peek();
		}
		st.push(arr[i]);
			
		}
		for(int i=0;i<ans.length;i++) {
			System.out.print(ans[i]+" ");
		}
	}

}
