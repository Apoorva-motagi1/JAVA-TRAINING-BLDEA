package Javaprograms;

import java.util.Scanner;

public class Arraycode3 {
	public static void main(String[] args) {
		System.out.println("Enter the count classes:");
		Scanner sc=new Scanner(System.in);
		int cls= sc.nextInt();	
		int arr[][]=new int[cls][];
	      for(int i=0;i<arr.length;i++) {
	    	 
	      
	    System.out.println("Enter the student count in each class:");
	    arr[i]=new int [sc.nextInt()];
	      }
	   
	    for(int i=0;i<arr.length;i++) {
	    	System.out.println("inside the class "+(i+1));
	    	for(int j=0;j<arr[i].length;j++) {
	    		System.out.println("Enter the marks of student" +(j+1));
	    		arr[i][j]=sc.nextInt();	
	    	}
	    }
	    System.out.println("-------");
	    for(int i=0;i<arr.length;i++) {
	    	System.out.println("inside the class"+(i+1));
	    	for(int j=0;j<arr[i].length;j++) {
	    		System.out.println("The marks of students"+(j+1)+"is:"+arr[i][j]);
	    	}
	    }
	}
}
