package com.zyh.his;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {
    public static void main(String[] args) {
        CheckItem item = new CheckItem(0,"血常规",123.32,"否", new Date());
        new CheckItemDaoImpl().addOne(item);
    }
}
