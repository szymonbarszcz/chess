package com.company.figures;

import com.company.Board;
import com.company.utils.Coordinates;

public interface FigureMove {
    boolean figureMove(Board board, Coordinates<Integer, Integer> coordinates);

    boolean isValid(Coordinates<Integer, Integer> coordinatesFrom, Coordinates<Integer, Integer> coordinatesTo);

}
