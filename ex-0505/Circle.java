public class Circle {

    public Circle(){

    }

    public Circle(double radius){
      this.radius = radius;  
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
