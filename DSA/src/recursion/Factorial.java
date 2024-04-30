package recursion;

public class Factorial {

    public static void main(String[] args) {

        int myFactorial = factorial(5);
        System.out.println("The Factorial of the Number is : " + myFactorial);

    }

    public static int factorial(int num) {
        if (num == 1) return 1;
        return num * factorial(num - 1);
    }
}
