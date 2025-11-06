package com.mycompany.vehiclerepair;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RepairsTest {
    final private Repairs repairs = new Repairs();
    final private double[][] repairAmounts = {
        { 8000, 2500, 3000 },
        { 5000, 8000, 4500 }
    };
    final private double[] repairTotals = new double[repairAmounts.length];

    @Test
    public void CalculateCosts_ReturnRepairCosts() {
        double total = repairs.RepairCosts(repairAmounts[0]);

        assertEquals(13500.00, total);
    }
    
    @Test
    public void CalculatePay_ReturnsExpectedPay() {
        double total = repairs.TechnicianPay(repairs.RepairCosts(repairAmounts[0]));
        
        assertEquals(1350.00, total);
    }
    
    @Test
    public void TopTechnician_ReturnsTopPosition() {
        for (int i = 0; i < repairAmounts.length; i++) {
            repairTotals[i] = repairs.RepairCosts(repairAmounts[i]);
        }
        
        int topIndex = repairs.TopTechnician(repairTotals);
        
        assertEquals(1, topIndex);
        
    }
}
