package com.zyh.his;

import java.util.Date;

public class Dept {
    private int dept_id;
    private String dept_name;
    private String loc;
    private String leader;
    private String del;
    private Date createtime;

    public Dept() {
    }

    public Dept(int dept_id, String dept_name, String loc, String leader, String del, Date createtime) {
        this.dept_id = dept_id;
        this.dept_name = dept_name;
        this.loc = loc;
        this.leader = leader;
        this.del = del;
        this.createtime = createtime;
    }

    public int getDept_id() {
        return dept_id;
    }

    public void setDept_id(int dept_id) {
        this.dept_id = dept_id;
    }

    public String getDept_name() {
        return dept_name;
    }

    public void setDept_name(String dept_name) {
        this.dept_name = dept_name;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    public String getLeader() {
        return leader;
    }

    public void setLeader(String leader) {
        this.leader = leader;
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
