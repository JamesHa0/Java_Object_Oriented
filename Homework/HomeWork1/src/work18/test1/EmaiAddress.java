package work18.test1;
//题目1：解析一个邮箱地址是否合法，如果合法则打印出用户名部分和该邮箱所属的网站域名，如果邮箱地址不合法则显示不合法的原因
//1.1　提示：邮箱地址不合法的因素：
//1.1.1 邮箱地址中不包含@或.　
//1.1.2 邮箱地址中含有多了@或.　
//1.1.3 邮箱地址中.出现在@的前面
//1.1.4 用户名里有其他字符
class EmailAddressException extends Exception {
    public EmailAddressException(String err) {
        super(err);
    }
}

public class EmaiAddress {
    private String address;

    public EmaiAddress(String address) throws EmailAddressException {
        this.address = address;
    }

    public void isValidEmail() {
        try {
            String[] pice = address.split("@");
            if (pice.length > 2) {
                throw new EmailAddressException("邮箱地址含有多了@或.");
            } else if (pice.length == 1) {
                throw new EmailAddressException("邮箱地址不包含@或.");
            } else {
                for (char cuser : pice[0].toCharArray()) {
                    if (cuser == '.') {
                        throw new EmailAddressException("邮箱地址中.出现在@的前面");
                    } else if (!Character.isLetterOrDigit(cuser) && cuser != '-' && cuser != '_') {
                        throw new EmailAddressException("用户名里有其他字符");
                    }
                }
                int countDoc = 0;
                for (char cdomain : pice[1].toCharArray()) {
                    if (cdomain == '.') {
                        countDoc++;
                        if (countDoc == 2) {
                            throw new EmailAddressException("邮箱地址含有多了@或.");
                        }
                    }
                }
                if (countDoc == 0) {
                    throw new EmailAddressException("邮箱地址不包含@或.");
                } else {
                    System.out.print("邮箱地址正确：用户名：" + pice[0]);
                    System.out.println("    网站域名：" + pice[1]);
                }


            }
        } catch (EmailAddressException err) {
            System.out.println("邮箱地址不合法：" + err.getMessage());
        }
    }

}
