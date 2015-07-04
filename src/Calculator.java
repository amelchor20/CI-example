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
			
			i == 0 ? i= ( Integer.parseInt((-1 * nums.nextToken()))) : i = (Integer.parseInt((i - nums.nextToken())));
		
		}
		return i;
	}
}
