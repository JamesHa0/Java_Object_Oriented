package com.zyh.his;

import java.util.List;

public interface DeptDao {
    List<Dept> getAll();
    List<Dept> getByPage(int page,int count);
    Dept getById(int id);
    List<Dept> getByName(String name);
    List<Dept> getByLeader(String leader);

    void addOne(Dept dept);
    void update(Dept dept);
    void delById(int id);
}
