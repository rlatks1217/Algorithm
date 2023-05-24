package _programmers중요;

public class N제곱배열자르기 {

	public static void main(String[] args) {
		int n = 4;
		int left = 7;
		int right = 14;
		System.out.println(solution(n, left, right));
		
	}

	private static int[] solution(int n, long left, long right) {
        int[] answer = new int[(int)(right - left) + 1];
        
        for(int i = 0; i < answer.length; i++){
            int row = (int)((i + left) / n) + 1; // 행
            int col = (int)((i + left) % n) + 1; // 열
            answer[i] = Math.max(row, col);
        }
        
        return answer;
	}
//필기 노트 확인
}
