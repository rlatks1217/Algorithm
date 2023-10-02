package _3배열;

import java.util.Scanner;

public class Ex4344 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int c = sc.nextInt();
		
		sc.nextLine();
		
		double []avgUp = new double[c];
		
		for (int i = 0; i < c; i++) {
			
			String n = sc.nextLine();
			String[] N = n.split(" ");
			
			int[] scores = new int[N.length-1];
			for (int j = 0; j < N.length-1; j++) {
				scores[j] = Integer.parseInt(N[j+1]);
			}
			
			
			int sum = 0;
			for (int j = 0; j < scores.length; j++) {
				sum += scores[j]; 				
			}
			
			double avgList = sum/Integer.parseInt(N[0]);
			
			int cnt = 0;
			for (int j = 0; j < scores.length; j++) {
				if (avgList < scores[j]) {
					cnt++;
				}
			}
			
			avgUp[i] = (double)cnt/scores.length*100;
			
		}
		
		for (int i = 0; i < avgUp.length; i++) {
			System.out.printf("%.3f",avgUp[i]);
			System.out.println("%");
		}
		
		
	}

}
