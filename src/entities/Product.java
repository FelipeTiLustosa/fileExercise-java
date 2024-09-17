package entities;

public class Product {
    private String nameProduct;
    private int quantiProduct;
    private double price;

    public Product() {
    }

    public Product(String nameProduct, double price,int quantiProduct) {
        this.nameProduct = nameProduct;
        this.quantiProduct = quantiProduct;
        this.price = price;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
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
    public  double multPrice(double price,int quantiProduct){
        return price*quantiProduct;
    }
    @Override
    public String toString() {
        return nameProduct +","+String.format("%.2f",multPrice(getPrice(),getQuantiProduct()));
    }
}
