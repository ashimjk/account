package io.github.ashimjk.account;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.assertThat;

class AccountTest {

    @Test
    void createAccount() {
        Account account = new Account();
        account.setName("ashim");
        account.setAmount(BigDecimal.TEN);
        account.setCurrency("USD");

        assertThat(account.getName()).isEqualTo("ashim");
    }

}