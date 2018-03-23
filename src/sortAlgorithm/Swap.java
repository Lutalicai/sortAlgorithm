package sortAlgorithm;

public interface Swap {
	public static <E> void swap(E [] inputArray,int indexa,int indexb) {
		if(indexa >= 0 && indexa < inputArray.length && indexb >= 0 && indexb < inputArray.length) { 
		E temp = inputArray[indexa];
		inputArray[indexa] = inputArray[indexb];
		inputArray[indexb] = temp;
		}
		else {System.out.println("There is something wrong about indexes");return;}
	}
}
	
