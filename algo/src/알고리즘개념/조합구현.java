package 알고리즘개념;

import java.util.ArrayList;

public class 조합구현 {
    static ArrayList<String> list = new ArrayList<String>();

    public static void main(String[] args) {
        int[] numberList = {1, 2, 3, 4, 5};
        int r = 1;

        combination("", 0, r, numberList); //5C1부터 5C5까지 다 구한다고 했을 땐 반복문 돌리면 됨

        System.out.println(list);
    }

    private static void combination(String case_, int start, int endCount, int[] numberList) {
        if (endCount == 0) {
            list.add(case_);
            return;
        }

        //숫자를 하나도 안 고른 상태에서 for문이 돌기 시작하는 거임
        
        //5C2라고 생각하고 코드를 뜯어보면
        for (int i = start; i <= numberList.length - endCount; i++) { 
        	//numberList.length - endCount를 하는 이유 : 2개를 무조건 골라야 되니까 두 번째에 고를 숫자 하나는 안전빵으로 무조건 남겨놓아야 함 => 이 연산으로 마지막 숫자 하나는 남게 됨
            combination(case_ + numberList[i], i + 1, endCount - 1, numberList); 
            //case_ + numberList[i] 이게 이뤄졌다는 건 하나 골랐다는 얘기임 => 그니까 endCount - 1을 함으로써 나머지 숫자는 안전빵으로 남겨뒀던 숫자까지 고를 수 있게 함
        }
    }
}
