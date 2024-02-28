package com.cejv416.thebank.data;

import java.math.BigDecimal;

/**
 *
 * @author [You]
 */
public class BankBean {
    
    private BigDecimal startingBalance;
    private BigDecimal currentBalance;
    private BigDecimal monthTotalDeposits;
    private int numberOfDeposits;
    private BigDecimal monthTotalWithdrawals;
    private int numberOfWithdrawals;
    private BigDecimal annualInterestRate;
    private BigDecimal monthInterestAmount;
    private BigDecimal monthServiceCharge;

    public BankBean() {
    }
    
    

    public BankBean(BigDecimal startingBalance, BigDecimal currentBalance, BigDecimal monthTotalDeposits, int numberOfDeposits, BigDecimal monthTotalWithdrawals, int numberOfWithdrawals, BigDecimal annualInterestRate, BigDecimal monthInterestAmount, BigDecimal monthServiceCharge) {
        this.startingBalance = startingBalance;
        this.currentBalance = currentBalance;
        this.monthTotalDeposits = monthTotalDeposits;
        this.numberOfDeposits = numberOfDeposits;
        this.monthTotalWithdrawals = monthTotalWithdrawals;
        this.numberOfWithdrawals = numberOfWithdrawals;
        this.annualInterestRate = annualInterestRate;
        this.monthInterestAmount = monthInterestAmount;
        this.monthServiceCharge = monthServiceCharge;
    }

    public BigDecimal getStartingBalance() {
        return startingBalance;
    }

    public void setStartingBalance(BigDecimal startingBalance) {
        this.startingBalance = startingBalance;
    }

    public BigDecimal getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(BigDecimal currentBalance) {
        this.currentBalance = currentBalance;
    }

    public BigDecimal getMonthTotalDeposits() {
        return monthTotalDeposits;
    }

    public void setMonthTotalDeposits(BigDecimal monthTotalDeposits) {
        this.monthTotalDeposits = monthTotalDeposits;
    }

    public int getNumberOfDeposits() {
        return numberOfDeposits;
    }

    public void setNumberOfDeposits(int numberOfDeposits) {
        this.numberOfDeposits = numberOfDeposits;
    }

    public BigDecimal getMonthTotalWithdrawals() {
        return monthTotalWithdrawals;
    }

    public void setMonthTotalWithdrawals(BigDecimal monthTotalWithdrawals) {
        this.monthTotalWithdrawals = monthTotalWithdrawals;
    }

    public int getNumberOfWithdrawals() {
        return numberOfWithdrawals;
    }

    public void setNumberOfWithdrawals(int numberOfWithdrawals) {
        this.numberOfWithdrawals = numberOfWithdrawals;
    }

    public BigDecimal getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(BigDecimal annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public BigDecimal getMonthInterestAmount() {
        return monthInterestAmount;
    }

    public void setMonthInterestAmount(BigDecimal monthInterestAmount) {
        this.monthInterestAmount = monthInterestAmount;
    }

    public BigDecimal getMonthServiceCharge() {
        return monthServiceCharge;
    }

    public void setMonthServiceCharge(BigDecimal monthServiceCharge) {
        this.monthServiceCharge = monthServiceCharge;
    }

    @Override
    public String toString() {
        return "BankBean{" + "startingBalance=" + startingBalance + ", currentBalance=" + currentBalance + ", monthTotalDeposits=" + monthTotalDeposits + ", numberOfDeposits=" + numberOfDeposits + ", monthTotalWithdrawals=" + monthTotalWithdrawals + ", numberOfWithdrawals=" + numberOfWithdrawals + ", annualInterestRate=" + annualInterestRate + ", monthInterestAmount=" + monthInterestAmount + ", monthServiceCharge=" + monthServiceCharge + '}';
    }
    
}
