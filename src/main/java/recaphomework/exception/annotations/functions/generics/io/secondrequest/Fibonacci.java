package recaphomework.exception.annotations.functions.generics.io.secondrequest;

public class Fibonacci {

    public static int fibonacciSeries(int n) throws CustomCheckedException {


        if (n == 10) {
            throw new CustomCheckedException("Error 001: Parameter 11 cannot be used");
        }

        if (n == 15) {
            throw new CustomUncheckedException("Cannot have more then 15 numbers due to memory issues");
        }

        if (n <= 1)
            return n;

        return fibonacciSeries(n - 1) + fibonacciSeries(n - 2);
    }

    public static void main(String... args) {

        try {
            int n = Integer.parseInt("11");

            for (int i = 0; i < n; i++) {

                System.out.print(fibonacciSeries(i) + " ");
            }

        //throws error if parameter is not int;
        } catch (NumberFormatException e) {
            System.out.print("Fibonacci series is made of array of integers");

        //throws error if parameter is 11;
        } catch (CustomCheckedException e) {
            System.out.println(e.getMessage());

        //throws error if parameter is grater then 15 (this will never be thrown as code is written now, it was written as example, I couldn't find
            // another relevant Unchecked exception example for how fibonacciSeries is implemented)
        } catch (CustomUncheckedException e) {
            System.out.print(e.getMessage());
        }
        System.out.println("Code is still executed");
    }
}
