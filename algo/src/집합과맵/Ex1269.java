package 집합과맵;

import java.util.HashMap;
import java.util.Scanner;

public class Ex1269 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for (int i = 0; i < a; i++) {
			int number = sc.nextInt();
			map.put(number, 0);
		}
		
		for (int i = 0; i < b; i++) {
			int number = sc.nextInt();
			if (!map.containsKey(number)) {
				map.put(number, 0);
			} else {
				map.remove(number);
			}
		}
		
		System.out.println(map.size());
		
		sc.close();
	}

}
