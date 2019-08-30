import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
       Scanner sc = new Scanner(System.in);
       String str=sc.next();
       String str1=sc.next();
       int f=0;
     if(str.length()!=str1.length())
     {
    	 System.out.println("NO");
     }
     else
     {
    	 for(int i=0;i<str1.length();i++)
    	 {
    		 if(!(str1.charAt(i)>str.charAt(i) || str1.charAt(i)==str.charAt(i)) )
    		 {
    			 f=1;
    		 }
    	 }
    	 if(f==0)
    	 {
    		 System.out.println("YES");
    	 }
    	 else
    	 {
    		 System.out.println("NO");
    	 }
     }
    }
}
