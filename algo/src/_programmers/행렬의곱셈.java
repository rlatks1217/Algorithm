package _programmers;

public class 행렬의곱셈 {
	public static void main(String[] args) {
		int[][] arr1 = {{1,4},{3,2},{4,1}};
		int[][] arr2 = {{3,3},{3,3}};
		System.out.println(solution(arr1, arr2));
	}

	public static int[][] solution(int[][] arr1, int[][] arr2) {
	    int[][] result = new int[arr1.length][arr2[0].length]; //arr1의 행큼 행이 있을 것이고 arr2의 열만큼 열이 있을 것이므로 길이 이렇게 생성 

	    for (int i = 0; i < arr1.length; i++) { //arr1의 행만큼(i가 행을 의미함)
	        for (int j = 0; j < arr2[0].length; j++) { //arr2의 열만큼(j가 열을 의미함)
	            for (int k = 0; k < arr1[0].length; k++) {//arr1의 열 길이만큼
	                
	            	result[i][j] += arr1[i][k] * arr2[k][j];
	                //이 줄이 제일 중요함
	                //arr1[i][k] : arr1의 i행의 k번째 열
	                //arr2[k][j] : arr2의 k행의 j번째 열(여기서 k만 변하므로 행만 변하고 같은 열에 대하여 곱이 진행되고 있음)
	            	
	            	//초기에 결과 표의 형태를 만들어서 미리 초기값들을 넣어놓고 arr1의 행의 각 값들이 연산될 떄마다 결과표의 각 위치값에 더해지는 형식 
	            }
	        }
	    }
	    return result;
	}

}
