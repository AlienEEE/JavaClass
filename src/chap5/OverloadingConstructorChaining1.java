
package chap5;
class Parent1{
    private String name;
    private String sex;
    public Parent1(String name, String sex) {
        this.name = name;
        this.sex = sex;
        System.out.println("Call constructor : Parent");
    }
}
class Son extends Parent1{

    public Son(String name,String sex){
        super(name,sex);
        System.out.println("Call constructor : Son");
    }
}
class Danghter extends Parent1{
    public Danghter(String name,String sex){
        super(name,sex);
        System.out.println("Call constructor : Danghter");
    }
}
public class OverloadingConstructorChaining1 {
    public static void main(String[] args) {
        new Son("Peter","M");
        new Danghter ("Anny","F");
    }
}
