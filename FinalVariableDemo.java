/* 
 Different Types of Casing
 1. Pascal Casing - VariableDemo - Used for class and interface names
 2. Camel Casing - fullName - Used for variables and functions
 3. Snake All Caps Casing - Used for Constants

*/

public class FinalVariableDemo {
    public static void main(String[] args) {
        final int MAX_NUMBER = 10;
        System.out.println("Max number is: " + MAX_NUMBER);        
    }
}    
// The above code demonstrates the use of a final variable in Java. The variable MAX_NUMBER is declared as final, meaning its value cannot be changed after it is initialized. The program prints the value of MAX_NUMBER to the console. If you try to change the value of MAX_NUMBER later in the code, it will result in a compilation error. This is useful for defining constants that should not be modified throughout the program.

