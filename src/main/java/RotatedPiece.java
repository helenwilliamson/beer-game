import java.util.Arrays;

public class RotatedPiece {
    private Type[] faces = new Type[4];

    public RotatedPiece(Piece piece, int rotation) {
        System.arraycopy(piece.types(), rotation, faces, 0, piece.types().length - rotation);
        System.arraycopy(piece.types(), 0, faces, piece.types().length - rotation, rotation);
        System.arraycopy(faces, 0, piece.types(), 0, piece.types().length);
    }

    public Type[] faces() {
        return faces;
    }

    @Override
    public String toString() {
        return "\n\tPiece=" +
                "" + Arrays.toString(faces);
    }
}
