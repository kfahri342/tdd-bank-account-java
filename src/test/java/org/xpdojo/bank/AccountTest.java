package org.xpdojo.bank;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.fail;

public class AccountTest {
    private final Account account = new Account();

    @Test
    public void newAccountShouldHaveZeroBalance() {
        assertThat(account.balance()).isEqualTo(0);
    }

    @Test
    public void depositAnAmountShouldIncreaseTheBalance(){
        account.deposit(10);
        assertThat(account.balance()).isEqualTo(10);
    }

    @Test
    public void depositMultipleDepositsShouldIncreaseTheBalance(){
        account.deposit(10);
        account.deposit(20);
        assertThat(account.balance()).isEqualTo(30);
    }

    @Test
    public void withdrawalFromEmptyAccountShouldNotBeAllowed(){
        try {
            account.withdraw(1);
            fail("Expected exception");
        } catch (Exception e) {

        }

    }

    @Test
    public void withdrawAnAmountShouldDecreaseTheBalance(){
        account.deposit(10);
        account.withdraw(7);
        assertThat(account.balance()).isEqualTo(3);

    }

    @Test
    public void multipleWithdrawAndDepositsShouldReflectInTheBalance(){
        Account account = new Account();
        account.deposit(50);
        account.deposit(10);
        account.withdraw(40);
        assertThat(account.balance()).isEqualTo(20);
    }
}

