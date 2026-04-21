package meneerkoperasi;

public class Invoice implements Payable {
    private String productName;
    private int quantity;
    private int pricePerItem;

    public Invoice(String productName, int quantity, int pricePerItem) {
        this.productName = productName;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }

    public double getTotal() {
        return quantity * pricePerItem;
    }

    @Override
    public double getPayableAmount() {
        return getTotal();
    }

    public void printInvoice(int index) {
        System.out.printf("%d. Produk : %s%n", index, productName);
        System.out.printf("   Qty    : %d%n", quantity);
        System.out.printf("   Harga  : Rp %,d%n", pricePerItem);
        System.out.printf("   Total  : Rp %,d%n%n", (int) getTotal());

    }
}
