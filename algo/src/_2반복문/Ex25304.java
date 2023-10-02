package _2반복문;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex25304 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt();
		int N = sc.nextInt();
		sc.nextLine(); //nextLine의 입력값으로 들어올 수 있는 Enter가 남아있는 상태라 한번 비워줘야 함
		String[] array = new String[N];
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextLine(); 
		}
		
		int total = 0;
		for (int i = 0; i < array.length; i++) {
			String[] product = new String[2];
			StringTokenizer st = new StringTokenizer(array[i], " ");
			product[0] = st.nextToken();
			product[1] = st.nextToken();
			total += Integer.parseInt(product[0])*Integer.parseInt(product[1]);
		}
		
		if (total == X) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}
//기본적으로 입력값을 받을 경우 Enter를 치면 다음으로 넘어감
//nextLine() 개행문자(Enter) 또한 입력값으로 받음(그래서 여기서 Enter만 치게 될 경우 
//Enter를 입력값이자 다음으로 넘어가라는 신호로 받아들이고 다음으로 넘어감)

//next()와 nextInt()는 개행문자(Enter)는 무시하고 공백 단위로 입력값을 받게 됨
//--> 그래서 next() 밑에 nextLine()이 있을 때 next() Enter를 치게 될 경우
//Enter는 밑에 nextLine에 입력값으로 들어가서 이 nextLine()은 그냥 넘어가는 것처럼 됨
