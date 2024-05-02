class ShapeFactory
{
    Shape getShape(String in)
    {
        switch (in) {
            case "Circle":

            return new Circle();
                
                

            case "Rectangle":

            return new Rectangle();
                
               
        
            default:
                return null;
        }
    }
}

abstract class Shape
{
    public abstract void draw();

}

class Circle extends Shape
{
    public void draw()
    {
        System.out.println("Circle");
    }
}
class Rectangle extends Shape
{
    public void draw()
    {
        System.out.println("Rectangle");
    }
}






public class FactoryPatter {
    public static void main(String[] args) {
        ShapeFactory ob=new ShapeFactory();
        Shape obj=(ob.getShape("Circle"));
        obj.draw();

    }
    
}
