package chapter_17.section_17_4;

public class RunnerAi {
    public static void main(String[] args) {
        LogBookAi firstLogBook = new LogBookAi();
        firstLogBook.title = "はじめてのJava";
        firstLogBook.addRead(75);

        LogBookAi secondLogBook = new LogBookAi();
        secondLogBook.title = "やさしいSQL";
        secondLogBook.addRead(20);

        firstLogBook.show();
        secondLogBook.show();
    }
}
