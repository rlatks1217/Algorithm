package 집합과맵;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Ex10815 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine()); //상근이가 가지고 있는 카드의 수
		int[] nCard = new int[N];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < nCard.length; i++) {
			nCard[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(nCard);
		
		int M = Integer.parseInt(br.readLine());
		int[] mCard = new int[M];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < mCard.length; i++) {
			mCard[i] = Integer.parseInt(st.nextToken());
		}

		for (int i = 0; i < mCard.length; i++) {
			int start = 0;
			int end = nCard.length -1;
			boolean find = false; //못 찾았을 경우 대비
			while (start <= end) { 
			// 탐색 범위를 나누기를 통해 서서히 좁히긴 할 텐데 start와 end가 같은 경우에도 탐색을 진행해야 됨
			// start = 10, end가 10인 경우 아직 인덱스 10에 해당하는 요소값을 비교하지는 않았기 때문에 그것까지 비교해줘야 모든 탐색을 다 했다고 할 수 있음
				int mid = (end + start)/2;
				if (mCard[i] < nCard[mid]) {
					end = mid - 1;
				} else if (mCard[i] > nCard[mid]) {
					start = mid + 1;
				} else if (mCard[i] == nCard[mid]){
					sb.append(1 + " ");
					find = true;
					break;
				}
			}
			if (!find) {
				sb.append(0 + " ");
			}
		}
		
		System.out.println(sb);
		
		br.close();
		
	}

}
//Contains()의 경우 문자열 전체를 모두 돌며 비교를 하기 때문에 사실상 for문 하나라고 볼 수 있음
//이진 탐색을 할 배열(nCard)가 정렬되어 있지 않으면 크기 순이 아니기 때문에 이상한 결과가 나오게 됨 ㅠ