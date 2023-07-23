package _programmers중요;

public class 멀리뛰기 {

    public static void main(String[] args) {
        System.out.println(solution(4));
    }

    public static long solution(int n) {
        long[] answer = new long[2001];
        answer[1] = 1;
        answer[2] = 2;

        for (int i = 3; i < 2001; i++) {
            answer[i] = (answer[i - 1] + answer[i - 2]) % 1234567;
        }

        return answer[n];
    }
}
//경우의 수 같은 경우 5항까지 직접 경우의 수를 따져가면서 규칙 찾기
//최소값이나 가장 효율적인 것을 구하는 문제라면 top-bottom 방식으로 접근해보기

//둘 다 작은 과정을 반복해서 큰 결과를 구하려고 할 때 사용된다는 게 전제되어야 함