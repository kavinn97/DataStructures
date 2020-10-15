package com.chainsys.learning;
import java.util.*;
public class Qsort {
 public static void main(String args[]){
	 int a[]=new int[10];
	 int n;
	 System.out.println("Enter the number of elements:");
	 Scanner sc = new Scanner(System.in);
	 n=sc.nextInt();
	 for(int i=0;i<n;i++)
		 a[i]=sc.nextInt();
	 quickSort(a,0,n-1);
	 for(int i=0;i<n;i++)
		 System.out.print(a[i]+" ");
	 sc.close();
 }
public static void quickSort(int a[],int lb,int ub){
	 if(lb<ub){
		 int loc=partition(a,lb,ub);
		 quickSort(a,lb,loc-1);
		 quickSort(a,loc+1,ub);
	 }
 }
public static int partition(int a[],int lb,int ub){
	 int pivot=a[lb];
	 int start=lb;
	 int end=ub;
	 while(start<end){
		 while((a[start]<=pivot)&&(start<end))
			 start++;
		 while(a[end]>pivot)
			 end--;
		 if(start<end)
			 swap(a,start,end);
	 }
	 swap(a,lb,end);
	 return end;
 }
public static void swap(int a[],int start,int end){
	 int temp=a[start];
	 a[start]=a[end];
	 a[end]=temp;
 }
}