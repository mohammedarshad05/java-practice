package com.techsmart.appx.sales;

public class Invoice {
    public String invoiceNumber;
    public double Amount;
    public String customerName;
    public double payment;

    public Invoice(String invoiceNumber, double amount, String name, double payment) {
        this.invoiceNumber = invoiceNumber;
        this.Amount = amount;
        this.customerName = name;
        this.payment = payment;
    }
    
    public void displayInvoice() {
        System.out.println("Invoice Details:");
        System.out.println("===================================");
        System.out.println("Invoice Number: " + invoiceNumber);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Amount: " + Amount);
        System.out.println("Payment: " + payment);
    }

}
