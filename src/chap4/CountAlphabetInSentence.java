package chap4;

import java.util.Scanner;

public class CountAlphabetInSentence {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter Sentence : ");
        String sentence = sc.next().toUpperCase();
        System.out.println("Sentence : " + sentence);
        System.out.println("length : " + sentence.length());
        int a=0,b=0;
        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);
            if(c == 'A' || c == 'E'|| c == 'I' || c == 'O' || c == 'U'){
               a++;
            }else{
               b++;
            }
        }
        System.out.println("จำนวนสระ : "+a);
        System.out.println("จำนวนอักขระ : "+b);

    }
}
