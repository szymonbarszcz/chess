package com.company.figures;

import com.company.Board;
import com.company.utils.Coordinates;

public class Pawn extends Figure implements FigureMove {
    public Pawn(FigureColour colour, Coordinates<Integer, Integer> coordinates ){
        super(colour,coordinates);

    }

    @Override
    public boolean figureMove(Board board, Coordinates<Integer, Integer> coordinates) {
        return false;
    }

    @Override
    public boolean isValid(Coordinates<Integer, Integer> coordinatesFrom, Coordinates<Integer, Integer> coordinatesTo) {
        return false;
    }

}
