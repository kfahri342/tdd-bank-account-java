package org.xpdojo.bank;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AccountTest {

    @Test
    public void newAccountShouldHaveZeroBalance() {
        Account account = new Account();
        assertThat(account.balance()).isEqualTo(0);

    }

    @Test
    public void depositAnAmountShouldIncreaseTheBalance(){
        Account account = new Account();
        account.deposit(10);
        assertThat(account.balance()).isEqualTo(10);
    }

    @Test
    public void depositMultipleDepositsShouldIncreaseTheBalance(){
        Account account = new Account();
        account.deposit(10);
        account.deposit(20);
        assertThat(account.balance()).isEqualTo(30);
    }

    @Test
    public void withdrawAnAmountShouldDecreaseTheBalance(){
        Account account = new Account();
        account.withdraw(15);
        assertThat(account.balance()).isEqualTo(-15);

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

