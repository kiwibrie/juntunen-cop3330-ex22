package base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    public void testLargestandAlsoUnique() {
        App myApp = new App();

        int[] intArray = new int[3];
        intArray[0] = 1;
        intArray[1] = 51;
        intArray[2] = 2;

        int largest = myApp.findLargest(intArray);
        int expectedLargest = 51;

        assertEquals(expectedLargest, largest);
        assertTrue(myApp.checkUnique(intArray));
    }
}