package work16.test4;

public class Utils {
    public int addition(int a){
        int ans = 0;
        for (int i = 1; i <= a;i++){
            ans += i;
        }
        return ans;
    }

    public int[] bubbleSort (int[] arr){
        for (int i = 0; i < arr.length-2;i++){
            boolean flag = true;
            for (int j = 0; j < arr.length-1-i;j++){
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = false;
                }
            }
            if (flag){
                break;
            }
        }
        return arr;
    }
}


