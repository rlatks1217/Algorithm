package Doit;

import java.util.Arrays;
import java.util.Scanner;

import javax.swing.plaf.FontUIResource;

public class Ex1377 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		Obj[] arr = new Obj[n];
		for (int i = 0; i < n; i++) {
			arr[i] = new Obj(i, sc.nextInt());
		}
		
		Arrays.sort(arr, (obj1, obj2) -> {
			return obj1.value - obj2.value;
		});
		
		int result = 0;
		for (int i = 0; i < arr.length; i++) {
			result = Math.max(result, arr[i].index - i);
		}
		
		System.out.println(result + 1);
	}

}

class Obj {
	int index;
	int value;
	
	public Obj (int index, int value) {
		this.index = index;
		this.value = value;
	}
}