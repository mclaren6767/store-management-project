public class Grocery extends Product {
private String expirationDate; // unique to Grocery

public Grocery() {
super();
this.expirationDate = "Unknown";
}

public Grocery(String name, double price, int stock, String expirationDate) {
super(name, price, stock);
this.expirationDate = expirationDate;
}

public String getExpirationDate() {
return expirationDate;
}

public void setExpirationDate(String expirationDate) {
this.expirationDate = expirationDate;
}

public String toString() {
return super.toString() + " | Expiration: " + expirationDate;
}
}