import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
		int x=sc.nextInt();
		int idx=0;
		int count=0;
		for(int i=0;i<n;i++){
		    if(arr[i]==x){
		        count=count+1;
		        if(count==2)
		        idx=i;
		    }
		}
		if(count==0)
		System.out.println(-1);
		else if(count==1)
		System.out.println(-2);
		else
		System.out.println(idx);
		}
	}

