package _programers;

import java.util.Arrays;

public class 소수찾기2 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        for (int i = 0; i < arr.length; i++) {
        	permute(arr, 0, arr.length - 1);
			
		}
    }
    
    public static void permute(int[] arr, int start, int end) {
        if (start == end) {
            // 배열의 모든 요소가 하나의 순열을 이루었을 경우 출력
            System.out.println(Arrays.toString(arr));
        } else {
            for (int i = start; i <= end; i++) {
                // 배열의 요소를 순서대로 선택
                swap(arr, start, i);
                
                // 선택한 요소를 제외한 나머지 요소들의 순열을 구함
                permute(arr, start + 1, end);
                
                // 배열의 요소를 다시 원래대로 되돌림
                swap(arr, start, i);
            }
        }
    }
    
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    

}
