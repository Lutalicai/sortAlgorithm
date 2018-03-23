package sortAlgorithm;

public class QuickSort implements Swap{
	public static <E extends Comparable<E>> void quickSort(E[] inputArray,int head,int end) {//head是数组第一个元素的下标，end是数组最后一个元素的下标
		
		if(end<=head || head<0 || head>=inputArray.length || end<0 || end>=inputArray.length) {return;}
		E key = inputArray[head];//取数组第一个元素为轴
		int keyindex = head;//keyindex记录轴的下标
		int tempHead = head;//tempHead为头指针
        int tempEnd = end;//tempEnd为尾指针
		while(tempHead < tempEnd) {
			while(inputArray[tempEnd].compareTo(key) >= 0 && tempEnd > tempHead) {tempEnd--;} //判断条件除了关注值跟key的大小，还要关心尾指针和头指针的相互位置关系。
    	    if(inputArray[tempEnd].compareTo(key) < 0 && tempEnd > keyindex) {
    	    	Swap.swap(inputArray, keyindex, tempEnd);
    	        keyindex = tempEnd;

    	    }//只需要改变key值的索引
    	    while(inputArray[tempHead].compareTo(key) <= 0 && tempHead < tempEnd) {tempHead++;}
    	    if(inputArray[tempHead].compareTo(key) > 0 && tempHead < keyindex) {
    	    	Swap.swap(inputArray, keyindex, tempHead);
    	        keyindex = tempHead;

    	    }
        }
		quickSort(inputArray,head,tempHead-1);
		quickSort(inputArray,tempEnd+1,end);	    
	}
}
