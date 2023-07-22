// ////////////////////////////////// Access Modifier //////////////////

// types of access modifiers
//  --> public
//  --> protected
//  --> private
//  --> default

class Account {
    public String name;
    protected String userName;
    private String password;

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.userName);
    }

    // getters and setters in java

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
        System.out.println(password);
    }
}

public class Bank {
    public static void main(String[] args) {
        Account account = new Account();
        account.name = "HBL";
        account.userName = "Usman";
        // account.password="yqyqyq";
        account.printInfo();

        account.setPassword("12345");
        account.getPassword();
    }

}
