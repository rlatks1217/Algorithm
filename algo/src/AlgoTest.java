import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class AlgoTest {
//5622
	public static void main(String[] args) throws IOException {
		Stack<Integer> stack = new Stack<Integer>();
		int[] result = {1,2,3,4};
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		
		stack.pop();
		System.out.println(stack);
		System.out.println(stack.firstElement());
	}

}
