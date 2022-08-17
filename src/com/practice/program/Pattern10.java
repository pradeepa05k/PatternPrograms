package com.practice.program;

import java.util.Scanner;

public class Pattern10 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows : ");
		int row = sc.nextInt();
		System.out.println("Enter number of cols : ");
		int col = sc.nextInt();
		
		for(int i=1; i<=row; i++) {
			if(i%2==1) {
				for(int j=1; j<=col; j++) {
					if(i==1 || j==1 || i==row || j==col) {
						System.out.print("X ");
					} else if(i%2==1 || j%2==1) {
						System.out.print("O ");
					}
				}
			} else if(i%2==0) {
				for(int j=1; j<=col; j++) {
					if(i==1 || j==1 || i==row || j==col) {
						System.out.print("O ");
					} else if(i%2==0 || j%2==0) {
						System.out.print("O ");
					}
				}
			}
//			for(int j=1; j<=col; j++) {
////				if(i==1 || j==1 || i==row || j==col) {
////					System.out.print("X ");
////				} else if(i%2==0 || j%2==0) {
////					System.out.print("O ");
////				} else if(i%2==1 || j%2==1) {
////					System.out.print("X ");
////				} else if((i+j)%2==1) {
////					System.out.print("X ");
////				} else {
////					System.out.print("O ");
////				}
//				
//				if(i==1 || j==1 || i==row || j==col) {
//					System.out.print("X ");
//				}
//				else if(i%2==1) {
//					
//				}
//				 else if(i%2==0 || j%2==0) {
//					System.out.print("O ");
//				} else if(i%2==1 || j%2==1) {
//					System.out.print("X ");
//				} else if((i+j)%2==1) {
//					System.out.print("X ");
//				} else {
//					System.out.print("O ");
//				}
//			}
			System.out.println();
		}
	}

}

//Input:
//N= 3, M=3
//Output:
//X X X
//X 0 X
//X X X
//
//Input:
//N=4 M=5
//Output:
//X X X X
//X 0 0 X
//X 0 0 X
//X 0 0 X
//X X X X
//
//Input:
//N=6 M=7
//X X X X X X
//X 0 0 0 0 X
//X 0 X X 0 X
//X 0 X X 0 X
//X 0 X X 0 X
//X 0 0 0 0 X
//X X X X X X