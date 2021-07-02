
package chap6;
abstract class Fan1 extends ElectricApplance{

    @Override
    public void on() {
        System.out.println("FAN : on()"); 
    }

    @Override
    public void off() {
        System.out.println("FAN : off()");
    }
}   
class Fan2 extends Fan1{

    @Override
    public void work() {
        System.out.println("FAN : work()");
    }
    
}
public class AbstracetClassExample1 {
    public static void main(String[] args) {
       Fan2 f2 = new Fan2();
       f2.on(); f2.off(); f2.work();
    }
}
