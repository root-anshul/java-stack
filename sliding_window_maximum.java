package stack;

import java.util.Stack;

public class sliding_window_maximum {

	public static void main(String[] args) {
		int arr[]= {1,3,-1,-3,5,3,6,7};
		int ans[]= new int[arr.length];
		int k=3;
		int ans1[]=new int [arr.length - k + 1];
		
		
		Stack<Integer>st=new Stack<>();
		ans[arr.length-1]=arr.length;
		st.push(arr.length-1);
		for(int i=arr.length-2;i>=0;i--) {
			while(st.size()>0 && arr[i]>=arr[st.peek()]) {
				st.pop();
			}
			if(st.size()==0) {
				ans[i]=arr.length;
			}
			else {
				ans[i]=st.peek();
			}
			st.push(i);
		}
		
		for(int i=0;i<ans.length;i++) {
			System.out.print(ans[i]+" ");
		}
		System.out.println();
		System.out.println();
		System.out.println();
		
		int j=0;
		for(int i=0;i<=arr.length-k;i++) {
		
			if(j<i) {
				j=i;
			}
			while(ans[j]<i+k) {
				j=ans[j];
			}
			
			ans1[i]= arr[j];
		}

		for(int i=0;i<ans1.length;i++) {
			System.out.print(ans1[i]+" ");
		}
	}

}
