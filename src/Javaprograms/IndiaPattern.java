package Javaprograms;
import java.util.Scanner;

public class IndiaPattern{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==0 || i==(n-1) || j==(n/2)) {
					System.out.print("* ");

				}
				else {
					System.out.print("  ");	
				}

			}
			System.out.print("  ");
			for(int j=0;j<n;j++) {
				if(j==0 || i==(n-1) ) {
					System.out.print("* ");

				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("  ");
			for(int j=0;j<n;j++) {
				if(j==0 || j==(n/2) || i==0 && j<=(n/2) || i==(n-1) && j<=(n/2)) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");	
				}

			} 
			System.out.print("  ");
			for(int j=0;j<n;j++) {
				if( j==0 && i<=(n/2) || (i-j==(n/2)) || (i+j==(n-1) + (n/2)) || (j==(n-1)) &&i<=(n/2) ) {
					System.out.print("* ");

				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("  ");
			for(int j=0;j<n;j++) {
				if(i==0 && j<=(n/2) || j==0 || i==(n/2) && j<=(n/2) || i==(n-1) && j<=
						(n/2)) {
					System.out.print("* ");

				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("  ");
			for(int j=0;j<n;j++) {
				if(i==0 || i==(n-1) || j==(n/2)) {
					System.out.print("* ");

				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("  ");
			for(int j=0;j<n;j++) {
				if(j==0 || i==j || j==(n-1)) {
					System.out.print("* ");

				}

				else{
					System.out.print("  ");
				}
			}

			System.out.print("  ");
			for(int j=0;j<n;j++) {
				if(j==0 || (i==0 && j<n/2) || (i==(n-1) && j<n/2)||
						(j==(n/2) && i!=0 && i!=(n-1))) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");	
				}

			} 
			System.out.print("  ");
			for(int j=0;j<n;j++) {
				if(i==0 || i==(n-1) || j==(n/2)) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");	
				}

			} 
			System.out.print("  ");
			for(int j=0;j<n;j++) {
				if(	j==0 || (i==0 && j<=(n/2)) || (j==(n/2)) || (i==(n/2) && j<=(n/2))) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");	
				}

			} 
		
			System.out.println();
		}

	}


}






