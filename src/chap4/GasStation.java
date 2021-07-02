
package chap4;

import java.util.Scanner;

public class GasStation {
    public static void Menu(){
        System.out.println("----------Menu-----------");
        System.out.println("1 Check In");
        System.out.println("2 Print Receipt");
        System.out.println("3 Print Tax Invoice");
        System.out.println("0 Exit");
        System.out.println("-------------------------");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Gasoline Calculation");
        System.out.println("Program is created by Thanyarat");
        Menu();
    }
}
 