package Activity3_3;

import Activity3_3_Implementing_Hamcrest_Matcher.SalaryCalculator;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class HamcrestTest {
    private int result;

    @Test
    public void testNetSalary(){
        SalaryCalculator salaryCalculator = new SalaryCalculator();
        result = salaryCalculator.NetSalary(4000);
//        assertEquals(result, 8520);
        assertThat(result, equalTo(8520));
    }

    @Test
    public void testNetSalary2(){
        SalaryCalculator salaryCalculator = new SalaryCalculator();
        result = salaryCalculator.NetSalary(3250);
//        assertEquals(result, 6900);
        assertThat(result, equalTo(6900));
    }
}
