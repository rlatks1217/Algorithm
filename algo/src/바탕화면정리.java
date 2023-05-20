
public class 바탕화면정리 {

	public static void main(String[] args) {
		
		String[] wallpaper = {
				".#...",
				"..#..", 
				"...#."};
		System.out.println(solution(wallpaper));
	}

	private static int[] solution(String[] wallpaper) {
		
		int startX = 0;
		int startY = 0;
		int endX = 1;
		int endY = 1;
	
		boolean x = true;
		boolean y = true;
		
		for (int i = 0; i < wallpaper.length; i++) {
			for (int j = 0; j < wallpaper[i].length(); j++) {
				if(wallpaper[i].charAt(j) == '#') {
					
					if (startX == 0 && x) {
						startX = j;
						x = false;
					}else if (startX > j) {
						startX = j;
					}
					
					if (startY == 0 && y) {
						startY = i;
						y = false;
					}else if (startY > i) {
						startY = i;
					}
					
					if (endX-1 < j) {
						endX = j+1;
					}
					
					if (endY-1 < i) {
						endY = i+1;
					}
				}
			}
		}
		int[] answer = {startY, startX, endY, endX};
		
		return answer;
	}

}

//Math.min()
//Math.max()
//Integer.MAX_VALUE;
//Integer.MIN_VALUE;
//이거 사용하면 훨씬 쉽게 풀 수 있음