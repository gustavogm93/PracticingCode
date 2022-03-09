import org.junit.jupiter.api.Test;

class RemoveDuplicatesFromSortedArrayTest {

    private final int[] variableOne = {1, 1, 2};
    private final int[] variableTwo = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
    private final int[] variableThree = {1, 1, 1, 2, 2, 3};
    private final int[] variableFour = {0, 0, 1, 1, 1, 1, 2, 3, 3};
    RemoveDuplicatesFromSortedArray removeDuplicatesFromSortedArray = new RemoveDuplicatesFromSortedArray();

    @Test
    void main() {
    }

    @Test
    void removeDuplicatesTest() {
        int quantity = removeDuplicatesFromSortedArray.removeDuplicates(variableOne);
        int exit = quantity - 2;
        assert (exit == quantity - 2);
        assert (quantity == 2);
    }

    @Test
    void removeDuplicateBestSolutionTest() {
        int quantity = removeDuplicatesFromSortedArray.removeDuplicateBestSolution(variableThree);
        int exit = quantity - 2;
        assert (exit == quantity - 2);
        assert (quantity == 3);
    }

    @Test
    void removeDuplicates2Test() {
        int quantity = removeDuplicatesFromSortedArray.removeDuplicates2(variableTwo);
        int exit = quantity - 2;
        assert (exit == quantity - 2);
        assert (quantity == 7);
    }

    @Test
    void splitInOddAndEvenTest() {
        int quantity = removeDuplicatesFromSortedArray.splitInOddAndEven(variableFour);
        int exit = quantity - 2;
        assert (exit == quantity - 2);
        assert (quantity == 5);
    }

    @Test
    void swapArrayTest() {
        int[] array = {1, 2, 3, 4, 5};
        removeDuplicatesFromSortedArray.swapArray(array, 2, 4);
    }
}
