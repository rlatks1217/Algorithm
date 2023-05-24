package _programmers;

import java.util.LinkedList;
import java.util.Queue;

public class 캐시 {

	public static void main(String[] args) {
		String[] s = {"a", "b", "c", "a"}; 
		solution(5 ,s);
	}
	
    public static int solution(int cacheSize, String[] cities) {
        int answer = 0;
        if(cacheSize == 0) {
        	return cities.length * 5;
        }
        
        Queue<String> queue = new LinkedList<String>();
        
        for (int i = 0; i < cities.length; i++) {
        	String s = cities[i].toLowerCase();
        	if(queue.contains(s)) {
        		queue.remove(s);
        		queue.offer(s);
        		answer++;
        	}else {
        		if (queue.size() == cacheSize) {
        			queue.poll();
        		}
        		queue.offer(s);
        		answer += 5;        			
        	}
        	
		}
        
        System.out.println(answer);
        return answer;
    }

}
//DB캐시란 : 데이터의 임시 저장소
