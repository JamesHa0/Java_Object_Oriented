package work16.test1;

public class Players {
    private static int sum = 0;
    public Players() {
        if (sum < 11) {
            sum++;
            System.out.println("创建了一个对象");
        } else {
            System.out.println("对不起，已经创建了十一个对象。不能再创建对象了");
        }
    }

}
