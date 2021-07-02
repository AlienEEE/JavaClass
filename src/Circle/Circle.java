//created by Thanyarat Promtong 624234009
package Circle;

public class Circle {
    private double radius;
    public Circle(double red){
        radius = red;
    }
    public double getRadius(){
        return radius;
    }
    public double computeArea(){
        return Math.PI*Math.pow(radius, 2 );            
    }
    public double computeCircumference(){
        return 2*Math.PI*radius;
    }
    public double computeDiameter(){
        return 2*radius; 
    }
}

