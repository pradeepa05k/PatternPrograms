package com.practice.program;

import java.util.Scanner;

public class Pattern04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows : ");
		int row = sc.nextInt();
		int asciiValue = 65;
		for(int i=1; i<=row; i++) {
			for(int j=1; j<=row-i; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print((char)asciiValue);
				if(j!=i) {
					System.out.print(" ");
				}
			}
			asciiValue++;
			System.out.println();
		}
		for(int i=row; i>=0; i--) {
			for(int j=1; j<=row-i; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print((char)asciiValue);
				if(j!=i) {
					System.out.print(" ");
				}
			}
			asciiValue++;
			System.out.println();
		}
	}
}

//Enter number of rows : 
//5
//    A
//   B B
//  C C C
// D D D D
//E E E E E
//F F F F F
// G G G G
//  H H H
//   I I
//    J