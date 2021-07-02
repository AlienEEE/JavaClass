
package chap6;

public abstract class TicTacToeAbstract implements Game{

    @Override
    public void start() {
        System.out.println("TicTocToe : start()");
       }

    @Override
    public void pauce() {
        System.out.println("TicTocToe : pauce()");
       }

    @Override
    public void play() {
        System.out.println("TicTocToe : play()");
       }
   
}
class TicTacToe extends TicTacToeAbstract{

    @Override
    public void toContinue() {
        System.out.println("TicTocToe : toContinue()");
        }

    @Override
    public void stop() {
        System.out.println("TicTocToe : stop()");
        }
    
}