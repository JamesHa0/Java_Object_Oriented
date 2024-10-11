public class Test {
    public static void main(String[] args) {

        int a =10;
        int b =20;
        int c =30;

        //短路与&& vs 非短路与&

        //boolean flag = a>b && ++b>c;//左边为假，右边短路了
        //System.out.println(flag);//false
        //System.out.println(b);//20

        boolean flag = a>b & ++b>c;//右边不短路
        System.out.println(flag);//false
        System.out.println(b);//21

        //短路或|| vs 非短路|

        //boolean flag = a<b||++b>c;//左边为真，右边短路了
        //System.out.println(flag);//true
        //System.out.println(b);//20

        flag = a<b|++b>c;//右边不短路
        System.out.println(flag);//true
        System.out.println(b);//22
    }
}
