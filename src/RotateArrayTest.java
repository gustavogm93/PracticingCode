import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class RotateArrayTest {

    RotateArray rotateArray = new RotateArray();

    @Test
    void testRotateArray() {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        rotateArray.rotate(numbers, k);
        int[] expected = {5, 6, 7, 1, 2, 3, 4};
        assertArrayEquals(expected, numbers);
    }

    @Test
    void testRotateArray2() {
        int[] numbers = {-1, -100, 3, 99};
        int k = 2;
        rotateArray.rotate(numbers, k);
        int[] expected = {3, 99, -1, -100};
        assertArrayEquals(expected, numbers);
    }

    @Test
    void testRotateArray4() {
        int[] numbers = {1};
        int k = 2;
        rotateArray.rotate(numbers, k);
        int[] expected = {1};
        assertArrayEquals(expected, numbers);
    }

    @Test
    void testRotateArray3() {
        int[] numbers = {1, 2};
        int k = 2;
        rotateArray.rotate(numbers, k);
        int[] expected = {2, 1};
        assertArrayEquals(expected, numbers);

    }
}