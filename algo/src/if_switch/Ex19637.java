package if_switch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex19637 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()); 
		//인자로 readLine()을 집어넣을 경우 구분자는 공백 하나가 됨
		//즉, 라인 단위로 입력되는 전체 문자열을 공백 단위로 잘라서 하나씩 반환하게 되는 것
		StringBuilder sb = new StringBuilder(); //시간 초과 방지용(
		
		int N = Integer.parseInt(st.nextToken()); // 칭호 갯수
		int M = Integer.parseInt(st.nextToken()); // 전투력 갯수
		
		String[] title = new String[N]; // 칭호
		int[] titlePower = new int[N]; // 칭호 획득의 기준이 되는 전투력
		
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			title[i] = st.nextToken(); 
			titlePower[i] = Integer.parseInt(st.nextToken());
			//라인 단위로 입력 받은 문자열을 공백 단위로 쪼개서 각 배열 안에 넣음
		}
		
		for(int i=0; i<M; i++) {
			int num = Integer.parseInt(br.readLine());
			
			int start = 0;
			int last = N-1;

			while(start <= last) {
				int mid = (start+last) / 2; //배열의 중간 index(mid) 구하기 -> 중간 지점에 있는 값을 구하기 위한 용도
				
				if(titlePower[mid] < num) { 
				// 입력값이 중간값보다 크다면 원하는 지점은 중간값 미만에는 없으니 start 지점을 mid 다음 인덱스로 잡음
					start = mid + 1;
				}else { 
				// 입력값이 중간값보다 작다면 원하는 지점은 중간값 초과에는 없으니 last 지점을 mid 이전 인덱스로 잡음
					last = mid - 1;
				}
			}
			sb.append(title[start]).append("\n"); // title[start] 혹은 title[last+1]로 가능
		}
		System.out.println(sb.toString());
		
	}

}
//이중으로 반복문을 써도 지금처럼 범위를 계속 줄여나가는 식이면 시간초과없이 충분히 가능함
//비내림차순 : 값이 감소하지 않는 순서로 정렬된 형태(오름차순이지만 같은 값도 있다는 얘기임) -> 이진 탐색이 가능한 이유