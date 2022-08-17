package com.practice.program;

import java.util.Scanner;

public class Pattern07 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows : ");
		int row = sc.nextInt();
		for(int i=1; i<=row; i++) {
			for(int j=1; j<=row-i; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=(2*i)-1; j++) {
				System.out.print("*");				
			}
			System.out.println();
		}
		for(int i=row; i>=0; i--) {
			for(int j=1; j<=row-i; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=(2*i)-1; j++) {
				System.out.print("*");				
			}
			System.out.println();
		}
	}
}

//Enter number of rows : 
//5
//    *
//   ***
//  *****
// *******
//*********
//*********
// *******
//  *****
//   ***
//    *