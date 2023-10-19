package bank;
// OOPS
// Encapsulation

class Account {
    public String name;
    protected String email;
}

public class Bank {
    public static void main(String args[]) {
        Account account1 = new Account();
        account1.name = "SidKarma";
        account1.email = "sidkarma@gmail.com";

    }
}
