public class Product {
// Instance variables shared by all products
private String name;
private double price;
private int stock;

// No-argument constructor
public Product() {
this.name = "Unknown";
this.price = 0.0;
this.stock = 0;
}

// Parameterized constructor
public Product(String name, double price, int stock) {
this.name = name;
this.price = price;
this.stock = stock;
}

// Accessor (getter) methods
public String getName() {
return name;
}

public double getPrice() {
return price;
}

public int getStock() {
return stock;
}

// Mutator (setter) methods
public void setName(String name) {
this.name = name;
}

public void setPrice(double price) {
this.price = price;
}

public void setStock(int stock) {
this.stock = stock;
}

// toString method
public String toString() {
return "Product: " + name + " | Price: $" + price + " | Stock: " + stock;
}
}

