package com.practice.program;

import java.util.Scanner;

public class Pattern08 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows : ");
		int row = sc.nextInt();
		for(int i=1; i<=row; i++) {
			int k=i+1;
			for(int j=1; j<=row-i; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=(2*i)-1; j++) {
				if(j==1) {
					System.out.print(i);									
				}
				else if(j<=i) {
					System.out.print(k++);
				}
				else {
					System.out.print(k--);
				}
			}
			System.out.println();
		}
	}
}

//Enter number of rows : 
//5
//    1
//   232
//  34543
// 4567654
//567898765