public class FinalMethodDemo {

}

class vehicle {
    public final void Brand() {
        System.out.println("Brand of the vehicle is BMW");
    }
}

class Car extends vehicle {
    /*
    / public void Brand() { // This will cause a compilation error because the method is final in the parent class
    //     System.out.println("Brand of the car is Mercedes");
    // }
    }❌cannot override final method
    
    
    //     // The above code demonstrates the use of a final method in Java. The method Brand() in the vehicle class is declared as final, meaning it cannot be overridden in any subclass. If you try
    */
}