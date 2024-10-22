package work16.test2;

public class TestCompany {
    public static void main(String[] args) {
        ColaEmployee[] employees = new ColaEmployee[3];
        employees[0] = new SalariedEmployee("固定工资员工", 5, 5000);
        employees[1] = new HourlyEmployee("小时工员工", 10, 20, 180);
        employees[2] = new SalesEmployee("销售人员", 3, 80000, 0.1);

        Company company = new Company();
        int month = 10;
        for (ColaEmployee employee : employees) {
            company.printEmployeeSalary(employee, month);
        }
    }
}
