package 정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Ex18870 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		
		int[] arr = new int[N];
		int[] order = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			int a = Integer.parseInt(st.nextToken());
			arr[i] = a;
			order[i] = a;
		}
		
		Arrays.sort(order);
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int cnt = 0; 
	//i로 대신 value를 저장하게 되면 같은 수인데도 인덱스가 달라져서 결국 다른 value를 저장하게 됨
	//ex) 4보다 작은 수가 3개일 경우 3만을 저장해야 되는데 배열을 정렬했을 때 4, 4, 4와 같은 꼴이 된다면 3, 4, 5 이런 식으로 저장될 것임
		for (int i = 0; i < order.length; i++) {
			if(!map.containsKey(order[i])) {
	//중복된 숫자가 나오는 경우에는 가장 앞에 나온 숫자의 인덱스만 value로 저장하기 위함
				map.put(order[i] , cnt);
				cnt++;
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			sb.append(map.get(arr[i]) + " ");
		}
		
		System.out.println(sb);
		
		br.close();
	}

}
//입력받은 순서대로 출력해줘야 하는데 그것을 어떻게 처리할 것인가?
//정렬한 배열의 값 자체를 key값으로 하고 순서를 value로 해서 map에 저장하면 되는 일이었음..
//그 다음 원래 입력을 받은 순서로 저장되어 있는 배열의 요소값을 key로 하여 value(지보다 작은 숫자의 갯수)를 출력해주면 됨

//정리하면 출력할 순서는 arr가 가지고 있는 것이고 출력할 value는 map이 가지고 있는 것임