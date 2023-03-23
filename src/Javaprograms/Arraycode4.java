package Javaprograms;

import java.util.Scanner;

public class Arraycode4 {
public static void main(String[] args) {
	System.out.println("Enter the count of movie houses");
	Scanner sc = new Scanner(System.in);
	int mov_hou=sc.nextInt();
	System.out.println("Enter the count of theaters in each movie house:");
	int thr=sc.nextInt();
	System.out.println("Enter the count of screen in each theaters of the movie");
	int scr=sc.nextInt();
	int arr[][][]=new int[mov_hou][thr][scr];
	for(int i=0;i<arr.length;i++) {
		System.out.println("inside the movie house"+(i+1));
		for(int j=0;j<arr[i].length;j++) {
			System.out.println("inside the theater no:"+(j+1));
			for(int k=0;k<arr[i][j].length;k++) {
				System.out.println("Enter the capacity of screen is"+(k+1));
				arr[i][j][k]= sc.nextInt();
				
			}
		}
	}
	System.out.println("------------------");
	for(int i=0;i<arr.length;i++)
	{	
		System.out.println("inside the movie house"+(i+1));
		for(int j=0;j<arr[i].length;j++) {
			System.out.println("inside the theater"+(j+1));
			for(int k=0;k<arr[i][j].length;k++) {
				System.out.println("The funds collected from screen no"+(k+1));
				int fund =arr[i][j][k]*350;
				System.out.println(fund);
				
			}
		}
	}
}
}
