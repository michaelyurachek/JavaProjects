import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestMeUnitTest {

    TestMe tm = new TestMe();

    @Test
    public void testAdd_6_7() {
        assertEquals(13, tm.add(6, 7), "Adding 6 plus 7 should equal 13.");
    }

    @Test
    public void testSubtract_15_12() {
        assertEquals(3, tm.subtract(15, 12), "Subtracting 12 from 15 should equal 3.");
    }

    @Test
    public void testMultiply_4_5() {
        assertEquals(20, tm.multiply(4, 5), "Multiplying 4 times 5 should equal 20.");
    }

    @Test
    public void testDivide_50_3() {
        // Using a delta to account for floating-point rounding
        assertEquals(16.66666, tm.divide(50.0, 3.0), 0.00001, "Dividing 50 by 3 should equal 16.66666.");
    }

    @Test
    public void test_isEven_60() {
        assertTrue(tm.isEven(60), "isEven(60) should return true.");
    }

    @Test
    public void test_containsSubstring() {
        assertTrue(tm.containsSubstring("Java testing is fun!", "Java"), 
                   "'Java testing is fun!' should contain 'Java'.");
    }
}