package work19;
//创建一个图书类，其中成员变量：id，price ,type类型,autor作者
// a.创建集合1 装入4个当前图书对象
// b.创建集合2 装入2个当前图书对象，其中一个与集合1当中的对象相同
// c.比较两个集合,返回数据重复的数据个数
// d.利用迭代器，遍历出集合1中的图书对象
// e.利用高级for 遍历出集合2中的图书对象
//用set完成
public class Book {
    private String id;
    private String name;
    private Double price;
    private String type;
    private String autor;

    public Book(String id, String name, Double price, String type, String autor) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.type = type;
        this.autor = autor;
    }

    
}
