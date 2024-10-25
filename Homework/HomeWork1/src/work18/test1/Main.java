package work18.test1;

public class Main {
    public static void main(String[] args) throws EmailAddressException {
        EmaiAddress e1 = new EmaiAddress("zyh@123.com");
        EmaiAddress e2 = new EmaiAddress("22023237@zyh@123.com");
        EmaiAddress e3 = new EmaiAddress("22023237.zyh@123.com");
        EmaiAddress e4 = new EmaiAddress("zyh@123");
        EmaiAddress e5 = new EmaiAddress("zyh￥￥%%@123.com");
        e1.isValidEmail();
        e2.isValidEmail();
        e3.isValidEmail();
        e4.isValidEmail();
        e5.isValidEmail();
    }
}
