package _programmers;

public class 숫자의표현 {

	public static void main(String[] args) {
		
		System.out.println(solution(15));
	}

    public static int solution(int n) {
        int answer = 0;
        //1부터 연속된 숫자를 계속 더하다가 해당 수와 같거나 커지면 멈춤
        //이때 해당 수와 같은 경우 answer++;를 해준다.
        for(int i=1; i<=n; i++) {
            int sum = 0;
            for(int j=i; j<=n; j++) {
                sum += j;
                
                if(sum==n) {
                    answer++;
                    break;
                } else if(sum>n) {
                    break;
                }
            }
        }      
        return answer;
    }

}
