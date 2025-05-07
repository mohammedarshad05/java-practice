public class InterfaceShape {
    public static void main(String[] args) {
        Shape circle = new circle(10);
        System.out.println("Area of circle :" + circle.getArea());
        System.out.println("perimeter of circle  :" + circle.getPerimeter());
        Shape rectangle = new Rectangle(4, 5);
        System.out.println("Area of rectangle :" + rectangle.getArea());
        System.out.println("perimeter of rectangle  :" + rectangle.getPerimeter());

    }

}

interface Shape {
    double getArea();

    double getPerimeter();
}

class circle implements Shape {
    double radius;

    circle(double radius) {
        this.radius = radius;
    }
    @Override

    public double getArea() {
        double PI = 3.14;
        return PI * radius * radius;
    }
    @Override
    public double getPerimeter() {
        double PI = 3.14;
        return 2* PI * radius;
    }
}

class Rectangle implements Shape {
        double length, width;

        Rectangle(double length, double width) {
            this.length = length;
            this.width = width;
        }
        @Override

        public double getArea() {
            return this.length * this.width;

        }
        
        @Override
    public double getPerimeter() {
        return 2*(length + width);
    }
}
