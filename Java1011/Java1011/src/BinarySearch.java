public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int key = 6;   //要查找的元素
        int index = -1;   //要查找的元素的位置（索引）
        int low = 0;
        int high = arr.length-1;
        while(high >= low){
            int mid = (low+high)/2;
            if (key < arr[mid]) {
                high = mid-1;
            } else if (key > arr[mid]) {
                low = mid + 1;
            } else {
                index = mid;
                break;
            }
        }
        if (index == -1){
            System.out.println("要查找的值不在此数组中");
        } else {
            System.out.println("要查找的值是数组的第"+(index+1)+"个");
        }
    }
}
