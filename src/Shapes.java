import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
/* [Circle [radius=2.00],
Rectangle [height=2.00, width=3.00],
 Circle [radius=1.00],
 Rectangle [height=3.00, width=2.00],
  Circle [radius=0.50],
  Rectangle [height=1.00, width=2.00]]
you should get
[Circle [radius=2.00], Rectangle [height=2.00, width=3.00], Rectangle [height=3.00, width=2.00]]
*/



class Shapes {



  /*  public static void main(String[] args) {

        // пример из условия
     List<Shape> shapes =  new ArrayList<Shape>();

     Shape circle1  = new Circle("C1",2.00);
     Shape rectangle1 = new Rectangle("R1",2.00,3.00);
     Shape circle2 = new Circle("C2",1.00);
     Shape rectangle2 = new Rectangle("R2",3.00,2.00);
     Shape circle3 = new Circle("C3",0.50);
     Shape rectangle3 = new Rectangle("R3",1.00,2.00);

     shapes.add(circle1);
     shapes.add(circle2);
     shapes.add(circle3);
     shapes.add(rectangle1);
     shapes.add(rectangle2);
     shapes.add(rectangle3);

     MyUtils util = new MyUtils();
        List<Shape> shapes1 = util.maxAreas(shapes);
        for (Shape x: shapes1
             ) {
            System.out.println(x.getName());
        }
    }*/
}

abstract class Shape  {

    // Code

    private String name;
    public Shape(String name){
        this.name = name;
    }
    abstract double getArea();

    public String getName(){
        return name;
    }

}

class Circle extends Shape {
    private double radius;
    // Code
    public Circle(String name,double radius){
        super(name);
        this.radius = radius;

    }

    public double getRadius(){
        return radius;
    }

    @Override
    public double getArea(){
        return 3.00*radius;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.getRadius(), getRadius()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getRadius(),super.getName());
    }
}
class Rectangle extends Shape {
    private double height;
    private double width;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return Double.compare(rectangle.getHeight(), getHeight()) == 0 && Double.compare(rectangle.getWidth(), getWidth()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getHeight(), getWidth(),super.getName());
    }

    // Code
    public Rectangle(String name,double height, double width){
        super(name);
        this.height = height;
        this.width = width;



    }

    public double getHeight(){
        return height;

    }

    public double getWidth(){
        return width;
    }

    @Override
    public double getArea(){
        return height*width;
    }
}


class MyUtils {
    public List<Shape> maxAreas(List<Shape> shapes) {
        // C

        HashSet<Shape> hashSet = new HashSet<>();

        if (!shapes.isEmpty()) {

            double maxArea = shapes.get(0).getArea();

            for (Shape x : shapes) {
                if (x.getArea() > maxArea) {
                    maxArea = x.getArea();
                }
            }


            for (Shape x : shapes) {
                if (x.getArea() == maxArea) {
                    hashSet.add(x);
                }
            }

        }


        return new ArrayList<Shape>(hashSet);

    }
}