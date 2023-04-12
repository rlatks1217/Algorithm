package _programers;

public class FilteringTest {

	public static void main(String[] args) {
		
		String[] columns = {"인원","계절","지역","목적","분위기","경제적요건","시간적요건"};
		String[] values = {"","","","꽃나들이","자연친화","가성비",""};
		
		String query = "";
		for (int i = 0; i < values.length; i++) {
			
			if (query.equals("") && !(values[i].equals(""))) {
				query = "SELECT 관광지명 FROM 관광지테이블 WHERE "+columns[i] +"="+"'"+values[i]+"'";
			}else if (!(query.equals("")) && !(values[i].equals(""))) {
				query += " AND " + columns[i] +"="+"'"+values[i]+"'";
			}
			
		}
		
		System.out.println(query);
	}

}
