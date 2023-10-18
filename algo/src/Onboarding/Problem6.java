package Onboarding;

import java.util.Set;
import java.util.TreeSet;

public class Problem6 {
	private static Set<String> list = new TreeSet<String>();

	public static void main(String[] args) {
		String[][] input = { { "jm@email.com", "제이엠" }, { "jason@email.com", "제이슨" }, { "woniee@email.com", "워니" },
				{ "mj@email.com", "엠제이" }, { "nowm@email.com", "이제엠" } };
		solution(input);
	}

	private static void solution(String[][] input) {
		for (int i = 1; i < input.length; i++) {
			if (checkDuplication(input, input[i][1], i)) {
				list.add(input[i][0]);
			}
		}

		System.out.println(list);
	}

	private static boolean checkDuplication(String[][] input, String nickName, int order) {
		boolean isDuplicate = false;
		for (int i = 1; i < nickName.length(); i++) {
			String checkLetter = nickName.substring(i-1, i+1);
			for (int j = 0; j < order; j++) {
				if (input[j][1].contains(checkLetter)) {
					list.add(input[j][0]);
					isDuplicate = true;
					return isDuplicate;
				}
			}
		}
		return isDuplicate;
	}

}
