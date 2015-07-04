import java.util.StringTokenizer;

public class Calculator {

	
	public int Add(String numbers){
		
		int i = 0;
		StringTokenizer nums = new StringTokenizer(numbers,",");
		
		while(nums.hasMoreTokens()){
			i += Integer.parseInt(nums.nextToken());
		}
		return i;
	}

	public int Sub(String numbers){
		
		int i = 0;
		StringTokenizer nums = new StringTokenizer(numbers,",");
		
		while(nums.hasMoreTokens()){
			
			i == 0 ? -1 * Integer.parseInt(nums.nextToken()) : i - Integer.parseInt(nums.nextToken());
		}
		return i;
	}
}
