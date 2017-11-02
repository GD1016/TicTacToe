import java.awt.*;

public class Gamefield {

    private Player[][] gameField = new Player[TTT.gameDimension][TTT.gameDimension];

    public void draw(Graphics g) {
        int gfmul2 = TTT.gamefieldDimension * 2;
        int gfmul3 = TTT.gamefieldDimension * 3;
        g.drawLine(TTT.gamefieldDimension, 0, TTT.gamefieldDimension, gfmul3);
        g.drawLine(gfmul2, 0, gfmul2, gfmul3);
        g.drawLine(0, TTT.gamefieldDimension, gfmul3, TTT.gamefieldDimension);
        g.drawLine(0, gfmul2, gfmul3, gfmul2);

        for (int i = 0; i < TTT.gameDimension; i++) {
            for (int j = 0; j < TTT.gameDimension; j++) {
                if (gameField[i][j] != null) {
                    gameField[i][j].draw(g, i, j);
                }
            }
        }
    }

    public Player get(int x, int y){
        return gameField[x][y];
    }

    public void set(int x, int y, Player player){
        gameField[x][y] = player;
    }
}
