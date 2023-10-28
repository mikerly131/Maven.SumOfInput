import org.junit.Test;

import java.util.Scanner;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void sumOfNumbersTest() {
        int test = Main.sumOfNumbers(4);
        int valid = 10;
        assertEquals(test, valid);
    }

    @Test
    public void gaussianSumOfNumbersTest() {
        int test = Main.gaussianSumOfNumbers(10);
        int valid = 55;
        assertEquals(test, valid);
    }

    @Test
    public void getInputNumberTest() {
        // create a scanner
        // create input to scanner? (modify test example against main FileInputStream and value, find slides)
        // feed input to method
        // assert?

    }


}
