package Onboarding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public class Problem7 {

	public static void main(String[] args) {
		//친구가 아닌 사람 중에 추천하는 것이 목표!
		//해당 유저의 친구와 친구가 아닌 사람 구분하기
		//친구는 모두 삭제하기
		//직접친구의 친구 구하기 -> 각각 10점
		//방문자 카운트
		//점수순 + 이름순 정렬
		String user = "mrko";
		String[][] friends = {
				{"donut", "andole"},
				{"donut", "jun"},
				{"donut", "mrko"},
				{"shakevan", "andole"},
				{"shakevan", "jun"},
				{"shakevan", "mrko"}
		};
		String[] visiter = {"bedi", "bedi", "donut", "bedi", "shakevan"};
		
		solution(user, friends, visiter);
	}

	private static void solution(String user, String[][] friends, String[] visiter) {
		ArrayList<String> userFriends = new ArrayList<>();
		HashMap<String, Integer> otherPeople = new HashMap<>();
		for (int i = 0; i < friends.length; i++) {
			if (user.equals(friends[i][0])) {
				userFriends.add(friends[i][1]);
				continue;
			}
			
			if (user.equals(friends[i][1])) {
				userFriends.add(friends[i][0]);
				continue;
			}
			otherPeople.put(friends[i][0], 0);
			otherPeople.put(friends[i][1], 0);
		}
		
		//다른 사람 목록에서 친구 지우기
		for (String friend : userFriends) {
			if (otherPeople.containsKey(friend)) {
				otherPeople.remove(friend);
			}
		}
		
		//10점 점수 추가
		for (String friend : userFriends) {
			for (int i = 0; i < friends.length; i++) {
				if (friend.equals(friends[i][0]) && otherPeople.get(friends[i][1]) != null) {
					otherPeople.put(friends[i][1], 10);
				}
				if (friend.equals(friends[i][1]) && otherPeople.get(friends[i][0]) != null) {
					otherPeople.put(friends[i][0], 10);
				}
			}
		}
		
		for (String person : visiter) {
			boolean isFriend = true;
			for (String friend : userFriends) {
				if (person.equals(friend)) {
					isFriend = false;
				}
			}
			if (!isFriend) {
				continue;
			}
			if (otherPeople.get(person) == null) {
				otherPeople.put(person, 1);
				continue;
			}
			if (otherPeople.get(person) != null) {
				otherPeople.put(person, otherPeople.get(person)+1);
			}
		}
		
		List<Integer> pointSorted = new ArrayList<>(otherPeople.values());
		Collections.sort(pointSorted, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o2 - o1;
				// 두 개의 숫자가 인자로 들어왔을 때 연산 결과가
				// 음수나 0이면 변동 없음
				// 양수면 첫 번째 인자를 두 번째 인자의 오른쪽에 배치
				
				// 그래서 내림차순을 하고 싶은 경우 첫 번째 인자에 더 작은 수가 들어올 때만 연산 결과가 양수로 나오게 하면 됨(그게 바로 o2 - o1)
			}
		});
		
		ArrayList<String> result = new ArrayList<>();

		for (int i = 0; i < pointSorted.size(); i++) {
			for (String person : otherPeople.keySet()) {
				if (otherPeople.get(person) == pointSorted.get(i)) {
					otherPeople.remove(person);
					result.add(person);
					break;
				}
			}
			for (int j = i-1; j >= 0; j--) {
				if (pointSorted.get(i) == pointSorted.get(j)) {
					result.sort(Comparator.naturalOrder()); //Comparator 객체를 인자로 넣어줌(오름차순/내림차순의 기준)
					break;
				}
			}
		}
		
		for (int i = 0; i < 5; i++) {
			System.out.println(result.get(i));
		}
	}

}