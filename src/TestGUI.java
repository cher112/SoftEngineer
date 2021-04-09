import javax.swing.*;

public class TestGUI {
    private JPanel panel1;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JScrollBar scrollBar1;
    private JButton button4;
    private JCheckBox checkBox1;
    private JCheckBox checkBox2;

    public static void main(String[] args) {
//        try {
//            UIManager.setLookAndFeel("com.birosoft.liquid.LiquidLookAndFeel");
//        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
//            e.printStackTrace();
//        }

        JFrame frame = new JFrame("TestGUI");
        frame.setContentPane(new TestGUI().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
