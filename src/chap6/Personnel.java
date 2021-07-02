
package chap6;


public class Personnel {
    String name = "Personnel";
    void printName(){
        System.out.println("I'm "+name+".");
    }
    void getAddress(){
        System.out.println("I'm "+name+".");
    }
}//end

class Manager extends Personnel {
    String name = "Manager";

    @Override
    void printName() {
        System.out.println("I'm "+name+".");
    }//end 
    void getDepartment(){
        System.out.println("I work in the accounting department.");
    }
}
