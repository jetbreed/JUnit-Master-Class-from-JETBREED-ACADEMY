package Activity2_3;

public class Gift {
    private String fname;

    public  Gift(String fname){
        this.fname = fname + " John";
    }

    public String getFname() {
        return fname;
    }

    public static void main(String[] args) {
        Gift instanceOfGift = new Gift("Gift");
        String fName =  instanceOfGift.getFname();
        System.out.println(fName);
    }
}
