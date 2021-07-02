package chap5;

public class LivingThing {

    protected String name = "LivingThing";

    public void grow() {
        System.out.println("LivingThing : grow");
    }

    public void reproduce() {
        System.out.println("LivingThing : reproduce");
    }
}

class Animal extends LivingThing {
    private String color;
    protected int leg;
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color+"Animal";
    }
    public void move(){
        System.out.println("Animal : move");
    }
}

class Plant extends LivingThing {
}
class Dog extends Animal{
    protected int leg =4;
    public void bark(){
        System.out.println("Dog : bark");
    }
    @Override
    public void move(){
        System.out.println("Dog : Walk and Run");
    }
}
