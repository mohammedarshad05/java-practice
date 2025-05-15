public class FinalCarAssignment {
    public static void main(String[] args) {
        Car car = new Car();
        car.setSpeed(250); 
    }
    
}

class Car {
    public final void setSpeed(int speed) {
        final int MAX_SPEED = 200;
        System.out.println("Speed of the car is: " + speed);
        if (speed > MAX_SPEED) {
        } else {
        }
    
    }
}
