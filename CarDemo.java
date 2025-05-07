public class CarDemo {
    public static void main(String[] args) {
        FinalCarAssignment Car1 = new FinalCarAssignment("toyota corolla", 20220, "red", 50);

        Car1.display();
        System.out.println(" after acceleration");
        Car1.accelerate(20);
        Car1.display();
        System.out.println(" after brake");
        Car1.brake(10);
        Car1.display();
    }
}

class Car {
    String model;
    int year;
    String color;
    double speed;

    Car() {
        this.model = "Unknown";
        this.year = 0;
        this.color = "Unknown";
        this.speed = 0.0;
    }

    Car(String m, int y, String c, double s) {
        this.model = m;
        this.year = y;
        this.color = c;
        this.speed = s;
    }

    void accelerate(double speedincrease) {
        speed += speedincrease;
    }

    void brake(double speeddecrease) {
        speed -= speeddecrease;
    }

    void display() {
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Color: " + color);
        System.out.println("Speed: " + speed);
    }

}
  