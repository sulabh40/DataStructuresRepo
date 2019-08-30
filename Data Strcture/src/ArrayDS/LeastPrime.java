package ArrayDS;

import java.util.Scanner;

public class LeastPrime {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int x= sc.nextInt();
		int arr[] = new int[1000001];
		int ans[] = new int[1000001];
		arr[0]=arr[1]=1;
		int c;
		for(int i=2; i<1000000;i++) {
			if(arr[i]==0) {
				c=1;
				for(int j=i+i;j<=1000000;j+=i) {
					if(arr[j]==0)
					{c++;}
					arr[j]=1;
				}
				ans[i]=c;
			}
		}
		
		System.out.println(ans[x]);

	}
	
}
