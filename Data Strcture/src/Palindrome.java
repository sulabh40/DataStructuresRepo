import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int j;

		Scanner sc = new Scanner(System.in);
		j=sc.nextInt();
		for(int k=0;k<j;k++) {
		String str= sc.next();
		int f=0;
        for(int i=0;i<str.length()/2;i++)
        {
        	System.out.println(i+"  "+(str.length()-i-1));
        	if(str.charAt(i)!=str.charAt(str.length()-i-1))
        	{
        		f=1;
        	}
        }
        if(f==1)
        {
        	System.out.println("DO NOT");
        }
        else
        {
        	System.out.println("AND IT IS");
        }
     
	}

}}
