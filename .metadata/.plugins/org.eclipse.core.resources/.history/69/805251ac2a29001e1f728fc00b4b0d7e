package _programmers중요;

public class 카펫 {

	public static void main(String[] args) {
		System.out.println(solution(10 ,2));
	}
	
    public static int[] solution(int brown, int yellow) {
        int[] answer = new int[2]; //가로 세로
        int sum = brown + yellow;
        //카펫이 되기 위해서는 일단 가로세로 곱의 약수여야 한다. => 즉, 총 블럭의 갯수에서 약수를 먼저 구해야 함
        //헌데 가로든 세로든 노란블럭이 갈색 블럭에 둘러쌓여 있기 위해서는 3이상이어야 함
        //그래서 약수의 후보 중 3 이상인 것부터 찾기 위해 3부터 시작 (1, sum)은 어차피 1이 3 이상이 아니므로 <=sum이 아닌 <sum이라고 씀
        for (int i = 3; i < sum; i++) {
            int j = sum / i; //임의로 약수를 구하기 위해 일단 i로 나눠봄(하지만 나누어 떨어지지 않는 경우 나눠지는 몫까지만 반환하므로 아직 확실치 않음)
            
            //sum % i == 0 로 나누어 떨어지는지 먼저 확인하고/ i가 세로 j를 가로라고 했을 때 i는 3부터 반복문이 실행되므로 3이상인 게 보장! 
            // j는 3이상이 아닐 수도 있으므로 j >= 3로 3이상임을 보장해야 함
            if (sum % i == 0 && j >= 3) {
                int garo = Math.max(i, j); //둘 중 큰 값이 가로가 됨(가로가 세로보다 크거나 같다고 했으니까)
                int sero = Math.min(i, j); //둘 중 작은 값이 세로가 됨
                int center = (garo - 2) * (sero - 2); 
                //안쪽 사각형의 넓이가 곧 노란블럭의 갯수가 됨
                if (center == yellow) {
                    answer[0] = garo;
                    answer[1] = sero;
                    return answer;
                }
            }
        }
        return answer;
    }

}
