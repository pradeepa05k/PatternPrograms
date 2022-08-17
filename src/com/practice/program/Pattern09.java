package com.practice.program;

import java.util.Scanner;

public class Pattern09 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows : ");
		int row = sc.nextInt();
		int coeff = 1;
		for(int i=0; i<row; i++) {
			for(int j=1; j<=row-i; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<=i; j++) {
				if(i==0 || j==0) {
					coeff = 1;
				} else {
					coeff = coeff * (i-j+1)/j;
				}
				System.out.print(coeff+" ");
			}
			System.out.println();
		}
		
		for(int i=row-1; i>=0; i--) {
			for(int j=1; j<=row-i; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<=i; j++) {
				if(i==0 || j==0) {
					coeff = 1;
				} else {
					coeff = coeff * (i-j+1)/j;
				}
				System.out.print(coeff+" ");
			}
			System.out.println();
		}
	}
}

//Enter number of rows : 
//7
//       1 
//      1 1 
//     1 2 1 
//    1 3 3 1 
//   1 4 6 4 1 
//  1 5 10 10 5 1 
// 1 6 15 20 15 6 1 
// 1 6 15 20 15 6 1 
//  1 5 10 10 5 1 
//   1 4 6 4 1 
//    1 3 3 1 
//     1 2 1 
//      1 1 
//       1 
