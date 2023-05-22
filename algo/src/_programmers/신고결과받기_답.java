package _programmers;

import java.util.HashMap;
import java.util.HashSet;

public class 신고결과받기_답 {

	public static void main(String[] args) {
		String[] id_list = { "muzi", "frodo", "apeach", "neo" };
		String[] report = { "muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi" };
		System.out.println(solution(id_list, report, 2));
	}

	private static int[] solution(String[] idList, String[] report, int k) {
		int[] answer = new int[idList.length];

		HashMap<String, HashSet<String>> reporterInfoMap = new HashMap<>(); // 특정 유저를 누구누구 신고했는지
		HashMap<String, Integer> reportedCountInfoMap = new HashMap<>(); // 유저당 신고를 몇번씩 받았는지

		for (String reportInfo : report) {
			String reporter = reportInfo.split(" ")[0]; // 신고한 놈
			String reported = reportInfo.split(" ")[1]; // 신고 당한 놈

			boolean flag = false; // 이미 신고한 적 있는지 판단

			if (reporterInfoMap.containsKey(reporter)) {// 한번이라도 신고한 적 있는 놈이라면
				if (reporterInfoMap.get(reporter).contains(reported)) { // 걔가 신고한 적 있는 놈이면
					flag = true;
				} else {// 아니면 해당 유저가 신고한 유저목록에 집어넣어
					reporterInfoMap.get(reporter).add(reported);
				}
			} else {// 아예 신고조차 한번도 안한 유저라면 새로 목록과 함께 신고한 유저목록을 생성
				reporterInfoMap.put(reporter, new HashSet<String>() {
					{
						add(reported);
					}
				});
			}
			if (flag) { //신고한 적 있는 놈이면 넘어감
				continue;
			} else if (reportedCountInfoMap.containsKey(reported)) { //신고당한 적 있는 놈이면 카운트 추가
				reportedCountInfoMap.put(reported, reportedCountInfoMap.get(reported) + 1);
			} else { //한번도 신고당한 적 없다면 새로 추가
				reportedCountInfoMap.put(reported, 1);
			}

		}
		
	      for (String reported : reportedCountInfoMap.keySet()){ //신고당한 사람마다 아래 코드들 실행
	          int reportedCount = reportedCountInfoMap.get(reported); //신고당한 횟수
	          if(reportedCount >= k){ //기준치보다 높다면
	              // 메일 발송 대상
	              for(int i=0; i<idList.length; i++){
	                  if(reporterInfoMap.get(idList[i]) == null){ //한번이라도 신고한 적 없는 유저라면
	                      answer[i] = 0;
	                  } else if(reporterInfoMap.get(idList[i]).contains(reported)){ //get메소드 사용 시 null이면 else if 구문 실행할 수 없음
	                      answer[i]++;
	                  }
	              }
	          }
	      }

		return null;
	}

}
