package string;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Ex5622 {

	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			String numberList = br.readLine();
			String alphabet = "ABC DEF GHI JKL MNO PQRS TUV WXYZ";
			String[] alphaList= alphabet.split(" ");
			
			int sum = 0;
			for (int i = 0; i < alphaList.length; i++) {
				for (int j = 0; j < alphaList[i].length(); j++) {
					for (int k = 0; k < numberList.length(); k++) {
						if (alphaList[i].charAt(j) == numberList.charAt(k) ) {
							sum += i+3;
						}
					}
				}
			}
			
			bw.write(sum +"");
			bw.flush();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
//i= A부터 i<=Z까지 라고 쓰면 A부터 Z까지의 반복문

//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
// 
//public class Main {
//	public static void main(String[] args) throws IOException {
//    
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        
//		String s = br.readLine();
//        
//		int count=0;
//		int k = s.length();
//        
//		for(int i = 0 ; i < k ; i++) {
//        
//			switch(s.charAt(i)) {
//			case 'A' : case 'B': case 'C' : 
//				count += 3; 
//				break;
//                
//			case 'D' : case 'E': case 'F' : 
//				count += 4; 
//				break;
//                
//			case 'G' : case 'H': case 'I' : 
//				count += 5; 
//				break;
//                
//			case 'J' : case 'K': case 'L' : 
//				count += 6; 
//				break;
//                
//			case 'M' : case 'N': case 'O' : 
//				count += 7; 
//				break;
//                
//			case 'P' : case 'Q': case 'R' : case 'S' :
//				count += 8; 
//				break;
//                
//			case 'T' : case 'U': case 'V' : 
//				count += 9; 
//				break;
//                
//			case 'W' : case 'X': case 'Y' : case 'Z' : 
//				count += 10; 
//				break;
//			}
//		}		
//		System.out.print(count);
//	}
//} //이게 더 시간적으로 빠름
