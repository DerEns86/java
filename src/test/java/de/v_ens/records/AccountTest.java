package de.v_ens.records;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {

    @Test
    void deposit_increaseBalanceWith5_WhenAmmountIS5() {
        //Given
        Client client1 = new Client("John", "Doe", "1234");
        Account account1 = new Account("123456", BigDecimal.valueOf(1000.5), client1);
        //When
        account1.deposit(BigDecimal.valueOf(5));
        BigDecimal actual = account1.getBalance();

        //Then
        BigDecimal expected = BigDecimal.valueOf(1005.5);
        assertEquals(expected, actual);

    }

    @Test
    void withdraw_decreaseBalanceWith5_WhenAmmountIS5() {
        //Given
        Client client1 = new Client("John", "Doe", "1234");
        Account account1 = new Account("123456", BigDecimal.valueOf(1000.5), client1);
        //When
        account1.withdraw(BigDecimal.valueOf(5));
        BigDecimal actual = account1.getBalance();

        //Then
        BigDecimal expected = BigDecimal.valueOf(995.5);
        assertEquals(expected, actual);
    }

}
