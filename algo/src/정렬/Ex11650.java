package 정렬;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Ex11650 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<XandY> list = new ArrayList<XandY>();
		
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			list.add(new XandY(sc.nextInt(),sc.nextInt()));
		}
		
		Collections.sort(list, Comparator.comparing(XandY::getX).thenComparing(XandY::getY));
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getX() + " " + list.get(i).getY());
		}
		
		sc.close();   
	}

}

class XandY {
	
	private int x;
	private int y;
	
	public XandY(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	
}
