package com.practice.program;

import java.util.Scanner;

public class Pattern05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows : ");
		int row = sc.nextInt();
		int mid=(row/2)+1;
		for(int i=0; i<row; i++) {
			for(int j=0; j<row; j++) {
				if(i==j) {
					if(i<mid) {
						System.out.print(row-i);						
					}
					else {
						System.out.print(i+1);
					}
				}
				else if(i+j==row-1 && i!=j) {
					if(i>mid-1) {
						System.out.print(j+1);
					}
					else {
						System.out.print(i+1);
					}
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
//Enter number of rows : 
//7
//7     1
// 6   2 
//  5 3  
//   4   
//  3 5  
// 2   6 
//1     7

