import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.daily_coding_problem.coding_problems.September26;

public class SeptemberTest {
    @Test
    public void Sep26TestCheckSumInList() {
        September26 september26 = new September26();
        int[] list = {10, 15, 3, 7};
        int k = 17;
        assertTrue(september26.checkSumInList(k, list), "10 + 7 is 17");
    }
    
}
