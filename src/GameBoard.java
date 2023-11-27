import javax.swing.*;
import java.awt.*;

public class GameBoard extends JPanel {

    private Pacman pacman;
    private boolean showPacman;

    public GameBoard() {
        JFrame f = new JFrame("Pacman");
        f.setLayout(null);
        f.add(this);
        f.setSize(750, 750);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        showPacman = true;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        if (showPacman) {
            // Load the Pacman image
            ImageIcon pacmanIcon = new ImageIcon("pacman.png"); // Replace "pacman.png" with the path to your image file

            // Draw the Pacman image at a specific position (adjust as needed)
            int x = 100;
            int y = 100;
            g.drawImage(pacmanIcon.getImage(), x, y, this);
        }
    }



    public static void main(String args[]) {
        SwingUtilities.invokeLater(() -> new GameBoard());
    }
}
