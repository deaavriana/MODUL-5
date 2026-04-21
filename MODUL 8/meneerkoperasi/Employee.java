package meneerkoperasi;

public class Employee implements Payable {
    private int registrationNumber;
    private String name;
    private int salaryPerMonth;
    private Invoice[] invoices;

    public Employee(int registrationNumber, String name, int salaryPerMonth, Invoice[] invoices) {
        this.registrationNumber = registrationNumber;
        this.name = name;
        this.salaryPerMonth = salaryPerMonth;
        this.invoices = invoices;
    }

    public double getTotalInvoice() {
        double total = 0;
        for (Invoice inv : invoices) {
            total += inv.getPayableAmount();
        }
        return total;
    }

    @Override
    public double getPayableAmount() {
        return salaryPerMonth - getTotalInvoice();
    }

    public void displayEmployee() {
        System.out.println("=========== DATA KARYAWAN ===========");
        System.out.println("No Registrasi : " + registrationNumber);
        System.out.println("Nama          : " + name);
        System.out.printf("Gaji Awal     : Rp %,d%n%n", salaryPerMonth);

        System.out.println("------------------------------------");
        System.out.println("        DETAIL BELANJA KOPERASI");
        System.out.println("------------------------------------");

        for (int i = 0; i < invoices.length; i++) {
            invoices[i].printInvoice(i + 1);
        }

        System.out.println("------------------------------------");
        System.out.printf("Total Belanja        : Rp %,d%n", (int) getTotalInvoice());
        System.out.printf("Gaji Setelah Potongan: Rp %,d%n", (int) getPayableAmount());
        System.out.println("====================================");
    }
}