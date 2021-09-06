package CodewarsTasks.OOP;

import org.junit.Test;

import java.text.DecimalFormat;


import static org.junit.Assert.assertEquals;

public class tdd_area_calculations {
    public static void main(String[] args) {

    }



        private Calculator sut = new Calculator();

        @Test
        public void areaOfATriangleIsBaseMultipliedByHeight()
        {
            double triangleBase = 6;
            double triangleHeight = 4;

            assertEquals(12, sut.getTotalArea(new Triangle(triangleBase, triangleHeight)), .0001);
        }

        @Test
        public void areaOfASquareIsSquareOfSide()
        {
            double side = 6;

            assertEquals(36, sut.getTotalArea(new Square(side)), .0001);
        }

        @Test
        public void areaOfARectangleIsWidthMultipliedByHeight()
        {
            double height = 4;
            double width = 8;

            assertEquals(32, sut.getTotalArea(new Rectangle(height, width)), .0001);
        }

        @Test
        public void areaOfACircleIsSquareOfRadiusMulitpliedByPi()
        {
            double radius = 3;

            assertEquals(28.27, sut.getTotalArea(new Circle(radius)), .0001);
        }

        @Test
        public void totalAreaIsSumOfAreasOfDifferentShapes()
        {
            assertEquals(49.14, sut.getTotalArea(new Rectangle(4, 2), new Rectangle(3, 4), new Circle(1), new Square(1), new Triangle(10, 5)), .0001);
        }

        @Test
        public void totalAreaIsRoundedTo2Decimals()
        {
            assertEquals(4.45, sut.getTotalArea(new Rectangle(1.112, 2), new Rectangle(1.111, 2)), .0001);
        }

        @Test
        public void totalAreaIs0WhenThereAreNoShapes()
        {
            assertEquals(0, sut.getTotalArea(), .0001);
        }
    }

    class Calculator{


        // окру
        private double rounder(double d){
            double result;
            DecimalFormat decimalFormat = new DecimalFormat("0.00");
            String format = decimalFormat.format((d));
            try {
                result = (Double)decimalFormat.parse(format);
            } catch (Exception e) {
                result = d;
            }
            return result;
        }



        public double getTotalArea(Shape shape){
            return rounder(shape.getTotalArea());
        }
        public double getTotalArea(){
            return 0d;
        }

        public double getTotalArea(Shape ... shape){

            double result = 0d;
            for (Shape s:shape
                 ) {
                result = result + s.getTotalArea();
            }

            return rounder(result);
        }




    }

    abstract class Shape {

         abstract double getTotalArea();
    }

    class Rectangle  extends Shape{

         private double height;
         private double width ;

        public Rectangle(double height, double width) {
            this.height = height;
            this.width = width;
        }

        @Override
        double getTotalArea() {
            return height*width;
        }
    }

    class Triangle extends Shape {

        private double triangleBase ;
        private double triangleHeight ;

        public Triangle(double triangleBase, double triangleHeight) {
            this.triangleBase = triangleBase;
            this.triangleHeight = triangleHeight;
        }


        @Override
        double getTotalArea() {
            return (triangleBase*triangleHeight)/2;
        }
    }
    class Circle extends Shape{

        private double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        @Override
        double getTotalArea() {
            return (radius*radius)*Math.PI;
        }
        }
    class Square extends Shape {

        private double side;

        public Square(double side) {
            this.side = side;
        }

        @Override
        double getTotalArea() {
            return side*side;
        }
    }

