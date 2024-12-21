public class Driver {
    public static void main(String[] args) {
        // thus creates a new object of type BankAccount
        BankAccount bankAccount = new BankAccount(1000, "AC001");
        // print out the current bank account information
        System.out.println(bankAccount.getBankAccountInfo());

        // deposit $500
        bankAccount.deposit(500);
        System.out.println(bankAccount.getBankAccountInfo());

        // withdraw $100
        boolean completed = bankAccount.withdraw(2000);
        if (completed) { // completed is called a flag variable
            System.out.println("Successful transaction");
        }
        else {
            System.out.println("Unsuccessful transaction");
        }
        System.out.println(bankAccount.getBankAccountInfo());

        // not related but this only prints ONE backslash
        //System.out.println("\\");
    }
}
