package oop;

public class Battery {
    private int load;

    public Battery(int load) {
        this.load = load;
    }

    public void exchange(Battery another) {
        another.load = this.load + another.load;
        this.load = 0;
    }

    public static void main(String[] args) {
        Battery cellphone = new Battery(1000);
        Battery powerBank = new Battery(2000);
        powerBank.exchange(cellphone);
        System.out.println("PowerBank Load:" + powerBank.load);
        System.out.println("CellPhone Load:" + cellphone.load);
    }
}
