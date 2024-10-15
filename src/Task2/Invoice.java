package Task2;

public class Invoice {
    // Atributele clasei
    private String model;
    private String description;
    private int quantity;
    private double pricePerUnit;

    // Constructor care inițializează toate atributele
    public Invoice(String model, String description, int quantity, double pricePerUnit) {
        this.model = model;
        this.description = description;
        setQuantity(quantity); // folosim setter pentru validare
        setPricePerUnit(pricePerUnit); // folosim setter pentru validare
    }

    // Getter pentru model
    public String getModel() {
        return model;
    }

    // Setter pentru model
    public void setModel(String model) {
        this.model = model;
    }

    // Getter pentru description
    public String getDescription() {
        return description;
    }

    // Setter pentru description
    public void setDescription(String description) {
        this.description = description;
    }

    // Getter pentru quantity
    public int getQuantity() {
        return quantity;
    }

    // Setter pentru quantity (cu validare)
    public void setQuantity(int quantity) {
        if (quantity > 0) {
            this.quantity = quantity;
        } else {
            this.quantity = 0; // cantitatea trebuie să fie pozitivă, altfel 0
        }
    }

    // Getter pentru pricePerUnit
    public double getPricePerUnit() {
        return pricePerUnit;
    }

    // Setter pentru pricePerUnit (cu validare)
    public void setPricePerUnit(double pricePerUnit) {
        if (pricePerUnit > 0) {
            this.pricePerUnit = pricePerUnit;
        } else {
            this.pricePerUnit = 0.0; // prețul trebuie să fie pozitiv, altfel 0.0
        }
    }

    // Metoda care calculează suma facturii
    public double getAmount() {
        return quantity * pricePerUnit; // Cantitate * Preț per unitate
    }

    // Metodă pentru afișarea detaliilor facturii
    public void displayInvoice() {
        System.out.println("Model: " + model);
        System.out.println("Descriere: " + description);
        System.out.println("Cantitate: " + quantity);
        System.out.println("Preț per unitate: " + pricePerUnit);
        System.out.println("Suma totală: " + getAmount());
    }
}

