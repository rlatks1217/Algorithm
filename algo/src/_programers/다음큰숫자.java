package _programers;

public class 다음큰숫자 {

	public static void main(String[] args) {
		
		System.out.println(solution(15));
	}
	
    public static int solution(int n) {
        int answer = 0;
        
        int a = Integer.toString(n, 2).replace("0", "").length();
        
        boolean success = true;
        int plus = 1;
        
        while(success) {
        	answer = n + plus;
        	int b = Integer.toString(answer, 2).replace("0", "").length();
        	
        	if (a == b) {
        		success = false;
        	}else {
        		plus++;
        	}
        	
        }
        
        
        return answer;
    }

}
