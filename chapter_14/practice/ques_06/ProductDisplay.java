package chapter_14.practice.ques_06;

public class ProductDisplay {
    public static void showProduct(String name, int price) {
        System.out.println(name + " は " + price + " 円");
    }

    public static void main(String[] args) {
        showProduct("ノート", 150);
        showProduct("ペン", 100);
    }
}
