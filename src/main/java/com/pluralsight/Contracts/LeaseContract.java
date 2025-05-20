package com.pluralsight.Contracts;

import com.pluralsight.dealership.Vehicle;

public class LeaseContract extends Contract{

    private double expectedEndingValue, leaseFee, monthlyPayment;

    public LeaseContract(String date, String name, String email, Vehicle vehicleSold, double expectedEndingValue, double leaseFee) {
        super(date, name, email, vehicleSold);
        this.expectedEndingValue = expectedEndingValue;
        this.leaseFee = leaseFee;
    }

    public double getExpectedEndingValue() {
        return expectedEndingValue;
    }

    public void setExpectedEndingValue(double expectedEndingValue) {
        this.expectedEndingValue = expectedEndingValue;
    }

    public double getLeaseFee() {
        return leaseFee;
    }

    public void setLeaseFee(double leaseFee) {
        this.leaseFee = leaseFee;
    }

    @Override
    public double getTotalPrice() {
        return 0;
    }

    @Override
    public double getMonthlyPayment() {
        return 0;
    }
}
