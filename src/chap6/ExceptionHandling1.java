
package chap6;

public class ExceptionHandling1 {
    public static void main(String[] args) {
        try {
            int zero = 0;
            int result = 1500/zero;
        } catch (NullPointerException e) {
            System.out.println("Objeck เป็น null");
        } catch (ArithmeticException e2){
            System.out.println("หารด้วยศูนย์ไม่ได้");
        }

        try {
            int num[]= new int[3];
            num[1] = 5;
            num[3] = 10;            
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("อ้างถึงอาร์เรย์เกินขอบเขตที่กำหนด");
        }

        try {
            Personnel pp = null;
            pp.getAddress();
        } catch (NullPointerException e) {
            System.out.println("Objeck เป็น null ใช่ไม่ได้");
            System.exit(0);
        } catch (Exception e2){
            System.out.println("จับด้วยยาย");
        }finally{
 
            System.out.println("บล็อกนี้ทำงานทุกครั้ง");
        }

    }
}
