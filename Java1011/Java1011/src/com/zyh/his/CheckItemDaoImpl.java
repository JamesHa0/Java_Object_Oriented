package com.zyh.his;

import java.util.List;

public class CheckItemDaoImpl extends BaseDao implements CheckItemDao {

    @Override
    public List<CheckItem> getAll() {
        return this.executeQuery("select * checkitem",CheckItem.class);
    }

    @Override
    public List<CheckItem> getByPage(int page, int count) {
        return this.executeQuery("select * from checkitem limit"+page+","+count+";",CheckItem.class);
    }

    @Override
    public CheckItem getById(int id) {
        return null;
    }

    @Override
    public List<CheckItem> getByKey(String name) {
        return this.executeQuery("select * from checkitem where name like ?",CheckItem.class,"%"+name+"%");
    }

    @Override
    public void addOne(CheckItem item) {
        String sql = "insert into checkitem values(null,?,?,?)";
        this.executeUpdate(sql,item.getName(),item.getPrice(),item.getDel());
    }

    @Override
    public void update(CheckItem item) {
        String sql = "update checkitem set name=?,del=?,price=? where check_id = ?";
        this.executeUpdate(sql,item.getName(),item.getDel(),item.getPrice(),item.getCheck_id());
    }

    @Override
    public void delById(int id) {
        this.executeUpdate("update checkitem set del='是' where check_id=?",id);
    }
}
