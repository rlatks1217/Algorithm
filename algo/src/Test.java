import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Test {
	
	public static void main(String[] args) {
			
		String originalFileName = "C:/aaa.txt";
		String targetFileName = "C:/Users/82106/Desktop/bbb.txt";
		
		InputStream input;
		OutputStream output;
		try {
			input = new FileInputStream(originalFileName);
			output =  new FileOutputStream(targetFileName);
			
			byte[] data = new byte[9];
			
			while (true) {
				int num = input.read(data);
				if (num == -1) {
					break;
				}
				output.write(data, 0, num);
				// (바이트 배열, 시작 인덱스, 끝 인덱스 + 1)
				// 버퍼에다 배열에 저장된 개수만큼만 담도록 작성
			}
			
			while(true) {
				
			}
			
//			output.flush(); 
//			// flush()를 사용하지 않아도 OutputStream가 내부적으로 버퍼를 비우는 기능을 함
//			// 그래서 파일 저장은 될 것임 하지만 flush()를 사용하는 것이 좋은 습관임 
//			input.close();
//			output.close();
			// close() 사용 시 버퍼에 남아 있는 게 있다면 다 비워내고 스트림을 닫음
			// 그래서 flush()없이 close()만 사용해도 파일 저장은 될 것임
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}