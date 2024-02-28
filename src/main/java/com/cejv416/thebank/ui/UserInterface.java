package com.cejv416.thebank.ui;

import com.cejv416.thebank.business.ChequingProcess;
import com.cejv416.thebank.business.SavingsProcess;
import com.cejv416.thebank.data.BankBean;
import java.math.BigDecimal;

/**
 *
 * @author [You]
 */
public class UserInterface {
    
    private BankBean savingsBean;
    private BankBean chequingBean; 
    
    private ChequingProcess chequingProcess;
    private SavingsProcess savingsProcess;
    
    public UserInterface() {
        savingsBean = new BankBean();
        chequingBean = new BankBean();
        
        chequingProcess = new ChequingProcess(new BigDecimal("100"), new BigDecimal("0.05"),chequingBean);
        savingsProcess = new SavingsProcess(new BigDecimal("100"), new BigDecimal("0.05"), savingsBean);
    }
    
    public void perform() {
        
        
        
    }
}
