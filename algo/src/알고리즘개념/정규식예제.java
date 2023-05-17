package 알고리즘개념;


public class 정규식예제 {

	public static void main(String[] args) {
		
		String a = "123456aZ..";
		
		boolean result1 = a.matches("[0-9a-z]+");
		//소문자와 숫자로만 구성되어 있는 정규식을 의미함
		System.out.println(result1);
		String result2 = a.replaceAll("[^a-z0-9]","0");
		// ^가 대괄호 안에 있으므로 부정의 의미 즉, 소문자나 숫자가 아닌 패턴을 판별하는 정규식을 의미함
		System.out.println(result2);
		
		//특수문자가 들어있는지 판단할 때는 대괄호안에 해당 특수문자를 쓰면 된다.
		String result3 = a.replaceAll("[^a-z0-9.]","0");
		System.out.println(result3);
	}
	
}
