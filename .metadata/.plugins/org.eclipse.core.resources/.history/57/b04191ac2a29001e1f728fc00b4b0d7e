package _programmers;

import java.time.LocalDate;
import java.util.ArrayList;

public class 개인정보수집유효기간 {

	public static void main(String[] args) {
		String today = "2022.05.19";
		String[] privacies = {"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"};
		String[] term = {"A 6", "B 12", "C 3"};
		
		System.out.println(solution(today, term, privacies));
	}

	private static ArrayList<Integer> solution(String today, String[] term, String[] privacies) {
		ArrayList<Integer> answer = new ArrayList<>();
		
		today = today.replace(".", "-");
		LocalDate date =  LocalDate.parse(today);
		
		ArrayList<String[]> list = new ArrayList<>();
		ArrayList<String[]> termList = new ArrayList<>();
		
		for (int i = 0; i < privacies.length; i++) {
			String[] a = privacies[i].split(" ");
			list.add(a);
		}
		
		for (String t : term) {
			String[] a = t.split(" ");
			termList.add(a);
		}
		
		for (int i = 0; i < list.size(); i++) {
			for (int j = 0; j < termList.size(); j++) {
				String type = list.get(i)[1];
				String termType= termList.get(j)[0];
				
				if (type.equals(termType)) {
					String startDate = list.get(i)[0];
					startDate = startDate.replace(".", "-");
					LocalDate date1 =  LocalDate.parse(startDate);
					
					String termMonth = termList.get(j)[1];
					date1 = date1.plusMonths(Integer.parseInt(termMonth)); //날짜 더하기 
					date1 = date1.minusDays(1);
					if (date.isAfter(date1)) { //유효기간이 지났다면
						answer.add(i+1);
						break;
					}
				}
			}
		}
		
		return answer;
	}

}
