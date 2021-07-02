package chap4;

import java.util.Scanner;

public class PostOffice {

    public static void printMenu() {
        System.out.println("-------Manu-------");
        System.out.println("Menu 0 : Exit");
        System.out.println("Manu 1 : Original");
        System.out.println("Manu 2 : Register");
        System.out.println("Manu 3 : EMS");
        System.out.println("----------------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Songkhla Post Office");
        System.out.println("Program is creaed by Thanyaarat");
        int menu = 0,weight = 0;
        do {
            printMenu();
            System.out.print("PLease Enter Menu (0-3) : ");
            menu = sc.nextInt();
            if(menu==1){
                System.out.print("\tEnter weight(gram) : ");
                weight = sc.nextInt();
                int ans = computeNormal(weight);
                System.out.println("\tService Amount = "+ans);
            }else if(menu == 2){
                System.out.print("\tEnter weight(gram) : ");
                weight = sc.nextInt();
                int ans = computeRegister(weight);
                System.out.println("\tService Amount = "+ans);
            }else if(menu == 3){
                System.out.print("\tEnter weight(gram) : ");
                weight = sc.nextInt();
                int ans = computeEMS(weight);
                System.out.println("\tService Amount = "+ans);
            }
        } while (menu != 0);

    }
    static int computeNormal(int weight){
        int bath = 0;
        if(weight <= 20){
            bath = 3;
        }else if(weight > 20 && weight <= 100){
            bath = 5;
        }else if(weight > 100 && weight <= 250){
            bath = 9;
        }else if(weight > 250 && weight <= 500){
            bath = 15;
        }else if(weight > 500 && weight <= 1000){
            bath = 25;
        }else if(weight > 1000 && weight <= 2000){
            bath = 45;
        }
        return bath;
    }
    static int computeRegister(int weight){
        
        return computeNormal(weight)+13;
    }
    static int computeEMS(int weight){
        int bath=0;
        if(weight <= 20){
            bath = 27;
        }else if(weight > 20 && weight <= 100){
            bath = 32;
        }else if(weight > 100 && weight <= 250){
            bath = 37;
        }else if(weight > 250 && weight <= 500){
            bath = 47;
        }else if(weight > 500 && weight <= 1000){
            bath = 62;
        }else if(weight > 1000 && weight <= 2000){
            bath = 77;
        }
        return bath;
    }
}
