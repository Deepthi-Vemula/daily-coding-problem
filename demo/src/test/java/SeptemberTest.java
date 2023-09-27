import org.junit.Assert;
import org.junit.Test;

import com.daily_coding_problem.coding_problems.September26;
import com.daily_coding_problem.coding_problems.September27;

public class SeptemberTest {
    @Test
    public void Sep26TestCheckSumInList() {
        September26 september26 = new September26();
        int[] list = {10, 15, 3, 7};
        int k = 17;
        Assert.assertTrue(september26.checkSumInList(k, list));
    }

    @Test
    public void Sep27TestProductArray() {
        September27 september27 = new September27();
        int[] list = {1, 2, 3, 4, 5};
        int[] expectedResult = {120, 60, 40, 30, 24};
        int[] result = september27.productOfAllNumbersExceptIndex(list);
        Assert.assertArrayEquals(expectedResult , result);

        list = new int[]{3, 2, 1};
        expectedResult = new int[]{2, 3, 6};
        result = september27.productOfAllNumbersExceptIndex(list);
        Assert.assertArrayEquals(expectedResult , result);

        list = new int[]{1, 2, 3, 4, 5, 6};
        expectedResult = new int[]{720, 360, 240, 180, 144, 120};
        result = september27.productOfAllNumbersExceptIndex(list);
        Assert.assertArrayEquals(expectedResult , result);
        
    }
    
}
