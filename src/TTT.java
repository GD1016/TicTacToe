import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class TTT extends JApplet implements MouseListener {

    public static final int gameDimension = 3;
    public static final int gamefieldDimension = 300;

    private PlayerX playerX = new PlayerX();
    private PlayerO playerO = new PlayerO();
    private Gamefield gameField = new Gamefield();
    private Player aktuellerSpieler = playerX;

    @Override
    public void init() {
        this.setSize(gamefieldDimension * gameDimension, gamefieldDimension * gameDimension);
        this.addMouseListener(this);
    }

    @Override
    public void start() {

    }

    @Override
    public void paint(Graphics g) {
        gameField.draw(g);

        this.repaint();
    }

    public Player hatGewonnen() {
        for (int i = 0; i < gameDimension; i++) {
            if ((gameField.get(0, i) == gameField.get(1, i)) && (gameField.get(2, i) == aktuellerSpieler) && (gameField.get(1, i) == aktuellerSpieler))
                return aktuellerSpieler;
        }
        for (int i = 0; i < gameDimension; i++) {
            if ((gameField.get(i, 0) == gameField.get(i, 1)) && (gameField.get(i, 2) == aktuellerSpieler) && (gameField.get(i, 1) == aktuellerSpieler))
                return aktuellerSpieler;
        }
        if ((gameField.get(0, 0) == gameField.get(1, 1)) && (gameField.get(2, 2) == aktuellerSpieler) && (gameField.get(1, 1) == aktuellerSpieler))
            return aktuellerSpieler;

        if ((gameField.get(2, 0) == gameField.get(1, 1)) && (gameField.get(0, 2) == aktuellerSpieler) && (gameField.get(1, 1) == aktuellerSpieler))
            return aktuellerSpieler;
        return null;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        int x = e.getX() / gamefieldDimension;
        int y = e.getY() / gamefieldDimension;
        if (gameField.get(x, y) == null) {
            gameField.set(x, y, aktuellerSpieler);

            if (hatGewonnen() != null)
                JOptionPane.showMessageDialog(this, "Gewonnen hat: Spieler " + hatGewonnen() + " o/");
            if (aktuellerSpieler == playerX)
                aktuellerSpieler = playerO;
            else
                aktuellerSpieler = playerX;
        }
        this.repaint();
        this.revalidate();
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
