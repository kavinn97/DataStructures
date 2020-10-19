package com.chainsys.learning;

import java.util.Scanner;

public class BinarySearch {
	public static void main(String args[]){
		int[] array=new int[50];
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter length of array");
		int length=sc.nextInt();
		System.out.println("Enter elements:");
		for(int i=0;i<length;i++){
			array[i]=sc.nextInt();
		}
		System.out.println("Enter target element:");
		int target=sc.nextInt();
		  int first = 0;
	      int last = length - 1;
	      int middle = (first + last)/2;

	      while( first <= last )
	      {
	         if ( array[middle] < target )
	           first = middle + 1;
	         else if ( array[middle] == target )
	         {
	           System.out.println(target + " found at location " + (middle + 1) + ".");
	           break;
	         }
	         else
	         {
	             last = middle - 1;
	         }
	         middle = (first + last)/2;
	      }
	      if ( first > last )
	          System.out.println(target + " is not found.\n");
	}
}
