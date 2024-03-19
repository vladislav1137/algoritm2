import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IntegerListImplTest {
    private IntegerListImplTest IntegerList;

    @BeforeEach
    public void setUp() {
        IntegerList = new IntegerListImplTest();
    }

    @Test
    void TestSortInsertion() {
        Random random = new Random();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt();
        }
        sort(array);
    }
    public static void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i;
            while (j > 0 && arr[j - 1] >= temp) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = temp;
        }
    }

    @Test
    public void testBinarySearch() {
        Integer[] arr = {3, 5, 7, 8, 2, 1, 9};
        boolean result = binarySearch(arr, 5);
        assertTrue(result);
    }
    private static boolean binarySearch(Integer[] arr, int target) {
        if (arr.length == 0) {
            return false;
        }
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int middle = low + (high - low) / 2;
            if (arr[middle] == target) {
                return true;
            }
            else if (arr[middle] < target) {
                low = middle + 1;
            }
            else {
                high = middle - 1;
            }
        }
        return false;
    }
}
