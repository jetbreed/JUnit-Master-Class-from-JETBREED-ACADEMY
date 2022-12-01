package Activity3_1_Creating_Parameterized_Tests;

public class PasswordChecker {
    public String combineString(String custName, String randChars){

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
                .combineString("Ferguson", "23%&$");

        System.out.println(printPass);
    }
}
