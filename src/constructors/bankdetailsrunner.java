package constructors;

public class bankdetailsrunner {
    public static void main(String[] args) {

        bankDetails bk = new bankDetails();
        bk.status();

        bankDetails bk1 = new bankDetails("ICICI_Bank", "icici12345", 500 , 1012131415L , "AAAAA" );
        System.out.println("This is the bank details of the AAAAA");
        System.out.println("Name -> " + bk1.holder_name);
        System.out.println("Account number  ->" +  bk1.account_no);
        System.out.println("Bank Name  ->" + bk1.bank_name);
        System.out.println("IFSC code -> " + bk1.ifsc_no);
        System.out.println("Bank Balance -> " + bk1.balance);


    }
}
