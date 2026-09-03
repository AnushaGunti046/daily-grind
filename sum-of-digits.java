import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		for(int t=0;t<T;t++){
		    int n=sc.nextInt();
		    int sum=0;
		    while(n>0){
		        sum=sum+(n%10);
		        n=n/10;
		    }
		    System.out.println(sum);
		}
	}
}
