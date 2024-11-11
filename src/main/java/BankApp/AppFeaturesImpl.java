package BankApp;

import java.io.IOException;

public class AppFeaturesImpl implements AppFeatures{

    double balance = 1000000;

    @Override
    public double saveMoney(int id, double amount) {
        return  balance + amount;
    }

    @Override
    public double withdrawMoney(int id, double amount) {
        if((balance+1000) < amount){
            System.out.println("Insufficient Fund!!");
        }else{
            try {
                amount  = balance - amount;
            } catch (ArithmeticException e) {
                // Handling the exception thrown by readFile method
                System.out.println("An error occurred while" +
                        " reading the file: " +
                        e.getMessage());
            }

        }
        return amount;
    }

    @Override
    public void simpleInterest() {

    }

    @Override
    public void compoundInterest() {

    }

}
