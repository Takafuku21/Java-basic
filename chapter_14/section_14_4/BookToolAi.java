package chapter_14.section_14_4;

public class BookToolAi {
    public static int addPages(int first, int second) {
        return first + second;
    }

    public static int calculateDays(int pages, int pagesPerDay) {
        return pages / pagesPerDay;
    }

    public static void main(String[] args) {
        int totalPages = addPages(320, 180);
        int days = calculateDays(totalPages, 30);

        System.out.println("2冊で " + totalPages + " ページ");
        System.out.println("1日30ページなら " + days + " 日");
    }
}
