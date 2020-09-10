package oop;

public class Battery {
    private int load;

    public Battery(int load) {
        this.load = load;
    }

    public void exchenge(Battery another) {
        this.load = this.load - another.load;
        another.load = 0;
    }

    public static void main(String[] args) {
        Battery poweBank = new Battery(10000);
        Battery cellphone = new Battery(4000);
        poweBank.exchenge(cellphone);
        System.out.println(poweBank.load);

    }
}
