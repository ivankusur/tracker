package pojo;

public class Shop {
    public static int indexOfNull(Product[] products) {
        int rsl = -1;
        for (int i = 0; i < products.length; i++) {
            if (products[i] == null) {
                rsl = i;
                break;
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        Product[] goods = new Product[5];
        goods[0] = new Product("Milk", 10);
        goods[1] = new Product("Bread", 4);
        goods[2] = new Product("Egg", 19);
        System.out.println("Index of first element with NULL in array is : "
                + Shop.indexOfNull(goods));
    }
}
