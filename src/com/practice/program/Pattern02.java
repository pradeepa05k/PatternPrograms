package com.practice.program;

import java.util.Scanner;

public class Pattern02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows : ");
		int row = sc.nextInt();
		for(int i=1; i<=row; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(i);
				if(j!=i) {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for(int i=row; i>=0; i--) {
			for(int j=1; j<=i; j++) {
				System.out.print(i);
				if(j!=i) {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}

//Enter number of rows : 
//5
//1
//2 2
//3 3 3
//4 4 4 4
//5 5 5 5 5
//5 5 5 5 5
//4 4 4 4
//3 3 3
//2 2
//1