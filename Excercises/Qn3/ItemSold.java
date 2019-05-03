package Qn3;
import java.util.Scanner;

public class ItemSold {
    String description;
    int invoiceNum, price;
    Scanner scan = new Scanner(System.in);

    public int getInvoiceNum() {
        return invoiceNum;
    }
    public void setInvoiceNum() {
        System.out.println("What is the invoice number: ");
        invoiceNum = scan.nextInt();
    }

    public String getDescription() {
        return description;
    }
    public void setDescription() {
        System.out.println("Describe the item: ");
        description = scan.nextLine();
    }

    public int getPrice() {
        return price;
    }
    public void setPrice() {
        System.out.println("What is the price: ");
        price = scan.nextInt();
    }
}
