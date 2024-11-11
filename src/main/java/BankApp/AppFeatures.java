package BankApp;

public interface AppFeatures {

    public double saveMoney(int id, double amount);

    public double withdrawMoney(int id, double amount);

    public void simpleInterest();

    public void compoundInterest();

}
