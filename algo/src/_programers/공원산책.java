package _programers;


public class 공원산책 {

	public static void main(String[] args) {
		String[] park = {
				"OSO",
				"OOO",
				"OXO",
				"OOO"};
		String[] routes = {"N 2","S 3","W 1"};
 		
		System.out.println(solution(park, routes));
	}

	private static int[] solution(String[] park, String[] routes) {
		
		int locationX = 0;
		int locationY = 0;
		boolean stop = false;
		for (int i = 0; i < park.length; i++) {
			for (int j = 0; j < park[i].length(); j++) {
				if (park[i].charAt(j) == 'S') {
					locationX = j;
					locationY = i;
					stop = true;
					break;
				}
			}
			if (stop) {
				break;
			}
		}
		
		System.out.println(locationX + ", " + locationY + " => 시작지점");
		for (int i = 0; i < routes.length; i++) {
			char direction = routes[i].charAt(0);
			int distance = routes[i].charAt(2) - '0';

			int x = 0;
			int y = 0;
			boolean pass= true;
			switch (direction) {
			case 'E':
				x = locationX + distance;
				if (x >= park[0].length()) {
					continue;
				} else {
					for (int j = locationX; j <= x; j++) {
						if (park[locationY].charAt(j) == 'X') {
							pass = false;
							break;
						}
					}
					if (pass) {
						locationX = x;						
					}
				}
				break;
			case 'W':
				x = locationX - distance;
				if (x < 0) {
					continue;
				} else {
					for (int j = locationX; j >= x; j--) {
						if (park[locationY].charAt(j) == 'X') {
							pass = false;
							break;
						}
					}
					if (pass) {
						locationX = x;						
					}
				}
				break;
			case 'S':
				y = locationY + distance;
				if (y >= park.length) {
					continue;
				} else {
					for (int j = locationY; j <= y; j++) {
						if (park[j].charAt(locationX) == 'X') {
							pass = false;
							break;
						}
					}
					if (pass) {
						locationY = y;
					}
				}
				

				break;
			case 'N':
				y = locationY - distance;
				if (y < 0) {
					continue;
				} else {
					for (int j = locationY; j >= y; j--) {
						if (park[j].charAt(locationX) == 'X') {
							pass = false;
							break;
						}
					}
					if (pass) {
						locationY = y;
					}
				}
				break;
			}
//			System.out.println(i);
//			System.out.println(locationX + ", " + locationY);
		}
		
		int[] answer = {locationY, locationX};
		
//		System.out.println(Arrays.toString(answer));
		return answer;
	}

}
//N일 경우 locationY - distance를 해줘야 하는데 + 를 해줘서 틀림 => 가독성 좋은 코드로 작성해야 함(난잡해서 오류 찾기 힘듬)
//런타임 에러 => 문법상 오류가 있거나 정해진 결과가 안 나올 경우 나옴