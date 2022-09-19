package ex01_arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayOfIntsSumOf3SmallestTest {
    private final ArrayOfInts arrayOfInts = new ArrayOfInts();

    @Test
    void nullArray() {
        int result = arrayOfInts.sumOf3SmallestInts(null);
        assertEquals(0,result);
    }

    @Test
    void emptyArray() {
        int result = arrayOfInts.sumOf3SmallestInts(new int[]{});
        assertEquals(0,result);
    }

    @Test
    void lessThan3Array() {
        int result = arrayOfInts.sumOf3SmallestInts(new int[]{2,9});
        assertEquals(11,result);
    }

    @Test
    void exactThan3Array() {
        int result = arrayOfInts.sumOf3SmallestInts(new int[]{2,7,9,5});
        assertEquals(14,result);
    }

    @Test
    void moreThan3withArray() {
        int result = arrayOfInts.sumOf3SmallestInts(new int[]{-3,7,9,5});
        assertEquals(4,result);
    }

    @Test
    void moreThan3Array() {
        int result = arrayOfInts.sumOf3SmallestInts(new int[]{2,9});
        assertEquals(11,result);
    }

}
