package pojo;

public class Library {
    public static void main(String[] args) {
        Book cleanCode = new Book("Clean Code", 200);
        Book javaEffectiveProgramming = new Book("Java Effective Programming", 350);
        Book headFirstJava = new Book("Head First Java", 320);
        Book thinkingInJava = new Book("Thinking in Java", 360);

        Book[] javaBooks = {cleanCode, javaEffectiveProgramming, headFirstJava, thinkingInJava};

        for (int i = 0; i < javaBooks.length; i++) {
            Book books = javaBooks[i];
            System.out.println(books.getName() + ": " + books.getNumbersOfPages());
        }
        System.out.println();

        Book temp = new Book("", 1);
        temp = javaBooks[3];
        javaBooks[3] = javaBooks[0];
        javaBooks[0] = temp;
        for (int i = 0; i < javaBooks.length; i++) {
            Book books = javaBooks[i];
            System.out.println(books.getName() + ": " + books.getNumbersOfPages());
        }
        System.out.println();

        for (int i = 0; i < javaBooks.length; i++) {
            Book books = javaBooks[i];
            if (javaBooks[i].equals(cleanCode)) {
                System.out.println(books.getName() + ": " + books.getNumbersOfPages());
            }
        }
    }
}
