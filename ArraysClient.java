import java.util.*;

public class ArraysClient{
	public static void main(String[] args){
		System.out.println("Arrays Client Program");
		System.out.println("Arithmetic Methods");
			
		List<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(9);

		
		System.out.println(Arithmetic.plusOne(arrayList));
		System.out.println(Arrays.toString(Arithmetic.stringBinarySum("1000000", "1000001")));
		
		
	}
}