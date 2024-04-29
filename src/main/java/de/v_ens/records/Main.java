package de.v_ens.records;

/*Create a record 'Client' with the properties First Name, Last Name, and Customer Number (choose suitable English field names).

Create a class 'Account' (not a record, should initially be mutable) with the properties Account Number (String), Account Balance (BigDecimal), and the associated customer.*/


import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        Client client1 = new Client("John", "Doe", "1234");
        Account account1 = new Account("123456", 1000.03, client1);
        System.out.println(account1);

        account1.setBalance(account1.getBalance().add(BigDecimal.valueOf(100)));
    }
}
