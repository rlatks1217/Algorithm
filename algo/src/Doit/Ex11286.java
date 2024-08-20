package Doit;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;






public class Ex11286 { // 93
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		
		PriorityQueue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				int a = Math.abs(o1);
				int b = Math.abs(o2);
				if (a == b) {
					return o1 > o2 ? 1 : -1;
				}
				return a - b;
			}
		});
		
		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			if (x != 0) {
				queue.offer(x);
			} else if (queue.isEmpty()) {
				sb.append("0\n");
			} else {
				sb.append(queue.poll() + "\n");				
			}
		}
		
		System.out.println(sb);
		sc.close();
	}
}
