package chap4;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeBonus {

    public static void printMenu() {
        System.out.println("-------Menu-------");
        System.out.println("0 : Exit");
        System.out.println("1 : Employee Information Entry");
        System.out.println("2 : Employee Summery");
        System.out.println("------------------");

    }
    static String getPosition(int pos){
        String st = null;
        switch (pos) {
            case 1:
                st = ("Manager");
                break;
            case 2:
                st = ("Assisant Manager");
                break;
            case 3:
                st = ("General");
                break;
            default:
                break;
        }
        return st;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int position,menu;
        String id,name,surname;
        double salary,total=0;
        ArrayList<Employee> arr = new ArrayList<>();
        
        do{
            printMenu();
            System.out.print("PLease Enter Menu (0-2) : ");
            menu = sc.nextInt();
            if(menu==1){
                System.out.print("Enter ID : ");
                id = sc.next();
                System.out.print("Enter Name : ");
                name = sc.next();
                System.out.print("Enter Surname : ");
                surname = sc.next();
                System.out.print("Enter Position Type : ");
                position = sc.nextInt();
                System.out.print("Enter Salary : ");
                salary = sc.nextDouble();
                Employee em = new Employee(id,name,surname,position,salary);
//                em.setId(id);
//                em.setName(name);
//                em.setSurname(surname);
//                em.setPosition(position);
//                em.setSalary(salary);
                arr.add(em);
                total = total+salary;
            }else if (menu==2){
                System.out.println("--------Data in Array----------");
                System.out.println("Show Data");
                for (Employee emobj : arr) {
                    emobj.getId();
                    System.out.print("ID : "+emobj.getId());
                    emobj.getName();
                    System.out.print("\tNAME : "+emobj.getName());
                    emobj.getSurname();
                    System.out.print("\tSUENAME : "+emobj.getSurname());
                    String Position = getPosition(emobj.getPosition());
                    System.out.print("\tPOSITION : " +Position);
                    emobj.getSalary();
                    System.out.println("\tSALARY : "+emobj.getSalary());
                }
                System.out.println("Summary");
                System.out.println("Employee Count : "+arr.size());
                System.out.println("Salary Total : "+total);     
        }  
            System.out.println("\n**********************\n");
        }while( menu != 0);
    }
}
