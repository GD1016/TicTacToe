import java.awt.*;

public class PlayerX extends Player {
    @Override
    public void draw(Graphics g, int x, int y) {
        int gfx = x * TTT.gamefieldDimension;
        int gfy = y * TTT.gamefieldDimension;
            g.drawLine(gfx, gfy, gfx + TTT.gamefieldDimension, gfy + TTT.gamefieldDimension);
            g.drawLine(gfx + TTT.gamefieldDimension, gfy, gfx, gfy + TTT.gamefieldDimension);
    }

    @Override
    public String toString() {
        return "X";
    }
}
