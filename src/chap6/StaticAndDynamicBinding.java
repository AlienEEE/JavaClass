
package chap6;

public class StaticAndDynamicBinding {
    public static void main(String[] args) {
        Personnel ps = new Personnel();
        System.out.print(ps.name+",");
        ps.printName();
        
        Personnel man = new Manager();
        System.out.print(man.name+",");
        man.printName();
    }

}
