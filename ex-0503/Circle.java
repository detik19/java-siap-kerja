public class Circle {

    public Circle(){
        
    }

    private double radius;
    
    public void setRadius(double radius){
       this.radius = radius;
    }

    public double getRadius(){
        return this.radius;
    }

    public double getArea(){
        return 3.14 * this.radius * this.radius;
    }
}
