package _programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class 신고결과받기 {

	public static void main(String[] args) {
		String[] id_list = {"muzi","frodo","apeach","neo"};
		String[] report = {"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"};
		System.out.println(solution(id_list, report, 2));
	}

	private static int[] solution(String[] id_list, String[] report, int k) {
		int[] answer = new int[id_list.length];
		HashMap<String, Integer> reporter = new HashMap<String, Integer>();
		HashMap<String, Integer> reported = new HashMap<String, Integer>();
		
		//누가 누구누구한테 신고 당했는지
		HashMap<String, ArrayList<String>> reportLog = new HashMap<String, ArrayList<String>>();
		for (String string : id_list) {
			reporter.put(string, 0);
			reported.put(string, 0);
			reportLog.put(string, new ArrayList<>());
		}
		
		for (int i = 0; i < report.length; i++) {
			String a = report[i].split(" ")[0]; //신고한 놈
			String b = report[i].split(" ")[1]; //당한 놈
			
			boolean reportCheck = false;
			for (int j = 0; j < reportLog.get(b).size(); j++) {
				String reportMen = reportLog.get(b).get(j);
				if (reportMen.equals(a)) {
					reportCheck = true;
					break;
				}
			}
			
			if(reportCheck) {
				continue;
			}
			
			//신고횟수가 안 찼으면
			if (reported.get(b) < k) {
				reported.put(b, reported.get(b) + 1);
				reportLog.get(b).add(a);
			}
			
			if (reported.get(b) >= k) {
				reporter.put(a, reporter.get(a) + 1);
				
				for (int j = 0; j < reportLog.get(b).size(); j++) {
					String reportMen = reportLog.get(b).get(j);
					if(reportMen.equals(a)) { //지금 신고한 애가 아니면
						continue;
					}else {
						reporter.put(reportMen, reporter.get(reportMen) + 1);
						reportLog.get(b).clear();
					}
				}
			}
			
		}
		
		for (int i = 0; i < id_list.length; i++) {
			answer[i] = reporter.get(id_list[i]);
		}
		
		System.out.println(Arrays.toString(answer));
		return null;
	}

}
