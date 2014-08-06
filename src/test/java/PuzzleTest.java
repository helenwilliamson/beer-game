import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class PuzzleTest {
    Piece piece1 = new Piece(new Type[] {Type.BarTender, Type.WineBottle, Type.Man, Type.Band});
    Piece piece2 = new Piece(new Type[] {Type.BarTender, Type.Band, Type.Man, Type.WineBottle});
    Piece piece3 = new Piece(new Type[] {Type.BarTender, Type.IHeartBeer, Type.Man, Type.Band});
    Piece piece4 = new Piece(new Type[] {Type.Man, Type.IHeartBeer, Type.BarTender, Type.Band});

    Piece awesomePiece = new Piece(new Type[] {Type.Man, Type.Man, Type.Man, Type.Man});

    @Test public void
    twoMatchedPiecesScoreOne() {
        Arrangement a = new Arrangement(new RotatedPiece[]{new RotatedPiece(piece1, 0), new RotatedPiece(piece2, 0)});
        Assert.assertEquals(1, a.score());
    }

    @Test public void
    twoUnmatchedPiecesScoreTwo() {
        Arrangement a = new Arrangement(new RotatedPiece[]{new RotatedPiece(piece1, 0), new RotatedPiece(piece1, 0)});
        Assert.assertEquals(0, a.score());
    }

    @Test public void
    threeMatchedPiecesScoreTwo() {
        Arrangement a = new Arrangement(new RotatedPiece[]{new RotatedPiece(piece1, 0), new RotatedPiece(piece2, 0), new RotatedPiece(piece3, 0)});
        Assert.assertEquals(2, a.score());
    }

    @Test public void
    fourMatchedPiecesScoreThree() {
        Arrangement a = new Arrangement(new RotatedPiece[]{new RotatedPiece(piece1, 0), new RotatedPiece(piece2, 0), new RotatedPiece(piece3, 0), new RotatedPiece(piece4, 0)});
        Assert.assertEquals(3, a.score());
    }

    @Test public void
    nineMatchedPiecesScoreTwelve() {
        RotatedPiece[] arrangement = new RotatedPiece[9];
        Arrays.fill(arrangement, new RotatedPiece(awesomePiece, 0));

        Arrangement a = new Arrangement(arrangement);
        Assert.assertEquals(12, a.score());
    }

    @Test public void
    rotatingRockzYo() {
        Assert.assertArrayEquals(new Type[] {Type.WineBottle, Type.Man, Type.Band, Type.BarTender},
                                 new RotatedPiece(piece1, 1).faces());
    }

}