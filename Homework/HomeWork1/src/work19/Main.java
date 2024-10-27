package work19;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Book> set1 = new HashSet<>();
        set1.add(new Book("001", "Book1", 25.0, "1", "a"));
        set1.add(new Book("002", "Book2", 30.0, "2", "b"));
        set1.add(new Book("003", "Book3", 18.0, "3", "c"));
        set1.add(new Book("004", "Book4", 22.0, "4", "d"));

        Set<Book> set2 = new HashSet<>();
        set2.add(new Book("002", "Book2", 30.0, "2", "b"));
        set2.add(new Book("005", "Book5", 28.0, "5", "e"));

        Set<Book> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        int duplicateCount = intersection.size();
        System.out.println("两个集合中重复的数据个数为: " + duplicateCount);

        Iterator<Book> iterator1 = set1.iterator();
        while (iterator1.hasNext()) {
            Book book = iterator1.next();
            System.out.println("迭代器遍历集合1:ID: " + book.getId() + ", Name: " + book.getname() + ", Price: " + book.getPrice() + ", Type: " + book.getType() + ", Author: " + book.getAuthor());
        }

        for (Book book : set2) {
            System.out.println("高级for遍历集合2:ID: " + book.getId() + ", Name: " + book.getname() + ", Price: " + book.getPrice() + ", Type: " + book.getType() + ", Author: " + book.getAuthor());
        }
    }
}
