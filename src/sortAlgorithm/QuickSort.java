package sortAlgorithm;

public class QuickSort implements Swap{
	public static <E extends Comparable<E>> void quickSort(E[] inputArray,int head,int end) {//head�������һ��Ԫ�ص��±꣬end���������һ��Ԫ�ص��±�
		
		if(end<=head || head<0 || head>=inputArray.length || end<0 || end>=inputArray.length) {return;}
		E key = inputArray[head];//ȡ�����һ��Ԫ��Ϊ��
		int keyindex = head;//keyindex��¼����±�
		int tempHead = head;//tempHeadΪͷָ��
        int tempEnd = end;//tempEndΪβָ��
		while(tempHead < tempEnd) {
			while(inputArray[tempEnd].compareTo(key) >= 0 && tempEnd > tempHead) {tempEnd--;} //�ж��������˹�עֵ��key�Ĵ�С����Ҫ����βָ���ͷָ����໥λ�ù�ϵ��
    	    if(inputArray[tempEnd].compareTo(key) < 0 && tempEnd > keyindex) {
    	    	Swap.swap(inputArray, keyindex, tempEnd);
    	        keyindex = tempEnd;

    	    }//ֻ��Ҫ�ı�keyֵ������
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
