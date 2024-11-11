package Activity3_1;

//import static org.junit.jupiter.api.Assertions.assertEquals;
//import org.junit.jupiter.api.Test;
import Activity3_1_Creating_Parameterized_Tests.PasswordChecker;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class PasswordCheckerTest {

    // Method to test the combineString method
    @Test
    public void testCombineString() {
        PasswordChecker obj = new PasswordChecker();

        // Test case 1: custName has more than 3 characters
        String result1 = obj.combineString("Customer", "123");
        assertEquals("Cus123", result1);

        // Test case 2: custName has exactly 3 characters
        String result2 = obj.combineString("Tom", "456");
        assertEquals("Tom456", result2);

        // Test case 3: custName has less than 3 characters
        String result3 = obj.combineString("Ed", "789");
        assertEquals("Ed789", result3);

        // Test case 4: custName is an empty string
        String result4 = obj.combineString("", "XYZ");
        assertEquals("XYZ", result4);

        // Test case 5: randChars is an empty string
        String result5 = obj.combineString("Customer", "");
        assertEquals("Cus", result5);
    }
}
