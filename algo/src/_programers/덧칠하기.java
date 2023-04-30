package _programers;

public class 덧칠하기 {
	
	public static void main(String[] args) {
		
		int section[] = {2,3,6};
		int n = 8;
		int m = 4;
		
		int startIndex = section[0];
		int idx = 0;
		
		int answer = 1;
		
		while (startIndex <= (n-m)+1 && idx <section.length) { //시작 인덱스가 시작 인덱스의 한계보다 크지 않고
			if (section[idx] <= startIndex+(m-1)) { //범위의 한계 안에 있으면
				idx++;
			} else {
				if (section[idx] < (n-m)+1) {
					startIndex = section[idx];					
				} else {
					startIndex = (n-m)+1;
				}
				answer++;
			}
		}
		
		System.out.println(answer);
	}
//롤러의 오른쪽 끝이 벽 밖으로 빠져나가지 않게 해야 한다는 조건을 신경쓰지 않음
//롤러의 범위에서 벗어나 있다면 벗어나 있는 지점을 시작지점으로 하고 거기부터 롤러의 범위에 속하는지 다시 판단하는 식으로 품

}
