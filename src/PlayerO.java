import java.awt.*;

public class PlayerO extends Player {
    @Override
    public void draw(Graphics g, int x, int y) {
        g.drawOval(x*TTT.gamefieldDimension, y*TTT.gamefieldDimension, TTT.gamefieldDimension, TTT.gamefieldDimension);

    }

    @Override
    public String toString() {
        return "O";
    }
}
