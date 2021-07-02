
package chap5;
class GrandMother{
    public GrandMother(){
        System.out.println("Call Con : GrandMother");
    }
}
class Mother extends GrandMother{

    public Mother() {
        System.out.println("Call Con : Mother");
    }
}

public class Child {

    public Child() {
        System.out.println("Call Con : Child");
    }
    
    public static void main(String[] args) {
        new Child();
    }
}
