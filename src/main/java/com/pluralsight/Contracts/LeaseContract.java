package com.pluralsight.Contracts;

import com.pluralsight.dealership.Vehicle;

public class LeaseContract extends Contract{

    private double expectedEndingValue, leaseFee, monthlyPayment;

    public LeaseContract(String date, String name, String email, Vehicle vehicleSold) {
        super(date, name, email, vehicleSold);
        this.expectedEndingValue = vehicleSold.getPrice()*.5;
        this.leaseFee = vehicleSold.getPrice()*.07;
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
        return (getVehicleSold().getPrice() - this.expectedEndingValue) + this.leaseFee;
    }

    @Override
    public double getMonthlyPayment() {

        double rate = .04;;
        int months = 36;
        double vehiclePrice = getVehicleSold().getPrice();

        double monthlyRate = rate / 12; // Assuming rate is APR

        return (vehiclePrice * monthlyRate) / (1 - Math.pow(1 + monthlyRate, -months));
    }
}
