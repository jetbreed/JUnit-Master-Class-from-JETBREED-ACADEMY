package jjj;



import java.util.Arrays;
import java.util.Collection;
import static org.junit.Assert.*;

import Activity3_1_Creating_Parameterized_Tests.PasswordChecker;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class TestPass {
    private String expected;
    private String Char1;
    private String Char2;

    public TestPass(String expectedresult, String Character1, String Character2) {
        this.expected=expectedresult;
        this.Char1=Character1;
        this.Char2=Character2;
    }

    @Parameters
    public static Collection<String[]> checkednumbers() {
        return Arrays.asList(new String[][] {{"Jam345","Jam","345"},{"Wod$#$%","Wod","$#$%"},
                {"Sam34ed#$@","Sam","34ed#$@"}});
    }

    @Test
    public void testCheck() {
        System.out.println("check");
        PasswordChecker p=new PasswordChecker();
        assertEquals(expected,p.combineString(Char1,Char2));
    }

}
