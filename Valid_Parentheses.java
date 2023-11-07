package stack;
import java.util.Stack;
public class Valid_Parentheses {
	public static void main(String[] args) {
		String str="()[]{}";
		Stack<Character> st=new Stack<>();
		
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch=='(') {
				st.push(')');
			}
			else if(ch=='{') {
				st.push('}');
			}
			else if(ch=='[') {
				st.push(']');
			}
			else if(st.isEmpty()||st.pop()!=ch) {
				return ;
			}
			
			
		}
		return ;
	}
}
