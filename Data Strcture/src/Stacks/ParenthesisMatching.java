package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class ParenthesisMatching {
public static void main(String[] args) {
	
	String s;
	Scanner sc=new Scanner(System.in);
	s=sc.next();
	Stack<Character> st=new Stack<Character>();
	int flag=1;
	for(int i=0;i<s.length();i++)
	{
		if(s.charAt(i)=='(')
		{
			st.push(s.charAt(i));
		}
		else if(s.charAt(i)==')')
		{
			if(st.size()>0 && st.peek()=='(')
			{
				st.pop();
			}
			else
			{
				flag=-1;
				break;
			}
			
		}
	}
	System.out.println(flag);
}
}
