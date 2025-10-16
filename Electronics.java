public class Electronics extends Product {
private int warrantyMonths; // Unique to Electronics

// No-argument constructor
public Electronics() {
super();
this.warrantyMonths = 0;
}

// Parameterized constructor
public Electronics(String name, double price, int stock, int warrantyMonths) {
super(name, price, stock);
this.warrantyMonths = warrantyMonths;
}

// Accessor and Mutator
public int getWarrantyMonths() {
return warrantyMonths;
}

public void setWarrantyMonths(int warrantyMonths) {
this.warrantyMonths = warrantyMonths;
}

// toString()
public String toString() {
return super.toString() + " | Warranty: " + warrantyMonths + " months";
}
}