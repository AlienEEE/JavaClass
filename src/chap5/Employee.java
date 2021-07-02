package chap5;

public class Employee {
    private String empld;
    private String empName;
    private Address address;
    private Department department;
    private double salary;

    public Employee(String empld, String empName) {
        this.empld = empld;
        this.empName = empName;
    }

    public String getEmpld() {
        return empld;
    }

    public void setEmpld(String empld) {
        this.empld = empld;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    
}
