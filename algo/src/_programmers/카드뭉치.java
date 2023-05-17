package _programmers;

public class 카드뭉치 {
	
	public static void main(String[] args) {
		
		String[] cards1 = {"i", "water", "drink"};
		String[] cards2 = {"want", "to"};
		String[] goal = {"i", "want", "to", "drink", "water"};

		String answer = "Yes";
		
		int cards1Cnt = 0;
		int cards2Cnt = 0;
		for (int i = 0; i < goal.length; i++) {

			if (i == 0) { //아직 아무 카드도 안 씀
				if (goal[i].equals(cards1[cards1Cnt])) {
					cards1Cnt++;
				}else if (goal[i].equals(cards2[cards2Cnt])) {
					cards2Cnt++;
				}else { //둘 다 없는 경우
					answer = "No";
					break;
				}
			}else {
				if (cards1Cnt < cards1.length && goal[i].equals(cards1[cards1Cnt])) {
					cards1Cnt++;											
				}else if (cards2Cnt < cards2.length && goal[i].equals(cards2[cards2Cnt])){
					cards2Cnt++;											
				}else {
					answer = "No";
					break;
				}
			}
		}
		
		System.out.println(answer);
		
	}

}
//각 카드 뭉치 안의 카드를 비교할 때 카드 뭉치 안에 들어 있는 카드의 수 즉, index를 고려하지 않았음(++를 생각없이 해서 비교하는 시점에 cards1[cards1Cnt]나 cards2[cards2Cnt]가 배열의 index를 초과해버림)
//cards1Cnt < cards1.length && goal[i].equals(cards1[cards1Cnt]) 라고 썼을 때 배열의 길이에 대한 조건이 부합하는지 먼저 실행함 (유의하기)