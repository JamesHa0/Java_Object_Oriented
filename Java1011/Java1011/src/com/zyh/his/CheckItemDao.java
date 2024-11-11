package com.zyh.his;

import java.util.List;

public interface CheckItemDao {
    List<CheckItem> getAll();
    List<CheckItem> getByPage(int page , int count);

    CheckItem getById(int id);
    List<CheckItem> getByKey(String name);

    void addOne(CheckItem item);
    void update(CheckItem item);
    void delById(int id);
}
