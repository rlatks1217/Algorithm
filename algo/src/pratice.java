import java.util.Arrays;

public class pratice {

	public static void main(String[] args) {
		int n = 5;
		int[] lost = {3, 4};
		int[] reserve = {3};
		solution(n, lost, reserve);
	}

	private static void solution(int n, int[] lost, int[] reserve) {
		int answer = n - lost.length;
		
		int[] students = new int[n+1];
		
		for (int i = 0; i < lost.length; i++) {
			students[lost[i]] -= 1;
		}
		
		for (int i = 0; i < reserve.length; i++) {
			students[reserve[i]] += 2; 
		}
		
		for (int i = 0; i < students.length; i++) {
			if (students[i] == 0) {
				students[i] = 1;
			}
		} 
		
		
		for (int i = 0; i < lost.length; i++) {
			if (students[lost[i]] == 1) {
				answer++;
				continue;
			}
			
			//여기서부터는 1이 아닌 애들 즉, -1인 애들
			if(lost[i] == 1) {
				if (students[2] == 2) {
					students[2] -= 1;
					answer++;
				}
				continue;
			}else if (lost[i] == students.length -1) {
				if (students[lost[i]-1] == 2) {
					students[lost[i]-1] -= 1;
					answer++;
				}
				continue;
			}
			
			if (students[lost[i]-1] == 2) {
				students[lost[i]-1] -= 1;
				answer++;
			}else if (students[lost[i]+1] == 2) {
				students[lost[i]+1] -= 1;
				answer++;
			}
			
		}
		
		System.out.println(answer);
	}

}
