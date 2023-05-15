package _programers;


public class 숫자짝꿍 {

	public static void main(String[] args) {
		
		System.out.println(solution("5525", "1255"));
//		System.out.println(Math.min(3,2)); //둘 중 작은 수 반환
	}

	private static String solution(String X, String Y) {
	
        StringBuilder answer = new StringBuilder();
        int[] x = {0,0,0,0,0,0,0,0,0,0};
        int[] y = {0,0,0,0,0,0,0,0,0,0};
        for(int i=0; i<X.length();i++){
           x[X.charAt(i)-48] += 1;
        }
        for(int i=0; i<Y.length();i++){
           y[Y.charAt(i)-48] += 1;
        }

        for(int i=9; i >= 0; i--){
            for(int j=0; j<Math.min(x[i],y[i]); j++){
                answer.append(i);
            }
        }
        if("".equals(answer.toString())){
           return "-1";
        }else if(answer.toString().charAt(0)==48){
           return "0";
        }else {
            return answer.toString();
        }
	}

}
// 숫자 + "" 도 효율성의 원인이 될 수 있음!! 