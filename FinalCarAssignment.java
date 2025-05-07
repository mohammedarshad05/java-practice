public class FinalCarAssignment {
    public static void main(String[] args) {
        Car car = new Car();
        car.setSpeed(250); 
    }
    
}

class Car {
    public final void setSpeed(int speed) {
        final int MAX_SPEED = 200;
        int currentSpeed;
        System.out.println("Speed of the car is: " + speed);
        if (speed > MAX_SPEED) {
            currentSpeed = MAX_SPEED;
        } else {
            currentSpeed = speed;
        }
    
    }
}
