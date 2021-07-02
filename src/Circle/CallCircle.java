//created by Thanyarat Promtong 624234009
package Circle;
public class CallCircle {
    public static void main(String[] args) {
        Circle object = new Circle(5.5);
        System.out.println("Radius: "+object.getRadius());
        System.out.println("Area: "+object.computeArea());
        System.out.println("Cicumference: "+object.computeCircumference());
        System.out.println("Diameter: "+object.computeDiameter());
    }
}
 