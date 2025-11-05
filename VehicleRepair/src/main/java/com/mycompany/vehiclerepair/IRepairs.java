package com.mycompany.vehiclerepair;

public interface IRepairs {
    double RepairCosts(double[] repairCosts);
    double TechnicianPay(double amount);
    int TopTechnician(double[] repairs);
};