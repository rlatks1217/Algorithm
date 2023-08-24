package 정렬;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Ex11651 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		ArrayList<Xy> list = new ArrayList<Xy>();
		for (int i = 0; i < N; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			Xy instn = new Xy(a, b); 
			list.add(instn);
		}
		
		Collections.sort(list, Comparator.comparing(Xy :: getY).thenComparing(Xy :: getX));
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getX() + " " + list.get(i).getY());
		}
		
		sc.close();
	}

}

class Xy {
	
	private int x;
	private int y;
	
	public Xy(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getY() {
		return y;
	}

	public int getX() {
		return x;
	}
}