package _programmers;

import java.util.LinkedList;
import java.util.Queue;

public class 캐시 {

	public static void main(String[] args) {
		String[] s = {"leo", "leo", "leo"}; 
		solution(5 ,s);
	}
	
    public static int solution(int cacheSize, String[] cities) {
        int answer = 0;
        
        Queue<String> queue = new LinkedList<String>();
        int idx = 0;
        int cnt = 0;
        while(idx < cities.length && idx <= cacheSize) {
        	String s = cities[idx].toLowerCase();
        	if (queue.contains(s)) {
        		idx++;
        		continue;
        	}
			queue.offer(s);
			answer+=5;
			idx++;
			cnt++;
		}
        
        for (int i = cnt; i < cities.length; i++) {
        	String s = cities[i].toLowerCase();
        	if (queue.peek() == null) {
        		queue.offer(s);
        		answer+=5;
        		continue;
        	}
        	
			if (queue.contains(s)) {
				queue.remove(s);
				queue.offer(s);
				answer++;
			}else {
				queue.poll();
				queue.offer(s);
				answer+=5;
			}
		}
        
        System.out.println(answer);
        
        
        return answer;
    }

}
//DB캐시란 : 데이터의 임시 저장소
