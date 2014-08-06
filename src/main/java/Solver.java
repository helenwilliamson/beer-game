/*
start with all pieces in array in some arrangement
work through all combinations of pieces and rotations

pick a piece [0], pick next piece which matches the piece you've got.
if none found, remove last piece and attempt with next
 */

public class Solver {

    Piece piece1 = new Piece(new Type[] {
            Type.Man, Type.WineBottle, Type.BarTender, Type.BeerGlass
    });
    Piece piece2 = new Piece(new Type[] {
            Type.BeerGlass, Type.BarTender, Type.Man, Type.IHeartBeer
    });
    Piece piece3 = new Piece(new Type[] {
            Type.BeerGlass, Type.Band, Type.IHeartBeer, Type.WineBottle
    });
    Piece piece4 = new Piece(new Type[] {
            Type.IHeartBeer, Type.BeerGlass, Type.Man, Type.Band
    });
    Piece piece5 = new Piece(new Type[] {
            Type.BarTender, Type.Band, Type.Man, Type.WineBottle
    });
    Piece piece6 = new Piece(new Type[] {
            Type.BeerGlass, Type.BarTender, Type.Man, Type.WineBottle
    });
    Piece piece7 = new Piece(new Type[] {
            Type.WineBottle, Type.BarTender, Type.IHeartBeer, Type.Band
    });
    Piece piece8 = new Piece(new Type[] {
            Type.BarTender, Type.IHeartBeer, Type.BeerGlass, Type.Band
    });
    Piece piece9 = new Piece(new Type[] {
            Type.Band, Type.Man, Type.WineBottle, Type.IHeartBeer
    });

}
