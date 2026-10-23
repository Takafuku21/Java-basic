package chapter_18.section_18_6;

public class RunnerAi {
    public static void main(String[] args) {
        LogBookAi firstBook = new LogBookAi("はじめてのJava");
        firstBook.addRead(75);

        ShelfAi shelf = new ShelfAi();
        shelf.keep(firstBook);
        shelf.latest().show();

        LogBookAi sameBook = firstBook;
        sameBook.addRead(25);
        firstBook.show();
    }
}
