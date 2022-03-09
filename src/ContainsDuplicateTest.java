import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ContaininsDuplicateOnArrayTest {

    @Test
    void main() {
    }

    @Test
    void containsDuplicate() {

        ContainsDuplicate containsDuplicate = new ContainsDuplicate();
        boolean testCase1Result = containsDuplicate.containsDuplicate(new int[]{1, 2, 3, 1});
        boolean testCase2Result = containsDuplicate.containsDuplicate(new int[]{1, 2, 3, 4});
        boolean testCase3Result = containsDuplicate.containsDuplicate(new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2});

        assertTrue(testCase1Result);
        assertFalse(testCase2Result);
        assertTrue(testCase3Result);
    }

}