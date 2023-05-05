package _programers;

import java.util.HashSet;
import java.util.Set;

public class 소수찾기2 {

    public static void main(String[] args) {
    	System.out.println(solution("011"));
    	
    	String a  = "";

    }
    
    public static int solution(String numbers) {
    	int answer = 0;
    	
    	Set<Integer> set = new HashSet<>();
    	permutation("", numbers, set);
    	
    	for (int num : set) { //Integer 객체들이 저장되어 있는 자료구조라도 for문 안에서는 자동으로 int형으로 변환되어 나옴
			if (isPrime(num)) {
				System.out.println(num);
				answer++;
			}
		}
    	
    	return answer;
    }

    //순열 구하기
	private static void permutation(String choose, String numbers, Set<Integer> set) { 
        int n = numbers.length();
        if (!choose.equals("")) {
            set.add(Integer.valueOf(choose)); //문자열을 Integer로 바꾸는 메소드
        }
        
        for (int i = 0; i < n; i++) {
            permutation(choose+numbers.charAt(i), numbers.substring(0, i)+numbers.substring(i+1, n), set);
        }
	}
	
	//소수인지 판별
	private static boolean isPrime(int num) {
		if(num == 0 || num == 1) {
			return false;
		} else {
			for (int i = 2; i <= Math.sqrt(num); i++) {
				if (num%i == 0) {
					return false;
				}
			}
		}
		
		return true;
	}
}

//String a  = "1231";
//a.substring(4, a.length());
//실제로 해당 문자열의 최대 인덱스는 3이지만 4부터 시작해도 에러가 나지 않음/ 왜냐? substring의 구조를 보면 (두번째 인자 - 첫번째 인자)의 결과가 0보다 작을 때 오류를 뱉음
//그러나 위의 예시는 딱 0이기 때문에 해당 오류에 걸리지는 않고 공백을 출력하게 되는 것임

//for (int i = 0; i < 0; i++) {
//	a.charAt(i);			
//} 이처럼 (시작 인덱스 >= 제한 인덱스)라면 for문은 실행되지 않음(애초에 for문이 종료되는 원리와도 같음)