import org.junit.Assert;
import org.junit.Test;

import com.daily_coding_problem.coding_problems.September.September26;
import com.daily_coding_problem.coding_problems.September.September27;
import com.daily_coding_problem.coding_problems.September.September29;
import com.daily_coding_problem.coding_problems.September.September30;
import com.daily_coding_problem.coding_problems.September.september_28.Node;
import com.daily_coding_problem.coding_problems.September.september_28.September28;

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

    @Test
    public void Sep28TestSerializeDeserialize() {
        September28 september28 = new September28();
        Node node = new Node("root", new Node("left", new Node("left.left")), new Node("right"));
        Assert.assertEquals("left.left", september28.deserialize(september28.serializeString(node)).left.left.val);
    }

    @Test
    public void Sep29TestGetMinpositiveMissingNumber() {
        September29 september29 = new September29();
        int[] list = {3, 4, -1, 1};
        Assert.assertEquals(2, september29.getMinpositiveMissingNumber(list));
        list = new int[]{1, 2, 0};
        Assert.assertEquals(3, september29.getMinpositiveMissingNumber(list));
        list = new int[]{1, 2, 3, 4, 5, 6};
        Assert.assertEquals(7, september29.getMinpositiveMissingNumber(list));  
        list = new int[]{60, 8, 56, 1, 3, -1, -1, 3, -4, 4, 8, 10, 4, 5, 6, 7, 2, 2};
        Assert.assertEquals(9, september29.getMinpositiveMissingNumber(list));
    }

    @Test
    public void Sep30TestCons() {
        September30 september30 = new September30();
        Assert.assertEquals(3, september30.car(september30.cons(3, 4)));
        Assert.assertEquals(4, september30.cdr(september30.cons(3, 4)));
    }
    
}
