

interface ICalculator {
    int add(int x, int y);
    int subtract(int x, int y);
    
}


class Calculator implements ICalculator {
    @Override
    public int add(int x, int y) {
        return x + y;
    }
    
    @Override
    public int subtract(int x, int y) {
        return x - y;
    }
    
}

public class AnonymousClass {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(100, 200));

        ICalculator calculator2 = new ICalculator() {
            @Override
            public int add(int x, int y) {
                return x + y;
            }

            @Override
            public int subtract(int x, int y) {
                return x - y;
            }
        };
        System.out.println(calculator2.add(3, 4));

    }
}