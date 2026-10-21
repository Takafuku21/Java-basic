public class Item { // クラス（プログラムのまとまり）の名前を Item にする
    public static void main(String[] args) { // main（実行すると最初に動く部分）を始める
        String title = "Todo"; // String（文字を入れる型）の変数（名前付きの入れ物）を作る
        String html = "<li>" + title + "</li>"; // + でつなぎ、HTML（画面表示用の書き方）の1行を作る
        boolean done = false;
        int count = 3;
        System.out.println("いま" + count + "件");
        System.out.println("完了: " + done);
        System.out.println(html); // ターミナル（文字を表示する画面）に1行出す
    } // main を終える
} // クラスを終える
