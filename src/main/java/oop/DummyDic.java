package oop;

public class DummyDic {
    public String engToRus(String eng) {
        return "Neizvestnoe slovo" + eng;
    }
    public static void main(String[] args) {
        DummyDic word = new DummyDic();
        System.out.println(word.engToRus(" " + "Excellent"));
    }
}