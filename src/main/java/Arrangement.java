import java.util.Arrays;

public class Arrangement {
    public Arrangement(RotatedPiece[] arrangement) {
        this.arrangement = arrangement;
    }

    private RotatedPiece[] arrangement = new RotatedPiece[9];

    public int score() {
        int score = 0;
        for (int row = 0; row < 3; row++) {
            score += (arrangement.length > row * 3 + 1) ? canFitHorizontally(0 + row * 3) : 0;
            score += (arrangement.length > row * 3 + 2) ? canFitHorizontally(1 + row * 3) : 0;
        }
        for (int piece = 0; piece < 6; piece++) {
            if (arrangement.length > piece + 3) {
                score += canFitVertically(piece);
            }
        }
        return score;
    }

    private int canFitHorizontally(int left) {
        return canFit(left, left + 1, 1, 3);
    }

    private int canFitVertically(int top) {
        return canFit(top, top + 3, 2, 0);
    }

    private int canFit(int piece1Idx, int piece2Idx, int face1, int face2) {
        Type piece1Type = arrangement[piece1Idx].faces()[face1];
        Type piece2Type = arrangement[piece2Idx].faces()[face2];
        if (piece1Type == piece2Type) return 1;
        else return 0;
    }

    @Override
    public String toString() {
        return "Arrangement{" +
                "arrangement=" + Arrays.toString(arrangement) +
                "\n}";
    }
}