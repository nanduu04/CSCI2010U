
//for rectangle class which uses Shape.java
public class Rectangle extends Shape{
    private  float width, length;


    public Rectangle( String color, float width, float length) {
        super (color);
        this.width = width;
        this.length = length;
    }
//calculating area 
    @Override
    public double getArea() {
        return (width * length);
    }
//calculating the perimeter
    @Override
    public double getPerimeter() {
        return (2 * (width + length));
    }
    //returning in words
    @Override
    public String toString(){
        return (color+ " Rectangle with the length " + length + " and width " + width);
    }

}