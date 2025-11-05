package com.mycompany.vehiclerepair;

public class Repairs implements IRepairs {
    @Override
    public double RepairCosts(double[] repairCosts) {
        double totalRepairCosts = 0;
        for (int i = 0; i < repairCosts.length; i++) {
            totalRepairCosts += repairCosts[i];
        }
        
        return totalRepairCosts;
    }
    
    @Override
    public double TechnicianPay(double amount) {
        return amount * 0.10;
    }
    
    @Override
    public int TopTechnician(double[] repairs) {
        int highestTechnicianIndex = 0;
        double highestTechnicianPay = repairs[0];
        
        for (int i = 1; i < repairs.length; i++) {
            if (repairs[i] > highestTechnicianPay) {
                highestTechnicianPay = repairs[i];
                highestTechnicianIndex = i;
            }
        }
        
        return highestTechnicianIndex;
    }
}
