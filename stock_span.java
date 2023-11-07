package stack;

import java.util.Stack;

public class stock_span {

	public static void main(String[] args) {
		int[]arr= {2,5,9,3,1,12,6,8,7};
		int[]ans=new int[arr.length];
		Stack <Integer> st= new Stack<>();
		st.push(1);
		ans[0]=1;
		for(int i=0;i<arr.length;i++) {
			while(st.size()>0 && arr[i]>arr[st.peek()]) {
				st.pop();
			}
			
			if(st.size()==0) {
				ans[i]=i+1;
			}
			else {
				ans[i]=i-st.peek();
			}
			st.push(i);
			
		}
		
	}

}
