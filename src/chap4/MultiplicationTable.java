//Thanyarat624234009
package chap4;

public class MultiplicationTable {
    public static void main(String[] args) {
        System.out.println("----------------------------------------Multiplicatio Table----------------------------------------");
        for (int x = 1; x <= 12; x++) {
            System.out.print("\t"+x);
        }
        System.out.println();
        System.out.println("---------------------------------------------------------------------------------------------------");
        for (int num = 2; num <= 12; num++) {
            System.out.print(+num);
            for (int i = 1; i <= 12; i++) {
                System.out.print("\t"+num*i);
        }
            System.out.println();
        }
    } 
}
