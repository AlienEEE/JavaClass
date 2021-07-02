package chap5;

public class CallEmployee {
    public static void main(String[] args) {
        Employee em = new Employee("135","Suthawee Solaeh");
        em.setSalary(25000);
        em.setAddress(new Address("72 Soi.4 Sungaikolok Narathiwat"));
        em.setDepartment(new Department("1","Software Development"));
        System.out.println("Name : "+em.getEmpName());
        System.out.println("Salary : "+em.getSalary());
        System.out.println("Address : "+em.getAddress().getRegisAddress());
        System.out.println("Department : "+em.getDepartment().getDepName());
    }
}
