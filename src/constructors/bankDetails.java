package constructors;

public class bankDetails {
    String bank_name;
    String ifsc_no;
    int balance;
    long account_no;
    String holder_name;

    void status() {
        System.out.println("print the bank details");
    }

    public bankDetails(String bank_name, String ifsc_no, int balance, long account_no, String holder_name) {
        this.bank_name = bank_name;
        this.ifsc_no = ifsc_no;
        this.balance = balance;
        this.account_no = account_no;
        this.holder_name = holder_name;
    }

    bankDetails() {
        System.out.println("_______________");
    }
}