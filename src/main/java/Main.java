/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        
        int number = getInputNumber();
        int sum = sumOfNumbers(number);
        int gaussSum = gaussianSumOfNumbers(number);
        System.out.println(sum);
        System.out.println(gaussSum);

        // Timing the Sum function
        long start = System.currentTimeMillis();
        for (int i = 1; i < 100000; i++) {
            // do something
            sum = sumOfNumbers(number);
        }
        long end = System.currentTimeMillis();
        System.out.println("Summing " + number + " took " + (end - start) + "ms");

        //  Timing the guassSum function
        start = System.currentTimeMillis();
        for (int i = 1; i < 100000; i++) {
            // do something
            gaussSum = gaussianSumOfNumbers(number);
        }
        end = System.currentTimeMillis();
        System.out.println("Gaussian Summing " + number + " took " + (end - start) + "ms");

    }
    
    // do this one and the lab is complete. really.
    // return the sum of 0 to n... if n == 3, the result should be 6
   public static int sumOfNumbers(int n) {
        int sumHolder = 0;
        for (int i = 1; i <= n; i++) {
            sumHolder = sumHolder + i;
        }
       return sumHolder;
    }
    
    
    public static int getInputNumber() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter any number: ");

        // This method reads the number provided using keyboard
        int num = scan.nextInt();

        // Closing Scanner after the use
        scan.close();
        return num;
    }
    
    
    
    // for Extra Credit
    public static int gaussianSumOfNumbers(int n) {
        //int numberOfPairs = n;
        //int sumOfPairs = n + 1;
        int gSum =  n * (n +1) / 2;
        return gSum;
    }
   
    // for Extra extra credit - compare the methods and show which one is faster
    // google "how to time some java code"
    // use "System.currentTimeMillis()" to ask the system what time it is.



}
