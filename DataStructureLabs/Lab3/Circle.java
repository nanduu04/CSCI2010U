//circle s which uses Shape.java
public class Circle extends Shape{
    private  float radius;
    final double pi = Math.PI;


    public Circle(String color, float radius) {
        super(color);
        this.radius = radius;
    }
//getting area 
    @Override
    public double getArea() {
        return (pi *(radius*radius));
    }
//getting perimerer
    public double getPerimeter() {
        return (2 * pi * radius);
    }
    @Override
    public String toString(){
        return (color+ " Circle with the Radius " + radius);
    }
}