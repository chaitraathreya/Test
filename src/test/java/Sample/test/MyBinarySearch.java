package Sample.test;

public class MyBinarySearch {
	
	public int binarySearch(int[] inputArr, int key) {
        
        int start = 0;
        int end = inputArr.length - 1;
        while (start <= end) {
        	
        	System.out.println("Iteration:..");
        	
        	System.out.println("start:"+start+", end = "+end);
            int mid = (start + end) / 2;
            
            System.out.println("Middle position = "+mid);
            if (key == inputArr[mid]) {
                return mid;
            }
            if (key < inputArr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
  
    public static void main(String[] args) {
         
        MyBinarySearch mbs = new MyBinarySearch();
        int[] arr = {2, 8, 10, 12, 14};
        System.out.println("Key 8's position: "+mbs.binarySearch(arr, 8));
        /*int[] arr1 = {6,34,78,123,432,900};
        System.out.println("Key 432's position: "+mbs.binarySearch(arr1, 432));*/
    }

}
