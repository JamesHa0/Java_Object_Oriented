package com.zyh.his;

import java.util.Date;

public class CheckItem {
    int check_id;
    String name;
    double price;
    String del;
    Date createtime;

    public CheckItem() {
    }

    public CheckItem(int check_id, String name, double price, String del, Date createtime) {
        this.check_id = check_id;
        this.name = name;
        this.price = price;
        this.del = del;
        this.createtime = createtime;
    }

    public int getCheck_id() {
        return check_id;
    }

    public void setCheck_id(int check_id) {
        this.check_id = check_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDel() {
        return del;
    }

    public void setDel(String del) {
        this.del = del;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}
