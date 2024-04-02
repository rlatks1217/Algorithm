package 재귀;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex24060 {
	private static int[] tmp;
	private static int k;
	private static int cnt;
	private static int result = -1;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[n];
		tmp = new int[n];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		merge_sort(arr, 0, n-1);
		System.out.println(result);
	}

	private static void merge_sort(int[] arr, int start, int end) {	
		if (start < end) {
			int q = (start + end) / 2;
			merge_sort(arr, start, q);
			merge_sort(arr, q + 1, end);
			merge(arr, start, q, end);
		}
	}

	private static void merge(int[] arr, int start, int q, int end) {
		int i = start;
		int j = q + 1;
		int t = 0;
		while (i <= q && j <= end) {
			if (arr[i] <= arr[j]) {
				tmp[t++] = arr[i++];
			} else {
				tmp[t++] = arr[j++];				
			}
		}
	    while (i <= q) {
	    	tmp[t++] = arr[i++];
	    }
	    while (j <= end)  {
	    	tmp[t++] = arr[j++];
	    }
	    i = start;
	    t = 0;
	    while (i <= end) {
	    	cnt++;
	    	if (cnt == k) {
	    		result = tmp[t];
	    		break;
	    	}
	    	arr[i++] = tmp[t++];
	    }
	}
}