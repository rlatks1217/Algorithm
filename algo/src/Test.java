import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test {
	
	public static void main(String[] args) {
		List<Student> totalList = new ArrayList<>();
		totalList.add(new Student("ㅎㅎ", "남", 92));
		totalList.add(new Student("ㅇㅇ", "여", 94));
		totalList.add(new Student("ㄱㄱ", "여", 91));
		totalList.add(new Student("ㄴㄴ", "남", 93));
		
		Map<String, Double> map = totalList.stream()
				.collect(Collectors.groupingBy(s -> s.getSex(), 
						Collectors.averagingDouble(s -> s.getScore())
						));
		
		System.out.println(map);
	}
	
}

class Student {
	private String name;
	private String sex;
	private int score;
	
	public Student(String name, String sex, int score) {
		this.name = name;
		this.sex = sex;
		this.score = score;
	}
	
	public String getName() {
		return name;
	}
	
	public String getSex() {
		return sex;
	}
	
	public int getScore() {
		return score;
	}
}