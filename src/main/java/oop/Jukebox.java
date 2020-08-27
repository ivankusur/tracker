package oop;

public class Jukebox {

    public void music(int position){
        if(position == 1) {
            System.out.println("Pust begut neuklugi");
        }
        if (position == 2) {
            System.out.println("Spokoinoi nochi");
        } if (position != 1 & position != 2){
            System.out.println("Sing not found");
        }
    }

    public static void main(String[] args) {
        Jukebox relax = new Jukebox();
        relax.music(1);
        relax.music(2);
        relax.music(5);
    }
}
