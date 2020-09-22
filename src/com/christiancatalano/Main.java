package com.christiancatalano;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	private Scanner s;
	private int termToShow;
	private boolean termValidated = false;
	
	public static void main(String[] args) {
		new Main();
	}
	
	public Main() {
		s = new Scanner(System.in);
		do {		
			try {
				System.out.print("Which term of fibonacci do you want to see? (0 - 92): ");
				termToShow = s.nextInt();
				
				if(termToShow < 0) {
					System.out.println("Please input a value from 0 to 92");
					continue;
				}
				
			} catch(InputMismatchException e) {
					System.out.println("Please input a value from 0 to 92");
					s.next();
					continue;
			}
			
			termValidated = true;
			s.close();
		} while (!termValidated);


		
		FibonacciHelper(0, 1, 0);
		return;
	}
	
	
	private long FibonacciHelper(long prev1, long prev2, long num) {
		int term = 0;
		System.out.println(num);
		while(term < termToShow) {
			num = prev2 + prev1;
			System.out.println(num);
			prev2 = prev1;
			prev1 = num;
			term++;
		}
		return num;
	}
}
