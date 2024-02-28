package com.cejv416.thebank.business;

import com.cejv416.thebank.data.BankBean;
import java.math.BigDecimal;

/**
 *
 * @author [You]
 */
public class SavingsProcess {

    private final BankBean savingsBean;

    public SavingsProcess(BigDecimal balance, BigDecimal interestRate, BankBean savingsBean ) {
        
        this.savingsBean = savingsBean;
        
        savingsBean.setStartingBalance(balance);
        savingsBean.setCurrentBalance(balance);
        savingsBean.setAnnualInterestRate(interestRate);
        
    }
    
    public void makeDeposit(BigDecimal deposit ) {
        
    }
    
    public boolean makeWithdrawal(BigDecimal withdrawal) {
        
        return true;
    }

    public void calculateInterest() {
        
    }
    
    public BankBean doMonthlyReport() {
        
        return null;
    }
    
    public void monthlyReset() {
        
    }
}
