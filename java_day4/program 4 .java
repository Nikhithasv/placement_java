public class Calculator {

    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public double multiply(double num1, double num2, double num3) {
        return num1 * num2 * num3;
    }

    public static void main(String[] args) {
      
        Calculator calculator = new Calculator();
        int result1 = calculator.multiply(3, 7);
        System.out.println("Result of multiplying two integers: " + result1);
        double result2 = calculator.multiply(1.5, 3.0, 4.2);
        System.out.println("Result of multiplying three doubles: " + result2);
    }
}
