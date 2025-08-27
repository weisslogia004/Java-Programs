package Bank;
class Account
{
    protected String accountNumber;
    private String password;
    //getter
    public String getPassword() {
        return this.password;
    }
    //setter
    public void setPassword(String password) {
        this.password = password;
    }
}
public class bank {
    public static void main(String[] args) {
        Account acc = new Account();
        acc.accountNumber = "123456789";
        acc.setPassword("agniv1234");
        System.out.println("Account Number: " + acc.accountNumber);
        System.out.println("Account Password: " + acc.getPassword());
    }
}
