package com.chainsys.learning;

import java.util.Scanner;

public class BinarySearch {
	public static void main(String args[]){
		int[] array=new int[50];
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter n");
		int length=sc.nextInt();
		for(int i=0;i<length;i++){
			array[i]=sc.nextInt();
		}
		int target=sc.nextInt();
		System.out.println(Bsearch(array,length,target));
	}
	public static int Bsearch(int array[],int length,int target){
		int lb=0,ub=length-1;
		while(lb<ub){
			int mid =(lb+ub)/2;
			if(array[mid]==target)
				return mid;
			else if(target>array[mid])
				return Bsearch(array,mid+1,target);
			else if(target<array[mid])
				return Bsearch(array,lb,mid-1);
		}
		return -1;
	}
}
