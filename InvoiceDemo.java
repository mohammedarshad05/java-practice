import com.techsmart.appx.sales.Invoice;

public class InvoiceDemo {
    public static void main(String[] args) {
        Invoice invoice = new Invoice("#2001", 4000.0, "mohammed abban", 2500.0);
        invoice.displayInvoice();
    }
}
