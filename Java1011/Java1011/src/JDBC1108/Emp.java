package JDBC1108;

import java.util.Date;

public class Emp {
    private String job;
    private int empno;
    private String ename;
    private int sal;
    private Date hiredate;

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getEmpno() {
        return empno;
    }

    public void setEmpno(int empno) {
        this.empno = empno;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }

    public Date getHiredate() {
        return hiredate;
    }

    public void setHiredate(Date hiredate) {
        this.hiredate = hiredate;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "job='" + job + '\'' +
                ", empno=" + empno +
                ", ename='" + ename + '\'' +
                ", sal=" + sal +
                ", hiredate=" + hiredate +
                '}';
    }
}
