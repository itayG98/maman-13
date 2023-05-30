import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Ex13Tests {
    @Test
    @DisplayName("Q1  - shortestRoad")
    public void shortestRoad() {

        int[] road1 = { 5, 4, 5, 8, 12, 9, 9, 3 };
        int[] road2 = { 7, 3, 3, 12, 10, 2, 10, 7 };
        int value = Ex13.shortestRoad(road1, road2);
        Assertions.assertEquals(49, value, "This is university's test");

        int[] road3 = { 1, 2, 5, 5 };
        int[] road4 = { 1, 1, 3, 9 };
        int value2 = Ex13.shortestRoad(road3, road4);
        Assertions.assertEquals(10, value2);

        int[] road5 = { 1, 2, 3, 4 };
        int[] road6 = { 1, 4, 2, 3 };
        int value3 = Ex13.shortestRoad(road5, road6);
        Assertions.assertEquals(8, value3);

        int[] road7 = { 10, 2, 5, 7, 8, 3, 1, 6 };
        int[] road8 = { 5, 8, 3, 6, 1, 9, 4, 7 };
        int value4 = Ex13.shortestRoad(road7, road8);
        Assertions.assertEquals(33, value4);
    }

    @Test
    @DisplayName("Q2  - missingValue")
    public void missingValue() {
        int[] arr1 = { 7, 10, 13, 16, 22, 25 };
        int value = Ex13.missingValue(arr1);
        Assertions.assertEquals(19, value, "This is university's test");

        int[] arr2 = { 1, 3, 5, 7, 9, 11, 13, 17 };
        int value2 = Ex13.missingValue(arr2);
        Assertions.assertEquals(15, value2);

        int[] arr3 = { 1, 2, 3, 4, 6, 7, 8 };
        int value3 = Ex13.missingValue(arr3);
        Assertions.assertEquals(5, value3);

        int[] arr4 = { -17, -15, -13, -9, -7, -5, -3 };
        int value4 = Ex13.missingValue(arr4);
        Assertions.assertEquals(-11, value4);

        int[] arr5 = { -2, 4 };
        int value5 = Ex13.missingValue(arr5);
        Assertions.assertEquals(1, value5);

        int[] arr6 = { -12, -8, -6, -2, 0 };
        int value6 = Ex13.missingValue(arr6);
        Assertions.assertEquals(-10, value6);

        int[] arr7 = { 0, 2 };
        int value7 = Ex13.missingValue(arr7);
        Assertions.assertEquals(1, value7);

        int[] arr8 = { -2,0, 4 };
        int value8 = Ex13.missingValue(arr8);
        Assertions.assertEquals(2, value8);

        int[] arr9 = { -2,0, 4,6 };
        int value9 = Ex13.missingValue(arr9);
        Assertions.assertEquals(2, value9);
    }

    @Test
    @DisplayName("Q3 - longestPalindrome")
    public void longestPalindrome() {
        int[] arr1 = { 1, 3, 2, 3, 10, 10, 3, 2, 4 };
        int value1 = Ex13.longestPalindrome(arr1);
        Assertions.assertEquals(6, value1, "This is university's test");

        int[] arr2 = { 1, 2, 3, 4 };
        int value2 = Ex13.longestPalindrome(arr2);
        Assertions.assertEquals(1, value2);

        int[] arr3 = { -4, -3, 10, 0, 0, 10, -3, -4, 2, 2 };
        int value3 = Ex13.longestPalindrome(arr3);
        Assertions.assertEquals(8, value3);

        int[] arr4 = { 5, 5 };
        int value4 = Ex13.longestPalindrome(arr4);
        Assertions.assertEquals(2, value4);
    }

    @Test
    @DisplayName("Q4 - isSum")
    public void isSum() {
        int[] arr1 = { 5, 4, 2, 1, 3 };
        boolean value1 = Ex13.isSum(arr1, 8);
        Assertions.assertTrue(value1, "This is university's test");

        boolean value2 = Ex13.isSum(arr1, 0);
        Assertions.assertTrue(value2, "This is university's test");

        boolean value3 = Ex13.isSum(arr1, 9);
        Assertions.assertTrue(value3, "This is university's test");

        boolean value4 = Ex13.isSum(arr1, 2);
        Assertions.assertTrue(value4, "This is university's test");

        boolean value5 = Ex13.isSum(arr1, 11);
        Assertions.assertFalse(value5, "This is university's test");

        boolean value6 = Ex13.isSum(arr1, 17);
        Assertions.assertFalse(value6, "This is university's test");

        int[] arr2 = { 5, 6, 4, 2, 12 };

        boolean value7 = Ex13.isSum(arr2, 14);
        Assertions.assertTrue(value7);

        int[] arr3 = { -6, 5, -2, -4, -18, 4 };

        boolean value8 = Ex13.isSum(arr3, 1);
        Assertions.assertTrue(value8);

        boolean value9 = Ex13.isSum(arr3, -1);
        Assertions.assertTrue(value9);

        boolean value10 = Ex13.isSum(arr3, -3);
        Assertions.assertFalse(value10);


    }
}