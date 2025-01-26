package Important_questions.basic;

public class CheckPrimeOrNot {

    public static void main(String[] args) {

        primeOrNot(133);
        primeOrNot(5);

    }

    public static void primeOrNot(int number) {
        if (number == 2) System.out.println("This Number is Prime");
        else {
            boolean isPrime = true;
          for (int mul = 2; mul <= number - 1; mul++) {
          //      for (int mul = 2; mul <= Math.sqrt(number); mul++) {
                    if (number % mul == 0) {
                        isPrime = false;
                        break;
                    }
                }

                if (isPrime) {
                    System.out.println("This Number is Prime");
                } else {
                    System.out.println("This Number is Not Prime");
                }
            }

        }
    }
