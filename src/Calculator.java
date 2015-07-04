import java.util.StringTokenizer;

public class Calculator {

	
	public int Add(String numbers){
		
		int i = 0;
		StringTokenizer nums = new StringTokenizer(numbers,",");
		
		while(nums.hasMoreTokens()){
			i += Integer.parse(nums.nextToken());
		}
		return i;
	}

}
