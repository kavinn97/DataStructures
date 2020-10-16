package com.chainsys.learning;

import java.util.Scanner;

public class LinearSerarch {
	public static void main(String args[]){
		int[] a=new int[50];
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter n");
		int n=sc.nextInt();
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		int k=sc.nextInt();
		int index=LS(a,n,k);
		if(index==-1)
			System.out.println("element not in array");
		else 
			System.out.println("element is at "+(index+1));
	}
	public static int LS(int a[],int l,int k){
		int i=0;
		while(i!=l){
			if(a[i]==k)
				return i;
				i++;
		}
		return -1;
	}
}
