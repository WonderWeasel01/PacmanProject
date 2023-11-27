import javax.swing.*;
import java.awt.*;

public class GameBoard extends JPanel {

    private boolean showPacman;
    int PacmanX = Pacman.getX();
    int PacmanY = Pacman.getY();


    public GameBoard() {
        JFrame f = new JFrame("Pacman Game");
        f.setLayout(null);
        f.add(this);
        f.setSize(750, 750);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Initialize the boolean variable
        showPacman = true;
    }

    // Method to toggle the value of the boolean variable
    public void togglePacman() {
        showPacman = !showPacman;
        repaint(); // Request a repaint to update the display
    }

    public void paint(Graphics g) {
        super.paint(g);

        g.setColor(Color.YELLOW);
        g.fillArc(pacmanX., pacmanY, 30, 30, 45 * pacmanDirection, 270);

        g.setColor(Color.RED);
        g.fillOval(ghost.x, ghost.y, 30, 30);

        g.setColor(Color.BLUE);
        for (Point pellet : pellets) {
            g.fillOval(pellet.x, pellet.y, 10, 10);
        }

        Toolkit.getDefaultToolkit().sync();
    }

    public static void main(String args[]) {
        SwingUtilities.invokeLater(() -> {
            GameBoard gameBoard = new GameBoard();
            // Example of toggling the Pacman image with a delay (adjust as needed)
            Timer timer = new Timer(0, e -> gameBoard.togglePacman());
            timer.setRepeats(false); // Run only once
            timer.start();
        });
    }
}
