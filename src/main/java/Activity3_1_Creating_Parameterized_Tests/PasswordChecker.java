package Activity3_1_Creating_Parameterized_Tests;

import java.util.Random;

public class PasswordChecker {
    public String combineString
    (
        String custName,
        String randChars
    ){
        String newCustName;
        if(custName.length() > 3) {
            newCustName = custName.substring(0, 3);
        }
        else
        {
            newCustName = custName;
        }

        randChars = getRandString();

        String passResult;
        passResult = newCustName + randChars;

        return passResult;
    }

    public static String getRandString() {
        String randChars;
        Random random = new Random();
        int digit1 = random.nextInt(10); // Random digit from 0 to 9
        int digit2 = random.nextInt(10); // Random digit from 0 to 9
        int digit3 = random.nextInt(10); // Random digit from 0 to 9

        randChars  = "" + digit1 + digit2 + digit3; // Concatenate digits to form a three-digit string
        return randChars;
    }
//
//    public void printPass()
//    {
//        System.out.println(combineString());
//    }
}

class TestPass{
    public static void main(String[] args) {
        PasswordChecker passwordChecker =
        new PasswordChecker();

        String printPass = passwordChecker
        .combineString("Samuel", PasswordChecker.getRandString());

        System.out.println(printPass);
    }
}
