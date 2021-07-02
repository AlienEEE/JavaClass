
package chap4;
public class Employee {
        private int position,menu;
        private String id,name,surname;
        private double salary;

    public Employee(int position, int menu, String id, String name, String surname, double salary) {
        this.position = position;
        this.menu = menu;
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    Employee(String id, String name, String surname, int position, double salary) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int getMenu() {
        return menu;
    }

    public void setMenu(int menu) {
        this.menu = menu;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
        
}
