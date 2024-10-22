package work16.test4;

public class UtilsTest {
    public static void main(String[] args) {
        Utils utils = new Utils();

        // 测试加法方法
        int additionResult = utils.addition(5);
        System.out.println("1 到 5 的和为：" + additionResult);

        // 测试冒泡排序方法
        int[] arrToSort = {5, 3, 8, 2, 7,21,15,43,23,10};
        int[] sortedArray = utils.bubbleSort(arrToSort);
        System.out.print("排序后的数组：");
        for (int num : sortedArray) {
            System.out.print(num + " ");
        }
    }
}
