package com.cejv416.thebank.business;

import com.cejv416.thebank.data.BankBean;
import java.math.BigDecimal;

/**
 *
 * @author [You]
 */
public class ChequingProcess {
    
    private final BankBean chequingBean;
    
    public ChequingProcess(BigDecimal balance, BigDecimal interestRate, BankBean chequingBean ) {
        
        this.chequingBean = chequingBean;
        
        chequingBean.setStartingBalance(balance);
        chequingBean.setCurrentBalance(balance);
        chequingBean.setAnnualInterestRate(interestRate);
        
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
