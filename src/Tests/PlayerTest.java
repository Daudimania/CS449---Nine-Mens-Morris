package Tests;

import game.logic.PlayerToken;
import game.logic.*;
import junit.framework.TestCase;

public class PlayerTest extends TestCase{
    private Player player1;
    private Player player2;
    protected void setUp(){
        player1 = new Player(PlayerToken.PLAYER1, 9);
        player2 = new Player(PlayerToken.PLAYER2, 9);
    }
    public void testCorrectPlayerReturned(){
        assertEquals(PlayerToken.PLAYER1, player1.getPlayerToken());
        assertEquals(PlayerToken.PLAYER2, player2.getPlayerToken());
    }
    public void testNumPlayerPiecesLeft(){
        assertEquals(9, player1.getPiecesLeft());
        assertEquals(9, player2.getPiecesLeft());
        player1.decrementPiecesLeft();
        player2.decrementPiecesLeft();
        assertEquals(8, player1.getPiecesLeft());
        assertEquals(8, player2.getPiecesLeft());
    }

    public void testNoMorePiecesCanBePlaced(){
        for(int x = 0; x < 9; x++){
            player1.incrementPiecesOnBoard();
            player2.incrementPiecesOnBoard();
        }
        assertEquals(9, player1.getPiecesOnBoard());
        assertEquals(9, player2.getPiecesOnBoard());
    }
}
