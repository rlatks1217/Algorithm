package 정렬;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Ex10814 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		ArrayList<Person> list = new ArrayList<Person>();
 		for (int i = 0; i < N; i++) {
 			Person p = new Person(sc.nextInt(), sc.next());
 			list.add(p);
		}
 		
 		Collections.sort(list, Comparator.comparing(Person :: getAge));
 		
 		for (int i = 0; i < list.size(); i++) {
 			System.out.println(list.get(i).getAge() + " " + list.get(i).getName());
		}
 		
 		sc.close();
	}

}

class Person {
	private int age;
	private String name;
	
	public Person(int age, String name) {
		this.age = age;
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}
	
}