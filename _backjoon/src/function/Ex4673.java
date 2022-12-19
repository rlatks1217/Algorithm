package function;

import java.util.ArrayList;

public class Ex4673 {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 1; i <= 10000; i++) {
			String num1 = String.valueOf(i);
			String[] num2 = num1.split("");
			
			int sum = 0;
			for (int j = 0; j < num2.length; j++) {
				sum += Integer.parseInt(num2[j]);
			}
			
			list.add(i+sum);
			
		}
		
		ArrayList<Integer> selfNum = new ArrayList<Integer>(); 
		
		for (int i = 0; i < 10000; i++) {
			for (int j = 0; j < list.size(); j++) {
				if ((i+1) == list.get(j)) {
					break;
				} else if (j == list.size()-1) {
					selfNum.add(i+1);
				}
			}
		}
		
		for (int i = 0; i < selfNum.size(); i++) {
			if (selfNum.get(i) <= 10000) {
				System.out.println(selfNum.get(i));				
			}
		}

	}

}
