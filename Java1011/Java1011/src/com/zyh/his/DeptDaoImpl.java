package com.zyh.his;

import java.util.List;

public class DeptDaoImpl extends BaseDao implements DeptDao{

    @Override
    public List<Dept> getAll() {
        String sql = "select * from dept";
        return this.executeQuery(sql,Dept.class);
    }

    @Override
    public List<Dept> getByPage(int page, int count) {
        String sql = "select * from dept limit ?,?";
        return this.executeQuery(sql,Dept.class,page,count);
    }

    @Override
    public Dept getById(int id) {
        return null;
    }

    @Override
    public List<Dept> getByName(String name) {
        String sql = "select * from dept where dept_name like ?";
        return this.executeQuery(sql,Dept.class,"%"+name+"%");
    }

    @Override
    public List<Dept> getByLeader(String leader) {
        String sql = "select * from dept where leader like?";
        return this.executeQuery(sql,Dept.class,"%"+leader+"%");
    }

    @Override
    public void addOne(Dept dept) {
        String sql = "insert into dept values(null,?,?,?,?)";
        this.executeUpdate(sql,dept.getDept_name(),dept.getLoc(),dept.getLeader(),dept.getDel());
    }

    @Override
    public void update(Dept dept) {
        String sql = "update dept set dept_name=?,loc=?,leader=?,del=? where dept_id = ?";
        this.executeUpdate(sql,dept.getDept_name(),dept.getLoc(),dept.getLeader(),dept.getDel(),dept.getDept_id());
    }

    @Override
    public void delById(int id) {
        String sql = "update dept set del='是' where dept_id=?";
        this.executeUpdate(sql,id);
    }
}
