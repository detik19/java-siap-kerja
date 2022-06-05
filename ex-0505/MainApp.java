public class MainApp {

    public static void main(String[] args) {
        Circle circle1 = new Circle(10);

        Circle circle2 = new Circle(100);

        System.out.println("circle 1 radius :"+circle1.getRadius() +" with Area: "+circle1.getArea());
        System.out.println("circle 2 radius :"+circle2.getRadius() +" with Area: "+circle2.getArea());

    }
    
}
