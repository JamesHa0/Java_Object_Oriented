package work16.test2;

public class ColaEmployee {
    private String name;
    private int birthdayMonth;

    public ColaEmployee(String name, int birthdayMonth) {
        this.name = name;
        this.birthdayMonth = birthdayMonth;
    }

    public double getSalary(int month) {
        double salary = 0;
        if (month == birthdayMonth) {
            salary += 100;
        }
        return salary;
    }

    public String getName() {
        return name;
        }
    }

class SalariedEmployee extends ColaEmployee {
    private double monthlySalary;

    public SalariedEmployee(String name, int birthdayMonth, double monthlySalary) {
        super(name, birthdayMonth);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double getSalary(int month) {
        return super.getSalary(month) + monthlySalary;
    }
}

class HourlyEmployee extends ColaEmployee {
    private double hourlyWage;
    private int hoursWorked;

    public HourlyEmployee(String name, int birthdayMonth, double hourlyWage, int hoursWorked) {
        super(name, birthdayMonth);
        this.hourlyWage = hourlyWage;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double getSalary(int month) {
        double baseSalary = hourlyWage * hoursWorked;
        if (hoursWorked > 160) {
            baseSalary += (hoursWorked - 160) * hourlyWage * 0.5;
        }
        return super.getSalary(month) + baseSalary;
    }
}

class SalesEmployee extends ColaEmployee {
    private double monthlySales;
    private double commissionRate;

    public SalesEmployee(String name, int birthdayMonth, double monthlySales, double commissionRate) {
        super(name, birthdayMonth);
        this.monthlySales = monthlySales;
        this.commissionRate = commissionRate;
    }

    @Override
    public double getSalary(int month) {
        return super.getSalary(month) + monthlySales * commissionRate;
    }
}

class Company {
    public void printEmployeeSalary(ColaEmployee employee, int month) {
        System.out.println(employee.getName() + "在" + month + "月份的工资是：" + employee.getSalary(month));
    }
}

