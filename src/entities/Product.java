package entities;

public class Product {
    private int nameProduct;
    private int quantiProduct;
    private double price;

    public Product() {
    }

    public Product(int nameProduct, int quantiProduct, double price) {
        this.nameProduct = nameProduct;
        this.quantiProduct = quantiProduct;
        this.price = price;
    }

    public int getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(int nameProduct) {
        this.nameProduct = nameProduct;
    }

    public int getQuantiProduct() {
        return quantiProduct;
    }

    public void setQuantiProduct(int quantiProduct) {
        this.quantiProduct = quantiProduct;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return nameProduct +" ,"+ quantiProduct +" ,"+ price+"\n";
    }
}
