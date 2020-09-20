package pojo;

public class Library {
    public static void main(String[] args) {
        Book cleanCode = new Book("Clean Code", 200);
        Book javaEffectiveProgramming = new Book("Java Effective Programming", 350);
        Book headFirstJava = new Book("Head First Java", 320);
        Book thinkingInJava = new Book("Thinking in Java", 360);

        Book[] javaBooks = {cleanCode, javaEffectiveProgramming, headFirstJava, thinkingInJava};

        for (Book books : javaBooks) {
            System.out.println(books.getName() + ": " + books.getNumbersOfPages());
        }
        System.out.println();

        Book temp;
        temp = javaBooks[3];
        javaBooks[3] = javaBooks[0];
        javaBooks[0] = temp;
        for (Book books : javaBooks) {
            System.out.println(books.getName() + ": " + books.getNumbersOfPages());
        }
        System.out.println();

        for (Book books : javaBooks) {
            if (books.equals(cleanCode)) {
                System.out.println(books.getName() + ": " + books.getNumbersOfPages());
            }
        }
    }
}
