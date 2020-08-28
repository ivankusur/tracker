package oop;

public class Cats {
    private String food;
    private String name;

    public void show() {
        System.out.println(this.name);
        System.out.println(this.food);
    }

    public void giveNick(String nick) {
        this.name = nick;
    }

    public void eat(String meat) {
        this.food = meat;
    }

    public static void main(String[] args) {
        System.out.println("There are foods for .");
        Cats catFirst = new Cats();
        catFirst.giveNick("gav");
        catFirst.eat("kotleta");
        catFirst.show();

        System.out.println("There are foods for .");
        Cats catSecond = new Cats();
        catSecond.giveNick("black");
        catSecond.eat("fish");
        catSecond.show();
    }
}
