/*
start with all pieces in array in some arrangement
work through all combinations of pieces and rotations

pick a piece [0], pick next piece which matches the piece you've got.
if none found, remove last piece and attempt with next
 */

public class Solver {

    Puzzle.Piece piece1 = new Puzzle.Piece(new Puzzle.Type[] {
            Puzzle.Type.Man, Puzzle.Type.WineBottle, Puzzle.Type.BarTender, Puzzle.Type.BeerGlass
    });
    Puzzle.Piece piece2 = new Puzzle.Piece(new Puzzle.Type[] {
            Puzzle.Type.BeerGlass, Puzzle.Type.BarTender, Puzzle.Type.Man, Puzzle.Type.IHeartBeer
    });
    Puzzle.Piece piece3 = new Puzzle.Piece(new Puzzle.Type[] {
            Puzzle.Type.BeerGlass, Puzzle.Type.Band, Puzzle.Type.IHeartBeer, Puzzle.Type.WineBottle
    });
    Puzzle.Piece piece4 = new Puzzle.Piece(new Puzzle.Type[] {
            Puzzle.Type.IHeartBeer, Puzzle.Type.BeerGlass, Puzzle.Type.Man, Puzzle.Type.Band
    });
    Puzzle.Piece piece5 = new Puzzle.Piece(new Puzzle.Type[] {
            Puzzle.Type.BarTender, Puzzle.Type.Band, Puzzle.Type.Man, Puzzle.Type.WineBottle
    });
    Puzzle.Piece piece6 = new Puzzle.Piece(new Puzzle.Type[] {
            Puzzle.Type.BeerGlass, Puzzle.Type.BarTender, Puzzle.Type.Man, Puzzle.Type.WineBottle
    });
    Puzzle.Piece piece7 = new Puzzle.Piece(new Puzzle.Type[] {
            Puzzle.Type.WineBottle, Puzzle.Type.BarTender, Puzzle.Type.IHeartBeer, Puzzle.Type.Band
    });
    Puzzle.Piece piece8 = new Puzzle.Piece(new Puzzle.Type[] {
            Puzzle.Type.BarTender, Puzzle.Type.IHeartBeer, Puzzle.Type.BeerGlass, Puzzle.Type.Band
    });
    Puzzle.Piece piece9 = new Puzzle.Piece(new Puzzle.Type[] {
            Puzzle.Type.Band, Puzzle.Type.Man, Puzzle.Type.WineBottle, Puzzle.Type.IHeartBeer
    });

}
