package mvc.models;

public class Candy {
    private String name;
    private double price;

    public Candy(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Candy() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Candy{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
