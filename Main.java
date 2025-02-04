public class Main {
    public static void main(String[] args) {
        javax.swing.JFrame frame = new javax.swing.JFrame("3 person chess");
        frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(800, 600);
        frame.setVisible(true);
        mainMenu(frame);
    }

    public static void mainMenu(javax.swing.JFrame frame) {
        javax.swing.JPanel panel = new javax.swing.JPanel();
        panel.setLayout(new java.awt.GridBagLayout());
        javax.swing.JButton button = new javax.swing.JButton("Play");
        panel.add(button);
        frame.getContentPane().removeAll();
        frame.getContentPane().add(panel);
        frame.revalidate();
        frame.repaint();
    }
}

