
public class AlgoTest {

	public static void main(String[] args) {
		//4673
		boolean[] arr = new boolean[10001]; 
		
		for (int i = 1; i <= 10000; i++) {
			String number = Integer.toString(i);
			int dnResult = i;
			for (int j = 0; j < number.length(); j++) {
				dnResult += (number.charAt(j)- 48);
			}
			
			if (dnResult <= 10000) {
				arr[dnResult] = true;
			}
		}
		
		for (int i = 1; i < arr.length; i++) {
			if (!arr[i]) {
				System.out.println(i);
			}
		}
	}

}
