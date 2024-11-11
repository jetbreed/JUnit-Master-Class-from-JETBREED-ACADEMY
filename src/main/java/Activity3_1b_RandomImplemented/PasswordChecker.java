package Activity3_1b_RandomImplemented;

import java.nio.Buffer;
import java.util.Random;

public class PasswordChecker {
    public String combineString(String custName)
    {
//        StringBuilder randChars;

        String randnumbers = "1234567890";

        int numLength = randnumbers.length();
        Random randomNum = new Random();

        String rander;
        StringBuilder randChars =
                new StringBuilder(300);

        for(int i = 0; i < 4; i++)
        {
            randChars.append(randnumbers.charAt(randomNum.
                    nextInt(10)));
        }

        String newCustName;
        if(custName.length() > 3) {
            newCustName = custName.substring(0, 3);
        }
        else
        {
            newCustName = custName;
        }

        String passResult;
        passResult = newCustName + randChars;

        return passResult;
    }
//
//    public void printPass()
//    {
//        System.out.println(combineString());
//    }
}

class TestPass{
    public static void main(String[] args) {
        PasswordChecker passwordChecker = new PasswordChecker();
        String printPass = passwordChecker
                .combineString("Ur");

        System.out.println(printPass);
    }
}
