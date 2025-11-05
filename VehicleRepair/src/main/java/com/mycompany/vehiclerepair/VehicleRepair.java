package com.mycompany.vehiclerepair;

import java.util.Scanner;

public class VehicleRepair {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Repairs repairs = new Repairs();
        String[] technicians = {
            "Joe Bloggs",
            "Jane Doe"
        };
        
        String[] months = {
            "JAN",
            "FEB",
            "MAR"
        };
        
        double[][] vehicleRepairAmounts = new double[technicians.length][months.length];
        
        double[] totals = new double[technicians.length];
        
        for (int i = 0; i < technicians.length; i++) {
            System.out.println("Enter repair amounts for " + technicians[i]);
            for (int j = 0; j < months.length; j++) {
                System.out.print(months[j] + ": R ");
                vehicleRepairAmounts[i][j] = scanner.nextDouble();
            }
        }
        
        System.out.println("--------- TECHNICIAN VEHICLE REPAIR REPORT ------------");
        for (int i = 0; i < vehicleRepairAmounts.length; i++) {
            System.out.println("Technician: " + technicians[i]);

            for (int j = 0; j < vehicleRepairAmounts[i].length; j++) {
                System.out.println(months[j] + ": " + vehicleRepairAmounts[i][j]);
            }
            System.out.println("------------------");
            System.out.println("Total Repairs: " + repairs.RepairCosts(vehicleRepairAmounts[i]));
            System.out.println("------------------");
            System.out.println("Technician Pay: " + repairs.TechnicianPay(repairs.RepairCosts(vehicleRepairAmounts[i])));
            System.out.println("------------------");
            
            totals[i] = repairs.RepairCosts(vehicleRepairAmounts[i]);
        }
        
        int topIndex = repairs.TopTechnician(totals);
        System.out.println("Top performing vehicle repair technician: " + technicians[topIndex]);
    }
}
