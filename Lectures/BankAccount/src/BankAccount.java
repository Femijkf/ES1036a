public class BankAccount {
    // create two field of the class
    private double balance;
    private String accountNumber;

    // This is the constructor of the class
    public BankAccount(double startBalance, String accNumber) {
        balance = startBalance;
        accountNumber = accNumber;
    }

    public void deposit(double amount){
        // balance = balance + amount;
            // OR
        balance += amount;
    }

    public boolean withdraw(double amount){
        if (amount <= balance) {
            // balance = balance - amount;
                //OR
            balance -= amount;
            return true;
        }
        else {
            return false;
        }
    }

    // Thus method should display the account information as follows:
        // Account Number: accountNumber
        // Balance:        balance
    public String getBankAccountInfo() {
        String output = String.format("%-15s %s\n%-15s $%.2f", "Account Number:", accountNumber,
                "Balance:", balance);
        return output;
    }
}

// Payroll --> class name
//--------------------------------------------------------
// - hoursWorked : double --> datatype                      } private
// - payRate : double                                       }
//--------------------------------------------------------
// + Payroll() --> constructor                              }
// + setHoursWorked(hours : double) : void <-- return type  }
// + setPayRate(rate : double) : void                       } public
// + getHoursWorked() : double                              }
// + getPayRate() : double                                  }
// + getGrossPay() : double                                 }