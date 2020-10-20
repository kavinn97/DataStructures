package com.chainsys.learning;

import java.util.Scanner;

public class LinearSerarch {
	public static void main(String args[]){
		int[] a=new int[50];
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter number of elements:");
		int num=sc.nextInt();
		System.out.println("Enter array elements:");
		for(int i=0;i<num;i++){
			a[i]=sc.nextInt();
		}
		System.out.println("Enter target element:");
		int target=sc.nextInt();
		int index=linearSearch(a,num,target);
		if(index==-1)
			System.out.println("Element not in array");
		else 
			System.out.println("Element is at "+(index+1));
	}
	public static int linearSearch(int a[],int num,int target){
		int i=0;
		while(i!=num){
			if(a[i]==target)
				return i;
				i++;
		}
		return -1;
	}
}
