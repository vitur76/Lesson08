import Task1.Employee;
import Task2.Invoice;
import Task3.Date;

public class Main {
    public static void main(String[] args) {
        // ************* Task 1
        Employee employee = new Employee("vvv nnn", 300, "HR");

        employee.displayEmployeeInfo();

        employee.setAge(35);
        employee.setDepartment("Finance");

        employee.displayEmployeeInfo();

        //***************Task 2
        Invoice invoice = new Invoice("masina de spalat", "Sharp", 6, 1500.75);

        invoice.displayInvoice();

        invoice.setQuantity(-30); // Cantitate invalidă
        invoice.setPricePerUnit(-100.50); // Preț invalid

        invoice.displayInvoice();

        //************** Task3
        // Crearea unui obiect Date cu date valide
        Date date = new Date(15, 10, 2024);
        // Afișarea datei
        date.displayDate();

        // Setare de date invalide pentru a testa validarea
        date.setDay(32);  // Zi invalidă
        date.setMonth(13);  // Lună invalidă
        date.setYear(-2020);  // An invalid

        // Afișarea datei actualizate
        date.displayDate();
    }
}
