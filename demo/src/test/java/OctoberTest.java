import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.daily_coding_problem.coding_problems.October.October2;
import com.daily_coding_problem.coding_problems.October.October3;
import com.daily_coding_problem.coding_problems.October.models.Node;

public class OctoberTest {
   
    @Test
    public void testCountWaysToDecode() {
        October2 october2 = new October2();
        int result = october2.countWaysToDecode("111", 0);
        assertEquals("Numways should be 3", 3, result);

        result = october2.countWaysToDecode("1234", 0);
        assertEquals("Numways should be 3", 3, result);

        result = october2.countWaysToDecode("12345", 0);
        assertEquals("Numways should be 3", 3, result);

        result = october2.countWaysToDecode("123456", 0);
        assertEquals("Numways should be 3", 3, result);
    }

    @Test
    public void testCountUniValSubTrees() {
        October3 october3 = new October3();
        Node root = new Node(0);
        root.left = new Node(1);
        root.right = new Node(0);
        root.right.left = new Node(1);
        root.right.right = new Node(0);
        root.right.left.left = new Node(1);
        root.right.left.right = new Node(1);
        int result = october3.countUniValSubTrees(root);
        assertEquals("Numways should be 5", 5, result);
    }
}
