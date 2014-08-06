import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class PuzzleTest {
    Puzzle.Piece piece1 = new Puzzle.Piece(new Puzzle.Type[] {Puzzle.Type.BarTender, Puzzle.Type.WineBottle, Puzzle.Type.Man, Puzzle.Type.Band});
    Puzzle.Piece piece2 = new Puzzle.Piece(new Puzzle.Type[] {Puzzle.Type.BarTender, Puzzle.Type.Band, Puzzle.Type.Man, Puzzle.Type.WineBottle});
    Puzzle.Piece piece3 = new Puzzle.Piece(new Puzzle.Type[] {Puzzle.Type.BarTender, Puzzle.Type.IHeartBeer, Puzzle.Type.Man, Puzzle.Type.Band});
    Puzzle.Piece piece4 = new Puzzle.Piece(new Puzzle.Type[] {Puzzle.Type.Man, Puzzle.Type.IHeartBeer, Puzzle.Type.BarTender, Puzzle.Type.Band});

    Puzzle.Piece awesomePiece = new Puzzle.Piece(new Puzzle.Type[] {Puzzle.Type.Man, Puzzle.Type.Man, Puzzle.Type.Man, Puzzle.Type.Man});

    @Test public void
    twoMatchedPiecesScoreOne() {
        Puzzle.Arrangement a = new Puzzle.Arrangement(new Puzzle.RotatedPiece[]{new Puzzle.RotatedPiece(piece1, 0), new Puzzle.RotatedPiece(piece2, 0)});
        Assert.assertEquals(1, a.score());
    }

    @Test public void
    twoUnmatchedPiecesScoreTwo() {
        Puzzle.Arrangement a = new Puzzle.Arrangement(new Puzzle.RotatedPiece[]{new Puzzle.RotatedPiece(piece1, 0), new Puzzle.RotatedPiece(piece1, 0)});
        Assert.assertEquals(0, a.score());
    }

    @Test public void
    threeMatchedPiecesScoreTwo() {
        Puzzle.Arrangement a = new Puzzle.Arrangement(new Puzzle.RotatedPiece[]{new Puzzle.RotatedPiece(piece1, 0), new Puzzle.RotatedPiece(piece2, 0), new Puzzle.RotatedPiece(piece3, 0)});
        Assert.assertEquals(2, a.score());
    }

    @Test public void
    fourMatchedPiecesScoreThree() {
        Puzzle.Arrangement a = new Puzzle.Arrangement(new Puzzle.RotatedPiece[]{new Puzzle.RotatedPiece(piece1, 0), new Puzzle.RotatedPiece(piece2, 0), new Puzzle.RotatedPiece(piece3, 0), new Puzzle.RotatedPiece(piece4, 0)});
        Assert.assertEquals(3, a.score());
    }

    @Test public void
    nineMatchedPiecesScoreTwelve() {
        Puzzle.RotatedPiece[] arrangement = new Puzzle.RotatedPiece[9];
        Arrays.fill(arrangement, new Puzzle.RotatedPiece(awesomePiece, 0));

        Puzzle.Arrangement a = new Puzzle.Arrangement(arrangement);
        Assert.assertEquals(12, a.score());
    }

    @Test public void
    rotatingRockzYo() {
        Assert.assertArrayEquals(new Puzzle.Type[] {Puzzle.Type.WineBottle, Puzzle.Type.Man, Puzzle.Type.Band, Puzzle.Type.BarTender},
                                 new Puzzle.RotatedPiece(piece1, 1).faces());
    }

}