package de.v_ens.records;

/*Create a record 'Client' with the properties First Name, Last Name, and Customer Number (choose suitable English field names).

Create a class 'Account' (not a record, should initially be mutable) with the properties Account Number (String), Account Balance (BigDecimal), and the associated customer.

Implement a method to deposit money into the account.

Implement a method to withdraw money from the account.

*
* Create a class 'BankService' that manages a set of accounts.

Implement a method in BankService to open an account. It should only require a customer as an argument and should return the new account number.

Implement a method in BankService to transfer a specific amount (as BigDecimal) from one account number (as String) to another account number (as String).
* Modify your records and classes so that an account can have multiple account holders (two or more account holders).

Write a method public List<String> split(String accountNumber) in the service that splits an account equally. From a joint account, individual accounts should be created for each account holder. It should return the newly created account numbers. Each account should receive the same amount of money after the split (+- 1 cent). Make sure that the bank does not incur any cent gains or losses during the process.

PS: as usual, our bank does not deal with half cents ;)

Tip: Test Driven Development is also very useful for solving this task! (applies to the following tasks as well)


*/


import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        Client client1 = new Client("John", "Doe", "1234");
        Account account1 = new Account("123456",BigDecimal.valueOf(1000.5), client1);
        System.out.println(account1);

        account1.setBalance(account1.getBalance().add(BigDecimal.valueOf(100)));
    }
}
