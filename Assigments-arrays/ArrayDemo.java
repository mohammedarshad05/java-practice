public class ArrayDemo {
    public static void main(String[] args) {

        int[] age = new int[5];
        age[0] = 10;
        age[1] = 20;
        age[2] = 30;
        age[4] = 50;
        age[3] = 40;

        int index;
        for (int i = 0; i < age.length - 1; i++) {
            index = i + 1;

            System.out.println("Age of a person" + index + " is: " + age[i]);
        }

        for (int ages : age) {
            System.out.println(ages);
            
        }
    }


    


    
}
