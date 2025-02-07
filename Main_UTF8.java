import java.io.File;

public class Main {
    public static String[][] red = new String[4][8];
    public static String[][] black = new String[4][8];
    public static String[][] white = new String[4][8];

    static {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 8; j++) {
                red[i][j] = "";
                black[i][j] = "";
                white[i][j] = "";
            }
        }
    }

    public static void main(String[] args) {
        startGame();
        displayBoard("red");
    }

    public static void displayBoard(String perspective) {
        String[][] displayer = new String[12][8];
        switch (perspective) {
            case "red":
                displayer[8] = red[0];
                displayer[9] = red[1];
                displayer[10] = red[2];
                displayer[11] = red[3];
                break;
            case "black":
                break;
            case "white":
                displayer = white;
                break;
        }
        // load interface.txt to string
        try {
            File file = new File("interface.txt");
            String[] lines = file.readLines();
            for (int i = 0; i < lines.length; i++) {
                displayer[i] = lines[i].split(" ");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(displayer[i][j]);
            }
            System.out.println();
        }
    }

    public static void startGame() {
        red = new String[][]{
            {"rr", "rh", "rb", "rq", "rk", "rb", "rh", "rr"},
            {"rp", "rp", "rp", "rp", "rp", "rp", "rp", "rp"},
            {"", "", "", "", "", "", "", ""},
            {"", "", "", "", "", "", "", ""}
        };
        black = new String[][]{
            {"br", "bh", "bb", "bq", "bk", "bb", "bh", "br"},
            {"bp", "bp", "bp", "bp", "bp", "bp", "bp", "bp"},
            {"", "", "", "", "", "", "", ""},
            {"", "", "", "", "", "", "", ""}
        };
        white = new String[][]{
            {"wr", "wh", "wb", "wq", "wk", "wb", "wh", "wr"},
            {"wp", "wp", "wp", "wp", "wp", "wp", "wp", "wp"},
            {"", "", "", "", "", "", "", ""},
            {"", "", "", "", "", "", "", ""}
        };
    }
}
// 