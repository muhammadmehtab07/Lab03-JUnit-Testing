/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Rana
 */
public class BankAccountTest {

    @Test
    public void testPositiveDeposit() {
        BankAccount account = new BankAccount();

        account.deposit(500);

        assertEquals(500, account.getBalance(), 0.01);
    }

    @Test
    public void testValidWithdrawal() {
        BankAccount account = new BankAccount();

        account.deposit(500);
        account.withdraw(200);

        assertEquals(300, account.getBalance(), 0.01);
    }

    @Test
    public void testWithdrawBeyondBalance() {
        BankAccount account = new BankAccount();

        account.deposit(100);

        assertThrows(IllegalStateException.class, () -> {
            account.withdraw(200);
        });
    }

    @Test
    public void testNegativeDeposit() {
        BankAccount account = new BankAccount();

        assertThrows(IllegalArgumentException.class, () -> {
            account.deposit(-100);
        });
    }
}