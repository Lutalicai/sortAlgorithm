package sortAlgorithm;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Double [] array = {1.1,4.4,5.6,6.6,6.6,0.0};
		
		for (Double elem : array) {System.out.print(elem+" ");}
		System.out.println();
		QuickSort.quickSort(array,0,array.length-1);
		
		for (Double elem : array) {System.out.print(elem+" ");}
		
	}

}
