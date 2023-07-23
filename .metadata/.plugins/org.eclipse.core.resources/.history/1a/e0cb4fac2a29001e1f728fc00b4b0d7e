package _programmers중요;

public class 예상대진표 {

	public static void main(String[] args) {
		int n = 8;
		int a = 4;
		int b = 7;
		System.out.println(solution(n, a, b));
	}

	private static int solution(int n, int a, int b) {
		int answer = 1; //1라운드부터 시작
		//문제에서 1이 2와 만나고 3이 4와 만나는 식으로 토너먼트가 진행된다고 했음 즉, 만나는 애들 중(a, b) 큰 수는 항상 짝수임을 알 수 있음
		while(true) {
			int gap = a - b; //1이 될 때까지 할 예정이니까 일단 뺄셈하기
			if (gap < 0 && b%2 == 0) {//gap이 음수가 나왔다는 것은 b가 더 크단 얘기 => b가 짝수여야 함
				if (gap == -1) {//차이가 1만 나면 바로 옆에 있음을 알 수 있음
					break;
				}
			}else if (a%2 == 0){ //a가 더 큰 경우 마찬가지로 이번엔 a가 짝수여야 함
				if(gap == 1) {
					break;
				}
			}
			
			//홀수라면 1더해줌 why? => 만나는 애들 중 큰 수인 짝수는 토너먼트인 만큼 다음 라운드에서 반으로 줄어든 번호를 부여받게 됨
			//(홀수가 이긴다고 하더라도 짝수가 이길 때와 같은 번호를 부여받게 될 것이므로 애초에 홀수더라도 번호 부여과정 전에 짝수로 만들어줌) 
			if(a%2 != 0) {
				a+=1;
			}
			if(b%2 != 0) {
				b+=1;
			}
			
			//다음 라운드 번호 부여(나누기 2한 것을 다시 해당 변수에 할당)
			a /= 2;
			b /= 2;
			
			//다음 라운드
			answer++;
		}
		
		return answer;
	}

}
