package ex01_arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayOfIntsSumOfEvenTest {
    private final ArrayOfInts arrayOfInts = new ArrayOfInts();

    @Test
    void nullArray() {
        int result = arrayOfInts.sumOfEven(null);
        assertEquals(0, result);

    }

    @Test
    void emptyArray() {
        int result = arrayOfInts.sumOfEven(new int[]{});
        assertEquals(0, result);
    }

    @Test
    void withoutEvenArray() {
        int result = arrayOfInts.sumOfEven(new int[]{1, 9});
        assertEquals(10, result);
    }

    @Test
    void onlyEvenArray() {
        int result = arrayOfInts.sumOfEven(new int[]{2, 6, 8, 6});
        assertEquals(22, result);
    }

    @Test
    void mixedArray() {
        int result = arrayOfInts.sumOfEven(new int[]{2, 7, 6, 3, 8, 6, 11});
        assertEquals(22, result);
    }

    @Test
    void mixedWithNegativeArray() {
        int result = arrayOfInts.sumOfEven(new int[]{2, 7, -4, 6, 3, 8, 6, 11});
        assertEquals(22, result);
    }
}