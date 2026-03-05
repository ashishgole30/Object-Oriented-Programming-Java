public class Compile_time_Polymorphism {
    public static void main(String[] args) {
        // Compile-time Polymorphism (Method Overloading)
        /*
         * Compile-time polymorphism happens when multiple methods have the same name
         * but different parameter lists.
         * It is resolved at compile time.
         * Also called:
         * Static Binding
         * Early Binding
         * Rules:
         * Same method name
         * Different parameters (number, type, or order)
         * Return type alone cannot change method
         */
        Calculator c = new Calculator();
        System.out.println(c.add(1, 2));
        System.out.println(c.add(1.121, 2.232));
        System.out.println(c.add(1, 2, 4));
    }
}

class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}
