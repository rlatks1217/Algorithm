package _programers;


public class 전화번호목록 {

	public static void main(String[] args) {
		
		String[] phone_book = {"119", "97674223", "1195524421"};
		System.out.println(solution(phone_book));
	}
	
   public static boolean solution(String[] phone_book) {
        boolean answer = true;
        
        for (int i = 0; i < phone_book.length; i++) {
        	int length = phone_book[i].length();
			for (int j = 0; j < phone_book.length; j++) {
				if (length >= phone_book[j].length() && i != j) {
					String a = phone_book[i].substring(0, phone_book[j].length());
					if (a.equals(phone_book[j])) {
						answer = false;
						break;
					}
				}else {
					continue;
				}
			}
			if (!(answer)) {
				break;
			}
			
		}
        
        return answer;
    }

}

//Set<Integer> lengths = new TreeSet(); 이게 key point