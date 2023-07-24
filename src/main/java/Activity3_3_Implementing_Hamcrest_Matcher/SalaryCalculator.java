package Activity3_3_Implementing_Hamcrest_Matcher;

import java.util.Scanner;

public class SalaryCalculator {
    private static int basicSalary;

    public static void main(String[] args) {
        System.out.println("Enter Your Basic Salary: ");
        Scanner scanner = new Scanner(System.in);
        basicSalary = scanner.nextInt();
        SalaryCalculator salaryCalculator = new SalaryCalculator();
        int netSalary = salaryCalculator.NetSalary(basicSalary);
        System.out.println(netSalary);
    }

    public int NetSalary(int basicSalary){
        int hra, specialAllowance, pf, netPayableSalary, grossSalary;
        hra = (50 * basicSalary) / 100;
        specialAllowance = (75 * basicSalary) / 100;
        pf = (12 * basicSalary) / 100;
        grossSalary = basicSalary + hra + specialAllowance;
        netPayableSalary = basicSalary + hra + specialAllowance - pf;

//        System.out.println("Basic Salary        = " + basicSalary);
//        System.out.println("HRA                 = " + hra);
//        System.out.println("Special Allowance   = " + specialAllowance);
//        System.out.println("_____________________________________");
//        System.out.println("Gross Salary        = " + grossSalary);
//        System.out.println("_____________________________________");
//        System.out.println("Deductions:");
//        System.out.println("PF                  = " + pf);
//        System.out.println("_____________________________________");
//        System.out.println("Net Payable Salary  = " + netPayableSalary);
//        System.out.println("_____________________________________");

        return netPayableSalary;
    }
}
