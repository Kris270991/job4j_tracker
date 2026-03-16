package ru.job4j.pojo;

public class ShopDrop {

    public static Product[] delete(Product[] products, int index) {
        for (int i = 0; i < products.length; i++) {
            if (i == index) {
                for (int j = i; j < products.length - 1; j++) {
                    products[j] = products[j + 1];
                }
            }
        }
        products[products.length - 1] = null;
        return products;
    }

    public static void main(String[] args) {
        Product[] products = new Product[3];
        products[0] = new Product("Milk", 10);
        products[1] = new Product("Bread", 4);
        products[2] = new Product("Egg", 19);
        products = delete(products, 1);
        for (Product product : products) {
            if (product != null) {
                System.out.println(product.getName());
            }
        }
    }
}
