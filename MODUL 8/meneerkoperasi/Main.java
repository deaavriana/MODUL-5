package meneerkoperasi;

public class Main {
    public static void main(String[] args) {

        Invoice[] invoices = {
                new Invoice("Beras", 2, 12000),
                new Invoice("Minyak", 1, 15000),
                new Invoice("Gula", 3, 10000)
        };

        Employee emp = new Employee(101, "Budi", 500000, invoices);

        emp.displayEmployee();
    }
}
