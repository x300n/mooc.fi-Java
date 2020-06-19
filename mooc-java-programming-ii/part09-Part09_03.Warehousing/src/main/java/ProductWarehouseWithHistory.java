/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author xeon
 */
public class ProductWarehouseWithHistory extends ProductWarehouse {
    
    private ChangeHistory chngHist = new ChangeHistory();
    
    public ProductWarehouseWithHistory(String productName, double capacity, 
            double initialBalance) {
        super(productName, capacity);
        super.addToWarehouse(initialBalance);
        this.chngHist.add(initialBalance);
    }
    
    public void addToWarehouse(double amount) {
        super.addToWarehouse(amount);
        this.chngHist.add(super.getBalance());
    }
    
    public double takeFromWarehouse(double amount) {
        if(amount <= super.getBalance()) {
            super.takeFromWarehouse(amount);
            this.chngHist.add(super.getBalance());
            return amount;
        }
        return super.getBalance();
    }
    
    public void printAnalysis() {
        System.out.println("Product: " + super.getName());
        System.out.println("History: " + chngHist.toString());
        System.out.println("Largest amount of product: " + chngHist.maxValue());
        System.out.println("Smallest amount of product: " + chngHist.minValue());
        System.out.println("Average: " + chngHist.average());
    }
    
    public String history() {
        return chngHist.toString();
    }
}
